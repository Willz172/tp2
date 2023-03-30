public class carteAttaque extends Carte {

    public carteAttaque() {
        super(nomCarte);
    }

    public static void effetDePremierType(Joueur jCrt, Joueur jAdv) {
        int nbrTrance = 0;

        while (jCrt.getCarteEnMain() > 0 && jCrt.getPointAttaque() > 0) {

                if(nomCarte.equals("Inspiration")) {
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 2);

                } else if (nomCarte.equals("NouvelleEnergie")) {
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setPointAttaque(jCrt.getPointAttaque() + 2);

                } else if (nomCarte.equals("Illumination")) {
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain((Math.max(jCrt.getCarteEnMain(), 7)));

                } else if (nomCarte.equals("RegardeUneDistraction")) {
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() + 1);

                } else if (nomCarte.equals("CalmeAvantLaTempete")) {
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() + 1);

                } else if (nomCarte.equals("TousPourUn")) {
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(0);

                } else if (nomCarte.equals("PetitVoleur")) {
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jAdv.setCarteEnMain(Math.max(0, jAdv.getCarteEnMain() - 3));

                } else if (nomCarte.equals("PetitePause")) {
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() + 1);
                    jAdv.setPointAttaque(jAdv.getPointAttaque() - 1);

                } else if (nomCarte.equals("BotteSecrete")) {
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                } else if (nomCarte.equals("ApprendreParMesErreurs")) {
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
                    jCrt.setPointAttaque(jCrt.getPointAttaque() - 1);

                } else if (nomCarte.equals("Trance")) {
                        jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                        jCrt.setPointAttaque(jCrt.getPointAttaque() -1);

                        jCrt.setCarteEnMain(jCrt.getCarteEnMain() -nbrTrance);


                }
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
}
