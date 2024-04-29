package Ejercicio1_3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Rombo rombo = new Rombo();

        JOptionPane.showMessageDialog(null, rombo.toString());
        boolean bandera = true;
        do {

            try {
                rombo.setLado(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de un lado: ")));
                bandera = true;
            } catch (Exception e) {
                bandera = false;
                JOptionPane.showMessageDialog(null, "El valor del lado tiene que ser numerico");
            }
        } while (!bandera);

        do {
            try {
                rombo.setDiagonalMayor(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la diagonal mayor: ")));
                bandera = true;
            } catch (Exception e) {
                bandera = false;
                JOptionPane.showMessageDialog(null, "El valor del diagonal mayor tiene que ser numerico");
            }
        } while (!bandera);

        do {
            try {
                rombo.setDiagonalMenor(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la diagonal menor: ")));
                bandera = true;
            } catch (Exception e) {
                bandera = false;
                JOptionPane.showMessageDialog(null, "El valor del diagonal menor dia tiene que ser numerico");
            }
        } while (!bandera);


        JOptionPane.showMessageDialog(null, rombo.toString());
    }

}
