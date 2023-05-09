package Problema3;

import java.util.Scanner;


public class Principal {
    public static int indiceCocheMBarato(Vehiculo coches[]){
        float precio1;
        int indice = 0;
        precio1 = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio1) {
                precio1 = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;
        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();
        //Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        for (int i = 0; i < coches.length; i++) {
            entrada.nextLine();
            System.out.print("\nDigite las caracteristicas del coche " + (i + 1) + ":");
            System.out.print("\nIntroduzca Marca: ");
            marca = entrada.nextLine();
            System.out.print("\nIntroduzca Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("\nIntroduzca Precio: ");
            precio = entrada.nextFloat();
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        float precio1;
        int indice = 0;
        precio1 = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio1) {
                precio1 = coches[i].getPrecio();
                indice = i;
            }
        }
        indiceBarato = indice;
        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
