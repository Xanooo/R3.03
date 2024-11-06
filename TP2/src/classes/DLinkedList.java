package classes;

public class DLinkedList {
    private DNode header, trailer;
    private long size;

    // Constructeur de la liste doublement chaînée
    public DLinkedList() {
        header = new DNode(0, null, null);
        trailer = new DNode(0, null, null);
        header.setNext(trailer);
        size = 0;
    }

    // Ajouter un noeud double dans la liste
    public void addFirstDouble(int value) {
        DNode node = new DNode(value, null, null);
        if (header == null) {
            header = node;
            trailer = node;
            size++;
        } else {
            trailer.setNext(header);
            header.setPrev(node);
            header = node;
            size++;
        }


    }

    // On crée une fonction booléenne nous renvoyons si la liste est vide ou non.
    public boolean isEmpty() {
        return size == 0;
    }

    // On crée une fonction nous retournant la taille de la liste.
    public long size() {
        return size;
    }


    public boolean equals(DLinkedList liste) {
        // Ici on regroupe trois conditions en une seule, si la taille est différente, si le header ou le trailer est différent, cela renvoie faux.
        return size == liste.size && header.getElement() == (liste.header.getElement()) && trailer.getElement() == liste.trailer.getElement();
    }
}
