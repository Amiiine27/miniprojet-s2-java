package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Création d'un aéroport
        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "International");

        // Création d'un avion
        Avion a1 = new Avion("F-123", "Airbus A320", 180);

        // Création du personnel
        Pilote pilote = new Pilote("P01", "Dupont", "Paris", "0123456789", "EMP01", "2020-01-01", "ATPL", 5000);
        PersonnelCabine cabine = new PersonnelCabine("C01", "Durand", "Lyon", "0987654321", "EMP02", "2021-05-01", "Hôtesse");

        // Création d'un vol
        Vol vol1 = new Vol("AF123", "Paris", "New York",
                LocalDateTime.of(2024, 4, 20, 14, 30),
                LocalDateTime.of(2024, 4, 20, 22, 0),
                "Planifié");

        // Affectation au vol
        vol1.affecterAvion(a1);
        vol1.affecterPilote(pilote);
        vol1.affecterPersonnelCabine(cabine);
        vol1.planifierVol();

        // Ajouter vol aux objets
        a1.affecterVol(vol1);
        pilote.affecterVol(vol1);
        cabine.affecterVol(vol1);
        cdg.affecterVol(vol1, true); // départ

        // Création d'un passager et réservation
        Passager passager = new Passager("PA01", "Martin", "Nice", "0666666666", "X123456");
        Reservation res1 = new Reservation("R001", LocalDate.now(), "En attente", vol1);
        passager.reserverVol(res1);
        res1.confirmerReservation();

        // Affichage
        System.out.println("--- INFOS PASSAGER ---");
        System.out.println(passager.obtenirInfos());
        System.out.println("Réservations : " + passager.obtenirReservations().size());

        System.out.println("\n--- VOL ---");
        System.out.println("Vol numéro : " + vol1.getNumeroVol());
        System.out.println("Passagers dans le vol : " + vol1.listingPassager().size());

        System.out.println("\n--- PLANNING ---");
        for (Vol v : GestionVols.getVolsPlannifies()) {
            System.out.println("Vol planifié : " + v.getNumeroVol());
        }

        System.out.println("\n--- AEROPORT ---");
        System.out.println(cdg);
        System.out.println("Vols au départ : " + cdg.getVolsDepart().size());
    }
}
