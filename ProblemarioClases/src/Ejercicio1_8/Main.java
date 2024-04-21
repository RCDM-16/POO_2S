package Ejercicio1_8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Distancia distancia = new Distancia();

        JOptionPane.showMessageDialog(null, distancia.toString());

        distancia.setX1(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de X1: ")));
        distancia.setX2(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de X2: ")));
        distancia.setY1(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de Y1: ")));
        distancia.setY2(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de Y2: ")));

        JOptionPane.showMessageDialog(null, distancia.toString());
    }
}
