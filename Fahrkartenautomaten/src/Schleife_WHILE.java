public class Schleife_WHILE {
    public static void main(String[] args) {
        int i = 10;
        while(i <= 20) {
            if (i == 11) {
                i = i+1;
                continue; // CONTINUE überspringt den Block (alles nach CONTINUE kommt!)..
                // ..in der beschriebenen Bedingung
            }
            if (i == 18) break; // BREAK bricht Schleife bei Bedingung ab
            System.out.printf("%d ", i*i);
            i = i+1;
        
        // im Unterscheid zu FOR wird hier nur die Bedingung angegeben
        // Block läuft solange die Bedingung (in dem Fall i<= 10) erfüllt
        // Interpretation: WHILE ist "einfachere" Version von FOR, man kann FOR Funktion einbauen..
        // ..aber man muss die im Codeblock implementieren
        }
    }
}
