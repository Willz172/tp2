public class carteDommage{

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
        }
    }

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
