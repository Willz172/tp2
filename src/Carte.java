import java.util.ArrayList;
import java.util.Arrays;
public class Carte {
    static String nomCarte;

    public Carte( String nomCarte) {
        this.nomCarte = nomCarte;
    }

    public static String getNomCarte() {
        return nomCarte;
    }

    public void setNomCarte(String nomCarte) {
        this.nomCarte = nomCarte;
    }

    public static ArrayList carte = new ArrayList<>(Arrays.asList("Inspiration",
            "NouvelleEnergie", "Illumination", "RegardeUneDistraction", "CalmeAvantLaTempete",
            "TousPourUn", "PetitVoleur", "PetitePause", "Trance", "BotteSecrete",
            "ApprendreParMesErreurs", "CoupDroit", "Fouette", "Fleche", "Oups",
            "JaiCompris", "Esquive", "Vitesse" ));

    public static void validerCarte(String nomCarte, int numLigne) {
        if (!(nomCarte.equals(carte))) {
            System.err.println("NOM DE LA CARTE INCORRECTE!" + numLigne);
            System.exit(-1);
        }
    }

     /*"Inspiration", "NouvelleEnergie", "Illumination",
            "RegardeUneDistraction", "CalmeAvantLaTempete", "TousPourUn", "PetitVoleur",
            "PetitePause", "Trance", "BotteSecrete", "ApprendreParMesErreurs", "CoupDroit",
            "Fouette", "Fleche", "Oups", "JaiCompris", "Esquive", "Vitesse"*/

}
