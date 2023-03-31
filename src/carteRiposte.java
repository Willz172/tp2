public abstract class carteRiposte  {

    /**
     * La methode effetDePremierType permet de gerer les effets
     * de premier type lies aux cartes de ripostes.
     *
     * @param jCrt le joueur courant.
     * @param nomCarte le nom des cartes jouees
     * @param numLigne numero de la ligne courante.
     */
    public static void effetDePremierType(Joueur jCrt, String nomCarte, int numLigne) {

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
            System.exit(-1);
        }
    }

    /**
     * La methode effetDeDeuxiemeType permet de gerer les effets
     *  de deuxieme type lies aux cartes de ripostes.
     *
     * @param jCrt le joueur courant.
     * @param jAdv l'adversaire.
     * @param nomCarte le nom de la carte
     */
    public static void effetDeDeuxiemeType(Joueur jCrt, Joueur jAdv, String nomCarte){

        if (jCrt.getCarteEnMain() > 0){

            if (nomCarte.equals("Esquive")) {
                Principal.pile2.removeFirst();

                //Enlever (dépiler) la carte au sommet.

            }else if (nomCarte.equals("Vitesse")) {
                String vit = Principal.pile2.getFirst();
                Principal.pile2.addFirst(vit);

                //La carte au sommet est doublée (une copie de la carte au sommet est empilée).

            }
        }
    }
}
