package Ejercicio1_3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Rombo rombo = new Rombo();

        JOptionPane.showMessageDialog(null, rombo.toString());

        rombo.setLado(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de un lado: ")));
        rombo.setDiagonalMayor(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la diagonal mayor: ")));
        rombo.setDiagonalMenor(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la diagonal mayor: ")));

        JOptionPane.showMessageDialog(null, rombo.toString());
    }

}
