package Metodos;

import javax.swing.*;

public class Operacion {
    //atributos
    int numero1,numero2,suma,resta,multiplicacion,division;

    //metodos

    //Metodo para pedir al usuario que nos digite 2 numeros
    public void leerNumeros(){
        numero1 =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    }
    //Metodo para sumar ambos números
    public void sumar(){
        suma=numero1+numero2;
    }
    public void restar() {
        resta = numero1 - numero2;
    }
    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }
    public void dividir(){
        division=numero1/numero2;
    }
    public void MostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
