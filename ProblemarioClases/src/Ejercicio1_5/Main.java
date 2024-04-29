package Ejercicio1_5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Terreno terreno = new Terreno();

        JOptionPane.showMessageDialog(null, terreno.toString());
        boolean bandera = true;

        do {
            try {
                terreno.setAlturaTerrenoIzq(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura izquierda del terreno: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El valor para la altura izquierda del terreno debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        do {
            try {
                terreno.setAlturaTerrenoDere(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura derecha del terreno: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "EL valor para la altura derecha del terreno debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);

        do {
            try {
                terreno.setBaseTerreno(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la base del terreno: ")));
                bandera = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "EL valor para la base del terreno debe de ser numerico");
                bandera = false;
            }
        } while (!bandera);


        JOptionPane.showMessageDialog(null, terreno.toString());

    }
}
