package classes;

public class DNode {
    private int element;
    private DNode next, prev;

    // On crée le constructeur DNode.
    public DNode(int element, DNode next, DNode prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    // On définit nos getters et nos setters.
    public int getElement() {
        return element;
    }
    public DNode getNext() {
        return next;
    }
    public DNode getPrev() {
        return prev;
    }
    public void setElement(int element) {
        this.element = element;
    }
    public void setNext(DNode next) {
        this.next = next;
    }
    public void setPrev(DNode prev) {
        this.prev = prev;
    }

}
