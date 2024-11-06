package test;
import classes.MyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    private MyLinkedList<String> list; // Afin de tester notre généricité, on choisit une liste de String.
    @BeforeEach
    public void setUp() {
        list = new MyLinkedList<>();
    }

    // QUESTION 11
    // On crée un test nous permettant de vérifier que les éléments String sont ajoutés à la liste.
    @Test
    public void testAdd() {
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(3, list.size());
    }

    // On crée un test nous permettant de vérifier que les éléments String peuvent être retirés.
    @Test
    public void testRemove() {
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(3, list.size());
        list.remove("A");
        assertEquals(2, list.size());
    }


    // On crée une fonction de test nous permettant de vérifier si une liste est vide ou non.
    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.add("A");
        assertFalse(list.isEmpty());
    }

}
