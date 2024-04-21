import java.util.Scanner;

public class CasaVinicola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precioFinal = 0, cargoTotal = 0, cargo = 0;
        float kilosUvas, preciokilo;
        byte tamanioUva;
        char tipoUva;

        System.out.print("Ingrese la cantidad de kilos de uvas del embarque: ");
        kilosUvas = entrada.nextFloat();
        System.out.print("Ingrese el tipo de las Uvas a / b: ");
        tipoUva = entrada.next().charAt(0);
        System.out.print("Ingrese el tipo de tamanio de la uva 1 / 2: ");
        tamanioUva = entrada.nextByte();
        System.out.print("Ingrese el precio del kilo de uvas: ");
        preciokilo = entrada.nextFloat();

        if (tipoUva == 'a') {
            if(tamanioUva == 2) {
                cargo = 0.30;
            } else {
                cargo = 0.20;
            }
            cargoTotal = cargo * kilosUvas;
            precioFinal = (preciokilo * kilosUvas) + cargoTotal;
        } else if (tipoUva == 'b') {
            if(tamanioUva == 2) {
                cargo = 0.50;
            } else {
                cargo = 0.30;
            }
            cargoTotal = cargo * kilosUvas;
            precioFinal = (preciokilo * kilosUvas) - cargoTotal;
        }

        System.out.println( "===================~- Casa Avicola -~=====================" + "\n"+
                "Uvas: " + kilosUvas + " kg" + "\n" +
                "Tipo: "+ tipoUva + "\n" +
                "tamanio de la uva: " + tamanioUva + "\n" +
                "Precio por kilo: " + preciokilo + "\n"+
                "Cargo por kilo: " + cargo + "\n"+
                "Precio por kilo final: " + (preciokilo - cargo) + "\n"+
                "Cargo Total: " + cargoTotal+ "\n"+
                "Recibira: " + precioFinal + "\n" +
                "=================~- Gracias por su compra -~=================");

    }
}
