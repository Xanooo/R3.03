package classes;

public class Node {
    private Node next;
    private int element;



    // On crée le constructeur.
    public Node(Node next, int element) {
        this.element = element;
        this.next = next;
    }

    // On initie les getters et setters de la fonction.
    public int getElement() {
        return element;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setElement(int element) {
        this.element = element;
    }
}