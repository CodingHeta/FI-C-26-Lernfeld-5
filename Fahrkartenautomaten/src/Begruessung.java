// Gehört zur Übungsreihe "METHODEN" =============

public class Begruessung {
    /*
    Herzlich Willkommen!

    Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:
    (1) - Kurzstrecke AB [2,00 EUR]
    (2) - Einzelfahrschein AB [3,00 EUR]
    (3) - Tageskarte Regeltarif AB [8,80 EUR]
    (4) - 4-Fahrten-Karte AB [9,40 EUR]

     */
    public static void main(String[] args) {
        gruss();
    }

    public static void gruss () {
        System.out.println("Herzlich Willkommen!\n");
        System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\n");
        System.out.println("(1) - Kurzstrecke AB [2,00 EUR]");
        System.out.println("(2) - Einzelfahrschein AB [3,00 EUR]");
        System.out.println("(3) - Tageskarte Regeltarif AB [8,80 EUR]");
        System.out.println("(4) - 4-Fahrten-Karte AB [9,40 EUR]");
    }

}
