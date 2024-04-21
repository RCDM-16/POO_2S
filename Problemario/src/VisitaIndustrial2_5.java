import java.util.Scanner;

public class VisitaIndustrial2_5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float noAlumnos;
        double[] calculo;

        System.out.print("Ingrese el numero de alumnos para el viaje: ");
        noAlumnos = ent.nextFloat();

        calculo = calculoPago(noAlumnos);
        System.out.println("Asistiran " + noAlumnos + (noAlumnos > 1 ? " alumnos" : " alumno") + "\nCosto del viaje: $" + calculo[1] + "\nPago por estudiante: $" + calculo[0]);
    }

    public static double[] calculoPago(float noAlumnos) {
        double[] datos = new double[2];

        if (noAlumnos >= 100) {
            datos[0] = 65;
        } else if (noAlumnos >= 50) {
            datos[0] = 70;
        } else if (noAlumnos >= 30) {
            datos[0] = 95;
        }

        datos[1] = datos[0] * noAlumnos;

        if (noAlumnos < 30) {
            datos[1] = 4000;
            datos[0] = datos[1] / noAlumnos;
        }

        return datos;
    }
}


