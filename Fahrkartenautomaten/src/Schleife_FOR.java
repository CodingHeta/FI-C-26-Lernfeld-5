public class Schleife_FOR {
    public static void main(String[] args) {
        //--------------------QUADRATZAHLEN VON 1~10
        /*
        for(int i=1; i<=10; i=i+1) {

            System.out.printf("%d ", i*i);
            // for(ex1, ex2, ex3) { code }
            // ex  1 wird einmal ausgeführt, ex2 definiert die Kondition, um den code auszuführen
            // ex3 wird jedes Mal ausgeführt, nachdem der Code durchlaufen wurde

            // in diesem Fall wird im ersten Durchlauf i gleich 1 gesetzt
            // ex2 in diesem Fall prüft bei jedem Durchlauf, ob i den Wert 10 überschritten hat
            // ist ex2 TRUE, dann wird der Codeblock ausgefuehrt, sonst wird die Schleife nicht ausgeführt
            // i wird nach Durchlauf um 1 erhöht
            // (dann gibt es naemlich ein Ende, da i in dem Fall irgendwann 10 übersteigen wird)
        */

        //--------------------QUADRATZAHLEN VON 10~20
        for(int i=10; i<=20; i++) {
            System.out.printf("%d ", i*i);
        }    
    }
}

