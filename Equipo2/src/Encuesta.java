import javax.swing.JFrame;
import java.util.Scanner;

public class Encuesta extends JFrame {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double terror = 0, suspenso = 0, aventura = 0, romance = 0, accion = 0, infantil = 0, totalEncuestados = 0;
        byte eleccion;
        char nuevaEncuesta;
        do {
            System.out.print("=== Encuesta: Gusto Cinefilo\n" +
                    "De los siguientes generos, Seleccione, en su opinion, cual es el que mas consume y prefiere\n" +
                    "1. Terror\n" +
                    "2. suspenso\n" +
                    "3. aventura\";\n" +
                    "4. romance\n" +
                    "5. accion\n" +
                    "6. Infantil\n" +
                    "Selecione de la categoria del 1 al 6: ");
            eleccion = entrada.nextByte();
            switch (eleccion) {
                case 1:
                    terror += 1;
                    break;

                case 2:
                    suspenso += 1;
                    break;

                case 3:
                    aventura += 1;
                    break;

                case 4:
                    romance += 1;
                    break;

                case 5:
                    accion += 1;
                    break;

                case 6:
                    infantil += 1;
                    break;

                default:
                    System.out.println("Valor no valido");
                    break;
            }
            totalEncuestados += 1;
            System.out.print("Desea realizar una nueva encuesta? S/N ");
            nuevaEncuesta = entrada.next().toUpperCase().charAt(0);
        } while (nuevaEncuesta != 'N');

        System.out.println("Total: " + totalEncuestados + "\n" +
                "=== Recuento ===\n" +
                "Terror " + terror + "\n" +
                "Suspenso: " + suspenso + "\n" +
                "Aventura: " + aventura + "\n" +
                "Romance: " + romance + "\n" +
                "Acion: " + accion + "\n" +
                "Infantil: " + infantil + "\n" +
                "=== Porcentaje ===\n" +
                "Terror " + ((terror * 100) / totalEncuestados) + "%\n" +
                "Suspenso: " + ((suspenso * 100) / totalEncuestados) + "%\n" +
                "Aventura: " + ((aventura * 100) / totalEncuestados) + "%\n" +
                "Romance: " + ((romance * 100) / totalEncuestados) + "%\n" +
                "Acion: " + ((accion * 100) / totalEncuestados) + "%\n" +
                "Infantil: " + ((infantil * 100) / totalEncuestados) + "%\n");

    }
}
