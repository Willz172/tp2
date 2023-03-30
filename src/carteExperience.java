public class carteExperience extends Carte {

    public carteExperience(String nomCarte) {
        super(nomCarte);
    }

    public void effetDePremierType(Joueur jCrt, Joueur jAdv, int numLigne){

        if (jCrt.getCarteEnMain() > 0) {

            if (nomCarte.equals("Oups")) {
                jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);

            } else if (nomCarte.equals("JaiCompris")) {
                jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);

            }
        } else {
            System.out.println("Ligne: " + numLigne +" Joueur: " +
                    jCrt.getNumJoueur() + " carte: " + nomCarte
                    + " NOMBRE DE CARTE EN MAIN INSUFFISANT.");
        }
    }

    public void effetDeDeuxiemeType(Joueur jCrt, Joueur jAdv){

       if (nomCarte.equals("Oups")) {
           jCrt.setPointExperience(jCrt.getPointExperience() + 1);

       }else if (nomCarte.equals("JaiCompris")) {
           jCrt.setPointExperience(jCrt.getPointExperience() + 2);

       }
    }
}
