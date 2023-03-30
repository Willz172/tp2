public class carteRiposte extends Carte {
    public carteRiposte() {
        super(nomCarte);
    }

    public void effetDePremierType(Joueur jCrt, Joueur jAdv, int numLigne, int nbrTrance) {

        if (jCrt.getCarteEnMain() > 0) {

             if (nomCarte.equals("Esquive")) {
                 Joueur.carteJouer.push("Esquive");
                 jCrt.setCarteEnMain(jCrt.getCarteEnMain() - 1);

             } else if (nomCarte.equals("Vitesse")) {
                 Joueur.carteJouer.push("Vitesse");
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
             Joueur.carteJouer.pop();

        }else if (nomCarte.equals("Vitesse")) {
            String sommet = Joueur.carteJouer.peek();
            Joueur.carteJouer.push(sommet);

        }
    }
}
