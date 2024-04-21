import java.util.Scanner;

public class Distancia8 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float horasTrabajadas, pagoHora;

        System.out.print("Ingrese la cantidad de pago por hora: ");
        horasTrabajadas = ent.nextFloat();
        System.out.print("ngrese la cantidad de pago por hora: ");
        pagoHora = ent.nextFloat();

        System.out.println("Su sueldo es de: $" + calculoSueldo(horasTrabajadas, pagoHora));
    }

    public static double calculoSueldo(float horasTrabajadas, float pagoHora) {
        return (horasTrabajadas * pagoHora);
    }
}