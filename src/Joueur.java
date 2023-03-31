import java.util.ArrayList;

public class Joueur {
    int numJoueur;
   int carteEnMain = 5;
    int pointAttaque = 1;
    int pointDommage;
    int pointExperience;

    /**
     * la methode numJoueur est le constructeur de la classe Joueur.
     *
     * @param numJoueur le numero du joueur.
     */
    public Joueur(int numJoueur,int carteEnMain, int pointAttaque, int pointDommage, int pointExperience ) {
        this.numJoueur = numJoueur;
        this.carteEnMain = carteEnMain;
        this.pointAttaque = pointAttaque;
        this.pointDommage = pointDommage;
        this.pointExperience = pointExperience;
    }

    public Joueur(int numJoueur) {
        this(numJoueur,5,1,0,0);
    }

    public int getNumJoueur() {
        return numJoueur;
    }

    public int getCarteEnMain() {
        return carteEnMain;
    }

    public int getPointAttaque() {
        return pointAttaque;
    }

    public int getPointDommage() {
        return pointDommage;
    }

    public int getPointExperience() {
        return pointExperience;
    }

    public void setNumJoueur(int numJoueur) {
        this.numJoueur = numJoueur;
    }

    public void setCarteEnMain(int carteEnMain) {
        this.carteEnMain = carteEnMain;
    }

    public void setPointAttaque(int pointAttaque) {
        this.pointAttaque = pointAttaque;
    }

    public void setPointDommage(int pointDommage) {
        this.pointDommage += pointDommage;
    }

    public void setPointExperience(int pointExperience) {
        this.pointExperience += pointExperience;
    }

    /**
     * La methode ValiderJoueur permet de verifier si le numero du joueur est valide.
     *
     * @param numJoueur numero du joueur
     * @param numLigne numero de la ligne courante.
     */
    public static void validerJoueur(int numJoueur, int numLigne){
        if(numJoueur != 0 && numJoueur != 1){
            System.err.println("NUMERO JOUEUR INCORRECT!" + "Ligne:" + numLigne);
            System.exit(-1);
        }
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "numJoueur=" + numJoueur +
                ", carteEnMain=" + carteEnMain +
                ", pointAttaque=" + pointAttaque +
                ", pointDommage=" + pointDommage +
                ", pointExperience=" + pointExperience +
                '}';
    }
}
