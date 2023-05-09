package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    //Metodos
    //Metodo constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;// Otra forama es poner public Persona(String _nombre, int _edad) para no confundir al programa
        this.edad = edad;//nombre=_nombre edad=_edad
    }
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
