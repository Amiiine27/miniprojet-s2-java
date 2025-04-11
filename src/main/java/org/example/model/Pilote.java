package org.example.model;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    public Pilote(String identifiant, String nom, String adresse, String contact,
                  String numeroEmploye, String dateEmbauche,
                  String licence, int heuresDeVol) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    public void affecterVol() {
        // logique d'affectation
    }

    public void obtenirVol() {
        // logique d'affichage des vols
    }

    @Override
    public String obtenirRole() {
        return "Pilote";
    }
}
