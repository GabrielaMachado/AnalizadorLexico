/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eam.analizadorlexico;

import static edu.eam.analizadorlexico.AnalizadorLexico.posActual;
import static edu.eam.analizadorlexico.FrmPrincipal.cadena;

/**
 *
 * @author user
 */
public class Automata {

    private Character tokens[] = {'=', '(', ')', '+', '-', '*', '/', ';', '<', '>',};
    private Character au = 'x';
    private char[] palabra;
    private String isTrue = "true";
    private String isFalse = "false";
    private String isCatch = "catch";
    private String isTry = "try";
    private String isMessage = "message";
    private String isReturn = "return";
    private String isSwitch = "switch";
    private String isWhile = "while";
    private String isBreak = "break";
    private String isCase = "case";
    private String isElse = "else";
    private String isFor = "for";
    private String isIf = "if";
    private String isDo = "do";
    private String isBoolean = "boolean";
    private String isInteger = "integer";
    private String isDouble = "double";
    private String isString = "string";
    private String isStyle = "style";
    private String isFigure = "figure";
    private String isColor = "color";
    private String isChar = "char";
    private String isCanvas = "canvas";
    private String isVoid = "void";
    private String isNull = "null";
    private String isNew = "new";
    private String isAnd = "and";
    private String isOr = "or";
    private String keyOpen = "{";
    private String keyClose = "}";
    private String parenthesisOpen = "(";
    private String parenthesisClose = ")";
    private String plus = "+";
    private String minus = "-";
    private String times = "*";
    private String divided = "/";
    private String equals = "=";
    private String lessThan = "<";
    private String greaterThan = ">";
    private String commentary = "//";
    private String semicolon = ";";
    Lexema lex;

    public Character[] leer(String texto) {
        String res = " " + texto + " ";
        int longitud = 0;
        Character ch[];
        res = res.toLowerCase();
        longitud = res.length();
        ch = new Character[longitud];
        System.out.println(res);
        for (int i = 0; i < longitud; i++) {
            ch[i] = res.charAt(i);
        }
        return ch;
    }

    /**
     * ****************************************
     * Verificamos la Expresion para ver si es un digito con el metodo de la
     * clase Character isDigit() ****************************************
     */
    public void esDigito(Character ch[]) {
        int cont = 0;
        String cualesSon = "";
        for (int i = 0; i < ch.length; i++) {
            if (au.isDigit(ch[i])) {
                cont++;
                cualesSon += ch[i].toString() + " ";
            }
        }

        Lexema out = new Lexema(cont, "Digitos", cualesSon);
    }

    public String esEspacio(Character ch[], int pos) {

        String pal = "";
        if (ch[pos].equals(" ")) {
            for (int i = pos; i < ch.length; i++) {
                pal += ch[pos].toString();
                if (ch[pos].equals(" ")) {
                    return pal;
                }
                pos++;
            }
            return pal;
        } else {
            return pal;
        }
    }

