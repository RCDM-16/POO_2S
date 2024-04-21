
import java.util.Scanner;

public class EdadNombre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte edad;
        String nombre;

        System.out.print("Ingrese su edad:  ");
        edad = entrada.nextByte();
        System.out.print("Ingrese su Nombre:  ");
        nombre = entrada.next();


        for (byte i = 1; i <= edad; i++) {
            System.out.println(nombre);
        }
    }
}



