package test;
import classes.DLinkedList;
import classes.DNode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DLinkedListTest {
    private DLinkedList liste;
    private DLinkedList listeEquals;

    @BeforeEach
    public void setUp() {
        liste = new DLinkedList();
        listeEquals = new DLinkedList();

    }

    // QUESTION 6
    // On teste l'ajout de deux double noeuds dans la liste doublement chaînée.
    @Test
    public void testAdd() {
        liste.addFirstDouble(1);
        liste.addFirstDouble(2);
        assertEquals(liste.size(), 2);
    }

    /* QUESTION 8 - L'algorithme sur liste doublement chaînée est plus rapide, puisque nous cherchons directement les noeuds précédent et suivant
    sans avoir à chercher manuellement comme avec une liste simplement chaînée.

    */

    // QUESTION 10
    // On teste l'égalité entre deux listes
    @Test
    public void testEquals(){
        liste.addFirstDouble(1);
        liste.addFirstDouble(2);
        listeEquals.addFirstDouble(1);
        assertFalse(liste.equals(listeEquals)); // Ici, on vérifie tout d'abord que leur taille est différente.
        listeEquals.addFirstDouble(2);
        assertTrue(liste.equals(listeEquals)); // Ici, on vérifie avec la même taille
    }



}
