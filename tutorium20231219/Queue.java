package de.fhdw.prg1.bfwc423a.kru.vorlesung20231201;

public class Queue {
    // Instanzvariabeln und Konstruktor
    List mList;
    Queue() {
        mList = new List();
    }

    // Instanzmethoden
    /**
     * Gibt zurück, ob Queue leer ist
     */
    boolean isEmpty() {
        return mList.size() == 0;
    }

    /**
     * Gibt die Größe des Queues an
     */
    int size() {
        return mList.size();
    }

    /**
     * Gibt das erste Element zurück
     */
    int first() {
        return mList.getFirst();
    }

    /**
     * Speichert das erste Element und löscht es dann
     */
    int pop() {
        int result = mList.getFirst();

        mList.remove(0);
        return result;
    }

    /**
     * Hängt neues Element am Ende der Queue an
     */
    void append(int newValue) {
        mList.insert(mList.size(), newValue);
    }

    /**
     * Gibt das größte Element der Queue zurück
     */
    int maximum() {
        int tempHigh = mList.getFirst();

        for (int i = 0; i < mList.size(); i++) {
            if (tempHigh < mList.get(i)) {
                tempHigh = mList.get(i);
            }
        }
        return tempHigh;
    }

    /**
     * Umwandlungen in Array, List und Stack
     */
    int[] toArray() {
        int[] result = new int[size()];
        ListNode next = mList.mStartNode;
        int i = 0;

        while (next != null) {
            result[i] = next.getContent();
            next = next.getSuccessor();
            i++;
        }
        return result;
    }

    // zur List
    List toList() {
        List list = new List();
        ListNode next = mList.mStartNode;

        for (int i = 0; i < size(); i++) {
            list.insert(i, next.getContent());
            next = next.getSuccessor();
        }
        return list;
    }

    // zum Stack
    Stack toStack() {
        Stack stack = new Stack();
        ListNode next = mList.mStartNode;

        for (int i = 0; i < size(); i++) {
            stack.push(next.getContent());
            next = next.getSuccessor();
        }
        return stack;
    }

    // Statische Methoden
    static int sumOfElements(Queue q) {
        int result = 0;
        int next;

        for (int i = 0; i < q.size(); i++) {
            next = q.first();
            result += q.pop();
            q.append(next);
        }
        return result;
    }
}
