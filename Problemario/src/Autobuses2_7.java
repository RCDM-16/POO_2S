import java.util.Scanner;

public class Autobuses2_7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double[] costos;
        float cantidadPersonas, kilometrosViaje;
        byte minPersonas = 20;
        char tipoAutobus;

        System.out.print("Ingrese el tipo de autobus para su viaje A / B / C: ");
        tipoAutobus = ent.next().toUpperCase().charAt(0);
        System.out.print("Ingrese los kilometros que se recorreran durante el viaje: ");
        kilometrosViaje = ent.nextFloat();
        System.out.print("Ingrese la cantidad de personas en el viaje: ");
        cantidadPersonas = ent.nextFloat();

        costos = calculoCostos(tipoAutobus, kilometrosViaje, cantidadPersonas, minPersonas);

        System.out.println("\n||||||||||||||| ADO Teziutlan ||||||||||||||\n" +
                "No.Pasajeros: " + cantidadPersonas + "\n" +
                "Tipo de Autobus: " + tipoAutobus + "\n" +
                "\n" +
                "Distancia de recorrido: " + kilometrosViaje + " km\n" +
                "\nPrecio del viaje: $" + costos[0] + "\n" +
                "Precio por cabeza: $" + costos[1] + "\n" +
                "|||||||||||Felicidades Usted Ahorro $nada ||||||||||||");

    }

    public static double[] calculoCostos(char tipoAutobus, float kilometros, float noPersonas, byte minPersonas) {
        double[] costos = new double[2];
        double costoPersonas;
        float personasCalculos = noPersonas;

        if (noPersonas < minPersonas) {
            personasCalculos = minPersonas;
        }

        costoPersonas = switch (tipoAutobus) {
            case 'A' -> personasCalculos * 2;
            case 'B' -> personasCalculos * 2.5;
            case 'C' -> personasCalculos * 3;
            default -> 0;
        };// no es que supiera, IntelliJ me lo dio como opcion

        costos[0] = costoPersonas * kilometros; //costo del viaje total
        costos[1] = costos[0] / noPersonas; //costo por persona
        return costos;
    }
}
