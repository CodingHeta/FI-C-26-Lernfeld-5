public class Fahrplan {
    public static void main(String[] args) {

        // Weichestellungen
        int fahrzeit = 0;
        char haltInSpandau = 'n';
        char richtungHamburg = 'n';
        char haltInStendal = 'n';
        char endetIn = 'h';

        fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau

        if (haltInSpandau == 'j') {
            fahrzeit = fahrzeit + 2; // Halt in Spandau
        }
        if (richtungHamburg == 'j') {
            fahrzeit += 96;
        }
        else {
            if (haltInStendal == 'j'){
                fahrzeit += 16;
            } // halt in Stendal
            else {
                fahrzeit += 6;
            } // Stendal Umfahrung
            if (endetIn == 'w') {
                fahrzeit += 29;
                System.out.print("Sie erreichen WOLFSBURG nach [" + fahrzeit + "] Minuten");
            } // endet in Wolfsburg
            else if (endetIn == 'h'){
                fahrzeit += 62;
                System.out.print("Sie erreichen HANNOVER nach [" + fahrzeit + "] Minuten");
            } // endet in Hannover
            else if (endetIn == 'b'){
                fahrzeit += 50;
                System.out.print("Sie erreichen BRAUNSCHWEIG nach [" + fahrzeit + "] Minuten");
            } // endet in Hannover
        }
        
   }
}
