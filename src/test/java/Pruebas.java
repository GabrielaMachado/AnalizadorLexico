/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.eam.analizadorlexico.Automata;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class Pruebas {

    public Pruebas() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void AutomataLiteralBooleanoTrue() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 't', 'r', 'u', 'e', ' '};
        assertTrue(prueba.esLiteralBooleana(palabra, 1) != null);
    }

    @Test
    public void AutomataLiteralBooleanoFalse() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'f', 'a', 'l', 's', 'e', ' '};
        assertTrue(prueba.esLiteralBooleana(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlSwitch() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 's', 'w', 'i', 't', 'c', 'h', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlWhile() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'w', 'h', 'i', 'l', 'e', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlBreak() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'b', 'r', 'e', 'a', 'k', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlCase() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'c', 'a', 's', 'e', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlElse() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'e', 'l', 's', 'e', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlFor() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'f', 'o', 'r', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlIf() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'i', 'f', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlDo() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'd', 'o', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoBoolean() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'b', 'o', 'o', 'l', 'e', 'a', 'n', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoInteger() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'i', 'n', 't', 'e', 'g', 'e', 'r', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoDouble() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'd', 'o', 'u', 'b', 'l', 'e', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoString() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 's', 't', 'r', 'i', 'n', 'g', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoStyle() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 's', 't', 'y', 'l', 'e', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoFigure() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'f', 'i', 'g', 'u', 'r', 'e', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoColor() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'c', 'o', 'l', 'o', 'r', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoChar() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'c', 'h', 'a', 'r', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataSalidaDatoMessage() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'm', 'e', 's', 's', 'a', 'g', 'e', ' '};
        assertTrue(prueba.esSalidaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataSalidaDatoReturn() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'r', 'e', 't', 'u', 'r', 'n', ' '};
        assertTrue(prueba.esSalidaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataExcepcionTry() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 't', 'r', 'y', ' '};
        assertTrue(prueba.esExcepcion(palabra, 1) != null);
    }

    @Test
    public void AutomataExcepcionCatch() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'c', 'a', 't', 'c', 'h', ' '};
        assertTrue(prueba.esExcepcion(palabra, 1) != null);
    }

    @Test
    public void AutomataEntradaDatoCanvas() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'c', 'a', 'n', 'v', 'a', 's', ' '};
        assertTrue(prueba.esEntradaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataEntradaDatoVoid() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'v', 'o', 'i', 'd', ' '};
        assertTrue(prueba.esEntradaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataEntradaDatoNull() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'n', 'u', 'l', 'l', ' '};
        assertTrue(prueba.esEntradaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataEntradaDatoNew() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'n', 'e', 'w', ' '};
        assertTrue(prueba.esEntradaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataOpreadorRacionalAnd() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'a', 'n', 'd', ' '};
        assertTrue(prueba.esOperadorRacional(palabra, 1) != null);
    }

    @Test
    public void AutomataOpreadorRacionalOr() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'o', 'r', ' '};
        assertTrue(prueba.esOperadorRacional(palabra, 1) != null);
    }
}
