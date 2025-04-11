package org.example.model;

import java.time.LocalDateTime;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private LocalDateTime dateHeureDepart;
    private LocalDateTime dateHeureArrivee;
    private String etat;

    private Pilote pilote;
    private PersonnelCabine personnelCabine;

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
        // ajout dans un planning
    }

    public void annulerVol() {
        this.etat = "Annulé";
    }

    public void affecterVol(Pilote pilote, PersonnelCabine cabine) {
        this.pilote = pilote;
        this.personnelCabine = cabine;
    }

    public static Vol obtenirVol(String numeroRecherche) {
        // Cette méthode simulerait la recherche si une liste de vols existait
        return null; // placeholder pour conformité
    }
}
