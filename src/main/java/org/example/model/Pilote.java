package org.example.model;

public class Pilote extends Employe {

    public Pilote(String identifiant, String nom, String adresse, String contact,
                  String numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
    }

    @Override
    public String obtenirRole() {
        return "Pilote";
    }
}