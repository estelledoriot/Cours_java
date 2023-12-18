package ch7;

enum Jour {
    LUNDI("lu", "Monday"),
    MARDI("ma", "Tuesday"),
    MERCREDI("me", "Wednesday"),
    JEUDI("je", "Thursday"),
    VENDREDI("ve", "Friday"),
    SAMEDI("sa", "Saturday"),
    DIMANCHE("di", "Sunday");

    String abréviation;
    String anglais;

    Jour(String abréviation, String anglais) {
        this.abréviation = abréviation;
        this.anglais = anglais;
    }

    public void affiche() {
        System.out.println(this.toString().toLowerCase());
    }
}

public class Enums {
    final static int LUNDI = 1;
    final static int MARDI = 2;

    public static void activité(int jour) {
        if (jour == LUNDI) {
            System.out.println("Il y a tennis");
        } else if (jour == MARDI) {
            System.out.println("Il y a piscine");
        }
    }

    public static Jour lendemain(Jour jour) {
        switch (jour) {
            case LUNDI:
                return Jour.MARDI;
            case MARDI:
                return Jour.MERCREDI;
            case MERCREDI:
                return Jour.JEUDI;
            case JEUDI:
                return Jour.VENDREDI;
            case VENDREDI:
                return Jour.SAMEDI;
            case SAMEDI:
                return Jour.DIMANCHE;
            default:
                return Jour.LUNDI;
        }
    }

    public static void main(String[] args) {
        String today = "Lundi";
        if (today.equals("lundi")) {
            System.out.println("Nous somme le premier jour de la semaine");
        }
        Jour courant = Jour.MERCREDI;
        Jour debut = Jour.LUNDI;
        System.out.println(Jour.MARDI.ordinal());
        System.out.println(lendemain(courant));
        debut.affiche();
        System.out.println(debut.anglais);
    }
}
