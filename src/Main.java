import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /** Personne p = new Personne("Jean");
        System.out.println(p.toString());
        Ascenseur ascenseur = new Ascenseur();
        Immeuble immeuble = new Immeuble(3);
        System.out.println(immeuble.toString());
        DifferentsEtages differentsEtages = new DifferentsEtages();
        System.out.println(differentsEtages.toString());**/
        Etage[] etgs = Etage.values();
        Etage rezDeChauss = etgs[2];
        System.out.println(rezDeChauss);
        System.out.println(Arrays.toString(etgs));
    }
}