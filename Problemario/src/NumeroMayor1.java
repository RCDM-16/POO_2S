import java.util.Scanner;

public class NumeroMayor1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float numero1, numero2, mayor;
        System.out.print("Ingrese el numero 1: ");
        numero1 = ent.nextFloat();
        System.out.print("Ingrese el numero 2: ");
        numero2 = ent.nextFloat();
        mayor = comparar(numero1, numero2);
        System.out.println(mayor + " Es el numero mayor");
    }
    public static float comparar(float n1, float n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}
