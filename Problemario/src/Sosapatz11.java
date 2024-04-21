import java.util.Scanner;

public class Sosapatz11 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float precioMetros, altura, base;
        double perimetro, area;

        System.out.print("Ingrese el precio por metro cuadrado: ");
        precioMetros = ent.nextFloat();
        System.out.print("Ingrese la altura de la alberca: ");
        altura = ent.nextFloat();
        System.out.print("Ingrese la medida de la base de la alberca: ");
        base = ent.nextFloat();

        System.out.println("El pago seria: "+ calculoPago(precioMetros, altura, base));

    }

    public static double calculoPago(float precioMetros, float altura, float base) {
        return ((Math.pow(altura,2) * base) * precioMetros);
    }

}

