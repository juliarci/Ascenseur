import java.util.Arrays;
import java.util.Scanner;

public class Immeuble {
private Ascenseur ascenseur;
private Personne[] personnes;
private DifferentsEtages differentsEtages;

    public Immeuble() {
        this.ascenseur=new Ascenseur();
        this.differentsEtages=new DifferentsEtages();
        this.creerUnePersonne();
    }

    public Immeuble(int nbrPersonnes) {
        this.ascenseur=new Ascenseur();
        this.differentsEtages=new DifferentsEtages();
        personnes=new Personne[nbrPersonnes];
        for(int i =0; i<=(nbrPersonnes-1);i++){
            personnes[i]=this.creerUnePersonne();
        }
    }


    public Personne creerUnePersonne(){
    System.out.println("Entrez le nom de la personne : ");
    Scanner sc =new Scanner(System.in);
    String nom = sc.next();
    Personne p = new Personne(nom);
        return p;
    }

    @Override
    public String toString() {
        return "Immeuble{" +
                "ascenseur=" + ascenseur +
                ", personnes=" + Arrays.toString(personnes) +
                '}';
    }

    public Ascenseur getAscenseur() {
        return ascenseur;
    }

    public void setAscenseur(Ascenseur ascenseur) {
        this.ascenseur = ascenseur;
    }

    public Personne[] getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }

    public DifferentsEtages getDifferentsEtages() {
        return differentsEtages;
    }

    public void setDifferentsEtages(DifferentsEtages differentsEtages) {
        this.differentsEtages = differentsEtages;
    }
}

