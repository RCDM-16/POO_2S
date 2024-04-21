package Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        float pesos;
        Conversor conversor = new Conversor();

        pesos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de pesos a convertir: "));

        JOptionPane.showMessageDialog(null, "Precio del dolar actual: " + conversor.dolarPrecio +
                "\nCantidad de pesos: " + pesos +
                "\nEquivalencia: " + conversor.dolarPeso(pesos));

    }
}
