import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float peso, estatura;
        double indice, imcMujeres = 0, imcHombres = 0;
        String nombre;
        char centinella, sexo;
        byte cHombres = 0, cMujeres = 0;
        do {
            System.out.print("\nIngrese su nombre: ");
            nombre = entrada.next();
            System.out.print("Ingrese su Altura en metros: ");
            estatura = entrada.nextFloat();
            System.out.print("Ingrese su Peso en kilogramos: ");
            peso = entrada.nextFloat();
            System.out.print("Ingrese su Sexo M/F: ");
            sexo = entrada.next().toLowerCase().charAt(0);

            indice = peso / Math.pow(estatura, 2);

            System.out.println(nombre + ", Su IMS es de: " + indice + "\n");

            if (sexo == 'f') {
                cMujeres++;
                imcMujeres += indice;
            } else {
                cHombres++;
                imcHombres += indice;
            }

            System.out.print("Desea calcular otro Indice?: ");
            centinella = entrada.next().toUpperCase().charAt(0);

        } while (centinella != 'N');

        System.out.println("\n=== Resultados ===\nMujeres atendidas: " + cMujeres + "\n" +
                "Hombres atendidos: " + cHombres + "\n" +
                "Total de personas atendidas: " + (cMujeres + cHombres) + "\n" +
                "=== Promedios ===" +
                "Promedio General: " + ((imcMujeres + imcHombres) / (cMujeres + cHombres)) + "\n" +
                "Promedio Mujeres: " + (imcMujeres / cMujeres) + "\n" +
                "Promedio Hombres: " + (imcHombres / cHombres));
    }
}
