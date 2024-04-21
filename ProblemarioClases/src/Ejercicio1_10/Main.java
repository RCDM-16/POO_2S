package Ejercicio1_10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        JOptionPane.showMessageDialog(null, pedido.toString());

        pedido.setMetros(Float.parseFloat(JOptionPane.showInputDialog("Ingrese los metros que ocupará: ")));

        JOptionPane.showMessageDialog(null, pedido.toString());
    }
}
