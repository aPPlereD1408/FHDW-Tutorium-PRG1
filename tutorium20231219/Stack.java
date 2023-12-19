package de.fhdw.prg1.bfwc423a.kru.vorlesung20231201;

public class Stack {
    // Konstruktor und Instanzvariabel
    List mList;
    Stack() {
        mList = new List();
    }

    // Instanzmethoden
    /**
     * Gibt zurück, ob Stack leer ist
     */
    boolean isEmpty() {
        return mList.size() == 0;
    }

    /**
     * Gibt die Größe des Stacks zurück
     */
    int size() {
        return mList.size();
    }

    /**
     * Gibt das erste bzw. oberste Element zurück
     */
    int top() {
        return mList.getFirst();
    }

    /**
     * Entfernt oberstes Element
     */
    int pop() {
        int result = mList.getFirst();

        mList.remove(0);
        return result;
    }

    /**
     * Fügt neues Element an erste Stelle ein
     */
    void push(int newValue) {
        mList.insert(0, newValue);
    }

    /**
     * Umwandlungen in Array, List und Queue
     */
    // zum Array
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

    // zu Queue
    Queue toQueue() {
        Queue queue = new Queue();
        ListNode next = mList.mStartNode;

        for (int i = 0; i < size(); i++) {
            queue.append(next.getContent());
            next = next.getSuccessor();
        }
        return queue;
    }

    // Statische Methoden
    static int getSecondFromTop(Stack s) {
        int result;
        int buffer;

        buffer = s.pop();
        result = s.top();
        s.push(buffer);
        return result;
    }
}
