import java.util.Scanner;

public class MedidasTerreno6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float radioTerreno, hipotenusaTerreno;
        double area;

        System.out.print("Ingrese el vaor del radio: ");
        radioTerreno = ent.nextFloat();
        System.out.print("Ingrese el valor de la hipotenusa: ");
        hipotenusaTerreno = ent.nextFloat();

        area = calculoArea(radioTerreno, hipotenusaTerreno);

        System.out.println("El area del terreno es de es de: " + area);

    }

    public static double calculoArea(float radio, float hipotenusa) {
        double areaSemicirculo, areaTriangulo;
        areaSemicirculo=(3.1416 * Math.pow(radio, 2))/2;
        areaTriangulo=(radio*2);//falta este
        return (areaSemicirculo + (areaTriangulo * 2));
    }

}
