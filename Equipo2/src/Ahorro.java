import java.util.Scanner;

public class Ahorro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float ahorro;
        double total;
        byte dias;
        total = 0;
        dias = 0;

        while (total < 5999.9) {
            System.out.print("Ingrese el ahorro del dia: ");
            ahorro = entrada.nextFloat();
            total += ahorro;
            dias++;
        }

        System.out.println("Dias de ahorro: "+ dias +" Dias\nTotal ahorrado: $" + total);
    }
}
