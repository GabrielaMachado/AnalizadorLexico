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

    @Test
    public void AutomataSimboloLlaveAbierta() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '{', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloLlaveCerrada() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '}', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloParentesisAbierto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '(', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloParentesisCerrado() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', ')', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloMas() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '+', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloMenos() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '-', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloPor() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '*', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloComentario() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '/', '/', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloDivision() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '/', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataLiteralBooleanoTrueIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 't', 'r', 'u', 'o', ' '};
        assertTrue(prueba.esLiteralBooleana(palabra, 1) != null);
    }

    @Test
    public void AutomataLiteralBooleanoFalseIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'x', 'a', 'l', 's', 'e', ' '};
        assertTrue(prueba.esLiteralBooleana(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlSwitchIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 's', 'w', 'o', 't', 'c', 'h', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlWhileIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'w', 'h', 'y', 'l', 'e', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlBreakIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'b', 'r', 'e', 'a', 'c', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlCaseIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'k', 'a', 's', 'e', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlElseIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'e', 'l', '5', 'e', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlForIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'f', '0', 'r', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlIfIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'y', 'f', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataEstructuraDeControlDoIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'd', 'o', 'o', ' '};
        assertTrue(prueba.esEstructuraDeControl(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoBooleanIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'b', 'o', '0', 'l', 'e', 'a', 'n', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoIntegerIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'i', 'p', 't', 'e', 'g', 'e', 'r', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoDoubleIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'd', 'o', 'o', 'b', 'l', 'e', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoStringIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 's', 's', 't', 'r', 'i', 'n', 'g', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoStyleIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 's', 't', 'i', 'l', 'e', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoFigureIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'f', 'i', 'g', '*', 'r', 'e', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoColorIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'k', 'o', 'l', 'o', 'r', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataTipoDatoCharIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'c', 'h', 'a', 'r', 'r', ' '};
        assertTrue(prueba.esTipoDato(palabra, 1) != null);
    }

    @Test
    public void AutomataSalidaDatoMessageIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'm', 'e', 'z', 's', 'a', 'g', 'e', ' '};
        assertTrue(prueba.esSalidaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataSalidaDatoReturnIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'r', 'i', 't', 'u', 'r', 'n', ' '};
        assertTrue(prueba.esSalidaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataExcepcionTryIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 't', 'r', 'i', ' '};
        assertTrue(prueba.esExcepcion(palabra, 1) != null);
    }

    @Test
    public void AutomataExcepcionCatchIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'c', 'a', 't', 'k', 'h', ' '};
        assertTrue(prueba.esExcepcion(palabra, 1) != null);
    }

    @Test
    public void AutomataEntradaDatoCanvasIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'k', 'a', 'n', 'v', 'a', 's', ' '};
        assertTrue(prueba.esEntradaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataEntradaDatoVoidIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'b', 'o', 'i', 'd', ' '};
        assertTrue(prueba.esEntradaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataEntradaDatoNullIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'n', 'a', 'l', 'l', ' '};
        assertTrue(prueba.esEntradaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataEntradaDatoNewIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'n', 'i', 'w', ' '};
        assertTrue(prueba.esEntradaDato(palabra, 1) != null);
    }

    @Test
    public void AutomataOpreadorRacionalAndIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'a', 'a', 'n', 'd', ' '};
        assertTrue(prueba.esOperadorRacional(palabra, 1) != null);
    }

    @Test
    public void AutomataOpreadorRacionalOrIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'o', 'r', 'r', ' '};
        assertTrue(prueba.esOperadorRacional(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloLlaveAbiertaIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'n', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloLlaveCerradaIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '3', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloParentesisAbiertoIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '/', '\\', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloParentesisCerradoIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', ')', '(', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloMasIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '.', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloMenosIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '_', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloPorIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '*', '*', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloComentarioIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '/', '+', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloDivisionIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', 'l', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloIgual() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '=', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloMenorQue() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '<', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloMayorQue() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '>', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloPuntoComa() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', ';', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloIgualIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '=', '+', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloMenorQueIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '>', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloMayorQueIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', '<', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }

    @Test
    public void AutomataSimboloPuntoComaIncorrecto() {
        Automata prueba = new Automata();
        Character[] palabra = {' ', ';', '.', ' '};
        assertTrue(prueba.esSimbolo(palabra, 1) != null);
    }
}
