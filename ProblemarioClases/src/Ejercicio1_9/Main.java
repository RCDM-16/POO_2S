package Ejercicio1_9;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador();

        JOptionPane.showMessageDialog(null, trabajador.toString());

        trabajador.setHorasTrabajadas(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas: ")));
        trabajador.setPagoHora(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de pago por hora: ")));

        JOptionPane.showMessageDialog(null, trabajador.toString());
    }
}
