package test;

import classes.CircularList;

import classes.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularListTest {
    private CircularList list;

    @BeforeEach
    void setUp() {
        list = new CircularList();
    }

    // On teste l'ajout de noeuds sur une liste circulaire
    // QUESTION 9
    @Test
    void testAdd() {
        list.insertCircular(2);
        list.insertCircular(3);
        list.insertCircular(4);
        assertEquals(list.getSize(), 3);


    }
    /*
    void testCount(){
        list.insertCircular(2);
        list.insertCircular(3);
        list.insertCircular(4);
        assertEquals(list.count(), 3);
    }
    */

}
