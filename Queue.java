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
