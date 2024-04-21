import java.util.Scanner;

public class MedidasTerreno5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float alturaTerrenoIzq, alturaTerrenoDere, baseTerreno;
        double area;

        System.out.print("Ingrese la altura izquierda del terreno: ");
        alturaTerrenoIzq = ent.nextFloat();
        System.out.print("Ingrese la altura derecha del terreno: ");
        alturaTerrenoDere = ent.nextFloat();
        System.out.print("Ingrese la medida de la base del terreno: ");
        baseTerreno = ent.nextFloat();

        area = calculoArea(alturaTerrenoIzq, alturaTerrenoDere, baseTerreno);

        System.out.println("El area del terreno es de es de: " + area);

    }

    public static double calculoArea(float alturaTerrenoIzq, float alturaTerrenoDere, float baseTerreno) {
        float alturaTriangulo, areaTriangulo, areaRectangulo;
        alturaTriangulo = alturaTerrenoIzq - alturaTerrenoDere;
        areaTriangulo = (baseTerreno * alturaTriangulo) / 2;
        areaRectangulo = baseTerreno * alturaTerrenoDere;
        return (areaTriangulo + areaRectangulo);
    }

}