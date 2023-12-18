/* Estelle DORIOT         */
/* Cours sur les tableaux */

package ch5;

public class Tableaux {
    public static void main(String[] args) {
        // création de tableau
        int[] tab = { 15, 7, 20, 3, 10, 11, 16 };
        System.out.println(tab[2]);
        // System.out.println(tab[10]);
        tab[3] = 19;
        System.out.println(tab.length);

        // parcours de tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        for (int elt : tab) {
            System.out.println(elt);
        }

        System.out.println("Maximum du tableau: " + maximum(tab));

        int[] rand = tableau_aleatoire(5);
        for (int elt : rand) {
            System.out.print(elt + " ");
        }
        System.out.println();

        // références
        int[] t1 = new int[3];

        for (int i = 0; i < 3; i++)
            t1[i] = i;

        int[] t2 = new int[2];

        for (int i = 0; i < 2; i++)
            t2[i] = 10 + i;

        // matrices
        int[][] M = {
                { 8, 5, 2, 6 },
                { 3, 4, 7, 9 },
                { 1, 3, 0, 4 }
        };
        int[][] M2 = new int[3][4];
        int[][] t = { new int[3], new int[2] };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] ligne : M2) {
            for (int val : ligne) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

    static int maximum(int[] tab) {
        int maxi = tab[0];
        for (int i = 0; i < tab.length; i++)
            // traitement : on compare l'élément courant au maximum des cases précédentes
            if (tab[i] > maxi)
                maxi = tab[i];
        return maxi;
    }

    static int[] tableau_aleatoire(int taille) {
        int[] tab = new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 10);
        }
        return tab;
    }

}
