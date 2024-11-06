package test;

import classes.Node;
import classes.TenScore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TenScoreTest {
    private TenScore liste;

    @BeforeEach
    public void setUp() {
        liste = new TenScore();
    }

    // QUESTION 12
    // On teste en ajoutant des valeurs à notre liste, puis en vérifiant sa taille.
    @Test
    public void testAdd() {
        liste.addScore(150);
        liste.addScore(200);
        assertEquals(liste.getSize(), 2);

    }

    // Test nous permettant de vérifier que la valeur la plus élevée sera head.
    @Test
    public void testGetHead(){
        liste.addScore(150);
        liste.addScore(300);
        liste.addScore(250);
        assertEquals(liste.getHead(), 300);
    }

    // On teste une fonction nous permettant de supprimer le dernier élément de la liste, ici 150.
    @Test
    public void testRemove(){
        liste.addScore(150);
        liste.addScore(200);
        liste.addScore(300);
        liste.removeLast();
        assertEquals(liste.getSize(), 2);
    }

    @Test
    public void testIsRemoved(){
        liste.addScore(100);
        liste.addScore(200);
        liste.addScore(300);
        liste.addScore(250);
        liste.addScore(400);
        liste.addScore(450);
        liste.addScore(455);
        liste.addScore(550);
        liste.addScore(750);
        liste.addScore(850);
        liste.addScore(800);
        liste.addScore(900);
        assertEquals(liste.getHead(), 900);
        assertEquals(liste.getSize(), 10);
    }
}
