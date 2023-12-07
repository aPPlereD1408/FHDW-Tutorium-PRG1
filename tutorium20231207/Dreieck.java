public class Dreieck {
    public static void main(String[] args) {
        int n = -10;
        if (n <= 0) {
            System.out.println();
        } else if (n == 1) {
            System.out.println("*");
        } else {
            // Methode
            Calc.dreieck(n);
        }
    }
}

class Calc {
    static void dreieck(int n) {
        System.out.println("*"); // Zeile 1
        // anderen Linien (Größe des Dreiecks - vorhanden Zeilen)
        for (int i = 0; i < n - 2; i++) {
            anderenLinien(i + i + 1);
        }
        untereLinie(n); // letzte Zeile
    }

    static void anderenLinien(int leerzeichen) {
        System.out.print("*");
        for (int i = 0; i < leerzeichen; i++) {
            System.out.print(" ");
        }
        System.out.print("*\n");
    }

    static void untereLinie(int n) {
        for (int i = 0; i < n + (n -1); i++) {
            System.out.print("*");
        }
    }
}
