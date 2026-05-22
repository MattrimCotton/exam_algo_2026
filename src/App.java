import java.util.Random;

/**
 * Simulation de lancers de dés polyédriques standard.
 */
public class App {

    private static final Random hasard = new Random();

    /**
     * Simule le lancer d'un dé à {@code faces} faces.
     *
     * @param faces nombre de faces du dé (doit être &gt; 0)
     * @return un entier aléatoire entre 1 et {@code faces} inclus,
     *         ou -1 si {@code faces} est invalide
     */
    public static int lancerDe(int faces) {
        if (faces <= 0) {
            System.err.println("Erreur : le nombre de faces doit être supérieur à 0.");
            return -1;
        }
        return hasard.nextInt(faces) + 1;
    }

    public static void main(String[] args) {
        System.out.println("Résultat du d4  : " + lancerDe(4));
        System.out.println("Résultat du d6  : " + lancerDe(6));
        System.out.println("Résultat du d8  : " + lancerDe(8));
        System.out.println("Résultat du d10 : " + lancerDe(10));
        System.out.println("Résultat du d12 : " + lancerDe(12));
        System.out.println("Résultat du d20 : " + lancerDe(20));
    }
}
