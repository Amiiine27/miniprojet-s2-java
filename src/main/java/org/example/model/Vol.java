package model;

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

    private Avion avion;
    private Pilote pilote;
    private PersonnelCabine personnelCabine;
    private List<Passager> passagers = new ArrayList<>();

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
        GestionVols.ajouterVol(this);
    }

    public void annulerVol() {
        this.etat = "Annulé";
        GestionVols.annulerVol(this.numeroVol);
    }

    public void modifierVol(LocalDateTime depart, LocalDateTime arrivee) {
        this.dateHeureDepart = depart;
        this.dateHeureArrivee = arrivee;
    }

    public List<Passager> listingPassager() {
        return passagers;
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public static Vol obtenirVol(String id) {
        for (Vol vol : GestionVols.getVolsPlannifies()) {
            if (vol.getNumeroVol().equals(id)) {
                return vol;
            }
        }
        return null;
    }

    public void affecterAvion(Avion avion) {
        this.avion = avion;
    }

    public void affecterPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public void affecterPersonnelCabine(PersonnelCabine pc) {
        this.personnelCabine = pc;
    }
}
