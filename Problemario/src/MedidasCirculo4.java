import java.util.Scanner;

public class MedidasCirculo4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float radio;
        double perimetro, area;
        System.out.print("Ingrese la medida del radio: ");
        radio = ent.nextFloat();

        area = calculoArea(radio);
        perimetro = calculoPerimetro(radio);

        System.out.println("El area es de: " + area + " y el perimetro es de: " + perimetro);

    }

    public static double calculoArea(float radio) {
        return ((3.1416 * 2) * radio);
    }

    public static double calculoPerimetro(float radio) {
        return (3.1416 * Math.pow(radio, 2));
    }
}