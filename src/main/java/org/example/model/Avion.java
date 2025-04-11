package org.example.model;

import java.time.LocalDateTime;
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

    public boolean affecterVol(Vol vol) {
        if (verifierDisponibilite(vol.getDateHeureDepart(), vol.getDateHeureArrivee())) {
            vols.add(vol);
            vol.setAvion(this);
            return true;
        }
        return false;
    }


    public boolean verifierDisponibilite(LocalDateTime nouvelleDateDepart, LocalDateTime nouvelleDateArrivee) {
        for (Vol v : vols) {
            if (!(nouvelleDateArrivee.isBefore(v.getDateHeureDepart()) ||
                    nouvelleDateDepart.isAfter(v.getDateHeureArrivee()))) {
                return false;
            }
        }
        return true;
    }
}