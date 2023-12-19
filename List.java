public class List {
    // Instanzvariabel
    ListNode mStartNode;

    // Instanzmethoden
    /**
     * Gibt Größe der Liste zurück
     */
    int size() {
        int result = 0;
        ListNode currentNode = mStartNode;

        while (currentNode != null) {
            currentNode = currentNode.getSuccessor();
            result++;
        }
        return result;
    }

    /**
     * Gibt Listen-Element an "position" zurück
     */
    ListNode getNode(int position)  {
        ListNode currentNode = mStartNode;

        while (position > 0) {
            currentNode = currentNode.getSuccessor();
            position--;
        }
        return currentNode;
    }

    /**
     * Gibt Inhalt des Listen-Elements an "position" zurück
     */
    int get(int position) {
        return getNode(position).getContent();
    }

    /**
     * Gibt erstes Element der Liste zurück
     */
    int getFirst() {
        return get(0);
    }

    /**
     * Wandelt die Liste in ein Array
     */
    int[] toArray() {
        int[] result = new int[size()];
        ListNode next = mStartNode;
        int i = 0;

        while (next != null) {
            result[i] = next.getContent();
            next = next.getSuccessor();
            i++;
        }
        return result;
    }

    /**
     * EInfügen eines neuen Werts an einer neunen Position
     */
    void insert(int position, int newValue) {
        ListNode newNode;

        if (this.size() == 0) {
            newNode = new ListNode();
            newNode.setContent(newValue);
            newNode.setSuccessor(null);
            mStartNode = newNode;
        } else {
            if (position == 0) {
                newNode = new ListNode();
                newNode.setContent(newValue);
                newNode.setSuccessor(mStartNode);
                mStartNode = newNode;
            } else {
                ListNode predecessor;

                newNode = new ListNode();
                newNode.setContent(newValue);
                predecessor = getNode(position - 1);
                newNode.setSuccessor(predecessor.getSuccessor());
                predecessor.setSuccessor(newNode);
            }
        }
    }

    /**
     * Entfernt Element an "position"
     */
    void remove(int position) {
        if (position == 0) {
            mStartNode = getNode(0).getSuccessor();
        } else {
            ListNode predecessor = getNode(position - 1);
            predecessor.setSuccessor(getNode(position).getSuccessor());
        }
    }
}
