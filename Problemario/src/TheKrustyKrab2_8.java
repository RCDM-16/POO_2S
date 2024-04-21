import java.util.Scanner;

public class TheKrustyKrab2_8 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double[] cuenta;
        float noHamburgesas;
        float cargo = 5;
        char tipoHamburgesa;

        System.out.print("Imgrese la cantidades de Hamburgesas consumidas: ");
        noHamburgesas = ent.nextFloat();
        System.out.print("Sencilla -> S\nDoble ->D\nTripe -> T\nIngrese la letra correspondiente al tipo de hamburgesas consumidas: ");
        tipoHamburgesa = ent.next().toUpperCase().charAt(0);

        cuenta = calculoCuenta(noHamburgesas, tipoHamburgesa, cargo);

        System.out.println("\nCantidad de Hamburgesas: " + noHamburgesas + "\n" +
                "Tipo de Hamburgesas: " + tipoHamburgesa + "\n" +
                "Precio por hamburgesa: $" + cuenta[0] + "\n" +
                "Precio total de hamburgesas: " + cuenta[1] + "\n" +
                "Cargo por Tarjeta de credito (Me gusta el dinero): " + cargo + "%\n" +
                "Monto por cargo: $" + cuenta[2] + "%\n" +
                "Total: $" + cuenta[3]);

    }

    public static double[] calculoCuenta(float noHamburgesas, char tipo, float cargo) {
        double[] cuenta = new double[4];

        cuenta[0] = switch (tipo) {
            case 'S' -> 20;
            case 'D' -> 25;
            case 'T' -> 28;
            default -> 0;
        };

        cuenta[1] = noHamburgesas * cuenta[0];
        cuenta[2] = cuenta[1] * (cargo / 100);
        cuenta[3] = cuenta[1] + cuenta[2];
        return cuenta;
    }
}
