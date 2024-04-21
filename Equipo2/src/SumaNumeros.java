import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int suma = 0;

        for (byte i = 1; i <= 5; i++) {
            System.out.print("Ingrese el numero " + i + ":");
            suma += entrada.nextByte();
        }
        System.out.println("La suma de los numeros es: "+suma);
    }
}

