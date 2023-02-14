import java.util.Scanner;

public class Fahrkartenautomat {
    public static void main(String[] args) {
        // -------- HAUPTPROGRAMM !!
        Scanner uchikomi = new Scanner(System.in);
        double zuZahlen = 0;

        // hier werden die METHODEN Aufgerufen
        gruss();
        zuZahlen = bestellungErfassen(uchikomi);
        karteBezahlen(uchikomi, zuZahlen);

        uchikomi.close();
    }

    public static double bestellungErfassen(Scanner uchikomi) {
        double zuZahlen = 0;
        int anzTickets = 0;
        int wahl = 0;
        double ausgewaehlt = 0;
        double kurzstrecke = 2.00;
        double einzelfahrschein = 3.00;
        double tageskarteRegel = 8.80;
        double vierFahrten = 9.40;

        wahl = uchikomi.nextInt();
        switch(wahl) {
            case 1:
              ausgewaehlt = kurzstrecke;
              break;
            case 2:
            ausgewaehlt = einzelfahrschein;
              break;
            case 3:
            ausgewaehlt = tageskarteRegel;
              break;
            case 4:
            ausgewaehlt = vierFahrten;
              break;
            default:
              ausgewaehlt = 0;
              System.out.print("\nUngültige Eingabe. Es wird kein Ticket ausgewählt.\n");
          }
        System.out.print("\nBitte geben Sie die gewünschte Ticketanzahl ein: ");
        anzTickets = uchikomi.nextInt();
        System.out.print("\nSie haben " + anzTickets + " eingegeben!\n\n");

        zuZahlen = ausgewaehlt * anzTickets;

        System.out.printf("Zu Zahlen: %.2f EUR", zuZahlen);
        
        return zuZahlen;
    }

    public static void gruss() {
        System.out.println("Herzlich Willkommen!\n");
        System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\n");
        System.out.println("(1) - Kurzstrecke AB [2,00 EUR]");
        System.out.println("(2) - Einzelfahrschein AB [3,00 EUR]");
        System.out.println("(3) - Tageskarte Regeltarif AB [8,80 EUR]");
        System.out.println("(4) - 4-Fahrten-Karte AB [9,40 EUR]");
    }

    public static double berechneMittelwert(double a, double b) //Methodenkopf
    
    {
        double z;
        z = (a + b) / 2.0; //Methodenrumpf
        return z;
    }

    public static double karteBezahlen(Scanner uchikomi, double c) {
        double eingezahlt = 0;
        double differenz = 0;
        
        System.out.print("\nSie können den Betrag jetzt Bezahlen.\n");
        eingezahlt = uchikomi.nextDouble();
        differenz = eingezahlt - c;
        System.out.printf("\nSie haben %.2f eingegeben. Die Differenz beträgt %.2f.\n", eingezahlt, differenz);

        return differenz;
    }
}