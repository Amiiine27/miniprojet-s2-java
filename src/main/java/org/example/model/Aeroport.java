package model;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;

    private List<Vol> volsDepart;
    private List<Vol> volsArrivee;

    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
        this.volsDepart = new ArrayList<>();
        this.volsArrivee = new ArrayList<>();
    }

    public void affecterVol(Vol vol, boolean estDepart) {
        if (estDepart) {
            volsDepart.add(vol);
        } else {
            volsArrivee.add(vol);
        }
    }

    public List<Vol> getVolsDepart() {
        return volsDepart;
    }

    public List<Vol> getVolsArrivee() {
        return volsArrivee;
    }

    @Override
    public String toString() {
        return String.format("Aéroport: %s, Ville: %s, Description: %s", nom, ville, description);
    }
}
