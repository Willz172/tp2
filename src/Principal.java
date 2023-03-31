import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Principal {

    static Deque<String> pile = new ArrayDeque<>();
    static Deque<String> pile2 = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        File file;
        int numLigne = 1;
        Joueur joueur1 = new Joueur(0);
        Joueur joueur2 = new Joueur(1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter le nom du fichier: ");
        String fileName = scanner.nextLine();

        try {
            file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
                while ((line = br.readLine()) != null) {
                    pile.addLast(line);
                    int numJoueur = Integer.parseInt(line.split(" ")[0]);
                    Joueur.validerJoueur(numJoueur, numLigne);
                    Joueur joueurCo = numJoueur==0?joueur1:joueur2;
                    Joueur joueurAv = numJoueur==0?joueur1:joueur2;
                    String nomCarte  = (line.split(" ")[1]);
                    Carte.validerCarte(nomCarte, numLigne);
                    switch (nomCarte){
                        case "Inspiration", "NouvelleEnergie", "Illumination", "RegardeUneDistraction",
                                "CalmeAvantLaTempete", "TousPourUn", "PetitVoleur", "PetitePause",
                                "BotteSecrete", "ApprendreParMesErreurs" -> {

                            carteAttaque.effetDePremierType(joueurCo,joueurAv,nomCarte,numLigne);
                        }
                        case "CoupDroit", "Fouette", "Fleche" -> {
                            carteDommage.effetDePremierType(joueurCo,nomCarte,numLigne);
                        }
                        case "Oups", "JaiCompris" -> {
                            carteExperience.effetDePremierType(joueurCo,nomCarte,numLigne);
                        }
                        case "Esquive", "Vitesse" -> {
                            carteRiposte.effetDePremierType(joueurCo,nomCarte,numLigne);
                        }
                        case "Trance"->{
                            int nbrTrance = Integer.parseInt(line.split(" ")[2]);
                            carteAttaque.effetDePremierTypeTrance(joueurCo,joueurAv,nbrTrance,nomCarte,numLigne);

                        }
                    }
                    numLigne++;
                }
            while (!(pile.isEmpty())){
                String linepile = pile.removeLast();
                int numJoueur = Integer.parseInt(linepile.split(" ")[0]);
                Joueur joueurCo = numJoueur==0?joueur1:joueur2;
                Joueur joueurAv = numJoueur==0?joueur1:joueur2;
                String nomCarte  = (linepile.split(" ")[1]);
                switch (nomCarte){
                    case "Inspiration", "NouvelleEnergie", "Illumination", "RegardeUneDistraction",
                            "CalmeAvantLaTempete", "TousPourUn", "PetitVoleur", "PetitePause",
                            "BotteSecrete", "ApprendreParMesErreurs", "Trance" -> {

                        carteAttaque.effetDeDeuxiemeType(joueurCo,joueurAv,nomCarte);
                    }
                    case "CoupDroit", "Fouette", "Fleche" -> {
                        carteDommage.effetDeDeuxiemeType(joueurCo,joueurAv,nomCarte);
                    }
                    case "Oups", "JaiCompris" -> {
                        carteExperience.effetDeDeuxiemeType(joueurCo,joueurAv,nomCarte);
                    }
                    case "Esquive", "Vitesse" -> {
                        carteRiposte.effetDeDeuxiemeType(joueurCo,joueurAv,pile,nomCarte);
                    }

                }

            }
            System.out.println( "Joueur "  + joueur1.getNumJoueur()+ " " + "dommage "+ joueur1.getPointDommage()+ " " + "expérience "+ joueur1.getPointExperience());
            System.out.println( "Joueur "  + joueur2.getNumJoueur()+ " " + "dommage "+ joueur2.getPointDommage()+ " " + "expérience "+ joueur2.getPointExperience());

        } catch (Exception ex) {
            System.err.println("Fichier non trouver");
            System.exit(-1);
        }
    }
}