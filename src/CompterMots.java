import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileWriter;

public class CompterMots {
    public static int compterMots(String f) throws IOException {
        BufferedReader lecteur = new BufferedReader(new FileReader(f));
        String ligne ;
        int compteurMots = 0;

        while((ligne = lecteur.readLine()) != null) {
            String[] mots = ligne.trim().split("\\s+");
            compteurMots += mots.length;
        }
        lecteur.close();
        return compteurMots;
    }

    //retourner les mots dans un tableau
    public static String[] extraireMots(String f) throws IOException {
        BufferedReader lecteur = new BufferedReader(new FileReader(f));
        String ligne;
        ArrayList<String> listeMots = new ArrayList<>();

        while ((ligne = lecteur.readLine()) != null) {
            String[] mots = ligne.trim().split("\\s+");
            listeMots.addAll(Arrays.asList(mots));
        }
        lecteur.close();
        return listeMots.toArray(new String[0]);
    }

    //tri par insertion
    public static void trierMots(String[] mots) {
        for (int i = 1; i < mots.length; i++) {
            String motActuel = mots[i];
            int j = i - 1;
        }
    }

    //afficher les mots en tableau
    public static void afficher(String[] mots) {
        System.out.println(Arrays.toString(mots));
    }

    //enregistrer les mots dans un fichier
    public static void enregistrer(String[] mots, String fichierEnreg) throws IOException {
        FileWriter writer = new FileWriter(fichierEnreg);
        writer.write(Arrays.toString(mots)); //tableau sous forme de motsdans le fichier
        writer.close();
        System.out.println("fichier enregistre dans: " + fichierEnreg);
    }

    public static void main(String[] args){
        try{
            String f = "C:\\users\\HP\\Desktop\\texto.txt";
//            String fichierEnreg = "C:\\users\\HP\\Desktop\\f2.txt";

            int nombreDeMots = compterMots(f);

            System.out.println("Le nombre de mots est: " + nombreDeMots);

            String[] mots = extraireMots(f);

            // Trier les mots avec un tri par insertion
            trierMots(mots);

            // Afficher les mots triés
            System.out.println("Mots triés : ");
            afficher(mots);

            //enrgistrer les mots dans un autre fichier
//            enregistrer(mots, fichierEnreg);
        }
        catch (IOException e) {
            {
                e.printStackTrace();
            }
        }
    }
}
