import java.util.Scanner;

public class PromedioCalificaciones2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] calificaciones = new int[4];
        double promedio;

        for (byte i = 0; i < calificaciones.length; ++i) {
            System.out.print("Ingrese la calificacion No." + (i + 1) + ": ");
            calificaciones[i] = ent.nextInt();
        }
        promedio = calculoPromedio(calificaciones);

        System.out.println("El promedio es de: "+promedio);
    }

    public static double calculoPromedio(int[] calif) {
        float sumaCalificaciones=0;
        for (byte i=0;i< calif.length;++i){
            sumaCalificaciones += calif[i];
        }
        return (sumaCalificaciones/calif.length);

    }
}

