/* Estelle DORIOT          */
/* Cours sur les fonctions */

package ch4;

import java.util.Scanner;

public class Fonctions {
    static int a = 8; // variable de classe

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        hello();
        hello("Alice");
        hello("Bob");

        System.out.print("Veuillez donner votre prenom: ");
        String prenom = scanner.next();
        System.out.print("Veuillez donner votre nom: ");
        String nom = scanner.next();
        hello(prenom + " " + nom);

        System.out.println(max1(3, 7));
        System.out.println(max1(9, 4));
        System.out.println(max1(max1(4, 9), 6));
        // System.out.println(max2(max2(4, 9), 6));

        System.out.println("Factorielle 4: " + factorielle(4));
        // System.out.println("a = " + a);

        for (int i = 1; i <= 3; i++)
            System.out.println("Hello !");
        // System.out.println("i = " + i);

        int b = truc(3); // utilise la variable a
        System.out.println("b = " + b);

        incremente1(); // modification de a
        System.out.println("a = " + a);

        int a = 8;
        a = incremente(a);
        System.out.println("a = " + a);

        scanner.close();
    }

    public static void hello() {
        System.out.println("Hello world !");
    }

    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static int max1(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void max2(int a, int b) {
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static int puissance(int a, int n) {
        int resultat = 1;
        for (int i = 1; i <= n; i++)
            resultat *= a;
        return resultat;
        // System.out.println("C'est inutile d'écrire ici");
    }

    public static boolean est_pair(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean est_pair2(int n) {
        return n % 2 == 0;
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int addition(int x, int y, int z) {
        return x + y + z;
    }

    public static int factorielle(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++)
            a = a * i;
        return a;
    }

    public static int truc(int n) {
        return n * a;
    }

    public static void incremente1() {
        a++;
    }

    public static int incremente(int b) {
        b++;
        return b;
    }

    /*
     * public static String signe(int a) {
     * if (a > 0)
     * return "positif";
     * if (a < 0)
     * return "négatif";
     * }
     */
}
