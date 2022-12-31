import java.util.Scanner;

public class Ticketgrenzen {
    public static void main(String[] args) {
        double ticketpreis;
        int anz_tickets;

        Scanner inputKunde = new Scanner(System.in);

        System.out.print("Geben Sie einen Preis in EUR ein: ");
        ticketpreis = inputKunde.nextDouble();
        System.out.println("Vielen Dank, Sie haben [" + ticketpreis + "] EUR eingegeben.");
    }
}
