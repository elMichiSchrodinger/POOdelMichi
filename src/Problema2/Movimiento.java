package Problema2;
/*
Ejercicio 2: Construir un programa que permita dirigir el movimiento de un
objeto dentro de un tablero y actualice su posición dentro del mismo.
Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA.
Tras cada movimiento el programa mostrará la nueva dirección elegida y las
coordenadas de situación del objeto dentro del tablero.
 */
import javax.swing.JOptionPane;

public class Movimiento {
    //Atributos

    private static int x=0;
    private static int y=0;

    //Metdodo

    public Movimiento(int mov){

    }

    public int arriba(){
        y++;
        return y;
    }
    public int abajo(){
        y--;
        return y;
    }
    public int derecha(){
        x++;
        return x;
    }
    public int izquierda(){
        x--;
        return x;

    }

    public void nuevoMov(){
        System.out.println("Ubicacion(x,y) = ("+x+":"+y+")");

    }

}