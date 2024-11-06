package classes;

public class TenScore {
    private Node head;
    private int size;
    private final int MAX_SIZE = 11; // On souhaite avoir les 10 meilleurs scores

    // On crée le constructeur de la liste
    public TenScore(){
        head = null;
        size = 0;
    }

    public void addScore(int score){
        Node newNode = new Node(null, score);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        // Si le score est supérieur/égal à celui du premier élément, on le met devant
        if (score >= head.getElement()){
            newNode.setNext(head);
            head = newNode;
            size++;
        }

        // Si la taille max est dépassée, on utilise la fonction removeLast(), d'où le fait que la constante soit 11 et non 10
        if (size > MAX_SIZE){
            removeLast();
        }
    }

    // On retire le dernier élément de la liste, nous permettant de conserver les 10 meilleurs
    public void removeLast(){
        if (head == null){ return;} //Liste vide
        if (head.getNext() == null) {
            head = null;
            return;

        }
        size--;

    }
    // Renvoie la taille de la liste
    public int getSize(){
        return size;
    }

    // Renvoie l'head de la liste.
    public int getHead(){
        return head.getElement();
    }
}

