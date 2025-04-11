package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private List<Vol> vols;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.vols = new ArrayList<>();
    }

    public void affecterVol(Vol vol) {
        vols.add(vol);
    }

    public boolean verifierDisponibilite() {
        return true; // logique à enrichir selon le planning
    }
}