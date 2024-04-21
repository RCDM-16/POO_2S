import java.util.Scanner;
public class Sueldo {
    public static void main(String []args){
        Scanner entrada =  new Scanner(System.in);
        byte horasTrabajo;
        float pagoHora;
        char madreSoltera;
        double sueldoNormal, sueldoExtra, sueldoTotal, porcentajeIsr, montoIsr, montoDespensa, porcentajeDespensa, sueldoNeto, horasExtra;

        System.out.print("Cuanto gana por hora de trabajo?: ");
        pagoHora = entrada.nextFloat();
        System.out.print("Cuantas horas trabaja a la semana: ");
        horasTrabajo = entrada.nextByte();
        System.out.print("Es usted madre soltera: S/N ");
        madreSoltera = entrada.next().charAt(0);

        //Pago extra
        if (horasTrabajo > 40) {
            horasExtra = (horasTrabajo - 40);
            sueldoExtra = (horasExtra * pagoHora) * 2;
            sueldoNormal = (horasTrabajo - horasExtra) * pagoHora;
            sueldoTotal = sueldoExtra + sueldoNormal;
        } else {
            sueldoTotal = (pagoHora * horasTrabajo);
            sueldoExtra = 0;
            sueldoNormal = sueldoTotal;
        }

        //PorcentajeISR
        if (sueldoTotal >= 2000){
            montoIsr = (sueldoTotal * 0.09);
            porcentajeIsr = 9;
        } else {
            montoIsr = sueldoTotal* 0.05;
            porcentajeIsr = 5;
        }

        //soltera

        if (madreSoltera == 'S' || madreSoltera == 's'){
            montoDespensa = sueldoTotal * 0.20;
            porcentajeDespensa = 20;
        } else {
            montoDespensa = sueldoTotal * 0.10;
            porcentajeDespensa = 10;
        }

        sueldoNeto =  (sueldoTotal -  montoIsr) + montoDespensa;

        System.out.println("Horas Trabajadas: "+ horasTrabajo+"\n"+
                "Pago por hora: "+ pagoHora+"\n"+
                "Pago horas normales: "+ sueldoNormal+"\n"+
                "Pago de horas extras: "+ sueldoExtra+"\n"+
                "sueldoBruto: "+ sueldoTotal+"\n"+
                "Porcentaje ISR: "+ porcentajeIsr +"\n"+
                "Monto ISR: "+ montoIsr +"\n"+
                "Madre Soltera: "+ madreSoltera +"\n"+
                "Despensa: "+ porcentajeDespensa +"\n"+
                "Monto de la despensa: "+ montoDespensa+"\n"+
                "Sueldo Neto: "+ sueldoNeto +"\n");
    }
}
