import java.util.ArrayList;
import java.util.Arrays;
public class Carte extends Joueur {
    static String nomCarte;
    static carteAttaque carteAttaque;
    static carteNonAttaque carteNonAttaque;

    public Carte(String nomCarte, Carte.carteAttaque carteAttaque, Carte.carteNonAttaque carteNonAttaque) {
        super();
        this.nomCarte = nomCarte;
        this.carteAttaque = carteAttaque;
        this.carteNonAttaque = carteNonAttaque;
    }

    public String getNomCarte() {
        return nomCarte;
    }

    public Carte.carteAttaque getCarteAttaque() {
        return carteAttaque;
    }

    public Carte.carteNonAttaque getCarteNonAttaque() {
        return carteNonAttaque;
    }

    public void setNomCarte(String nomCarte) {
        this.nomCarte = nomCarte;
    }

    public void setCarteAttaque(Carte.carteAttaque carteAttaque) {
        this.carteAttaque = carteAttaque;
    }

    public void setCarteNonAttaque(Carte.carteNonAttaque carteNonAttaque) {
        this.carteNonAttaque = carteNonAttaque;
    }

    public enum carteAttaque{
         Inspiration,NouvelleEnergie,Illumination,RegardeUneDistraction,
         CalmeAvantLaTempete,TousPourUn,PetitVoleur,PetitePause,Trance,
         BotteSecrete, ApprendreParMesErreurs
     }
    public enum carteNonAttaque{
        CoupDroit, Fouette, Fleche,Oups ,JaiCompris,Esquive ,Vitesse
    }
    public static ArrayList carte = new ArrayList(Arrays.asList(carteAttaque, carteNonAttaque));
    public static void validerCarte(String nomCarte) {
        if (!(nomCarte.equals(carte))) {
            System.err.println("NOM DE LA CARTE INCORRECTE! ");
            System.exit(-1);
        }
    }
    Joueur jCrt = new Joueur(0);
    Joueur jAdv = new Joueur(1);

    public static void effetDePremierType(Joueur jCrt, Joueur jAdv){

        while (jCrt.getCarteEnMain() > 0 && jCrt.pointAttaque > 0){
             switch (nomCarte){

                case "Inspiration":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.pointAttaque -1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() +2);
                    break;

                case "NouvelleEnergie":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.pointAttaque -1);

                    jCrt.setPointAttaque(jCrt.pointAttaque +2);
                    break;

                case "Illumination":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.pointAttaque -1);

                    jCrt.setCarteEnMain((Math.max(jCrt.getCarteEnMain(),7)));
                    break;

                case "RegardeUneDistraction", "CalmeAvantLaTempete":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.pointAttaque -1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() +1);
                    jCrt.setPointAttaque(jCrt.pointAttaque +1);
                    break;

                case "TousPourUn":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.pointAttaque -1);

                    jCrt.setCarteEnMain(0);
                    break;

                case "PetitVoleur":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.pointAttaque -1);

                   // jAdv.setCarteEnMain(Math.max(/*0.jAdv.getCarteEnMain()-3*/));
                    break;

                case "PetitePause":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.pointAttaque -1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() +1);
                    jAdv.setPointAttaque(jAdv.pointAttaque -1);
                    break;

                case "BotteSecrete", "ApprendreParMesErreurs":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.pointAttaque -1);
                    break;

                default:
                    break;
            }
        }

        int nbrTrance = 0;
        while (jCrt.getCarteEnMain() > nbrTrance && jCrt.pointAttaque > 0){
           if (nomCarte.equals("Trance")){
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    jCrt.setPointAttaque(jCrt.pointAttaque -1);

                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -nbrTrance);
           }
        }

        while (jCrt.getCarteEnMain() > 0){

            switch (nomCarte){
                case "CoupDroit", "Fleche", "Fouette":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    break;

                case "Oups", "JaiCompris":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    break;

                case "Esquive","Vitesse":
                    jCrt.setCarteEnMain(jCrt.getCarteEnMain() -1);
                    break;

                default:
                    break;
            }

        }
    }
    public static void effetDeDeuxiemeType(Joueur jCrt, Joueur jAdv){
        switch (nomCarte){

            case "CalmeAvantLaTempete":
                jCrt.setPointExperience(jCrt.getPointExperience() +1);
                break;

            case "PetitVoleur":
                jCrt.setPointExperience(jCrt.getPointExperience() +1);
                break;

            case "TousPourUn":
                jCrt.setPointExperience(jCrt.getPointExperience() +3);
                break;

            case "ApprendreParMesErreurs":
                jCrt.setPointExperience(jCrt.getPointExperience() +3);
                jCrt.setPointDommage(jCrt.getPointDommage() +1);
                break;

            case "BotteSecrete":
                jCrt.setPointDommage(jCrt.getPointDommage() +1);
                jAdv.setPointDommage(jAdv.getPointDommage() +3);
                break;

            case "CoupDroit":
                jAdv.setPointDommage(jAdv.getPointDommage() +1);
                break;

            case "Fouette":
                jAdv.setPointDommage(jAdv.getPointDommage() +2);
                break;

            case "Fleche":
                jAdv.setPointDommage(jAdv.getPointDommage() +3);
                break;

            case "Oups":
                jCrt.setPointExperience(jCrt.getPointExperience() +1);
                break;

            case "JaiCompris":
                jCrt.setPointExperience(jCrt.getPointExperience() +2);
                break;

            case "Esquive":
                //Enlever (dépiler) la carte au sommet.
                break;

            case "Vitesse":
                //La carte au sommet est doublée (une copie de la carte au sommet est empilée).
                break;

            case "NouvelleEnergie", "Inspiration", "Illumination",
                    "RegardeUneDistraction", "PetitePause", "Trance":

            default:
                break;

        }
    }
     /*"Inspiration", "NouvelleEnergie", "Illumination",
            "RegardeUneDistraction", "CalmeAvantLaTempete", "TousPourUn", "PetitVoleur",
            "PetitePause", "Trance", "BotteSecrete", "ApprendreParMesErreurs", "CoupDroit",
            "Fouette", "Fleche", "Oups", "JaiCompris", "Esquive", "Vitesse"*/

}
