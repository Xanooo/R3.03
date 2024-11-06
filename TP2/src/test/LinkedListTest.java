package test;


import classes.LinkedList;
import classes.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    // On définit nos listes et nos noeuds ici
    private LinkedList liste;
    Node node = new Node(null, 3);
    Node node1 = new Node(node, 2);
    Node node2 = new Node(node, 1);

    // On setup notre liste en ajoutant les noeuds dedans.
    @BeforeEach
    public void setUp() {
        liste = new LinkedList();
    }


        // Test élémentaire nous permettant de vérifier si les éléments ont bien été insérés, et que la liste n'est pas vide.
        @Test
        public void testTaille(){
            liste.addFirst(node);
            liste.addAfter(node, node1);
            liste.addAfter(node1, node2);

            assertEquals(liste.size(), 3);
            assertEquals(liste.isEmpty(), false);

        }

        // QUESTION 2
        // On ajoute un élément au début de la liste, on teste aussi la taille de la liste.
        @Test
        public void testAddNode(){
        liste.addFirst(node);
        liste.addAfter(node, node1);
        liste.addAfter(node1, node2);
        assertEquals(liste.size(), 3);
        }

        // On vérifie que la dernière valeur insérée correspond à la tête
        @Test
        public void testHead(){
        liste.addFirst(node);
        liste.addAfter(node, node1);
        liste.addAfter(node1, node2);
        assertEquals(liste.getHead(), 1);
        }

        // QUESTION 3
        // On teste une fonction nous permettant de renvoie l'avant dernier élément, ici dans [1,2,3], il s'agit de 2.
        @Test
        public void testPenultimate(){
            liste.addFirst(node);
            liste.addAfter(node, node1);
            liste.addAfter(node1, node2);
        assertEquals(liste.getPenultimate(node2).getElement(), 2);
        }

        // QUESTION 4
        // On teste une fonction nous permettant d'inverser la liste, et donc d'inverser l'head.
        @Test
        public void testReverse(){
            liste.addFirst(node);
            liste.addAfter(node, node1);
            liste.addAfter(node1, node2);
            assertEquals(liste.getHead(), 1);
            liste.reverseList();
            assertEquals(liste.getHead(), 3);

        }

        // QUESTION 5
        // Fonction de test nous permettant d'échanger deux noeuds dans la même liste
        @Test
        public void testSwap(){
        liste.addFirst(node);
        liste.addAfter(node, node1);
        liste.addAfter(node1, node2);
        assertEquals(liste.getHead(), 1); // Avant l'échange, head est 1
        liste.swapElement(node1.getElement(), node2.getElement());// On inverse node1 et node2
        assertEquals(liste.getHead(), 2); // Après l'échange, head devient 2
        }







    }

