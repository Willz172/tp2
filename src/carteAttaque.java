public abstract class carteAttaque {

    /**
     * La methode effetDePremierType permet de gerer les effets
     * de premier type lies aux cartes d'attaques sauf la carte Trance.
     *
     * @param jCrt le joueur courant.
     * @param jAdv l'adversaire.
     * @param nomCarte le nom des cartes jouees.
     * @param numLigne numero de la ligne courante.
     */
    public static void effetDePremierType(Joueur jCrt, Joueur jAdv, String nomCarte, int numLigne){
        if(jCrt.getCarteEnMain() > 0){

            if(jCrt.getPointAttaque()>0){

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
                }
            } else {
                System.out.println("Ligne: " + numLigne +" Joueur: " +
                        jCrt.getNumJoueur() + " carte: " + nomCarte
                        + " NOMBRE DE POINT D'ATTAQUE INSUFFISANT.");
                System.exit(-1);
            }

        } else {
            System.out.println("Ligne: " + numLigne +" Joueur: " +
                    jCrt.getNumJoueur() + " carte: " + nomCarte
                    + " NOMBRE DE CARTE EN MAIN INSUFFISANTE.");
            System.exit(-1);
        }
    }

    /**
     * La methode effetDePremierType permet de gerer les effets
     * de premier type lies a la carte Trance.
     *
     * @param jCrt le joueur courant.
     * @param jAdv l'adversaire
     * @param nbrTrance le nombre Trance.
     * @param nomCarte le nom des cartes jouees
     * @param numLigne numero de la ligne courante.
     */
    public static void effetDePremierTypeTrance(Joueur jCrt, Joueur jAdv, int nbrTrance,
                                                String nomCarte, int numLigne) {
            if(nbrTrance > 0 && nbrTrance < 4){
                if(jCrt.getPointAttaque() > 0 && jCrt.getCarteEnMain() > nbrTrance){
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() -1);
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -nbrTrance);
                }else{
                    System.out.println("Ligne: " + numLigne +" Joueur: " +
                            jCrt.getNumJoueur() + " carte: " + nomCarte
                            + " NOMBRE DE CARTE EN MAIN INSUFFISANT.");
                    System.exit(-1);
                }

            }else{
                System.out.println("Ligne: " + numLigne +" Joueur: " +
                        jCrt.getNumJoueur() + " carte: " + nomCarte
                        + " NOMBRE SUIVANT LA CARTE TRANCE INCORRECT");
                System.exit(-1);
            }

    }

    /**
     * La methode effetDeDeuxiemeType permet de gerer les effets
     *  de deuxieme type lies aux cartes d'attaques.
     *
     * @param jCrt le joueur courant.
     * @param jAdv l'adversaire.
     * @param nomCarte le nom de la carte
     */
    public static void effetDeDeuxiemeType(Joueur jCrt, Joueur jAdv, String nomCarte) {

        if (jCrt.getCarteEnMain() > 0){
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

    }
    /*"Inspiration",
            "NouvelleEnergie", "Illumination", "RegardeUneDistraction", "CalmeAvantLaTempete",
            "TousPourUn", "PetitVoleur", "PetitePause", "Trance", "BotteSecrete",
            "ApprendreParMesErreurs", "CoupDroit", "Fouette", "Fleche", "Oups",
            "JaiCompris", "Esquive", "Vitesse" */

}
