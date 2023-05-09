package Problema3;
/*
Construir un programa que dada una serie de vehiculos caracterizados
por su marca, modelo y precio, imprima las propiedades del vehiculo
más barato. Para ello, se deberan leer por teclado las características
de cada vehiculo y crear una clase que represente a cada uno de ellos.
 */
import java.lang.reflect.Array;

public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
    public Vehiculo(String marca, String modelo,Float precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    public float getPrecio() {
        return precio;
    }
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: $"+precio+"\n";
    }
}