public class Ascenseur {
    private Etage etage;
    private Etage etagedest;
    private boolean porteferm;

    public Ascenseur() {
        this.etage = Etage.REZDECHAUSSE;
        this.etagedest = null;
        this.porteferm = true;
    }

    /**
     * @param etagedest
     */
    public void changmtEtage(Etage etagedest) {
        this.setEtage(etagedest);
    }

    /**
     * Méthode indiquant l'arrivée de l'ascenseur
     */
    public void arriveeAscenseur() {
        System.out.println("L'ascenseur est arrivé à l'étage " + this.etage);
    }

    /**
     * Méthode permettant de réaliser le changement d'étage vers celui de la personne avec l'ouverture des portes/ fermetures des portes
     */
    public void deplacementEtage() {
        //L'ascenseur vient à l'étage de la personne
        this.changmtEtage(this.getEtagedest());
        //Les portes s'ouvrent
        this.setPorteferm(false);
        //On relocalise l'ascenseur
        this.setEtage(this.getEtagedest());
        //Signal
        this.arriveeAscenseur();
    }

    /**
     * Méthode amenant la personne au bon étage
     *
     * @param pers
     */
    public void ameneBonEtage(Personne pers) {
        //On ferme les portes
        this.setPorteferm(true);
        //On amène la personne au bon étage
        this.changmtEtage(pers.getEtage());
        this.setEtage(pers.getEtage());
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
