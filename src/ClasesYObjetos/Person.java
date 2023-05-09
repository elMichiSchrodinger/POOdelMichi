package ClasesYObjetos;

public class Person {
    //atributos
    String name;
    int edad;
    String DNI;

    //Metodo
    public Person(String name,int edad){
        this.name=name;
        this.edad=edad;
    }
    //Los metodos constructores se pueden diferenciar siempre que tengan diferentes parametros
    public Person(String DNI){
        this.DNI=DNI;
    }
    public void correr(){
        System.out.println("Soy "+name+", tengo "+edad+" años y estoy corriendo una maraton");
    }
    public void correr(int km){
        System.out.println("He corrido "+km+" kilometros");
    }
}
