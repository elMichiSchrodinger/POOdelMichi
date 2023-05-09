package Metodos;

import javax.swing.*;

public class main3 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    Operacion3 op3=new Operacion3();
    op3.MostrarResultados(op3.sumar(n1,n2),op3.restar(n1,n2),op3.multiplicar(n1,n2),op3.dividir(n1,n2));
    }
}
