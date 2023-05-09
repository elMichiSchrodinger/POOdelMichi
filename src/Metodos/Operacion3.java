package Metodos;

public class Operacion3 {
    public int sumar(int n1,int n2){
        int suma= n1+n2;
        return suma;
    }
    public int restar(int n1,int n2){
        int resta = n1-n2;
        return resta;
    }
    public int multiplicar(int n1,int n2){
        int multiplicacion = n1*n2;
        return multiplicacion;
    }
    public int dividir(int n1,int n2){
        int division = n1/n2;
        return division;
    }
    public void MostrarResultados(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma es "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
