package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations;

    public Passager(String identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    public void reserverVol(Reservation reservation) {
        reservations.add(reservation);
    }

    public void annulerReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public List<Reservation> obtenirReservations() {
        return reservations;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public String getPasseport() {
        return passeport;
    }
}
