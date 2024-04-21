import java.util.Scanner;

public class CalculoPrecio2_4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float precioTraje;
        double porcentajeDescuento;

        System.out.print("Precio del traje: $");
        precioTraje = ent.nextFloat();

        porcentajeDescuento = calculoPorcentaje(precioTraje);

        System.out.println("Su descuento es del " + (porcentajeDescuento * 100) + "%, usted debera pagar: " + calculoPrecio(porcentajeDescuento, precioTraje));
    }

    public static double calculoPorcentaje(float precio) {
        return precio > 2500 ? 0.15 : 0.08;
    }

    public static double calculoPrecio(double porcentaje, float precio) {
        return (precio - (porcentaje * precio));
    }
}

