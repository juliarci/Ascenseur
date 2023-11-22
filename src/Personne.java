import java.util.Random;

import static java.lang.Math.random;

public class Personne extends Immeuble{
    private String name;
    private Etage etage;

    public Personne(String name) {
        this.name = name;
        Etage[] etgs=Etage.values();
        int index = new Random().nextInt(etgs.length);
        this.etage = etgs[1+(index)%2];
    }

    public void presseBoutonEtage(){
        if(this.getDifferentsEtages().getCreatEtage().get(this.etage)==Button.UNPRESSED){
            this.getDifferentsEtages().getCreatEtage().replace(this.etage, Button.UNPRESSED, Button.PRESSED);
            if (this.getEtage() == Etage.ETAGE1){
                this.setEtage(Etage.ETAGE2);
            }else{
                this.setEtage(Etage.ETAGE1);
            }
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
