package Ejercicio1_9;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador();

        JOptionPane.showMessageDialog(null, trabajador.toString());

        boolean bandera = true;

        do {
            try {
                trabajador.setHorasTrabajadas(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para la cantidad de horas trabajadas debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        do {
            try {
                trabajador.setPagoHora(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de pago por hora: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para la cantidad de pago por hora debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);


        JOptionPane.showMessageDialog(null, trabajador.toString());
    }
}
