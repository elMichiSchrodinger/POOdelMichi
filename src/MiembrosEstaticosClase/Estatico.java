package MiembrosEstaticosClase;

public class Estatico {
    private static String frase = "Primera fase";
    public static int sumar(int n1, int n2){
        int suma=n1+n2;
        return suma;
    }
    public static void main(String[] args) {
        Estatico objeto = new Estatico();
        Estatico objeto2= new Estatico();
        objeto2.frase="Segunda frase";
        System.out.println(objeto.frase);
        System.out.println(objeto2.frase);
        System.out.println(Estatico.frase);
        System.out.println("La suma es: "+Estatico.sumar(3,4));
    }
}
