import java.util.HashMap;

public class DifferentsEtages{
    private Etage etageAjout;

    private HashMap<Etage, Button> creatEtage;
    public DifferentsEtages() {
        Etage[] etgs=Etage.values();
        for(int i =0; i <=(etgs.length-1); i++){
            creatEtage.put(etgs[i], Button.UNPRESSED);
        }
    }

    @Override
    public String toString() {
        return "DifferentsEtages{" +
                "etageAjout=" + etageAjout +
                ", creatEtage=" + creatEtage +
                '}';
    }
}
