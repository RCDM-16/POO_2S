import java.util.Scanner;

public class CalculoLeche7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float litros, pagoGalon;
        double pago;

        System.out.print("Ingrese la cantidad de litros vendidos: ");
        litros = ent.nextFloat();
        System.out.print("Ingrese cuanto le pagan por galon: ");
        pagoGalon = ent.nextFloat();

        pago = calculoPago(litros, pagoGalon);

        System.out.println("Recibira: $" + pago+" por su leche");

    }

    public static double calculoPago(float litros, float pagoGalon) {
        return (pagoGalon * (litros/3.785));
    }

}

