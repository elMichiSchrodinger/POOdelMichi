package Metodos;

import javax.swing.*;

public class main2 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        Operacion2 op2 = new Operacion2();
        op2.sumar(n1,n2);
        op2.restar(n1,n2);
        op2.multiplicar(n1,n2);
        op2.dividir(n1,n2);
        op2.mostrarResultados();
    }
}
