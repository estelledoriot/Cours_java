/* Estelle DORIOT           */
/*  Cours sur les variables */

package ch2;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        /* operateurs arithmetiques */
        /* ************************ */

        // addition de deux entiers
        System.out.println("5 + 3 = " + (5 + 3) + " -> resultat entier");
        // addition d'un entier et d'un flottant
        System.out.println("5.0 + 3 = " + (5.0 + 3) + " -> resultat flottant");
        // division de deux entiers (! division euclidienne)
        System.out.println("5 / 3 = " + (5 / 3) + " -> resultat entier");
        // division de deux flottants
        System.out.println("5.0 / 3.0 = " + (5.0 / 3.0) + " -> resultat flottant");
        // operateur modulo
        System.out.println("5 % 3 = " + (5 % 3) + " -> resultat entier");

        /* operateurs de comparaison */
        /* ************************* */

        // on peut comparer un entier et un flottant
        System.out.println(3 < 9.5);
        // les caractères sont comparés avec l'ordre alphabétique
        System.out.println('b' < 'f');

        /* operateurs de booléens */
        /* ********************** */

        System.out.println((3 == 3) || (9 > 24));
        System.out.println((9 > 24) && (3 == 3));

        /* operateurs de cast */
        /* ****************** */

        int n = 5;
        double m = (double) n;
        System.out.println(m);

        /* sorties */
        /* ******* */

        System.out.println("Bonjour");
        System.out.println("3.5");
        String nom = "John";
        int age = 30;
        System.out.println(nom + " a " + age + " ans.");

        /* entrées */
        /* ******* */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom2 = scanner.nextLine();
        System.out.println("Bonjour " + nom2);

        System.out.print("Entrez votre age : ");
        int age2 = scanner.nextInt();
        System.out.println("Vous avez " + (77 - age2) + " ans de différence avec le Père Noël");
        System.out.print("Voulez-vous continuer? (o pour oui, n pour non) ");
        char reponse = scanner.next().charAt(0);
        System.out.println(reponse);
        scanner.close();
    }
}
