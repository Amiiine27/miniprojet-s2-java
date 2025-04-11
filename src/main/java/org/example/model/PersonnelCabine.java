package model;

public class PersonnelCabine extends Employe {

    public PersonnelCabine(String identifiant, String nom, String adresse, String contact,
                           String numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
    }

    @Override
    public String obtenirRole() {
        return "PersonnelCabine";
    }
}
