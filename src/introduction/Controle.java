/* Estelle DORIOT                       */
/* Cours sur les structures de controle */

package introduction;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // if ...
        System.out.print("Quel est votre age: ");
        int age = scanner.nextInt();
        if (age >= 16)
            System.out.println("OK, vous pouvez voir ce film");
        if (age < 16)
            System.out.println("Désolé, vous êtes trop jeune pour voir ce film");

        // if ... else ...
        System.out.print("Quel est votre age: ");
        int age2 = scanner.nextInt();
        if (age2 >= 16)
            System.out.println("OK, vous pouvez voir ce film");
        else
            System.out.println("Désolé, vous êtes trop jeune pour voir ce film");

        // opérateurs booléens
        System.out.print("Donnez les longueurs des trois côtés: ");
        double c1 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        double c3 = scanner.nextDouble();
        if ((c1 <= c2 + c3) && (c2 <= c1 + c3) && (c3 <= c1 + c2))
            System.out.println("C'est un triangle !");
        else
            System.out.println("Ce n'est pas un triangle.");

        // structures conditionnelles imbriquées
        System.out.print("Quelle est la température (degrés): ");
        double temperature = scanner.nextDouble();
        if (temperature <= 0) {
            System.out.println("Température négative ou nulle: risque de gel");
            if (temperature < -10)
                System.out.println("Oh là là, c'est le pôle nord ici !");
        } else {
            System.out.println("Température positive");
            if (temperature >= 25)
                System.out.println("Sortez les t-shirts !");
            else if (temperature > 18)
                System.out.println("Il fait encore un peu frisquet.");
            else
                System.out.println("Mais garde ton manteau...");
        }

        // switch
        System.out.println(
                "Veuillez choisir votre plat. Tapez: \n1 pour le gateau au chocolat \n2 pour la glace \n3 pour la tarte tatin \nVotre choix: ");
        int dessert = scanner.nextInt();
        switch (dessert) {
            case 1:
                System.out.println("Vous avez choisi le gateau au chocolat");
                break;
            case 2:
                System.out.println("Vous avez choisi la glace");
                break;
            case 3:
                System.out.println("Vous avez choisi la tarte tatin");
                break;
            default:
                System.out.println("Ce choix n'est pas disponible");
                break;
        }

        // opérateur ternaire
        int nb1 = 10;
        int nb2 = 20;
        int nb3 = (nb1 > nb2) ? nb1 : nb2;
        System.out.println("nb3 = " + nb3);

        // boucle while
        int m = 1;
        while (m <= 10) {
            System.out.println("Bonjour");
            m = m + 1;
        }

        // boucle infinie
        /*
         * int n = 1;
         * System.out.println("début");
         * 
         * while (n > 0)
         * {
         * if (n % 2 == 1)
         * System.out.println("tic");
         * else
         * System.out.println("tac");
         * n = n + 1;
         * }
         * System.out.println("fin");
         */

        // do while
        int mdp = 123456;
        int essai = 0;
        do {
            System.out.print("Veuillez entrer le mot de passe: ");
            essai = scanner.nextInt();
        } while (essai != mdp);

        // boucle for simple
        for (int i = 1; i <= 5; i++)
            System.out.println(i);

        // for et while
        int somme = 0;
        for (int i = 100; i <= 200; i++)
            somme = somme + i;
        System.out.println("La somme est " + somme);

        int somme2 = 0;
        int k = 100;
        while (k <= 200) {
            somme2 = somme2 + k;
            k = k + 1;
        }
        System.out.println("La somme est " + somme2);

        // compteur
        int c = 0;
        for (int j = 1; j <= 50; j++) {
            if (j % 3 == 0)
                c = c + 1;
        }
        System.out.println("Il y a " + c + " nombres divisibles par 3 inférieurs à 50.");

        // accumulateur
        int s = 0;
        for (int p = 1; p <= 50; p++)
            s = s + p;
        System.out.println("Somme des nombres inférieurs à 7: " + s);

        // boucle + if
        System.out.print("Veuillez donner un entier: ");
        int n = scanner.nextInt();
        System.out.println("Voici les nombres pairs inférieurs à " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        // boucles imbriquées
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 2; j++)
                System.out.println(i + " " + j);

        // break
        System.out.print("Donner un entier: ");
        int nombre = scanner.nextInt();
        boolean premier = true;
        for (int i = 2; i < nombre; i++) {
            if (nombre % i == 0) {
                premier = false;
                break;
            }
        }
        if (nombre == 1)
            System.out.println("1 n'est pas premier");
        else if (premier)
            System.out.println(nombre + " est premier");
        else
            System.out.println(nombre + " n'est pas premier");

        scanner.close();
    }

}