    /**
     * ****************************************
     * Verificamos la Expresion para ver si es un digito con el metodo de la
     * clase Character isDigit() ****************************************
     */
    public Lexema esLiteralBooleana(Character ch[], int pos) {

        int posIn = pos;

        if (pos > 0 && ch[pos - 1].toString().equals(" ")) {

            palabra = isTrue.toCharArray();
            String lexema = "";

            for (int j = 0; j < palabra.length; j++) {
                if (ch[pos].equals(palabra[j])) {
                    lexema += ch[pos].toString();
                    if (lexema.equals(isTrue)) {
                        posActual = pos;
                        if (ch[pos + 1].toString().equals(" ")) {
                            pos++;
                            return lex = new Lexema(posIn, "Literal Booleana", lexema);
                        } else {
                            return null;
                        }
                    }
                } else {
                    palabra = isFalse.toCharArray();
                    lexema = "";

                    for (int i = 0; i < palabra.length; i++) {
                        if (ch[posIn].equals(palabra[i])) {
                            lexema += ch[posIn].toString();
                            if (lexema.equals(isFalse)) {
                                posActual = posIn;
                                if (ch[posIn + 1].toString().equals(" ")) {
                                    posIn++;
                                    return lex = new Lexema(pos, "Literal Booleana", lexema);
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                        posIn++;

                    }
                }
                pos++;
            }
        } else {
            return null;
        }
        return null;
    }

    public Lexema esEstructuraDeControl(Character ch[], int pos) {

        int posWhile = pos;
        int posBreak = pos;
        int posCase = pos;
        int posElse = pos;
        int posFor = pos;
        int posIf = pos;
        int posDo = pos;

        if (pos > 0 && ch[pos - 1].toString().equals(" ")) {

            palabra = isSwitch.toCharArray();
            String lexema = "";

            for (int j = 0; j < palabra.length; j++) {
                if (ch[pos].equals(palabra[j])) {
                    lexema += ch[pos].toString();
                    if (lexema.equals(isSwitch)) {
                        posActual = pos;
                        if (ch[pos + 1].toString().equals(" ")) {
                            pos++;
                            return lex = new Lexema(posWhile, "Estructura de control", lexema);
                        } else {
                            return null;
                        }
                    }
                } else {
                    palabra = isWhile.toCharArray();
                    lexema = "";

                    for (int i = 0; i < palabra.length; i++) {
                        if (ch[posWhile].equals(palabra[i])) {
                            lexema += ch[posWhile].toString();
                            if (lexema.equals(isWhile)) {
                                posActual = posWhile;
                                if (ch[posWhile + 1].toString().equals(" ")) {
                                    posWhile++;
                                    return lex = new Lexema(pos, "Estructura de control", lexema);
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            palabra = isBreak.toCharArray();
                            lexema = "";

                            for (int k = 0; k < palabra.length; k++) {
                                if (ch[posBreak].equals(palabra[k])) {
                                    lexema += ch[posBreak].toString();
                                    if (lexema.equals(isBreak)) {
                                        posActual = posBreak;
                                        if (ch[posBreak + 1].toString().equals(" ")) {
                                            posBreak++;
                                            return lex = new Lexema(pos, "Estructura de control", lexema);
                                        } else {
                                            return null;
                                        }
                                    }
                                } else {
                                    palabra = isCase.toCharArray();
                                    lexema = "";

                                    for (int l = 0; l < palabra.length; l++) {
                                        if (ch[posCase].equals(palabra[l])) {
                                            lexema += ch[posCase].toString();
                                            if (lexema.equals(isCase)) {
                                                posActual = posCase;
                                                if (ch[posCase + 1].toString().equals(" ")) {
                                                    posCase++;
                                                    return lex = new Lexema(pos, "Estructura de control", lexema);
                                                } else {
                                                    return null;
                                                }
                                            }
                                        } else {
                                            palabra = isElse.toCharArray();
                                            lexema = "";

                                            for (int m = 0; m < palabra.length; m++) {
                                                if (ch[posElse].equals(palabra[m])) {
                                                    lexema += ch[posElse].toString();
                                                    if (lexema.equals(isElse)) {
                                                        posActual = posElse;
                                                        if (ch[posElse + 1].toString().equals(" ")) {
                                                            posElse++;
                                                            return lex = new Lexema(pos, "Estructura de control", lexema);
                                                        } else {
                                                            return null;
                                                        }
                                                    }
                                                } else {
                                                    palabra = isFor.toCharArray();
                                                    lexema = "";

                                                    for (int n = 0; n < palabra.length; n++) {
                                                        if (ch[posFor].equals(palabra[n])) {
                                                            lexema += ch[posFor].toString();
                                                            if (lexema.equals(isFor)) {
                                                                posActual = posFor;
                                                                if (ch[posFor + 1].toString().equals(" ")) {
                                                                    posFor++;
                                                                    return lex = new Lexema(pos, "Estructura de control", lexema);
                                                                } else {
                                                                    return null;
                                                                }
                                                            }
                                                        } else {
                                                            palabra = isIf.toCharArray();
                                                            lexema = "";

                                                            for (int p = 0; p < palabra.length; p++) {
                                                                if (ch[posIf].equals(palabra[p])) {
                                                                    lexema += ch[posIf].toString();
                                                                    if (lexema.equals(isIf)) {
                                                                        posActual = posIf;
                                                                        if (ch[posIf + 1].toString().equals(" ")) {
                                                                            posIf++;
                                                                            return lex = new Lexema(pos, "Estructura de control", lexema);
                                                                        } else {
                                                                            return null;
                                                                        }
                                                                    }
                                                                } else {
                                                                    palabra = isDo.toCharArray();
                                                                    lexema = "";

                                                                    for (int q = 0; q < palabra.length; q++) {
                                                                        if (ch[posDo].equals(palabra[q])) {
                                                                            lexema += ch[posDo].toString();
                                                                            if (lexema.equals(isDo)) {
                                                                                posActual = posDo;
                                                                                if (ch[posDo + 1].toString().equals(" ")) {
                                                                                    posDo++;
                                                                                    return lex = new Lexema(pos, "Estructura de control", lexema);
                                                                                } else {
                                                                                    return null;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            return null;
                                                                        }
                                                                        posDo++;
                                                                    }
                                                                }
                                                                posIf++;
                                                            }
                                                        }
                                                        posFor++;
                                                    }
                                                }
                                                posElse++;
                                            }
                                        }
                                        posCase++;
                                    }
                                }
                                posBreak++;
                            }
                        }
                        posWhile++;
                    }
                }
                pos++;
            }
        } else {
            return null;
        }
        return null;
    }

    public Lexema esSalidaDato(Character ch[], int pos) {

        int posIn = pos;

        if (pos > 0 && ch[pos - 1].toString().equals(" ")) {

            palabra = isMessage.toCharArray();
            String lexema = "";

            for (int j = 0; j < palabra.length; j++) {
                if (ch[pos].equals(palabra[j])) {
                    lexema += ch[pos].toString();
                    if (lexema.equals(isMessage)) {
                        posActual = pos;
                        if (ch[pos + 1].toString().equals(" ")) {
                            pos++;
                            return lex = new Lexema(posIn, "Salida de dato", lexema);
                        } else {
                            return null;
                        }
                    }
                } else {
                    palabra = isReturn.toCharArray();
                    lexema = "";

                    for (int i = 0; i < palabra.length; i++) {
                        if (ch[posIn].equals(palabra[i])) {
                            lexema += ch[posIn].toString();
                            if (lexema.equals(isReturn)) {
                                posActual = posIn;
                                if (ch[posIn + 1].toString().equals(" ")) {
                                    posIn++;
                                    return lex = new Lexema(pos, "Salida de dato", lexema);
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                        posIn++;

                    }
                }
                pos++;
            }
        } else {
            return null;
        }
        return null;
    }

    public Lexema esExcepcion(Character ch[], int pos) {

        int posIn = pos;

        if (pos > 0 && ch[pos - 1].toString().equals(" ")) {

            palabra = isTry.toCharArray();
            String lexema = "";

            for (int j = 0; j < palabra.length; j++) {
                if (ch[pos].equals(palabra[j])) {
                    lexema += ch[pos].toString();
                    if (lexema.equals(isTry)) {
                        posActual = pos;
                        if (ch[pos + 1].toString().equals(" ")) {
                            pos++;
                            return lex = new Lexema(posIn, "Excepción", lexema);
                        } else {
                            return null;
                        }
                    }
                } else {
                    palabra = isCatch.toCharArray();
                    lexema = "";

                    for (int i = 0; i < palabra.length; i++) {
                        if (ch[posIn].equals(palabra[i])) {
                            lexema += ch[posIn].toString();
                            if (lexema.equals(isCatch)) {
                                posActual = posIn;
                                if (ch[posIn + 1].toString().equals(" ")) {
                                    posIn++;
                                    return lex = new Lexema(pos, "Excepción", lexema);
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                        posIn++;

                    }
                }
                pos++;
            }
        } else {
            return null;
        }
        return null;
    }

    public Lexema esTipoDato(Character ch[], int pos) {

        int posIn = pos;
        int posDouble = pos;
        int posString = pos;
        int posStyle = pos;
        int posFigure = pos;
        int posColor = pos;
        int posChar = pos;

        if (pos > 0 && ch[pos - 1].toString().equals(" ")) {

            palabra = isBoolean.toCharArray();
            String lexema = "";

            for (int j = 0; j < palabra.length; j++) {
                if (ch[pos].equals(palabra[j])) {
                    lexema += ch[pos].toString();
                    if (lexema.equals(isBoolean)) {
                        posActual = pos;
                        if (ch[pos + 1].toString().equals(" ")) {
                            pos++;
                            return lex = new Lexema(posIn, "Tipo de dato", lexema);
                        } else {
                            return null;
                        }
                    }
                } else {
                    palabra = isInteger.toCharArray();
                    lexema = "";

                    for (int i = 0; i < palabra.length; i++) {
                        if (ch[posIn].equals(palabra[i])) {
                            lexema += ch[posIn].toString();
                            if (lexema.equals(isInteger)) {
                                posActual = posIn;
                                if (ch[posIn + 1].toString().equals(" ")) {
                                    posIn++;
                                    return lex = new Lexema(pos, "Tipo de dato", lexema);
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            palabra = isDouble.toCharArray();
                            lexema = "";

                            for (int d = 0; d < palabra.length; d++) {
                                if (ch[posDouble].equals(palabra[d])) {
                                    lexema += ch[posDouble].toString();
                                    if (lexema.equals(isDouble)) {
                                        posActual = posDouble;
                                        if (ch[posDouble + 1].toString().equals(" ")) {
                                            posDouble++;
                                            return lex = new Lexema(pos, "Tipo de dato", lexema);
                                        } else {
                                            return null;
                                        }
                                    }
                                } else {
                                    palabra = isString.toCharArray();
                                    lexema = "";

                                    for (int s = 0; s < palabra.length; s++) {
                                        if (ch[posString].equals(palabra[s])) {
                                            lexema += ch[posString].toString();
                                            if (lexema.equals(isString)) {
                                                posActual = posString;
                                                if (ch[posString + 1].toString().equals(" ")) {
                                                    posString++;
                                                    return lex = new Lexema(pos, "Tipo de dato", lexema);
                                                } else {
                                                    return null;
                                                }
                                            }
                                        } else {
                                            palabra = isStyle.toCharArray();
                                            lexema = "";

                                            for (int o = 0; o < palabra.length; o++) {
                                                if (ch[posStyle].equals(palabra[o])) {
                                                    lexema += ch[posStyle].toString();
                                                    if (lexema.equals(isStyle)) {
                                                        posActual = posStyle;
                                                        if (ch[posStyle + 1].toString().equals(" ")) {
                                                            posStyle++;
                                                            return lex = new Lexema(pos, "Tipo de dato", lexema);
                                                        } else {
                                                            return null;
                                                        }
                                                    }
                                                } else {
                                                    palabra = isFigure.toCharArray();
                                                    lexema = "";

                                                    for (int f = 0; f < palabra.length; f++) {
                                                        if (ch[posFigure].equals(palabra[f])) {
                                                            lexema += ch[posFigure].toString();
                                                            if (lexema.equals(isFigure)) {
                                                                posActual = posFigure;
                                                                if (ch[posFigure + 1].toString().equals(" ")) {
                                                                    posFigure++;
                                                                    return lex = new Lexema(pos, "Tipo de dato", lexema);
                                                                } else {
                                                                    return null;
                                                                }
                                                            }
                                                        } else {
                                                            palabra = isColor.toCharArray();
                                                            lexema = "";

                                                            for (int c = 0; c < palabra.length; c++) {
                                                                if (ch[posColor].equals(palabra[c])) {
                                                                    lexema += ch[posColor].toString();
                                                                    if (lexema.equals(isColor)) {
                                                                        posActual = posColor;
                                                                        if (ch[posColor + 1].toString().equals(" ")) {
                                                                            posColor++;
                                                                            return lex = new Lexema(pos, "Tipo de dato", lexema);
                                                                        } else {
                                                                            return null;
                                                                        }
                                                                    }
                                                                } else {
                                                                    palabra = isChar.toCharArray();
                                                                    lexema = "";

                                                                    for (int e = 0; e < palabra.length; e++) {
                                                                        if (ch[posChar].equals(palabra[e])) {
                                                                            lexema += ch[posChar].toString();
                                                                            if (lexema.equals(isChar)) {
                                                                                posActual = posChar;
                                                                                if (ch[posChar + 1].toString().equals(" ")) {
                                                                                    posChar++;
                                                                                    return lex = new Lexema(pos, "Tipo de dato", lexema);
                                                                                } else {
                                                                                    return null;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            return null;
                                                                        }
                                                                        posChar++;
                                                                    }
                                                                }
                                                                posColor++;
                                                            }
                                                        }
                                                        posFigure++;
                                                    }
                                                }
                                                posStyle++;
                                            }
                                        }
                                        posString++;
                                    }
                                }
                                posDouble++;
                            }
                        }
                        posIn++;
                    }
                }
                pos++;
            }
        } else {
            return null;
        }
        return null;
    }

    public Lexema esEntradaDato(Character ch[], int pos) {

        int posVoid = pos;
        int posNull = pos;
        int posNew = pos;

        if (pos > 0 && ch[pos - 1].toString().equals(" ")) {

            palabra = isCanvas.toCharArray();
            String lexema = "";

            for (int j = 0; j < palabra.length; j++) {
                if (ch[pos].equals(palabra[j])) {
                    lexema += ch[pos].toString();
                    if (lexema.equals(isCanvas)) {
                        posActual = pos;
                        if (ch[pos + 1].toString().equals(" ")) {
                            pos++;
                            return lex = new Lexema(posVoid, "Entrada de dato", lexema);
                        } else {
                            return null;
                        }
                    }
                } else {
                    palabra = isVoid.toCharArray();
                    lexema = "";

                    for (int v = 0; v < palabra.length; v++) {
                        if (ch[posVoid].equals(palabra[v])) {
                            lexema += ch[posVoid].toString();
                            if (lexema.equals(isVoid)) {
                                posActual = posVoid;
                                if (ch[posVoid + 1].toString().equals(" ")) {
                                    posVoid++;
                                    return lex = new Lexema(pos, "Entrada de dato", lexema);
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            palabra = isNull.toCharArray();
                            lexema = "";

                            for (int n = 0; n < palabra.length; n++) {
                                if (ch[posNull].equals(palabra[n])) {
                                    lexema += ch[posNull].toString();
                                    if (lexema.equals(isNull)) {
                                        posActual = posNull;
                                        if (ch[posNull + 1].toString().equals(" ")) {
                                            posNull++;
                                            return lex = new Lexema(pos, "entrada de dato", lexema);
                                        } else {
                                            return null;
                                        }
                                    }
                                } else {
                                    palabra = isNew.toCharArray();
                                    lexema = "";

                                    for (int m = 0; m < palabra.length; m++) {
                                        if (ch[posNew].equals(palabra[m])) {
                                            lexema += ch[posNew].toString();
                                            if (lexema.equals(isNew)) {
                                                posActual = posNew;
                                                if (ch[posNew + 1].toString().equals(" ")) {
                                                    posNew++;
                                                    return lex = new Lexema(pos, "Entrada de dato", lexema);
                                                } else {
                                                    return null;
                                                }
                                            }
                                        } else {
                                            return null;
                                        }
                                        posNew++;
                                    }
                                }
                                posNull++;
                            }
                        }
                        posVoid++;
                    }
                }
                pos++;
            }
        } else {
            return null;
        }
        return null;
    }

    public Lexema esOperadorRacional(Character ch[], int pos) {

        int posIn = pos;

        if (pos > 0 && ch[pos - 1].toString().equals(" ")) {

            palabra = isAnd.toCharArray();
            String lexema = "";

            for (int j = 0; j < palabra.length; j++) {
                if (ch[pos].equals(palabra[j])) {
                    lexema += ch[pos].toString();
                    if (lexema.equals(isAnd)) {
                        posActual = pos;
                        if (ch[pos + 1].toString().equals(" ")) {
                            pos++;
                            return lex = new Lexema(posIn, "Operador racional", lexema);
                        } else {
                            return null;
                        }
                    }
                } else {
                    palabra = isOr.toCharArray();
                    lexema = "";

                    for (int i = 0; i < palabra.length; i++) {
                        if (ch[posIn].equals(palabra[i])) {
                            lexema += ch[posIn].toString();
                            if (lexema.equals(isOr)) {
                                posActual = posIn;
                                if (ch[posIn + 1].toString().equals(" ")) {
                                    posIn++;
                                    return lex = new Lexema(pos, "Operador racional", lexema);
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                        posIn++;
                    }
                }
                pos++;
            }
        } else {
            return null;
        }
        return null;
    }

    public Lexema esSimbolo(Character ch[], int pos) {

        int posKeyClose = pos;
        int posPaOpen = pos;
        int posPaClose = pos;
        int posPlus = pos;
        int posMinus = pos;
        int posTimes = pos;
        int posDivided = pos;
        int posEquals = pos;
        int posLess = pos;
        int posGreater = pos;
        int posCo = pos;
        int posSemi = pos;

        if (pos > 0 && ch[pos - 1].toString().equals(" ")) {

            palabra = keyOpen.toCharArray();
            String lexema = "";

            for (int j = 0; j < palabra.length; j++) {
                if (ch[pos].equals(palabra[j])) {
                    lexema += ch[pos].toString();
                    if (lexema.equals(keyOpen)) {
                        posActual = pos;
                        if (ch[pos + 1].toString().equals(" ")) {
                            pos++;
                            return lex = new Lexema(posKeyClose, "Símbolo", lexema);
                        } else {
                            return null;
                        }
                    }
                } else {
                    palabra = keyClose.toCharArray();
                    lexema = "";

                    for (int i = 0; i < palabra.length; i++) {
                        if (ch[posKeyClose].equals(palabra[i])) {
                            lexema += ch[posKeyClose].toString();
                            if (lexema.equals(keyClose)) {
                                posActual = posKeyClose;
                                if (ch[posKeyClose + 1].toString().equals(" ")) {
                                    posKeyClose++;
                                    return lex = new Lexema(pos, "Símbolo", lexema);
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            palabra = parenthesisOpen.toCharArray();
                            lexema = "";

                            for (int d = 0; d < palabra.length; d++) {
                                if (ch[posPaOpen].equals(palabra[d])) {
                                    lexema += ch[posPaOpen].toString();
                                    if (lexema.equals(parenthesisOpen)) {
                                        posActual = posPaOpen;
                                        if (ch[posPaOpen + 1].toString().equals(" ")) {
                                            posPaOpen++;
                                            return lex = new Lexema(pos, "Símbolo", lexema);
                                        } else {
                                            return null;
                                        }
                                    }
                                } else {
                                    palabra = parenthesisClose.toCharArray();
                                    lexema = "";

                                    for (int s = 0; s < palabra.length; s++) {
                                        if (ch[posPaClose].equals(palabra[s])) {
                                            lexema += ch[posKeyClose].toString();
                                            if (lexema.equals(parenthesisClose)) {
                                                posActual = posPaClose;
                                                if (ch[posPaClose + 1].toString().equals(" ")) {
                                                    posPaClose++;
                                                    return lex = new Lexema(pos, "Símbolo", lexema);
                                                } else {
                                                    return null;
                                                }
                                            }
                                        } else {
                                            palabra = plus.toCharArray();
                                            lexema = "";

                                            for (int o = 0; o < palabra.length; o++) {
                                                if (ch[posPlus].equals(palabra[o])) {
                                                    lexema += ch[posPlus].toString();
                                                    if (lexema.equals(plus)) {
                                                        posActual = posPlus;
                                                        if (ch[posPlus + 1].toString().equals(" ")) {
                                                            posPlus++;
                                                            return lex = new Lexema(pos, "Símbolo", lexema);
                                                        } else {
                                                            return null;
                                                        }
                                                    }
                                                } else {
                                                    palabra = minus.toCharArray();
                                                    lexema = "";

                                                    for (int f = 0; f < palabra.length; f++) {
                                                        if (ch[posMinus].equals(palabra[f])) {
                                                            lexema += ch[posMinus].toString();
                                                            if (lexema.equals(minus)) {
                                                                posActual = posMinus;
                                                                if (ch[posMinus + 1].toString().equals(" ")) {
                                                                    posMinus++;
                                                                    return lex = new Lexema(pos, "Símbolo", lexema);
                                                                } else {
                                                                    return null;
                                                                }
                                                            }
                                                        } else {
                                                            palabra = times.toCharArray();
                                                            lexema = "";

                                                            for (int c = 0; c < palabra.length; c++) {
                                                                if (ch[posTimes].equals(palabra[c])) {
                                                                    lexema += ch[posTimes].toString();
                                                                    if (lexema.equals(times)) {
                                                                        posActual = posTimes;
                                                                        if (ch[posTimes + 1].toString().equals(" ")) {
                                                                            posTimes++;
                                                                            return lex = new Lexema(pos, "Símbolo", lexema);
                                                                        } else {
                                                                            return null;
                                                                        }
                                                                    }
                                                                } else {
                                                                    palabra = divided.toCharArray();
                                                                    lexema = "";

                                                                    for (int e = 0; e < palabra.length; e++) {
                                                                        if (ch[posDivided].equals(palabra[e])) {
                                                                            lexema += ch[posDivided].toString();
                                                                            if (lexema.equals(divided)) {
                                                                                posActual = posDivided;
                                                                                if (ch[posDivided + 1].toString().equals(" ")) {
                                                                                    posDivided++;
                                                                                    return lex = new Lexema(pos, "Símbolo", lexema);
                                                                                } else {
                                                                                    return null;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            palabra = equals.toCharArray();
                                                                            lexema = "";

                                                                            for (int a = 0; a < palabra.length; a++) {
                                                                                if (ch[posEquals].equals(palabra[a])) {
                                                                                    lexema += ch[posEquals].toString();
                                                                                    if (lexema.equals(equals)) {
                                                                                        posActual = posEquals;
                                                                                        if (ch[posEquals + 1].toString().equals(" ")) {
                                                                                            posEquals++;
                                                                                            return lex = new Lexema(pos, "Símbolo", lexema);
                                                                                        } else {
                                                                                            return null;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    palabra = lessThan.toCharArray();
                                                                                    lexema = "";

                                                                                    for (int l = 0; l < palabra.length; l++) {
                                                                                        if (ch[posLess].equals(palabra[l])) {
                                                                                            lexema += ch[posLess].toString();
                                                                                            if (lexema.equals(lessThan)) {
                                                                                                posActual = posLess;
                                                                                                if (ch[posLess + 1].toString().equals(" ")) {
                                                                                                    posLess++;
                                                                                                    return lex = new Lexema(pos, "Símbolo", lexema);
                                                                                                } else {
                                                                                                    return null;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            palabra = greaterThan.toCharArray();
                                                                                            lexema = "";

                                                                                            for (int g = 0; g < palabra.length; g++) {
                                                                                                if (ch[posGreater].equals(palabra[g])) {
                                                                                                    lexema += ch[posGreater].toString();
                                                                                                    if (lexema.equals(greaterThan)) {
                                                                                                        posActual = posGreater;
                                                                                                        if (ch[posGreater + 1].toString().equals(" ")) {
                                                                                                            posGreater++;
                                                                                                            return lex = new Lexema(pos, "Símbolo", lexema);
                                                                                                        } else {
                                                                                                            return null;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    palabra = commentary.toCharArray();
                                                                                                    lexema = "";

                                                                                                    for (int b = 0; b < palabra.length; b++) {
                                                                                                        if (ch[posCo].equals(palabra[b])) {
                                                                                                            lexema += ch[posCo].toString();
                                                                                                            if (lexema.equals(commentary)) {
                                                                                                                posActual = posCo;
                                                                                                                if (ch[posCo + 1].toString().equals(" ")) {
                                                                                                                    posCo++;
                                                                                                                    return lex = new Lexema(pos, "Símbolo", lexema);
                                                                                                                } else {
                                                                                                                    return null;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            palabra = semicolon.toCharArray();
                                                                                                            lexema = "";

                                                                                                            for (int v = 0; v < palabra.length; v++) {
                                                                                                                if (ch[posSemi].equals(palabra[v])) {
                                                                                                                    lexema += ch[posSemi].toString();
                                                                                                                    if (lexema.equals(semicolon)) {
                                                                                                                        posActual = posSemi;
                                                                                                                        if (ch[posSemi + 1].toString().equals(" ")) {
                                                                                                                            posSemi++;
                                                                                                                            return lex = new Lexema(pos, "Símbolo", lexema);
                                                                                                                        } else {
                                                                                                                            return null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return null;
                                                                                                                }
                                                                                                                posSemi++;
                                                                                                            }
                                                                                                        }
                                                                                                        posCo++;
                                                                                                    }
                                                                                                }
                                                                                                posGreater++;
                                                                                            }
                                                                                        }
                                                                                        posLess++;
                                                                                    }
                                                                                }
                                                                                posEquals++;
                                                                            }
                                                                        }
                                                                        posDivided++;
                                                                    }
                                                                }
                                                                posTimes++;
                                                            }
                                                        }
                                                        posMinus++;
                                                    }
                                                }
                                                posPlus++;
                                            }
                                        }
                                        posPaClose++;
                                    }
                                }
                                posPaOpen++;
                            }
                        }
                        posKeyClose++;
                    }
                }
                pos++;
            }
        } else {
            return null;
        }
        return null;
    }

    /**
     * ****************************************
     * Verificamos la Expresion para ver si es un operador evaluandolo contra
     * nuestros tokens ****************************************
     */
    public void esToken(Character ch[]) {
        int ope = 0;
        String cualesSon = "";
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < tokens.length; j++) {
                if (ch[i].equals(tokens[j])) {
                    ope++;
                    cualesSon += ch[i].toString() + " ";
                }
            }
        }
//        Lexema out = new Lexema(ope, "Tokens", cualesSon);
//        out.verTipos();
    }

    /**
     * ***************************
     * Verificamos la Expresion para ver si es un identificador con el metodo de
     * la clase Cha racter isJavaIdentifierStart ***************************
     */
    public Lexema esIdentificador(Character ch[], int pos) {
        String lexema = "";
        // lexema = ch[pos].toString();
        if (ch[pos].toString().equals(" ")) {
            pos++;
            posActual = pos;
            return null;
        } else {
            while (!ch[pos].toString().equals(" ")) {
                System.out.println(pos);
                System.out.println("." + ch[pos] + ".");
                lexema += ch[pos].toString();
                pos++;
                posActual = pos;                
            }
            return lex = new Lexema(pos - 1, "Identificadores", lexema);
        }

        //     if (!) {            
        //          while (!ch[pos + 1].equals(" ")) {
//        System.out.print("." + ch[pos] + ".");
//        pos++;
//        posActual = pos;
//        //          }
//
//        return lex = new Lexema(pos - 1, "Identificadores", lexema);
//        //     } else {
        //         System.out.println("Espacio");
        //       return null;
        // }
    }
}

//        }

