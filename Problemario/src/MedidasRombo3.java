import java.util.Scanner;

public class MedidasRombo3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float lado, diagonalMayor, diagonalMenor;
        double perimetro, area;
        System.out.print("Ingrese la medida de un lado: ");
        lado = ent.nextFloat();
        System.out.print("Ingrese la medida de la diagonal mayor: ");
        diagonalMayor = ent.nextFloat();
        System.out.print("Ingrese la medida de la diagonal menor: ");
        diagonalMenor = ent.nextFloat();

        area = calculoArea(diagonalMayor, diagonalMenor);
        perimetro = calculoPerimetro(lado);

        System.out.println("El area es de: "+area+" y el perimetro es de: "+perimetro);

    }

    public static double calculoArea(float diagonalMayor, float diagonalMenor) {
        return ((diagonalMayor*diagonalMenor)/2);
    }

    public static double calculoPerimetro(float lado) {
        return (lado*4);
    }
}
