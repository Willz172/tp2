public class carteRiposte extends Carte {
    public carteRiposte() {
        super(nomCarte);
    }

    public static void effetDePremierType(Joueur jCrt, Joueur jAdv) {

        while (jCrt.getCarteEnMain() > 0 && jCrt.getPointAttaque() > 0) {

             if (nomCarte.equals("Esquive")) {
                 jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);

             } else if (nomCarte.equals("Vitesse")) {
                 jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
             }
        }
    }

    public static void effetDeDeuxiemeType(Joueur jCrt, Joueur jAdv){


        if (nomCarte.equals("Esquive")) {
            //Enlever (dépiler) la carte au sommet.

        } else if (nomCarte.equals("Vitesse")) {
            //La carte au sommet est doublée (une copie de la carte au sommet est empilée).

        }
    }
}
