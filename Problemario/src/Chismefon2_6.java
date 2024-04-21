import java.util.Scanner;

public class Chismefon2_6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float duracion;
        double total, precio;
        String turno = "No aplica";
        byte dia;
        double[] valorAgregado = {};

        System.out.print("Ingrese la duracion de la llamada en minutos: ");
        duracion = ent.nextFloat();
        System.out.print("Ingrese el dia de la semana en que que se realizó la llamada: ");
        dia = ent.nextByte();

        if (dia != 6 && dia != 7) {
            System.out.print("Ingrese el turno en el que se realizó la llamada: ");
            turno = ent.next().toLowerCase();
        }

        precio = calculoPrecio(duracion);

        valorAgregado = CalculoValorAregado(precio, turno, dia);

        System.out.println("Duracion de la llamada: " + duracion +
                "\n" + "Dia: " + dia + "\n" + "Turno: " + turno +
                "\n" + "El costo de la llamada es de: $" + precio +
                "\nDescuento o impuesto es del: " + valorAgregado[0] + "%" +
                "%\n" + "El monto de descuento o impuesto es del: $" + valorAgregado[1] +
                "%\n" + "El costo total de la llamada es: $" + valorAgregado[2] + "\n");
    }

    public static double calculoPrecio(float duracion) {
        double precio = 0;
        if (duracion <= 5) {
            precio = duracion * 1.00;
        } else {
            if (duracion > 5 && duracion <= 8) {
                precio = 5.00 + (duracion - 5) * 0.80;
            } else if (duracion > 8 && duracion <= 10) {
                precio = 5.00 + 2.40 + (duracion - 8) * 0.70;
            } else if (duracion > 10) {
                precio = 5.0 + 2.40 + 1.40 + (duracion - 10) * 0.50;
            }
        }
        return precio;
    }

    public static double[] CalculoValorAregado(double precio, String turno, byte dia) {
        double[] valores = new double[3];

        if (dia == 6 || dia == 7) {
            valores[0] = 7; //descuento
            valores[1] = precio * (valores[0] / 100); //monto de descuento
            valores[2] = precio - valores[1]; //total con descuento
        } else {
            if (turno.equals("m")) {
                valores[0] = 8; //impuesto
            } else if (turno.equals("v")) {
                valores[0] = 10; //impuesto
            }
            valores[1] = precio * (valores[0] / 100); //monto de impuesto
            valores[2] = precio + valores[1]; //total con impuesto
        }

        return valores;
    }

}
