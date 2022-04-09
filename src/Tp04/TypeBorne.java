package Tp04;

public class TypeBorne {

    private int dureeRevision;
    private int nbJoursEntreRevisions;
    private int nbUnitesEntreRevisions;
    private  String codeTypeBorne;



    public TypeBorne(int dureeRevision,int nbJoursEntreRevisions,int nbUnitesEntreRevisions,String codeTypeBorne ) {
        this.dureeRevision = dureeRevision;
        this.nbJoursEntreRevisions=nbJoursEntreRevisions ;
        this.nbUnitesEntreRevisions=nbUnitesEntreRevisions ;
        this.codeTypeBorne =codeTypeBorne;
    }
    public int getDureeRevision() {
        return dureeRevision;
    }



    public String getCodeTypeBorne() {
        return codeTypeBorne;
    }

    public void setCodeTypeBorne(String codeTypeBorne) {
        this.codeTypeBorne = codeTypeBorne;
    }

    public int getNbJoursEntreRevisions() {
        return nbJoursEntreRevisions;
    }

    public void setNbJoursEntreRevisions(int nbJoursEntreRevisions) {
        this.nbJoursEntreRevisions = nbJoursEntreRevisions;
    }

    public int getNbUnitesEntreRevisions() {
        return nbUnitesEntreRevisions;
    }

    public void setNbUnitesEntreRevisions(int nbUnitesEntreRevisions) {
        this.nbUnitesEntreRevisions = nbUnitesEntreRevisions;
    }





}
