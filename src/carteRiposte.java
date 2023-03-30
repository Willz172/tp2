public class carteRiposte extends Carte {
    public carteRiposte() {
        super(nomCarte);
    }

    public void effetDePremierType(Joueur jCrt, Joueur jAdv, int numLigne) {

        if (jCrt.getCarteEnMain() > 0) {

             if (nomCarte.equals("Esquive")) {
                 jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);

             } else if (nomCarte.equals("Vitesse")) {
                 jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);
             }

        }else{
            System.out.println("Ligne: " + numLigne +" Joueur: " +
                    jCrt.getNumJoueur() + " carte: " + nomCarte
                    + " NOMBRE DE CARTE EN MAIN INSUFFISANT.");
        }
    }

    public void effetDeDeuxiemeType(Joueur jCrt, Joueur jAdv){


        if (nomCarte.equals("Esquive")) {
            //Enlever (dépiler) la carte au sommet.

        }else if (nomCarte.equals("Vitesse")) {
            //La carte au sommet est doublée (une copie de la carte au sommet est empilée).

        }
    }
}
