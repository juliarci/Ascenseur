import java.util.Random;

public class Personne {
    private String name;
    private Etage etage;
    protected boolean boutonappuye;

    /**
     * Constructeur de personne
     * @param name
     */
    public Personne(String name) {
        this.name = name;
        this.boutonappuye=false;
        Etage[] etgs = new Etage[2];
        etgs = Etage.values();
        int index = new Random().nextInt(etgs.length);
        this.etage = etgs[1 + (index) % 2];
    }

    /**
     * Méthode caractérisant l'appui sur le bouton d'une personne et détermine l'étage de destination
     */
    public void presseBoutonEtage() {
        boutonappuye =! boutonappuye;
            if (this.getEtage() == Etage.ETAGE1) {
                this.setEtage(Etage.ETAGE2);
            } else if (this.getEtage()==Etage.REZDECHAUSSE){
                this.setEtage(Etage.ETAGE1);
            }
            else {
                this.setEtage(Etage.REZDECHAUSSE);
            }

    }

    @Override
    public String toString() {
        return "Personne{" +
                "name='" + name + '\'' +
                ", etage=" + etage +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Etage getEtage() {
        return etage;
    }

    public void setEtage(Etage etage) {
        this.etage = etage;
    }
}
