package org.example.model;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightReader {

    public static List<Vol> readFlightsFromResources() {
        List<Vol> vols = new ArrayList<>();

        try (InputStream input = FlightReader.class.getClassLoader().getResourceAsStream("data/flights.csv");
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty() || line.startsWith("Code")) continue;

                String[] parts = line.split("\\|");
                if (parts.length != 5) continue;

                String code = parts[0].trim();
                String dep = parts[1].trim();
                String arr = parts[2].trim();
                String[] dateParts = parts[3].trim().split("-");
                String[] timeParts = parts[4].trim().split(":");

                LocalDate date = LocalDate.of(2024,
                        Integer.parseInt(dateParts[1]),
                        Integer.parseInt(dateParts[0]));
                LocalTime time = LocalTime.of(
                        Integer.parseInt(timeParts[0]),
                        Integer.parseInt(timeParts[1]));

                LocalDateTime dateTime = LocalDateTime.of(date, time);

                Vol vol = new Vol(code, dep, arr, dateTime, dateTime.plusHours(2), "Planifié");
                vols.add(vol);
            }

        } catch (IOException | NullPointerException e) {
            System.err.println("Erreur lecture resource : " + e.getMessage());
        }

        return vols;
    }
}
