public class Ascenseur {
    private Etage etage;
    private boolean porteferm;

    public Ascenseur() {
        this.etage = Etage.REZDECHAUSSE;
        this.porteferm=true;
    }

    @Override
    public String toString() {
        return "Ascenseur{" +
                "etage=" + etage +
                ", porteferm=" + porteferm +
                '}';
    }
}
