package U12;

import java.util.ArrayList;

public class DoubleLinkedList<T> implements List<T> {


    /*
     * Head points to the first element of the list and tail to the last
     */
    Node<T> head = new Node<>(null);
    Node<T> tail = new Node<>(null);
    private int ListSize;


    public DoubleLinkedList() {

        ArrayList<Integer> l = new ArrayList<>();

        this.head.next = tail;
        this.tail.prev = head;
    }

    /**
     * fuegt mithilfe der "pointer" das Glied an die erste Stelle ein.
     * @param data
     */
    @Override
    public void add(Object data) {
        Node<T> tempo = new Node<T>(data);
        tempo.prev = tail.prev;
        tempo.next = tail;
        tail.prev.next = tempo;
        tail.prev = tempo;
        ListSize++;
    }

    /**
     * fuegt mit der selben Methode wie die add Methode das Glied an der gewuenschten Stelle ein, indem duch die
     * Liste iteriert wird
     * @param obj
     * @param index
     */
    @Override
    public void insert(Object obj, int index) {

        Node<T> tempo = head.next;
        if (index < 0 || index > ListSize) {
            System.err.println("Too big!");
        } else if (index == ListSize) {
            add(obj);
        } else {
            for(int i = 0; i < index;i++) {
                tempo = tempo.next;
            }
            Node<T> in = new Node<T>(obj);
            in.prev = tempo.prev;
            tempo.prev.next = in;
            tempo.prev = in;
            in.next = tempo;
        }
    }

    /**
     * holt sich das Object aus der Liste, von der gewuenschten Stelle
     * @param index
     * @return
     */
    @Override
    public Object get(int index){

        if (this.length() < index) {
            System.out.println("Out of range!");
        } else {
            Node<T> current = head.next;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.getObject();

        }
        return null;
    }

    /**
     * loescht das Glied an der Stelle vom Index
     * @param index
     */
    @Override
    public void delete(int index) {
        if (index < 0 || index >= ListSize) {
            System.err.println("Out of bound!");
        }else {
            Node<T> current = head.next;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node<T> previous = current.prev;
            Node<T> next = current.next;
            current.next.prev = previous;
            current.prev.next = next;
            ListSize--;

        }
    }

    /**
     * @param obj
     */
    @Override
    public int indexOf(T obj) {
        int temp = 0;
            Node<T> current = head.next;
            while (!current.object.equals(obj)) {
                current = current.next;
                temp++;
                if(current.equals(tail)) {
                    System.err.println("Object nicht gefunden!");
                    return -1;
                }
            }
            System.out.println(current.object + " found at index " + temp);

        return temp;

    }

    /*
     * Returns the number of elements in the linked list.
     */
    public int length() {
        Node<T> temp = head.next;
        int count = 0;
        for(int i = 1; temp!=tail;i++) {
            temp = temp.next;
            count = i;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        Node<T> curr = head.next;
        while (curr.next != null) {
            result.append(curr.getObject()).append(",");
            curr = curr.next;
        }
        result.deleteCharAt(result.length() - 1);
        result.append("}");

        return result.toString();
    }

    /*
     * Checks whether a certain element is true
     */
    @Override
    public boolean equals(Object obj) {
           if(obj instanceof DoubleLinkedList) {
               DoubleLinkedList<T> l = (DoubleLinkedList<T>) obj;
               if(this.length()!=l.length()) {
                   return false;
               }
               Node<T> current = head.next;
               Node<T> current2 = l.head.next;
               if (current.object.equals(current2.object)) {
                   while (current.object.equals(current2.object)){
                       current = current.next;
                       current2 = current2.next;
                       if(current.object == null || current2.object == null) {
                           break;
                       }
                       if (!current.object.equals(current2.object)) {
                           return false;
                       }
                   }
               } else {
                   return false;
               }
               return true;
           } else {
               return false;
           }
    }

    /**
     * Inner-Class.
     * Node definition with two pointers
     */
    public class Node<T> {
        private Node<T> prev;
        private Node<T> next;
        private Object object;


        public Node(Object wert) {
            this.object = wert;
            this.next = null;
            this.prev = null;
        }

        /**
         * Getter Object.
         */
        public Object getObject() {
            return object;
        }

        /**
         * @return the previous
         */
        public Node<T> getPrev() {
            return prev;
        }

        /**
         * @param prev the previous to set
         */
        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        /**
         * @return the next
         */
        public Node<T> getNext() {
            return next;
        }

        /**
         * @param next the next to set
         */
        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "object=" + object +
                    '}';
        }
    }

}
