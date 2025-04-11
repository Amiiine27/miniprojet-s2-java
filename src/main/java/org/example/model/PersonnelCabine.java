package org.example.model;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(String identifiant, String nom, String adresse, String contact,
                           String numeroEmploye, String dateEmbauche,
                           String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    public void affecterVol() {
        // logique d'affectation
    }

    public void obtenirVol() {
        // logique d'affichage des vols
    }

    @Override
    public String obtenirRole() {
        return "PersonnelCabine";
    }
}
