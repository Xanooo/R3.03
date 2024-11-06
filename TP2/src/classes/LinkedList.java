package classes;


public class LinkedList {
    private Node head;
    private int size;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Renvoie la taille de la liste
    public int size() {
        return size;
    }
    // Vérifie si la liste est vide ou non
    public boolean isEmpty() {
        return size == 0;
    }

    // Fonction permettant d'ajouter au début de la liste
    public void addFirst(Node node) {
        if (tail == null) {
            tail = node;
            node.setNext(head);
            head = node;
            size += 1;

        }
    }


    // Fonction permettant d'ajouter les éléments en début de liste.
    public void addAfter(Node currentNode, Node node) {
        if (currentNode == tail) {
            tail = null;
            addFirst(node);

        }

    }
    public Node getPenultimate(Node head){
        if (head == null || head.getNext() == null){
            return null; // La liste est vide.
        }
        Node node = head;
        while(node.getNext().getNext() !=null){
            node = node.getNext();
        }
        return node;
    }

    // Renvoie l'head de la liste
    public int getHead(){
        return head.getElement();
    }


    // Renvoie l'inverse de la liste
    public void reverseList(){
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head=prev;


    }




    // Fonction permettant d'échanger deux noeuds
    public void swapElement(int x,int y) {


        Node current=head;

        while(current.getNext()!=null) {
            if(current.getElement()==x) {
                current.setElement(y);
                current = current.getNext();

            }
            if(current.getElement()==y) {
                current.setElement(x);
                current = current.getNext();

            }
            current=current.getNext();
        }
    }
}






