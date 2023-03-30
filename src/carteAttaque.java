public class carteAttaque extends Carte {

    public carteAttaque() {
        super(nomCarte);
    }

    public static void attaque(Joueur jCrt, Joueur jAdv, int numLigne){
        int nbrTrance = 0;

        if(jCrt.getPointAttaque() > 0){
            switch (nomCarte){

                case "Inspiration" :
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 2);
                    break;

                case "NouvelleEnergie" :
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setPointAttaque(jCrt.getPointAttaque() + 2);
                    break;

                case "Illumination":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain((Math.max(jCrt.getCarteEnMain(), 7)));
                    break;

                case "RegardeUneDistraction", "CalmeAvantLaTempete":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() + 1);
                    break;

                case "TousPourUn":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(0);
                    break;

                case "PetitVoleur":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jAdv.setCarteEnMain(Math.max(0, jAdv.getCarteEnMain() - 3));
                    break;

                case "PetitePause":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 1);
                    jAdv.setPointAttaque(jAdv.getPointAttaque() - 1);
                    break;

                case "BotteSecrete", "ApprendreParMesErreurs":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);
                    break;

                case "Trance":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() -1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -nbrTrance);
                    break;

                default:
                    break;

            }

        } else {
            System.out.println("Ligne: " + numLigne +" Joueur: " +
                    jCrt.getNumJoueur() + " carte: " + nomCarte
                    + " NOMBRE DE POINT D'ATTAQUE INSUFFISANT.");
        }
    }

    public static void effetDePremierType(Joueur jCrt, Joueur jAdv, int numLigne) {

        if (jCrt.getCarteEnMain() > 0) {
            attaque( jCrt, jAdv, numLigne);

        } else {
            System.out.println("Ligne: " + numLigne +" Joueur: " +
                    jCrt.getNumJoueur() + " carte: " + nomCarte
                    + " NOMBRE DE CARTE EN MAIN INSUFFISANT.");
        }
    }
    public static void effetDeDeuxiemeType(Joueur jCrt, Joueur jAdv) {

        switch (nomCarte){

            case "CalmeAvantLaTempete":
                jCrt.setPointExperience(jCrt.getPointExperience() + 1);
                break;

            case "PetitVoleur":
                jCrt.setPointExperience(jCrt.getPointExperience() + 1);
                break;

            case "TousPourUn":
                jCrt.setPointExperience(jCrt.getPointExperience() + 3);
                break;

            case "ApprendreParMesErreurs":
                jCrt.setPointExperience(jCrt.getPointExperience() + 3);
                jCrt.setPointDommage(jCrt.getPointDommage() + 1);
                break;

            case "BotteSecrete":
                jCrt.setPointDommage(jCrt.getPointDommage() + 1);
                jAdv.setPointDommage(jAdv.getPointDommage() + 3);
                break;

            case "NouvelleEnergie", "Inspiration", "Illumination",
                    "RegardeUneDistraction", "PetitePause", "Trance":

            default:
                break;

        }
    }
    /*"Inspiration",
            "NouvelleEnergie", "Illumination", "RegardeUneDistraction", "CalmeAvantLaTempete",
            "TousPourUn", "PetitVoleur", "PetitePause", "Trance", "BotteSecrete",
            "ApprendreParMesErreurs", "CoupDroit", "Fouette", "Fleche", "Oups",
            "JaiCompris", "Esquive", "Vitesse" */

}
