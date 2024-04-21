package Ejercicio1_6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Terreno terreno = new Terreno();

        JOptionPane.showMessageDialog(null, terreno.toString());

        terreno.setRadioTerreno(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del radio: ")));

        JOptionPane.showMessageDialog(null, terreno.toString());

    }
}
