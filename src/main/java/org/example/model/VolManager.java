package org.example.model;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class VolManager{

    public static List<Vol> importFlights(String filepath) {
        List<Vol> vols = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
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
                vol.planifierVol();
                vols.add(vol);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

        return vols;
    }

    public static void saveReservationFile(Passager p, String codeVol, String filepath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, true))) {
            writer.write(p.getPasseport() + " | " + p.getNom() +  " | " + codeVol);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }
}
