public class Ascenseur {
    private Etage etage;
    private Etage etagedest;
    private boolean porteferm;

    public Ascenseur() {
        this.etage = Etage.REZDECHAUSSE;
        this.etagedest=null;
        this.porteferm=true;
    }

    public void changmtEtage(Etage etagedest){
        this.setEtage(etagedest);
    }
    @Override
    public String toString() {
        return "Ascenseur{" +
                "etage=" + etage +
                ", porteferm=" + porteferm +
                '}';
    }

    public Etage getEtage() {
        return etage;
    }

    public void setEtage(Etage etage) {
        this.etage = etage;
    }

    public boolean isPorteferm() {
        return porteferm;
    }

    public void setPorteferm(boolean porteferm) {
        this.porteferm = porteferm;
    }

    public Etage getEtagedest() {
        return etagedest;
    }

    public void setEtagedest(Etage etagedest) {
        this.etagedest = etagedest;
    }
}
