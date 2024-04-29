package Ejercicio1_10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        JOptionPane.showMessageDialog(null, pedido.toString());

        boolean bandera = true;

        do {
            try {
                pedido.setMetros(Float.parseFloat(JOptionPane.showInputDialog("Ingrese los metros que ocupará: ")));
                bandera = true;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para la cantidad de metros de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        JOptionPane.showMessageDialog(null, pedido.toString());
    }
}
