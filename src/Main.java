import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Immeuble immeuble = new Immeuble(1);
        System.out.println(immeuble.toString());
        DifferentsEtages differentsEtages=new DifferentsEtages();
        System.out.println(differentsEtages.toString());
        immeuble.appelAscenseur();
        System.out.println(Arrays.toString(immeuble.getPersonnes()));
        System.out.println(immeuble.getAscenseur());
        immeuble.appelAscenseur();
        System.out.println(Arrays.toString(immeuble.getPersonnes()));
        immeuble.appelAscenseur();
        System.out.println(Arrays.toString(immeuble.getPersonnes()));
    }
}