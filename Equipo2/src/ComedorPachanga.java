import java.util.Scanner;
public class ComedorPachanga {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        byte costoPlatillo;
        float costoTotal, noPersonas;
        double total;
        System.out.print("Ingrese la cantidad de personas en su mesa: ");
        noPersonas = entrada.nextFloat();

        if (noPersonas > 300) {
            costoPlatillo = 75;
        } else {
            if(noPersonas >= 200 && noPersonas <= 300) {
                costoPlatillo = 85;
            }else{
                costoPlatillo = 95;
            }
        }

        System.out.println("El numero de personas en su banquete es de: "+ noPersonas + "\n" +
        "El costo de su platilo es de: " + costoPlatillo + "\n" +
        "El total sera de: "+ noPersonas * costoPlatillo);
    }
}
