package Tp04;

public class Technicien {
    private int marticule;
    private String nom;
    private String prenom;
    private Visite lesVisites;

    public int getMarticule() {
        return marticule;
    }

    public void setMarticule(int marticule) {
        this.marticule = marticule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Visite getLesVisites() {
        return lesVisites;
    }

    public void setLesVisites(Visite lesVisites) {
        this.lesVisites = lesVisites;
    }

}
