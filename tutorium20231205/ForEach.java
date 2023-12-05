package de.fhdw.prg1.bfwc423a.kru.tutorium20231205;

public class ForEach {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // "normale" For-Schleife
        /**
         * for (Startwert des Zählers; Bedingung für den Zähler; Zähler wird erhöht) {
         *      Codeblock, der so lange ausgeführt wird, bis Bedingung des Zählers erfüllt ist.
         * }
         */
        System.out.println("\"normale\" For-Schleife:");
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }

        System.out.println("\n"); // doppelter Zeilenumbruch

        System.out.println("For:Each-Schleife:");
        // for : each
        for (int e : test) {
            System.out.printf("%d ", e); // neue Formatierung, wie String.format()
        }

        /**
         * eine For:Each-Schleife vereinfacht das (fortlaufende) Iterieren eines Arrays
         * das iterierende Element muss vom selben Typ wie das Array sein.
         */

        System.out.println("\n"); // doppelter Zeilenumbruch

        System.out.println("Bsp: Kann keine For:Each-Schleife");
        // Wofür eine For:Each-Schleife nicht geeignet ist:
        // Bsp: jedes zweite Element soll ausgegeben werden:
        for (int i = 0; i < test.length; i += 2) {
            System.out.print(test[i] + " ");
        }

        System.out.println();

        NeuKlasse.hallo();
        NeuKlasse.hallo2();
        boolean ad = NeuKlasse.isGleich(7, 7);
        System.out.println(ad);


        // Stringvergleich
        String s1 = "CR7";
        String s2 = "LM10";

        if (s1.equals(s2)) {
            System.out.println("Hallo");
        }
    }
}

class NeuKlasse {
    static void hallo() {
        int o = 1;
        o = o + 1;
        o++;
        o *= 2;
        System.out.println(o);
    }

    static void hallo2() {
        int hallo = hallo3();
        System.out.println(hallo);
    }

    static int hallo3() {
        int result = 42;
        return result;
    }

    static boolean isGleich(int i, int o) {
        return i == o;
    }
}
