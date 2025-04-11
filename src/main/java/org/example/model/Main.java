package org.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Création d'un aéroport
        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "International");
        cdg.affecterVol(); // appel vide pour respecter la structure

        // Création d'un avion
        Avion a1 = new Avion("F-123", "Airbus A320", 180);
        a1.affecterVol(); // appel de la méthode requise
        System.out.println(a1.verifierDisponibilite());; // test disponibilité

        // Création du personnel
        Pilote pilote = new Pilote("P01", "Dupont", "Paris", "0123456789", "EMP01", "2020-01-01");
        PersonnelCabine cabine = new PersonnelCabine("C01", "Durand", "Lyon", "0987654321", "EMP02", "2021-05-01");

        // Affichage des rôles (méthode demandée)
        System.out.println("Rôle Pilote : " + pilote.obtenirRole());
        System.out.println("Rôle Cabine : " + cabine.obtenirRole());

        // Création d'un vol
        Vol vol1 = new Vol("AF123", "Paris", "New York",
                LocalDateTime.of(2024, 4, 20, 14, 30),
                LocalDateTime.of(2024, 4, 20, 22, 0),
                "Planifié");
        vol1.planifierVol();
        vol1.annulerVol(); // test annulation

        // Création d'un passager et réservation
        Passager passager = new Passager("PA01", "Martin", "Nice", "0666666666", "X123456");
        Reservation res1 = new Reservation("R001", LocalDate.now(), "En attente", vol1);
        passager.reserverVol(res1);
        passager.annulerReservation(res1); // test annulation
        System.out.println("Passager infos : " + passager.obtenirInfos());
    }
}
