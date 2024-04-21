import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = 90, intentos = 0, numero;

        System.out.print("Cual es el numero secreto?: ");
        numero = entrada.nextInt();
        intentos++;

        while (numero != numeroSecreto) {
            System.out.print(((numero > numeroSecreto)? "Te pasaste!": "Te falta!")+", "+numero+" no es el numero secreto, intente de nuevo: ");
            numero = entrada.nextInt();
            intentos++;
        }
        System.out.println("\nFelicidades, el numero " + numero + " es el numero secreto :D\n Realizaste." + intentos + " intentos");

    }
}
