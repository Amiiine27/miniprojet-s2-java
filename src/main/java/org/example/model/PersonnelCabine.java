package model;

import java.util.ArrayList;
import java.util.List;

public class PersonnelCabine extends Employe {
    private String qualification;
    private List<Vol> vols = new ArrayList<>();

    public PersonnelCabine(String identifiant, String nom, String adresse, String contact,
                           String numeroEmploye, String dateEmbauche,
                           String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    public void affecterVol(Vol vol) {
        vols.add(vol);
    }

    public List<Vol> obtenirVol() {
        return vols;
    }

    @Override
    public String obtenirRole() {
        return "PersonnelCabine";
    }
}
