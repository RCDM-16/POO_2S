import java.util.Scanner;
public class VisitaIndustrial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float noAlumnos, costoAlumno, total;
        System.out.print("Ingrese la cantidad de Alumnos a la visita: ");
        noAlumnos = entrada.nextFloat();

        if (noAlumnos >= 100) {
            costoAlumno = 65;
        } else if(noAlumnos >= 50){
            costoAlumno = 70;
        } else if(noAlumnos >= 30){
            costoAlumno = 95;
        }else{
            costoAlumno = 0;
        }

        total =(noAlumnos < 30)? 4000 : costoAlumno * noAlumnos;

        System.out.println("\n" +
                "\n" +
                "                       __   ___    _ _          _         _         _       _      _                           \n" +
                "  ___ ___ ___ ___ ___  \\ \\ / (_)__(_) |_ __ _  (_)_ _  __| |_  _ __| |_ _ _(_)__ _| |  ___ ___ ___ ___ ___ ___ \n" +
                " |___|___|___|___|___|  \\ V /| (_-< |  _/ _` | | | ' \\/ _` | || (_-<  _| '_| / _` | | |___|___|___|___|___|___|\n" +
                "                         \\_/ |_/__/_|\\__\\__,_| |_|_||_\\__,_|\\_,_/__/\\__|_| |_\\__,_|_|                          \n" +
                "                                                                                                               \n" +
                "\n");

        System.out.println("No. de alumnos: " + noAlumnos + "\n" +
                "Costo por alumno: " + costoAlumno + "\n" +
                "Total: " + total);

    }
}
