import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {


    public static void validerCarteTrance(int nbrTrance, int numLigne){
        if(!(nbrTrance >= 0 && nbrTrance <=4)){
            System.out.println("NOMBRE INVALIDE!" + numLigne);
        }
    }
    public static void main(String[] args) {
        File file;
        int numLigne = 0;
        int nbrTrance;
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
                    int numJoueur = Integer.parseInt(line.split(" ")[0]);
                    Joueur.validerJoueur(numJoueur, numLigne);
                    String nomCarte  = (line.split(" ")[1]);
                    Carte.validerCarte(nomCarte, numLigne);
                    if(nomCarte.equals("Trance")){
                        nbrTrance = Integer.parseInt(line.split(" ")[2]);
                        validerCarteTrance(nbrTrance,numLigne);
                    }
                }


        } catch (Exception ex) {
            System.err.println("Fichier non trouver");
            System.exit(-1);
        }
    }
}