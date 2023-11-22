import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Personne p = new Personne("Jean");
        p.presseBoutonEtage();
        System.out.println(p.toString());
        Ascenseur ascenseur = new Ascenseur();
        Immeuble immeuble = new Immeuble(3);
        System.out.println(immeuble.toString());
        DifferentsEtages differentsEtages=new DifferentsEtages();
        System.out.println(differentsEtages.toString());

    }
}