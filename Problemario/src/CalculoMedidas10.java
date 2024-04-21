import java.util.Scanner;

public class CalculoMedidas10 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float metros;

        System.out.print("Ingrese los metros que ocupara: ");
        metros = ent.nextFloat();

        System.out.println("Las pulgadas que ocupara son: " + calculoPedido(metros));
    }

    public static double calculoPedido(float metros) {
        return (metros *0.0254);
    }
}