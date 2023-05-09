package Problema1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Cuadrilatero objeto;
        float lado1, lado2;
        lado1 =Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1 del cuadrilatero: "));
        lado2 =Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2 del cuadrilatero: "));
        if (lado2==lado1){
            objeto=new Cuadrilatero(lado1);
        }
        else {
            objeto=new Cuadrilatero(lado1,lado2);
        }
        System.out.println("El perimetro es: "+objeto.getPerimetro());
        System.out.println("El area es: "+objeto.getArea());
    }
}
