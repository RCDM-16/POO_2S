import java.util.Scanner;

public class ChismefonCentinela {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float duracion, duracionTotal = 0, impuesto, llamadasMatutinas = 0;
        float llamadasVespertinas = 0, llamadasEntreSemana = 0, llamadasFinSemana = 0;
        double total, precio = 0, montoImpuesto, montoDescuento;
        char centinela = 's';
        String turno;
        byte dia, descuento, llamadas = 0;

        while (centinela != 'n') {
            turno = "No aplica";
            impuesto = 0;
            descuento = 0;
            montoDescuento = 0;
            System.out.print("Ingrese la duracion de la llamada en minutos: ");
            duracion = entrada.nextFloat();
            System.out.print("Ingrese el dia de la semana en que que se realizó la llamada: ");
            dia = entrada.nextByte();

            if (dia != 6 && dia != 7) {
                System.out.print("Ingrese el turno en el que se realizó la llamada: ");
                turno = entrada.next().toLowerCase();
            }

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

            if (dia == 6 || dia == 7) {
                descuento = 7;
                montoDescuento = precio * 0.07;
                total = precio - montoDescuento;

                llamadasFinSemana++;
            } else {
                if (turno.equals("m")) {
                    impuesto = 8;
                    llamadasMatutinas++;
                } else if (turno.equals("v")) {
                    impuesto = 10;
                    llamadasVespertinas++;
                }
                montoImpuesto = precio * (impuesto / 100);
                total = precio + montoImpuesto;
                llamadasEntreSemana++;
            }
            System.out.println("Duracion de la llamada: " + duracion +
                    "\n" + "Dia: " + dia + "\n" + "Turno: " + turno +
                    "\n" + "El costo de la llamada es de: $" + precio + "\n" +
                    "El descuento es del: " + descuento +
                    "%\n" + "El monto de descuento es del: " + montoDescuento +
                    "%\n" + "El costo total de la llamada es: " + total + "\n");

            System.out.print("Desea realizar otra llamada?: ");
            centinela = entrada.next().toLowerCase().charAt(0);


            duracionTotal += duracion;
            llamadas++;
        }
        System.out.println("=== Resultados Estadisticos ===\nDuracion promedio: " + (duracionTotal / llamadas) +
                "\nPorcentaje de llamadas en fin de semana: " + ((llamadasFinSemana * 100) / (llamadasEntreSemana + llamadasFinSemana)) +
                "%\nPorcentaje de llamadas entre semana:  " + ((llamadasEntreSemana * 100) / (llamadasEntreSemana + llamadasFinSemana)) +
                "%\nPorcentaje de llamadas en el turno matutino:  " + ((llamadasMatutinas * 100) / (llamadasMatutinas + llamadasVespertinas)) +
                "%\nPorcentaje de llamadas en el turno vespertino:  " + ((llamadasVespertinas * 100) / (llamadasVespertinas + llamadasMatutinas))+"%");
    }
}
