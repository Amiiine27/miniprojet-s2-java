package org.example.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AvionTest {

    @Test
    public void testAffecterEtVerifierDisponibilite() {
        Avion avion = new Avion("F123", "A320", 180);

        Vol v1 = new Vol("A1", "Paris", "Alger",
                LocalDateTime.of(2024, 5, 10, 10, 0),
                LocalDateTime.of(2024, 5, 10, 12, 0), "Planifié");

        Vol v2 = new Vol("A2", "Paris", "Djerba",
                LocalDateTime.of(2024, 5, 10, 11, 0),
                LocalDateTime.of(2024, 5, 10, 13, 0), "Planifié");

        avion.affecterVol(v1);
        assertFalse(avion.verifierDisponibilite(
                v2.getDateHeureDepart(), v2.getDateHeureArrivee()));

        assertTrue(avion.verifierDisponibilite(
                LocalDateTime.of(2024, 5, 10, 13, 0),
                LocalDateTime.of(2024, 5, 10, 15, 0)));
    }
}
