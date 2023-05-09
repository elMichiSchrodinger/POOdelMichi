package ModificadoresAcceso.Paquete2;
import ModificadoresAcceso.Paquete1.Clase1;

public class Clase3 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();
        objeto1.atributo1=15;

        Clase3 objeto= new Clase3();
        //objeto.atributo=16; //Al ser privada la variable solo se puede usar en la misma clase por metodos
    }
}
