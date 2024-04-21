package Ejercicio1;

import javax.swing.*;

public class
Main {
    public static void main(String[] args) {
        float precio;
        Iva iva = new Iva();

        precio = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio del producto: "));

        JOptionPane.showMessageDialog(null,"==== Desglose ====" +
                "\nPrecio del producto: " + precio +
                "\nIVA: " + iva.ivaPorcentaje +
                "\nTotal de IVA: " + iva.totalIva(precio) + "%" +
                "\nPrecio neto: " + iva.precioNeto(iva.totalIva(precio), precio));
    }
}
