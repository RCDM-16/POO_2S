import java.util.Scanner;

public class ArreglosEdades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte[] edades = new byte[5];
        int sumaEdades = 0,edadMayor, edadMenor;

        for (int i = 0; i < edades.length; i++) {
            System.out.print("Ingrese la edad " + (i + 1) + ": ");
            edades[i] = entrada.nextByte();
            sumaEdades += edades[i];
        }

        System.out.println("Edades en orden: ");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad No." + (i + 1) + ": " + edades[i]);
        }
        System.out.println("Edades Inversas: ");
        for (int i = edades.length - 1; i >= 0; i--) {
            System.out.println("Edad No." + (i + 1) + ": " + edades[i]);
        }

        System.out.println("Promedio:\n" + (sumaEdades / (edades.length)));

        edadMayor = edades[0];
        for (byte i = 0; i < edades.length; i++) {
            if (edadMayor < edades[i]){
                edadMayor = edades[i];
            }
        }

        edadMenor = edades[0];
        for (byte i = 0; i < edades.length; i++) {
            if (edadMenor > edades[i]){
                edadMenor = edades[i];
            }
        }
        System.out.println("Edad menor:\n"+edadMenor+"\nEdad mayor:\n"+edadMayor);
        /*
        for (int i = 0; i < edades.length; i++) {
            for (int x = 0; x < i - 1; x++) {
                if (edades[x] > edades[x + 1]) {
                    byte ordenEdad = edades[x];
                    edades[x] = edades[x+1];
                    edades[x+1] = ordenEdad;
                }
            }
        }

        System.out.println("Edad menor:\n"+edades[0]+"\nEdad menor:\n"+edades[edades.length-1]);

*/
    }
}
