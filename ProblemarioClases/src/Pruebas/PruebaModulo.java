package Pruebas;

import javax.swing.*;

public class PruebaModulo {
    public static void main(String[]Args){
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor: "));
        JOptionPane.showMessageDialog(null, ""+ valor%2);

    }
}
