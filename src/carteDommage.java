public abstract class carteDommage{

    /**
     * La methode effetDePremierType permet de gerer les effets
     * de premier type lies aux cartes de dommages.
     *
     * @param jCrt le joueur courant.
     * @param nomCarte le nom des cartes jouees
     * @param numLigne numero de la ligne courante.
     */
    public static void effetDePremierType(Joueur jCrt, String nomCarte, int numLigne) {

        if (jCrt.getCarteEnMain() > 0) {

            if (nomCarte.equals("CoupDroit")) {
                jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);

            } else if (nomCarte.equals("Fleche")) {
                jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);

            } else if (nomCarte.equals("Fouette")) {
                jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);

            }
        } else {
            System.out.println("Ligne: " + numLigne +" Joueur: " +
                    jCrt.getNumJoueur() + " carte: " + nomCarte
                    + " NOMBRE DE CARTE EN MAIN INSUFFISANT.");
            System.exit(-1);

        }
    }

    /**
     * La methode effetDeDeuxiemeType permet de gerer les effets
     *  de deuxieme type lies aux cartes de dommages.
     *
     * @param jCrt le joueur courant.
     * @param jAdv l'adversaire.
     * @param nomCarte le nom de la carte
     */
    public static void effetDeDeuxiemeType(Joueur jCrt, Joueur jAdv, String nomCarte){

            if (nomCarte.equals("CoupDroit")) {
                jAdv.setPointDommage(jAdv.getPointDommage() +1);

            } else if (nomCarte.equals("Fleche")) {
                jAdv.setPointDommage(jAdv.getPointDommage() +3);

            } else if (nomCarte.equals("Fouette")) {
                jAdv.setPointDommage(jAdv.getPointDommage() +2);

            }
        }
}
