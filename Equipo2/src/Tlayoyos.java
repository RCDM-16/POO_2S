import java.util.Scanner;

public class Tlayoyos {
    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);

        byte totalEncuestados = 0, encuestadosEstudiantes = 0, encuestadosNormales = 0, consumidores = 0, noConsumidores = 0;
        String respuestaEstudiante, respuestaConsumo;

        while (totalEncuestados < 30 || encuestadosEstudiantes <= (totalEncuestados / 2)) {
            System.out.print("\n=== Tlayoyos Teziutecos ===\nSe parte de nuesta encuesta del consumidor:\nEres un estudiante?: ");
            respuestaEstudiante = entrada.nextLine().toLowerCase();
            if ((respuestaEstudiante.equals("si"))) {
                encuestadosEstudiantes++;
            } else {
                encuestadosNormales++;
            }

            System.out.print("Has probado el Tlayoyo teziuteco?");
            respuestaConsumo = entrada.nextLine().toLowerCase();
            if ((respuestaConsumo.equals("si"))) {
                consumidores++;
            } else {
                noConsumidores++;
            }

            totalEncuestados++;
            System.out.println("=== Encuesta No. " + totalEncuestados + " ===\n");
        }
        System.out.println("\n==== Resultados de las encuestas ====\nEncuestas Totales: " + totalEncuestados + "\n" + "Estudiantes encuestados: " + encuestadosEstudiantes + "\nEncuestados que han consumido Tlayoyos: " + ((consumidores * 100) / totalEncuestados) + "%\nEncuestados que no han consumido Tlayoyos: " + ((noConsumidores * 100) / totalEncuestados) + "%\n======================");
    }
}
