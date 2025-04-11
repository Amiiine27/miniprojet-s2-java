package model;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;

    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    public void affecterVol() {
        // logique d'affectation de vols à cet aéroport
    }
}
