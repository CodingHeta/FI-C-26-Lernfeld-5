// Gehört zur Übungsreihe "METHODEN" =============

public class Mittelwert {
    public static void main(String[] args) {

        // (E) "Eingabe"
        // Werte für x und y festlegen:
        // ===========================
        double x = 949.024134;
        double y = 123.34;
                
        // (V) Verarbeitung
        // Mittelwert von x und y berechnen:
        // ================================
        double m = berechneMittelwert(x ,y);
        // (A) Ausgabe
        // Ergebnis auf der Konsole ausgeben:
        // =================================
        System.out.printf("Der Mittelwert von %.2f und %.2f ist %.2f\n", x, y, m);
    }
    public static double berechneMittelwert (double a, double b) //Methodenkopf
    {
        double z;
        z = (a + b) / 2.0; //Methodenrumpf
        return z;
    }


}
