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

    public void appelAscenseur() {
        for (Personne pers : personnes) {
            //Récuperation de l'étage où la personne veut être réupérée
            this.differentsEtages.getCreatEtage().replace(pers.getEtage(), Button.UNPRESSED, Button.PRESSED);
            //Récupération du lieu de la personne pour le mettre en destination de l'ascenseur
            ascenseur.setEtagedest(pers.getEtage());
            //Si ascenseur à un étage différent de la personne
            if (pers.getEtage() != ascenseur.getEtage()) {
                //Demande de changement d'étage
                pers.presseBoutonEtage();
                //On réinitialise le bouton du palier
                this.differentsEtages.getCreatEtage().replace(pers.getEtage(), Button.PRESSED, Button.UNPRESSED);
                ascenseur.deplacementEtage();
                //On amène au bon étage
                ascenseur.ameneBonEtage(pers);
                //Si la personne est déjà à l'étage de l'ascenseur
            } else if (pers.getEtage() == ascenseur.getEtage()) {
                //Signal
                ascenseur.arriveeAscenseur();
                //Demande de changement d'étage
                pers.presseBoutonEtage();
                //On réinitialise le bouton du palier
                this.differentsEtages.getCreatEtage().replace(pers.getEtage(), Button.PRESSED, Button.UNPRESSED);
                //Ouverture des portes
                ascenseur.setPorteferm(false);
                //On amene au bon étage
                ascenseur.ameneBonEtage(pers);
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

