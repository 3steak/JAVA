import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {

    /*
     * BufferedReader -> synchrone
     * thread-safe
     * lecture de chaînes de caractères
     * 
     * read() : lire un caractère
     * readline(): lire une chaîne de caractères
     * skip(N) : ignore N caractères
     * 
     * *********************** *
     * 
     * Scanner -> asynchrone
     * not thread-safe
     * lecture de données + parsing ( demande plus de ressources)
     */
    public static void main(String[] args) {

        try {
            // mis en place de lecture du flux d'entré
            // Sytem.in correspond à l'input keyboard
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);

            // BuffredReader nous permet de lire inputstream
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // toute chaine de caractrères doit etre stocker

            System.out.print("Comment tu te nommes ?");
            String name = bufferedReader.readLine();

            System.out.println(name);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
