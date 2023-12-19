package de.fhdw.prg1.bfwc423a.kru.vorlesung20231201;

import java.util.Arrays;

public class ListeAufgabe {
    public static void main(String[] args) {
        // List
        List l = new List();
        l.insert(0, 200);
        l.insert(1, 100);
        l.insert(2, 50);
        l.insert(3, 25);

        // a)
        System.out.println("a) als Array: " + Arrays.toString(l.toArray()));

        // b)
        System.out.println("b) erstes Element: " + l.getFirst());
        System.out.println("   zweites Element: " + l.getSecond());

        System.out.println(); // Zeilenumbruch

        // c) Stack
        Stack lStack = l.toStack();
        lStack.pop();
        lStack.push(20);
        System.out.println("c) als Stack + neues Element: " + Arrays.toString(lStack.toArray()));

        // d) mit der Liste passiert nichts
        System.out.println("d) " + Arrays.toString(l.toArray()) + " (also passiert nichts mit der originalen Liste)");

        // e) Queue
        Queue lQueue = l.toQueue();
        lQueue.append(20);
        System.out.println("e) als Queue: " + Arrays.toString(lQueue.toArray()));

        System.out.println(); // Zeilenumbruch

        // f)
        System.out.println("f) Stack: " + Arrays.toString(lStack.toArray()));
        // Stack zu List
        List newListFromStack = lStack.toList();
        newListFromStack.insert(4, 10);
        System.out.println("   List: " + Arrays.toString(newListFromStack.toArray()));
        // Stack zu Queue
        Queue newQueueFromStack = lStack.toQueue();
        newQueueFromStack.append(10);
        System.out.println("   Queue: " + Arrays.toString(newQueueFromStack.toArray()));

        System.out.println(); // Zeilenumbruch

        // g)
        System.out.println("g) Queue: " + Arrays.toString(lQueue.toArray()));
        // Queue zu List
        List newListFromQueue = lQueue.toList();
        newListFromQueue.insert(5, 10);
        System.out.println("   List: " + Arrays.toString(newListFromQueue.toArray()));
        // Queue zu Stack
        Stack newStackFromQueue = lQueue.toStack();
        newStackFromQueue.push(10);
        System.out.println("   Stack: " + Arrays.toString(newStackFromQueue.toArray()));
    }
}
