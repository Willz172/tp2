import java.util.Arrays;
import java.util.List;

public class Carte {
    public static List toutesCartes = Arrays.asList("Inspiration",
            "NouvelleEnergie", "Illumination", "RegardeUneDistraction", "CalmeAvantLaTempete",
            "TousPourUn", "PetitVoleur", "PetitePause", "Trance", "BotteSecrete",
            "ApprendreParMesErreurs", "CoupDroit", "Fouette", "Fleche", "Oups",
            "JaiCompris", "Esquive", "Vitesse" );

      public static void validerCarte(String nomCarte, int numLigne) {
        if (!(toutesCartes.contains(nomCarte))) {
            System.err.println( "NOM DE LA CARTE INCORRECTE !"  + numLigne);
            System.exit(-1);
        }

    }
}
