package classes;

import java.util.*;

public class MyLinkedList<T> implements List<T> {

    // On crée notre classe Node au sein de cette liste
    private class Node {
        T data; // Le type T sera notre type générique, il peut très bien être un int, un String...
        Node prev;
        Node next;
    // On crée notre constructeur
        Node(T value) {
            this.data = value;
            this.prev = null;
            this.next = null;
        }
    }

    // On implémente nos noeuds dans la liste
    private Node head;
    private Node tail;
    private int size;

    // On crée notre constructeur MyLinkedList
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Retourne la taille de la liste.
    @Override
    public int size() {
        return size;
    }

    // Indique si la liste est vide ou non.
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(T element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = new Node(element);
        if (index == 0) {
            if (isEmpty()) {
                head = current;
                tail = current;
            } else {
                current.next = head;
                head.prev = current;
                head = current;
            }
        } else if (index == size) {
            add(element);
        } else {
            current = getNodeAt(index);
            current.next = current;
            current.prev.next = current;
            current.prev = current;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return getNodeAt(index).data;
    }

    private Node getNodeAt(int index) {
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    @Override
    public boolean remove(Object o) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                removeNode(current);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    private void removeNode(Node node) {
        if (node == head) {
            head = node.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            node.prev.next = node.next;
        }
        if (node == tail) {
            tail = node.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            node.next.prev = node.prev;
        }
        size--;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node toRemove = getNodeAt(index);
        T data = toRemove.data;
        removeNode(toRemove);
        return data;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // Fonctions supplémentaires implémentées (erreur en cas de non implémentation)
    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public int indexOf(Object o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    // D'autres méthodes de List<T> peuvent être implémentées ici selon les besoins.
}
