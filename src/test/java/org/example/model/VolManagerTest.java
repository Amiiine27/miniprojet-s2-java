package org.example.model;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VolManagerTest {

    @Test
    public void testImportFlights() throws IOException {
        File testFile = File.createTempFile("flights", ".csv");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFile))) {
            writer.write("Code|Dep|Arriv|Date|Hour\n");
            writer.write("TO350|Paris|Rome|25-12|10:15\n");
            writer.write("TO761|Lyon|Prague|25-12|12:25\n");
        }

        List<Vol> vols = VolManager.importFlights(testFile.getAbsolutePath());
        assertEquals(2, vols.size());
        assertEquals("TO350", vols.get(0).getNumeroVol());
    }

    @Test
    public void testSaveReservationFile() throws IOException {
        File testFile = File.createTempFile("passengers", ".csv");

        Passager p = new Passager("P01", "Martin", "Paul", "123456789", "X12345");
        VolManager.saveReservationFile(p, "TO350", testFile.getAbsolutePath());

        try (BufferedReader reader = new BufferedReader(new FileReader(testFile))) {
            String line = reader.readLine();
            assertNotNull(line);
            assertTrue(line.contains("Martin"));
            assertTrue(line.contains("TO350"));
        }
    }
}