package org.example.model;

import java.time.LocalDate;

public class Reservation {
    private String numeroReservation;
    private LocalDate dateReservation;
    private String statut;
    private Vol vol;

    public Reservation(String numeroReservation, LocalDate dateReservation, String statut, Vol vol) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
        this.vol = vol;
    }

    public void confirmerReservation() {
        statut = "Confirmée";
    }

    public void annulerReservation() {
        statut = "Annulée";
    }

    public void modifierReservation(LocalDate nouvelleDate) {
        this.dateReservation = nouvelleDate;
    }

    public Vol getVol() {
        return vol;
    }
}
