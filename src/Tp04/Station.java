package Tp04;
import java.util.ArrayList;

public class Station{
    private int idStation;
    private String libelleEmplacement;
    private ArrayList<Borne>lesBornes;



    public Station(){

    }

    public Station(int idStation, String libelleEmplacement,ArrayList<Borne>lesBornes){
        this.idStation=idStation ;
        this.libelleEmplacement=libelleEmplacement ;
        this.lesBornes=lesBornes ;
    }

    public String getLibelleEmplacement() {
        return libelleEmplacement;
    }

    public void setLibelleEmplacement(String libelleEmplacement) {
        this.libelleEmplacement = libelleEmplacement;
    }

    public int getIdStation() {
        return idStation;
    }

    public ArrayList<Borne>getLesBornes() {
        return lesBornes;
    }

    public void setLesBornes(ArrayList<Borne> lesBornes) {
        this.lesBornes = lesBornes;
    }

        public  void ajouteBorne(Borne leBorne){
            lesBornes.add(leBorne);
    }




}
