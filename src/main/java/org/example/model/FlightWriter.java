package org.example.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FlightWriter {

    public static void appendFlightToCsv(Vol vol, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(vol.getNumeroVol() + "|" +
                         vol.getOrigine() + "|" +
                         vol.getDestination() + "|" +
                         vol.getDateHeureDepart().getDayOfMonth() + "-" +
                         vol.getDateHeureDepart().getMonthValue() + "|" +
                         String.format("%02d:%02d", 
                             vol.getDateHeureDepart().getHour(), 
                             vol.getDateHeureDepart().getMinute()));
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erreur écriture CSV : " + e.getMessage());
        }
    }
}
