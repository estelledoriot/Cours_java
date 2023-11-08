/* Estelle DORIOT                      */
/* Cours sur les chaînes de caractères */

package introduction;

public class Chaines {
    public static void main(String[] args) {
        // chaînes de caractères
        String chaine = "abcd";
        char[] data = { 'a', 'b', 'c' };
        String chaine3 = new String(data);
        System.out.println(chaine3);
        String phrase = "Un test\nUn test\n\"Un test\"...";
        System.out.println(phrase);

        // opérations
        System.out.println(chaine.length());
        System.out.println(chaine.charAt(2));
        String ch1 = "Bonjour ";
        String ch2 = "John";
        String ch3 = "bonjour ";
        System.out.println(ch1 + ch2);
        int age = 20;
        System.out.println("Vous avez " + age + " ans.");

        // comparaisons
        System.out.println(ch1.equals(ch2));
        System.out.println(ch1.equalsIgnoreCase(ch3));
        System.out.println(ch1.compareTo(ch2));

        String CH1 = "bonjour";
        String CH2 = "bonsoir";
        String CH = CH1;
        CH1 = CH2;
        CH2 = CH;
        System.out.println(CH1);
        System.out.println(CH2);

        // parcours de chaîne
        for (int i = 0; i < ch1.length(); i++) {
            System.out.println(ch1.charAt(i));
        }

        // reconstitution
        String chaine1 = "Les sanglots longs des violons de l'automne";
        String chaine2 = "";
        String voyelles = "aeiouy";

        for (int i = 0; i < chaine1.length(); i++) {
            if (voyelles.indexOf(chaine1.charAt(i)) != -1) {
                chaine2 += chaine1.charAt(i);
            }
        }
        System.out.println(chaine2);

        // méthodes sur les chaînes de caractères

    }

}
