package Ejercicio1_4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Circunferencia circunferencia = new Circunferencia();

        JOptionPane.showMessageDialog(null, circunferencia.toString());

        circunferencia.setRadio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del radio: ")));

        JOptionPane.showMessageDialog(null, circunferencia.toString());

    }
}
