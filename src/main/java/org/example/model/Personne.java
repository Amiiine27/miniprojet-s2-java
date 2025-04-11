package model;

public abstract class Personne {
    protected String identifiant;
    protected String nom;
    protected String adresse;
    protected String contact;

    public Personne(String identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public String obtenirInfos() {
        return String.format("ID: %s, Nom: %s, Adresse: %s, Contact: %s",
                identifiant, nom, adresse, contact);
    }
}
