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
