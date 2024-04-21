import java.util.Scanner;

public class Consultorio2_9 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        char nuevaCita;
        byte citas = 1;
        float costoCita;
        double totalTratamiento = 0;


        do {
            costoCita = pagoCita(citas);
            System.out.println("El costo de su cita sera de: $" + costoCita);
            totalTratamiento += costoCita;
            System.out.print("Desea haceer una nueva cita: ");
            nuevaCita = ent.next().toLowerCase().charAt(0);
            citas++;
        } while (nuevaCita == 's');
        System.out.println("El total de su tratamiento fue de: $" + totalTratamiento);
    }

    public static float pagoCita(float citas) {
        float costo = 0;
        if (citas <= 3) {
            costo = 200;
        } else if (citas > 3 && citas <= 5) {
            costo = 150;
        } else if (citas > 5 && citas <= 8) {
            costo = 100;
        } else if (citas > 8) {
            costo = 50;
        }

        return costo;
    }
}
