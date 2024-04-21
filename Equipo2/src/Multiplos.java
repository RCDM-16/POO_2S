import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte numero;

        System.out.print("ingrese un numero del 1 al 10: ");
        numero = entrada.nextByte();
        while (numero > 10) {
            System.out.print("Ese no es un numero del 1 al 10, ingrese un numero del 1 al 10: ");
            numero = entrada.nextByte();
        }

        for (byte i = numero; i <= 100; i += numero) {
            System.out.println(i);
        }
    }
}
