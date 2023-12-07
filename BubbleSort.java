import java.util.Arrays;

public class BubbleSort {
    // Übung: Grundgedanken
    public static void main(String[] args) {
        int[] unsortedArray = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        // Aufgabe 1:
        // Schreibe eine Bubblesort-Methode (ohne Rückgabewert), die ein Integer-Array als Parameter übermittelt bekommt.
        bubbleSort(unsortedArray);

        int[] unsortedArray2 = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        // Aufgabe 2:
        // Schreibe eine Bubblesort-Methode (mit Rückgabewert), die ein Integer-Array als Parameter übermittelt bekommt.
        System.out.println(Arrays.toString(bubbleSortReturn(unsortedArray2)));
        // Mit Arrays.toCopy()
        int[] unsortedArray3 = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        System.out.println(Arrays.toString(bubbleSortReturn2(unsortedArray3)));
        System.out.println(Arrays.toString(unsortedArray3));

        // Aufgabe 3:
        // Gegeben ist ein unsortiertes int-Array und eine int-Variabel sumTarget.
        // Gebt die Elemente aus dem Array zurück, die die sumTarget ergeben.
        int[] ungeradeZahlen = {0, 9, 3, 1, 5, 7, 2, 6, 4, 8};
        int targetSum = 9;
        System.out.println(
                "\nunsortiertes Array: " + Arrays.toString(ungeradeZahlen) + "\n" +
                "vorgegebene Summe: " + targetSum + "\n" +
                "Ausgabe:"
        );
        System.out.println(Arrays.toString(sumTwoElements(ungeradeZahlen, targetSum)));
    }

    /** Methoden **/
    // Aufgabe 1
    static void bubbleSort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = 0; j < unsortedArray.length - 1 - i; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int tempZahl = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = tempZahl;
                }
            }
        }
        System.out.println(Arrays.toString(unsortedArray));
    }

    // Aufgabe 2
    static int[] bubbleSortReturn(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = 0; j < unsortedArray.length - 1 - i; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int tempZahl = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = tempZahl;
                }
            }
        }
        return unsortedArray;
    }

    static int[] bubbleSortReturn2(int[] unsortedArray) {
        int[] copy = Arrays.copyOf(unsortedArray, unsortedArray.length); // Originalarray wird nicht verändert
        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy.length - 1 - i; j++) {
                if (copy[j] > copy[j + 1]) {
                    int tempZahl = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = tempZahl;
                }
            }
        }
        return copy;
    }

    /* Elementensumme eines Arrays */
    // Aufgabe 3
    static int[] sumTwoElements(int[] array, int targetSum) {
        int pointerRight = array.length - 1;
        int pointerLeft = 0;

        if (targetSum > (maxValues(array)[0] + maxValues(array)[1])) { // wenn Target größer als maximale Summe ist
            return new int[0]; // leeres Array
        } else {
            while (pointerLeft < pointerRight) {
                int tempSum = array[pointerLeft] + array[pointerRight];

                if (tempSum == targetSum) {
                    return new int[] {
                            array[pointerLeft], array[pointerRight]
                    };
                } else if (tempSum < targetSum) {
                    pointerLeft++;
                } else {
                    pointerRight--;
                }
            }
        }
        return new int[0];
    }

    static int[] maxValues(int[] array) { // zwei größten Werte des Arrays finden
        array = bubbleSortReturn(array); // Array wird sortiert
        return new int[] {
                array[array.length - 1], array[array.length - 2]
        };
    }
}
