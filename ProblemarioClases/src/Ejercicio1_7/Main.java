package Ejercicio1_7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Produccion produccion = new Produccion();

        JOptionPane.showMessageDialog(null, produccion.toString());
        boolean bandera;

        do {
            try {
                produccion.setLitros(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de litros vendidos: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "la cantidad de litros vendidos debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        do {
            try {
                produccion.setPagoGalon(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de pago por galón: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La cantidad de pago por galon debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        JOptionPane.showMessageDialog(null, produccion.toString());

    }

}
