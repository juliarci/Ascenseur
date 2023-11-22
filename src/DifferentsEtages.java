import java.util.HashMap;

public class DifferentsEtages extends Immeuble{
    private Etage etageAjout;

    private HashMap<Etage, Button> creatEtage;
    public DifferentsEtages() {
        super();
        this.creatEtage=new HashMap<Etage, Button>();
        Etage[] etgs= Etage.values();
        for(int i =0; i <=(etgs.length-1); i++){
            this.creatEtage.put(etgs[i], Button.UNPRESSED);
        }
    }



    @Override
    public String toString() {
        return "DifferentsEtages{" +
                ", creatEtage=" + creatEtage +
                '}';
    }

    public Etage getEtageAjout() {
        return etageAjout;
    }

    public void setEtageAjout(Etage etageAjout) {
        this.etageAjout = etageAjout;
    }

    public HashMap<Etage, Button> getCreatEtage() {
        return creatEtage;
    }

    public void setCreatEtage(HashMap<Etage, Button> creatEtage) {
        this.creatEtage = creatEtage;
    }
}
