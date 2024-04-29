package Ejercicio1_8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Distancia distancia = new Distancia();

        JOptionPane.showMessageDialog(null, distancia.toString());
        boolean bandera = true;

        do {
            try {
                distancia.setX1(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de X1: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para  debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        do {
            try {
                distancia.setX2(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de X2: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para  debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        do {
            try {
                distancia.setY1(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de Y1: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para  debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        do {
            try {
                distancia.setY2(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de Y2: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para  debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);


        JOptionPane.showMessageDialog(null, distancia.toString());
    }
}
