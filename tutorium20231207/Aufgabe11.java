public class Aufgabe11 {
    public static void main(String[] args) {
        triangle(2);
    }

    static void triangle(int n) {
        System.out.println("Dreieck der Größe " + n + ":\n");
        if (n <= 0) {
            System.out.println();
        } else if (n == 1) {
            System.out.println("*");
        } else {
            drawTriangle(n);
        }
    }

    static void drawTriangle(int n) {
        System.out.println("*"); // Zeile 1
        for (int i = 0; i < n - 2; i++) {
            drawLines(i + (i + 1));
        }
        drawBottomLine(n);
    }

    static void drawLines(int leerzeichen) {
        System.out.print("*");
        for (int j = 0; j < leerzeichen; j++) {
            System.out.print(" ");
        }
        System.out.print("*\n");
    }

    static void drawBottomLine(int n) {
        for (int i = 0; i < n + (n - 1); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
