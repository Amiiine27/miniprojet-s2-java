package org.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "International");

        Avion avion = new Avion("F-123", "Airbus A320", 180);

        Pilote pilote = new Pilote("P01", "Jean Dupont", "Paris", "0123456789", "EMP001", "2020-01-01");
        PersonnelCabine cabine = new PersonnelCabine("C01", "Sophie Martin", "Lyon", "0987654321", "EMP002", "2022-05-01");

        Vol vol = new Vol(
                "AF123", "Paris", "New York",
                LocalDateTime.of(2024, 4, 20, 14, 30),
                LocalDateTime.of(2024, 4, 20, 22, 0),
                "Planifié"
        );

        vol.affecterVol(pilote, cabine);

        vol.planifierVol();

        avion.affecterVol(vol);
        cdg.affecterVol(vol);

        Vol recherche = Vol.obtenirVol("AF123");

        if (recherche != null) {
            System.out.println("Vol trouvé : " + recherche);
        } else {
            System.out.println("Vol non trouvé.");
        }

        vol.annulerVol();
        System.out.println("Vol annulé.");
    }
}