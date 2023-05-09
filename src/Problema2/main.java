package Problema2;

import javax.swing.JOptionPane;

public class main {
    public static void main(String [] args){
        int mov;


        do{
            mov = Integer.parseInt(JOptionPane.showInputDialog("Dijite un movimiento: "
                    +"\n1. Subir"
                    +"\n2. Bajar"
                    +"\n3. Derecha"
                    +"\n4. Izquierda"
                    +"\n5. Salir"));
            Movimiento auto = new Movimiento(mov);
            switch(mov){
                case 1: auto.arriba();
                    auto.nuevoMov();
                    break;
                case 2: auto.abajo();
                    auto.nuevoMov();
                    break;
                case 3: auto.derecha();
                    auto.nuevoMov();
                    break;
                case 4: auto.izquierda();
                    auto.nuevoMov();
                    break;
                default: System.out.println("Error no existe esa opcion");
            }


        }while(mov !=5);

        System.out.println("Gracis por participar");

    }
}
