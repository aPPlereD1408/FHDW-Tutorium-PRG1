package de.fhdw.prg1.bfwc423a.kru.tutorium20231205;

public class IfUndSwitch {
    public static void main(String[] args) {
        int i = 5;
        String output = "i ist ";

        // if-Abfrage
        System.out.println("if-Abfrage:");
        /**
         * if (Bedingung) {
         *     Codeblock, wenn Bedingung wahr ist.
         * } else if (Bedingung) {
         *     Codeblock, wenn Bedingung wahr ist.
         * } else {
         *     Codeblock, wenn keine der vorherigen Bedingungen wahr ist.
         * }
         */
        if (i == 0) {
            System.out.println(output + 0);
        } else if (i == 1) {
            System.out.println(output + 1);
        } else if (i == 2) {
            System.out.println(output + 2);
        } else if (i == 3) {
            System.out.println(output + 3);
        } else {
            System.out.println("i ist entweder kleiner als 0 oder größer als 3!");
        }

        // Switch-Case
        System.out.println("\nSwitch-Case:");
        // i = 5
        switch (i) {
            case 0:
                System.out.println(output + 0);
                break; // beenden
            case 1:
                System.out.println(output + 1);
                break;
            case 2:
                System.out.println(output + 2);
                break;
            case 3:
                System.out.println(output + 3);
                break;
            default:
                System.out.println("i ist entweder kleiner als 0 oder größer als 3!");
        }

        // weiteres Bsp:
        String s = "c";
        switch (s) {
            case "a":
                System.out.println("Hallo");
                break;
            case "b":
                System.out.println("Java");
                break;
            default:
                System.out.println("s ist werder \"a\" noch \"b\"");
        }
    }
}
