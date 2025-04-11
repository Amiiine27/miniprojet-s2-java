package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private List<Vol> vols = new ArrayList<>();

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public void affecterVol(Vol vol) {
        vols.add(vol);
    }

    public boolean verifierDisponibilite() {
        return true; // placeholder logique à enrichir si planning avec dates
    }

    public List<Vol> getVols() {
        return vols;
    }
}
