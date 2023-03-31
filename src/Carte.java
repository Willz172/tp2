import java.util.Arrays;
import java.util.List;

public abstract class Carte {

    /**
     * La methode List permet d'initialiser une ArrayList qui contient les noms des cartes.
     */
    public static List toutesCartes = Arrays.asList("Inspiration",
            "NouvelleEnergie", "Illumination", "RegardeUneDistraction", "CalmeAvantLaTempete",
            "TousPourUn", "PetitVoleur", "PetitePause", "Trance", "BotteSecrete",
            "ApprendreParMesErreurs", "CoupDroit", "Fouette", "Fleche", "Oups",
            "JaiCompris", "Esquive", "Vitesse" );

    /**
     * La methode validerCarte permet de verifier si le nom de carte trouvee
     * figure dans la liste des cartes.
     *
     * @param nomCarte le nom de la carte.
     * @param numLigne numero de la ligne courante.
     */
      public static void validerCarte(String nomCarte, int numLigne) {
        if (!(toutesCartes.contains(nomCarte))) {
            System.err.println( "NOM DE LA CARTE INCORRECTE !"  + "Ligne:" + numLigne);
            System.exit(-1);
        }

      }

}
