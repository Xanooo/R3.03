package classes;



public class CircularList {
    private Node head;
    private int size;

    public CircularList() {
        head = null;
        size = 0;
    }

    public void insertCircular(int data) {
        Node current = new Node(null, data);

        if (head == null) { // Dans le cas où la liste est vide, le noeud suivant sera le noeud actuel
            head = current;
            current.setNext(head); // Le noeud pointe vers lui-même.
            size++;

        }
        else {
                current.setNext(head);
                head = current ;// Le nouveau noeud pointe vers head
                size++;

             }

    }

    public int getSize(){
        return size;
    }
}
