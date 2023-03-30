public class carteExperience extends Carte {

    public carteExperience(String nomCarte) {
        super(nomCarte);
    }

    public static void effetDePremierType(Joueur jCrt, Joueur jAdv){

        while (jCrt.getCarteEnMain() > 0) {

            if (nomCarte.equals("Oups")) {
                jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);

            } else if (nomCarte.equals("JaiCompris")) {
                jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);

            }
        }
    }

    public static void effetDeDeuxiemeType(Joueur jCrt, Joueur jAdv){

       if (nomCarte.equals("Oups")) {
           jCrt.setPointExperience(jCrt.getPointExperience() + 1);

       }else if (nomCarte.equals("JaiCompris")) {
           jCrt.setPointExperience(jCrt.getPointExperience() + 2);

       }
    }
}
