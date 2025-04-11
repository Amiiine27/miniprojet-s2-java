package org.example.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private LocalDateTime dateHeureDepart;
    private LocalDateTime dateHeureArrivee;
    private String etat;

    private Pilote pilote;
    private PersonnelCabine personnelCabine;

    // Planning statique partagé
    private static List<Vol> planning = new ArrayList<>();

    public Vol(String numeroVol, String origine, String destination,
               LocalDateTime dateHeureDepart, LocalDateTime dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
    }

    public void planifierVol() {
        planning.add(this);
    }

    public void annulerVol() {
        this.etat = "Annulé";
        planning.remove(this);
    }

    public static Vol obtenirVol(String numeroRecherche) {
        for (Vol vol : planning) {
            if (vol.numeroVol.equals(numeroRecherche)) {
                return vol;
            }
        }
        return null;
    }

    public void affecterVol(Pilote pilote, PersonnelCabine cabine) {
        this.pilote = pilote;
        this.personnelCabine = cabine;
    }

    public String getNumeroVol() {
        return numeroVol;
    }
}
