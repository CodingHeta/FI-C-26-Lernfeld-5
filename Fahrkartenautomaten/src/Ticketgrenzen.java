import java.util.Scanner;

public class Ticketgrenzen {
    public static void main(String[] args) {
        double ticketpreis;
        int anz_tickets;

        Scanner inputKunde = new Scanner(System.in);

        System.out.print("Geben Sie einen Preis in EUR ein: ");
        ticketpreis = inputKunde.nextDouble();
        System.out.println("Vielen Dank, Sie haben [" + ticketpreis + "] EUR eingegeben.");
        System.out.print("Geben Sie die Anzahl der Tickets an: ");
        anz_tickets = inputKunde.nextInt();
        System.out.println("Vielen Dank, Sie haben [" + anz_tickets + "] Tickets eingegeben.");

        inputKunde.close();
    }
}
