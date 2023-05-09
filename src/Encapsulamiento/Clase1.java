package Encapsulamiento;

public class Clase1 {
    private int edad;
    private String nombre;
    public void SetEdad(int edad){
        this.edad=edad;
    }
    public int GetEdad(){
        return edad;
    }
    public void setNombre(String nombre) { //Escribir set o get es una forma rapída
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
