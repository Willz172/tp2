public class carteAttaque extends Carte {

    public carteAttaque() {
        super(nomCarte);
    }

    public static void effetDePremierType(Joueur jCrt, Joueur jAdv, int numLigne) {
        int nbrTrance = 0;

        if (jCrt.getCarteEnMain() > 0 && jCrt.getPointAttaque() > 0) {

            switch (nomCarte){

                case "Inspiration":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 2);

                case "NouvelleEnergie":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setPointAttaque(jCrt.getPointAttaque() + 2);

                case "Illumination":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain((Math.max(jCrt.getCarteEnMain(), 7)));

                case "RegardeUneDistraction":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() + 1);

                case "CalmeAvantLaTempete":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() + 1);

                case "TousPourUn":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(0);

                case "PetitVoleur":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jAdv.setCarteEnMain(Math.max(0, jAdv.getCarteEnMain() - 3));

                case "PetitePause":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 1);
                    jAdv.setPointAttaque(jAdv.getPointAttaque() - 1);

                case "BotteSecrete":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                case "ApprendreParMesErreurs":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                case "Trance":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() -1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -nbrTrance);

            }

        } else {
            System.out.println("Ligne: " + numLigne +" Joueur: " +
                    jCrt.getNumJoueur() + " carte: " + nomCarte
                    + " NOMBRE DE CARTE EN MAIN INSUFFISANT.");
        }
    }
    public static void effetDeDeuxiemeType(Joueur jCrt, Joueur jAdv) {

            if(nomCarte.equals("CalmeAvantLaTempete")) {
                jCrt.setPointExperience(jCrt.getPointExperience() + 1);

            } else if (nomCarte.equals("PetitVoleur")) {
                jCrt.setPointExperience(jCrt.getPointExperience() + 1);

            } else if (nomCarte.equals("TousPourUn")) {
                jCrt.setPointExperience(jCrt.getPointExperience() + 3);

            } else if (nomCarte.equals("ApprendreParMesErreurs")) {
                jCrt.setPointExperience(jCrt.getPointExperience() + 3);
                jCrt.setPointDommage(jCrt.getPointDommage() + 1);

            } else if (nomCarte.equals("BotteSecrete")) {
                jCrt.setPointDommage(jCrt.getPointDommage() + 1);
                jAdv.setPointDommage(jAdv.getPointDommage() + 3);

            } else if (nomCarte.equals("NouvelleEnergie")) {

            } else if (nomCarte.equals("Inspiration")) {

            } else if (nomCarte.equals("Illumination")) {

            } else if (nomCarte.equals("RegardeUneDistraction")) {

            } else if (nomCarte.equals("PetitePause")) {

            } else if (nomCarte.equals("Trance")) {

            }
    }
    /*"Inspiration",
            "NouvelleEnergie", "Illumination", "RegardeUneDistraction", "CalmeAvantLaTempete",
            "TousPourUn", "PetitVoleur", "PetitePause", "Trance", "BotteSecrete",
            "ApprendreParMesErreurs", "CoupDroit", "Fouette", "Fleche", "Oups",
            "JaiCompris", "Esquive", "Vitesse" */

    public static void Inspiration (Joueur jCrt, Joueur jAdv, int numLigne){

    }
}
