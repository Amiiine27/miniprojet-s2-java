package model;

import java.time.LocalDateTime;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private LocalDateTime dateHeureDepart;
    private LocalDateTime dateHeureArrivee;
    private String etat;

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
        // ajout dans un planning centralisé
    }

    public void annulerVol() {
        this.etat = "Annulé";
    }

    public static Vol obtenirVol(String id) {
        return null; // méthode à relier à un système de gestion si besoin
    }
}
