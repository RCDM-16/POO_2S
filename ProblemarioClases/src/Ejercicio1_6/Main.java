package Ejercicio1_6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Terreno terreno = new Terreno();

        JOptionPane.showMessageDialog(null, terreno.toString());

        boolean bandera;
        do {
            try {
                terreno.setRadioTerreno(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del radio: ")));

                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para el radio debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        JOptionPane.showMessageDialog(null, terreno.toString());

    }
}
