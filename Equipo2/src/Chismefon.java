import java.util.Scanner;

public class Chismefon {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float duracion;
        double total, precio, montoImpuesto = 0, montoDescuento = 0;
        char turno;
        byte dia, descuento = 0, impuesto = 0;

        System.out.print("Ingrese la duracion de la llamada en minutos: ");
        duracion = entrada.nextFloat();
        System.out.print("Ingrese el dia de la semana en que que se realizó la llamada: ");
        dia = entrada.nextByte();
        System.out.print("Ingrese el turno en el que se realizó la llamada: ");
        turno = entrada.next().charAt(0);

        if (duracion <= 5) {
            precio = duracion * 1.00;
        } else {
            if (duracion > 5 && duracion <= 8) {
                precio = 5.00 + (duracion - 5) * 0.80;
            } else if (duracion > 8 && duracion <= 10) {
                precio = 5.00 + 2.40 + (duracion - 8) * 0.70;
            } else {
                precio = 5.0 + 2.40 + 1.40 + (duracion - 10 * 0.50);
            }
        }

        if (dia == 6 || dia == 7) {
            descuento = 7;
            montoDescuento = precio * 0.07;
            total = precio - montoDescuento;
        } else {
            if (turno == 'm' || turno == 'M') {
                impuesto = 8;
            } else {
                impuesto = 10;
            }
            montoImpuesto = precio * (impuesto / 100);
            total = precio + montoImpuesto;
        }

        System.out.println("Duracion de la llamada: " + duracion + "\n" + "Dia: " + dia + "\n" + "Turno: " + turno + "\n" + "El costo de la llamada es de: $" + precio + "\n" + "El descuento es del: " + descuento + "%\n" + "El monto de descuento es del: " + montoDescuento + "%\n" + "El costo total de la llamada es: " + total + "\n" + "El monto de impuesto es del: " + montoImpuesto + "%\n" + "El monto de descuento es del: " + montoDescuento + "%\n");

    }
}
