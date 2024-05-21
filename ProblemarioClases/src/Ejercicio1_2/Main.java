package Ejercicio1_2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Promedio promedio = null;
        try {
            promedio = new Promedio(1,2,3,4);
        } catch (PromedioException e) {

        }

        JOptionPane.showMessageDialog(null, promedio.toString());
        boolean bandera;

        for (byte i = 0; i < promedio.getCalificaciones().length; ++i) {

            do {
                try {
                    promedio.setCalificaciones(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación No." + (i + 1) + ": ")), i);
                    bandera = true;
                } catch (Exception e) {
                    bandera = false;
                }
            } while (!bandera);
        }

        JOptionPane.showMessageDialog(null, promedio.toString());
    }

}
