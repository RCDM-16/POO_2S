package Ejercicio1_11;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Pago pago = new Pago();

        JOptionPane.showMessageDialog(null, pago.toString());


        boolean bandera;

        do {
            try {
                pago.setPrecioMetros(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio por metro cuadrado: ")));
                bandera = true;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para la cantidad de metros de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        do {
            try {
                pago.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura de la alberca: ")));
                bandera = true;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para la altura debe de ser numerica");
                bandera = false;
            }
        } while (!bandera);

        do {
            try {
                pago.setBase(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la base de la alberca: ")));
                bandera = true;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para la base debe de ser numerica");
                bandera = false;
            }
        } while (!bandera);

        JOptionPane.showMessageDialog(null, pago.toString());

    }
}
