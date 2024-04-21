
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte numero;

        System.out.print("ingrese un numero del 1 al 10: ");
        numero = entrada.nextByte();
        while (numero > 10) {
            System.out.print("Ese no es un numero del 1 al 10, ingrese un numero del 1 al 10: ");
            numero = entrada.nextByte();
        }

        for (byte i = 1; i <= 10; i ++) {
            System.out.println(numero+" x "+i+" = "+numero*i);
        }
    }
}