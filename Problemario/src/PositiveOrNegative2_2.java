import java.util.Scanner;

public class PositiveOrNegative2_2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float numero;

        System.out.print("Ingrese un numero: ");
        numero = ent.nextFloat();
        System.out.println(numero + " es " + comparar(numero));
    }

    public static String comparar(float numero) {
        return numero > 0 ? "positivo" : "negativo";
    }
}
