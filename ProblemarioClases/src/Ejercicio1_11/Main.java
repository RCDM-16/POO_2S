package Ejercicio1_11;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Pago pago = new Pago();

        JOptionPane.showMessageDialog(null, pago.toString());

        pago.setPrecioMetros(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por metro cuadrado: ")));
        pago.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura de la alberca: ")));
        pago.setBase(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la base de la alberca: ")));

        JOptionPane.showMessageDialog(null, pago.toString());

    }
}
