package org.example.model;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public void affecterVol() {
        // logique pour affecter un vol à cet avion
    }

    public boolean verifierDisponibilite() {
        return true; // stub logique
    }
}
