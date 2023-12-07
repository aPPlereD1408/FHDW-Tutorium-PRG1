package de.fhdw.prg1.bfwc423a.kru.tutorium20231205;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] testArray = {5, 1, 4, 2, 8};
        bubbleSortInt(testArray);
    }

    static void bubbleSortInt(int[] unsortiertesArray) {
        for (int i = 0; i < unsortiertesArray.length; i++) {
            for (int j = 0; j < unsortiertesArray.length - 1 - i; j++) {
                if (unsortiertesArray[j] > unsortiertesArray[j + 1]) {
                    int tempZahl = unsortiertesArray[j];
                    unsortiertesArray[j] = unsortiertesArray[j + 1];
                    unsortiertesArray[j + 1] = tempZahl;
                }
            }
        }
        System.out.println(Arrays.toString(unsortiertesArray));
    }

    static int[] bubbleSortInt2(int[] unsortiertesArray) {
        for (int i = 0; i < unsortiertesArray.length; i++) {
            for (int j = 0; j < unsortiertesArray.length - 1 - i; j++) {
                if (unsortiertesArray[j] > unsortiertesArray[j + 1]) {
                    int tempZahl = unsortiertesArray[j];
                    unsortiertesArray[j] = unsortiertesArray[j + 1];
                    unsortiertesArray[j + 1] = tempZahl;
                }
            }
        }
        return unsortiertesArray;
    }
}
