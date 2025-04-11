package org.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Création d’un aéroport
        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "International");

        // Création d’un avion
        Avion avion = new Avion("F-123", "Airbus A320", 180);

        // Création du personnel
        Pilote pilote = new Pilote("P01", "Jean Dupont", "Paris", "0123456789", "EMP001", "2020-01-01");
        PersonnelCabine cabine = new PersonnelCabine("C01", "Sophie Martin", "Lyon", "0987654321", "EMP002", "2022-05-01");

        // Création d’un vol
        Vol vol = new Vol(
                "AF123", "Paris", "New York",
                LocalDateTime.of(2024, 4, 20, 14, 30),
                LocalDateTime.of(2024, 4, 20, 22, 0),
                "Planifié"
        );

        // Affectation du personnel au vol
        vol.affecterVol(pilote, cabine);

        // Ajout dans le planning
        vol.planifierVol();

        // Affectation de l’avion et de l’aéroport
        avion.affecterVol(vol);
        cdg.affecterVol(vol);

        // Recherche du vol
        Vol recherche = Vol.obtenirVol("AF123");

        if (recherche != null) {
            System.out.println("Vol trouvé : " + recherche);
        } else {
            System.out.println("Vol non trouvé.");
        }

        // Annulation
        vol.annulerVol();
        System.out.println("Vol annulé.");
    }
}