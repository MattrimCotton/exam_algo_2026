import java.util.Random;

public class App {

    public static int lancerDe(int faces) {
        if (faces <= 0) {
            System.out.println("Erreur, Veuillez réessayer.");
        } else {
            return -1;
        }
        Random hasard = new Random();
        hasard.nextInt();
        int resultat = hasard.nextInt(faces) + 1;
        return resultat;
    }

    public static void main(String[] args) {
        int resultatD4 = lancerDe(4);
        System.out.println("Résultat du d4 : " + resultatD4);

        int resultatD20 = lancerDe(20);
        System.out.println("Résultat du d20 : " + resultatD20);
    }
}