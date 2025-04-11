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

    public void affecterVol(Vol vol) {
        vols.add(vol);
    }

    public boolean verifierDisponibilite(LocalDateTime nouvelleDateDepart, LocalDateTime nouvelleDateArrivee) {
        for (Vol v : vols) {
            // S'il y a un chevauchement
            if (!(nouvelleDateArrivee.isBefore(v.getDateHeureDepart()) ||
                    nouvelleDateDepart.isAfter(v.getDateHeureArrivee()))) {
                return false; // conflit trouvé
            }
        }
        return true; // pas de conflit
    }
}