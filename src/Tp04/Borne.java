package Tp04;

public class Borne {

    private int idBorne;
    private DateBorne dateDerniereRevision;
    private int indiceCompteurUnites;
    private TypeBorne leType;


    public Borne(int idBorne, DateBorne dateDerniereRevision, TypeBorne leType, int indiceCompteurUnites) {
        this.idBorne = idBorne;
        this.dateDerniereRevision = dateDerniereRevision;
        this.leType=leType ;
        this.indiceCompteurUnites =indiceCompteurUnites;
    }


    public int getIdBorne() {
        return idBorne;
    }
    public void setIdBorne(int idBorne) {
        this.idBorne = idBorne;
    }


    public int getIndiceCompteurUnites() {
        return indiceCompteurUnites;
    }
    public void setIndiceCompteurUnites(int indiceCompteurUnites) {
        indiceCompteurUnites = indiceCompteurUnites;
    }


    public TypeBorne getLeType() {

        return leType;
    }
    public void setLeType(TypeBorne leType) {

        this.leType = leType;
    }


    public  DateBorne getDateDerniereRevision() {
        return dateDerniereRevision;
    }
    public void setDateDerniereRevision(DateBorne dateDerniereRevision) {
        this.dateDerniereRevision = dateDerniereRevision;
    }

    public int getDureeRevision(){
        return leType.getDureeRevision();
    }



    public  boolean estAReviser() {
        if ( DateBorne.aujourdhui().difference(getDateDerniereRevision())>getDureeRevision() || indiceCompteurUnites > leType.getNbUnitesEntreRevisions()) {
            System.out.println("True");
            return true;

        }


        return false;
    }





}
