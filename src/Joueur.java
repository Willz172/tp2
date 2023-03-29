public class Joueur {
    int numJoueur;
    int carteEnMain = 5;
    int pointAttaque = 1;
    int pointDommage;
    int pointExperience;

    public Joueur(int numJoueur) {
        this.numJoueur = numJoueur;
        this.carteEnMain = carteEnMain;
        this.pointAttaque = pointAttaque;
        this.pointDommage = pointDommage;
        this.pointExperience = pointExperience;
    }

    public Joueur() {

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
    public static void validerJoueur(int numJoueur){
        if(numJoueur != 0 || numJoueur != 1){
            System.err.println("NUMERO JOUEUR INCORRECT! ");
            System.exit(-1);
        }
    }
    public static void validerCarteEnMain(int carteEnMain){
        if(carteEnMain < 0){
            System.out.println("Vous n'avez plus de carte en main!");
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
