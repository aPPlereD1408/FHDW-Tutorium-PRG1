import java.util.Arrays;

public class Methoden {
    public static void main(String[] args) {
        System.out.println("Aufgabe 3:");
        // Aufgabe 1:
        // Schreibt eine Methode, welche ein Array eurer Wahl als Parameter übermittelt bekommt.
        // Das Array soll fortlaufend in der Konsole ausgegeben werden.
        int[] testIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Aufgaben.arrayAusgabe1(testIntArray);
        String[] testStringArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        Aufgaben.arrayAusgabe2(testStringArray);

        System.out.println("\n\nAufgabe 4:");
        // Aufgabe 2:
        // Schreibt eine Methode, welche zwei Integer als Parameter übermittelt.
        // Die Methode soll zurückgeben, welche Zahl größer ist.
        int zahl1 = 1, zahl2 = 2;
        System.out.println("Zahl 1: " + zahl1 + "\n" + "Zahl 2: " + zahl2);
        Aufgaben.groessereZahl(zahl1, zahl2); // Was wird hier ausgeben?
        String ausgabe = Aufgaben.groessereZahl(zahl1, zahl2);
        System.out.println(ausgabe);

        System.out.println("\nAufgabe 5:");
        // Aufgabe 3:
        // Schreibt eine Methode, die
        // a) zwei double-Werte als Parameter übermittelt und das Produkt zurückgebt.
        // b) zwei Integer als Parameter übermittelt und ausgibt, ob beide gleich sind (kein String).
        // c) ein Array als Parameter übermittelt und als leeres-Array zurückgibt.
        System.out.println("a) " + Aufgaben.doubleProdukt(2.0, 3.0) + ", Produkt aus " + 2.0 + " und " + 3.0);
        System.out.println("b) " + Aufgaben.istGleich(1, 1) + ", Sind " + 1 + " und " + 1 + " gleich?");
        int[] befuelltesArray = {1, 2, 3, 4};
        System.out.println("c) " + Arrays.toString(Aufgaben.nullArray(befuelltesArray)) + ", leeres Array");
        int[] leeresArray = Aufgaben.nullArray(befuelltesArray);
        Aufgaben.arrayAusgabe1(leeresArray);

        System.out.println("\nZusatzaufgabe Taschenrechner:");
        // Taschenrechner
        double rechnerZahl1 = 15.0;
        double rechnerZahl2 = 7.0;
        char rechenOperation = '/';
        Rechner.rechner(rechnerZahl1, rechnerZahl2, rechenOperation);
    }
}

class Aufgaben {
    // Aufgabe 1:
    static void arrayAusgabe1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Zeilenumbruch
    }
    static void arrayAusgabe2(String[] array) {
        for (String e : array) {
            System.out.print(e + " ");
        }
    }
    /**
     * Void-Methoden haben keinen Rückgabewert!
     * Es gibt auch int-, String-, boolean-, double-Methoden
     * Arrays können auch zurückgegeben werden
     */

    // Aufgabe 2:
    static String groessereZahl(int zahl1, int zahl2) {
        if (zahl1 > zahl2) { // Zahl 1 ist größer
            return "Zahl 1 ist größer";
        } else if (zahl1 < zahl2) { // Zahl1 ist kleiner
            return "Zahl 2 ist größer";
        } else { // Beide gleich
            return "Beide Zahlen sind gleich groß";
        }
    }

    // Aufgabe 3:
    // a)
    static double doubleProdukt(double zahl1, double zahl2) {
        return zahl1 * zahl2; // double-Wert wird berechnet (Rückgabe: double)
        /** Selbes Ergebnis:
         * double result = 0;
         * result = zahl1 * zahl2;
         * return result;
         */
    }
    // b)
    static boolean istGleich(int zahl1, int zahl2) {
        return zahl1 == zahl2; // boolische Anweisung (Rückgabe: Boolean)
        /** Selbes Ergebnis:
         * if (zahl1 == zahl2) {
         *    return true;
         * } else {
         *    return false;
         * }
         */
    }
    // c)
    static int[] nullArray(int[] array) {
        // Array-Inhalt wird verändert
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        return array; // Rückgabe
    }
}

class Rechner {
    static void rechner(double zahl1, double zahl2, char rechenOperation) {
        switch (rechenOperation) {
            case '+':
                System.out.println(addition(zahl1, zahl2));
                break;
            case '-':
                System.out.println(subration(zahl1, zahl2));
                break;
            case '*':
                System.out.println(multiplikation(zahl1, zahl2));
                break;
            case '/':
                System.out.println(division(zahl1, zahl2));
                break;
            default:
                System.out.println("Bitte gültige Rechenoperation auswählen!");
                break;
        }
    }

    // Rechenoperationen
    static double addition(double zahl1, double zahl2) {
        return zahl1 + zahl2;
    }

    static double subration(double zahl1, double zahl2) {
        return zahl1 - zahl2;
    }

    static double multiplikation(double zahl1, double zahl2) {
        return zahl1 * zahl2;
    }

    static double division(double zahl1, double zahl2) {
        return zahl1 / zahl2;
    }
}
