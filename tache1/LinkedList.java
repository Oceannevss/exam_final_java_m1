package m1.examen_final.tache1;

public class LinkedList {
    private Node first; //can be called head
    private Node last; //can be called tail

    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void addFirst(int value) {
        Node newFirst = new Node(value);
        if (this.size == 0) {
            this.first = newFirst;
            this.last = newFirst;
        } else {
            newFirst.setNext(this.first);
            this.first = newFirst;
        }
        this.size++;
    }

    public void addLast(int value) {
        Node newLast = new Node(value);
        if (this.size == 0) {
            this.first = newLast;
            this.last = newLast;
        } else {
            this.last.setNext(newLast);
            this.last = newLast;
        }
        this.size++;
    }

    public int deleteFirst() {
        Node n = this.first;
        this.first = this.first.getNext();
        this.size--;
        return n.getValue();
    }

    public int deleteLast() throws Exception {
        Node n = this.first;
        Node l = this.last;
        if (this.size == 0) {
            throw new Exception("You cannot delete value of an empty list.");
        } else if (this.size == 1) {
            this.first = null;
            this.last = null;
        } else {
            for (int i = 0; i < size-2; i++) {
                n = n.getNext();
            }
            n.setNext();
            this.last = n;
        }
        this.size--;
        return l.getValue();
    }

    public boolean contains(int testValue) {
        Node n = this.first;
        for (int i=0 ; i<this.size ; i++) {
            if (n.getValue() == testValue) {
                return true;
            } else {
                n = n.getNext();
            }
        }
        return false;
    }

    public int indexOf(int testValue) {
        Node n = this.first;
        for (int i=0 ; i<this.size ; i++) {
            if (n.getValue() == testValue) {
                return i;
            } else {
                n = n.getNext();
            }
        }
        return -1;
    }

    public String toString(){
        if (this.size == 0) {
            return ("Empty list.");
        }
        Node n = this.first;
        String r = "[";
        for (int i=0 ; i<size-1 ; i++) {
            r += n.getValue() + ", ";
            n = n.getNext();
        }
        return r + this.last.getValue() + "]";
    }
    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
}
