package Ejercicio1_7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Produccion produccion = new Produccion();

        JOptionPane.showMessageDialog(null, produccion.toString());

        produccion.setLitros(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de litros vendidos: ")));
        produccion.setPagoGalon(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de pago por galón: ")));

        JOptionPane.showMessageDialog(null, produccion.toString());

    }

}
