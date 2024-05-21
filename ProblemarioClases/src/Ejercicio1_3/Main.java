package Ejercicio1_3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Rombo rombo = null;
        try {
            rombo = new Rombo();
        } catch (RomboException e) {

        }

        JOptionPane.showMessageDialog(null, rombo.toString());
        boolean bandera;
        do {

            try {
                rombo.setLado(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de un lado: ")));
                bandera = true;
            } catch (NumberFormatException e) {
                bandera = false;
                JOptionPane.showMessageDialog(null, "El valor del lado tiene que ser numerico");
            } catch (RomboException re) {
                bandera = false;
                JOptionPane.showMessageDialog(null, re.toString());
            }

        } while (!bandera);

        do {
            try {
                rombo.setDiagonalMayor(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la diagonal mayor: ")));
                bandera = true;
            } catch (NumberFormatException e) {
                bandera = false;
                JOptionPane.showMessageDialog(null, "El valor del diagonal mayor tiene que ser numerico");
            } catch (RomboException re) {
                bandera = false;
                JOptionPane.showMessageDialog(null, re.toString());
            }
        } while (!bandera);

        do {
            try {
                rombo.setDiagonalMenor(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la diagonal menor: ")));
                bandera = true;
            } catch (NumberFormatException e) {
                bandera = false;
                JOptionPane.showMessageDialog(null, "El valor del diagonal menor dia tiene que ser numerico");
            } catch (RomboException re) {
                bandera = false;
                JOptionPane.showMessageDialog(null, re.toString());
            }
        } while (!bandera);


        JOptionPane.showMessageDialog(null, rombo.toString());
    }

}
