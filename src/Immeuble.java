import java.util.Arrays;
import java.util.Scanner;

public class Immeuble {
    private Ascenseur ascenseur;
    private Personne[] personnes;
    private DifferentsEtages differentsEtages;

    public Immeuble(int nbrPersonnes) {
        this.ascenseur = new Ascenseur();
        this.personnes = new Personne[nbrPersonnes];
        this.differentsEtages = new DifferentsEtages();
        for (int i = 0; i <= (nbrPersonnes - 1); i++) {
            this.personnes[i] = this.creerUnePersonne();
        }
    }

    public Immeuble() {

    }

    public void appelAscenceur() {
        for (Personne pers : personnes) {
            //Récuperation de l'étage où la personne veut être réupérée
            this.differentsEtages.getCreatEtage().replace(pers.getEtage(), Button.UNPRESSED, Button.PRESSED);
            //Récupération du lieu de la personne pour le mettre en destination de l'ascenseur
            ascenseur.setEtagedest(pers.getEtage());
            //Si ascenseur à un étage différent de la personne
            if (pers.getEtage() != ascenseur.getEtage()) {
                //Demande de changement d'étage
                pers.presseBoutonEtage();
                //L'ascenseur vient à l'étage de la personne
                ascenseur.changmtEtage(ascenseur.getEtagedest());
                //Les portes s'ouvrent
                ascenseur.setPorteferm(false);
                //On relocalise l'ascenseur
                ascenseur.setEtage(ascenseur.getEtagedest());
                //Signal
                System.out.println("L'ascenseur est arrivé");
                //On referme les portes
                ascenseur.setPorteferm(true);
                //On amène la personne au bon étage
                ascenseur.changmtEtage(pers.getEtage());
                ascenseur.setEtage(pers.getEtage());
            }else if (pers.getEtage() == ascenseur.getEtage()) {
                ascenseur.setPorteferm(false);
                System.out.println("L'ascenseur à l'étage");
                //Demande de changement d'étage
                pers.presseBoutonEtage();
                //On amène la personne au bon étage
                ascenseur.changmtEtage(pers.getEtage());
                ascenseur.setEtage(pers.getEtage());
            }
        }
    }

    public Personne creerUnePersonne() {
        System.out.println("Entrez le nom de la personne : ");
        Scanner sc = new Scanner(System.in);
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

