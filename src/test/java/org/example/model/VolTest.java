package org.example.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class VolTest {

    @Test
    public void testPlanifierEtObtenirVol() {
        Vol vol = new Vol("V001", "Paris", "Rome",
                LocalDateTime.of(2024, 5, 1, 10, 0),
                LocalDateTime.of(2024, 5, 1, 12, 0), "Planifié");

        vol.planifierVol();
        Vol found = Vol.obtenirVol("V001");

        assertNotNull(found);
        assertEquals("V001", found.getNumeroVol());
    }

    @Test
    public void testAnnulerVol() {
        Vol vol = new Vol("V002", "Lyon", "Berlin",
                LocalDateTime.of(2024, 6, 1, 14, 0),
                LocalDateTime.of(2024, 6, 1, 16, 0), "Planifié");

        vol.planifierVol();
        vol.annulerVol();

        assertEquals("Annulé", vol.getEtat());
    }
}
