package Tp04;

public class Visite {
    private char etat;
    private int dureeTotale;
    private Station laStation;
    private Borne lesBornne;

    public char getEtat() {
        return etat;
    }

    public void setEtat(char etat) {
        this.etat = etat;
    }

    public int getDureeTotale() {
        return dureeTotale;
    }

    public Station getLaStation() {
        return laStation;
    }


    public void setLaStation(Station laStation) {
        this.laStation = laStation;
    }

    public void setDureeTotale(int dureeTotale) {
        this.dureeTotale = dureeTotale;
    }

    public Borne getLesBornne() {
        return lesBornne;
    }

    public void setLesBornne(Borne lesBornne) {
        this.lesBornne = lesBornne;
    }
}
