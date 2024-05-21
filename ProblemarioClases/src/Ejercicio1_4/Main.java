package Ejercicio1_4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Circunferencia circunferencia = null;
        try {
            circunferencia = new Circunferencia();
        } catch (Exception e) {

        }

        JOptionPane.showMessageDialog(null, circunferencia.toString());

        boolean bandera;
        do {
            try {
                circunferencia.setRadio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del radio: ")));
                bandera = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor porporcionado a la medida del radio debe de ser numerico");
                bandera = false;
            } catch (CircunferenciaExcepcion ce) {
                JOptionPane.showMessageDialog(null, ce.toString());
                bandera = false;
            }
        } while (!bandera);


        JOptionPane.showMessageDialog(null, circunferencia.toString());

    }
}
