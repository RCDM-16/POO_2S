package Ejercicio1_5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Terreno terreno = new Terreno();

        JOptionPane.showMessageDialog(null, terreno.toString());

        terreno.setAlturaTerrenoIzq(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura izquierda del terreno: ")));
        terreno.setAlturaTerrenoDere(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura derecha del terreno: ")));
        terreno.setBaseTerreno(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida de la base del terreno: ")));

        JOptionPane.showMessageDialog(null, terreno.toString());

    }
}
