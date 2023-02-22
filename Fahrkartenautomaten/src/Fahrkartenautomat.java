import java.util.Scanner;

public class Fahrkartenautomat {
    public static void main(String[] args) {
        // -------- HAUPTPROGRAMM !!
        Scanner uchikomi = new Scanner(System.in);
        double zuZahlen = 0;
        double a;
        double b;
        double c;

        // hier werden die METHODEN Aufgerufen
        gruss();
        zuZahlen = bestellungErfassen(uchikomi);
        a = geldEinzahlung(uchikomi, zuZahlen);
        b = rueckgeld(uchikomi, a);
        // c = muenzRueckgabe(b);
        Bezahlung(uchikomi, b);
        kartenausgabe();
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

    public static double geldEinzahlung(Scanner uchikomi, double c) {
        double eingezahlt = 0;
        double differenz = 0;
        double vorzeichenwechsel = -1;
        
        System.out.print("\nSie können den Betrag jetzt Bezahlen.\n");
        eingezahlt = uchikomi.nextDouble();
        differenz = eingezahlt - c;
        System.out.printf("\nSie haben einen Betrag i.H.v. %.2f EUR eingegeben. Die Differenz beträgt %.2f.\n", eingezahlt, differenz);
        return differenz;
    }

    public static double rueckgeld(Scanner uchikomi, double differenz){
      double vorzeichenwechsel = -1;
      while(differenz < 0){
        System.out.printf("\nBitte Zahlen Sie noch %.2f EUR ein.\n", vorzeichenwechsel*differenz);
        differenz = differenz + uchikomi.nextDouble();
        if(differenz > 0.009) {
          System.out.printf("\nIhr Rückgeld beträgt %.2f.\n", differenz);
        }
      }
      return differenz;
    }

    // insert method here

    // aufgabe 6.3, vanilla code
    /*
    public static double muenzRueckgabe(double e) {
      while (e >= 2.0) { // 2-Euro-Münzen
        System.out.println("2 Euro");
        e = e - 2.0;
      }
      while (e >= 1.0) { // 1-Euro-Münzen
        System.out.println("1 Euro");
        e = e - 1.0;
      }
      while (e >= 0.5) { // 50-Cent-Münzen
        System.out.println("50 Cent");
        e = e - 0.5;
      }
      while (e >= 0.2) { // 20-Cent-Münzen
        System.out.println("20 Cent");
        e = e - 0.2;
      }
      while (e >= 0.1) { // 10-Cent-Münzen
        System.out.println("10 Cent");
        e = e - 0.1;
      }
      while (e >= 0.05) { // 5-Cent-Münzen
        System.out.println("5 Cent");
        e = e - 0.05;
      }
    return e;
    }
    */

    public static double Bezahlung(Scanner uchikomi, double zuZahlenderBetrag) {
      
      // zu gebrauchende Variablen in der Methode
      double nochZuZahlen;
      double eingezahlterGesamtbetrag;
      double eingeworfeneMuenze;
      
      // Geldeinwurf
      eingezahlterGesamtbetrag = 0.0;
      nochZuZahlen = 0.0;
      while (eingezahlterGesamtbetrag < zuZahlenderBetrag)
      // solange eingezahlterGesamtbetrag kleiner als zuZahlenderBetrag ist
      // wird die Schliefe weitergehen
      {
        nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
        // NOCH zu zahlen ist differenz aus zu zahlen und (bereits) eingezahlt
        // nZZ kommt aus der vorherigen Methode
        System.out.printf("Noch zu zahlen: %.2f Euro \n", nochZuZahlen);
        System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro-Schein): ");
        
        eingeworfeneMuenze = uchikomi.nextDouble();
        
        if(eingeworfeneMuenze == 0.05 || eingeworfeneMuenze == 0.10 || eingeworfeneMuenze == 0.20 || eingeworfeneMuenze == 0.50 || eingeworfeneMuenze == 1 || eingeworfeneMuenze == 2 || eingeworfeneMuenze == 5 || eingeworfeneMuenze == 10 || eingeworfeneMuenze == 20) {
        eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
        }else{
          System.out.println(">> Kein gueltiges Zahlungsmittel!");
        }
      }
      
      return eingezahlterGesamtbetrag;
    }

    public static void kartenausgabe() {
      //hh
      System.out.println("\nFahrschein wird ausgegeben");
      System.out.println("==========================\n");
      // fancy Ladebalken implementieren!
    }
}