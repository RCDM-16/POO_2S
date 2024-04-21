import java.util.Scanner;

public class AlmacenArticulosArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] articulos = new double[5];
        double sumaArticulos = 0;

        for (int i = 0; i < articulos.length; i++) {
            System.out.print("Ingrese el precio del artículo " + (i + 1) + ": ");
            articulos[i] = entrada.nextDouble();
        }

        System.out.println("Precio de los articulos en orden: ");
        for (int i = 0; i < articulos.length; i++) {
            System.out.println("Artículo No." + (i + 1) + ": $" + articulos[i]);
        }

        System.out.println("Precio de los articulos en orden (+5%): ");
        for (int i = 0; i < articulos.length; i++) {
            articulos[i] = articulos[i] + (articulos[i] * 0.05);
            System.out.println("Artículo No." + (i + 1) + ": $" + articulos[i]);
            sumaArticulos += articulos[i];
        }

        System.out.println("Promedio:\n"+sumaArticulos/(articulos.length));
    }
}
