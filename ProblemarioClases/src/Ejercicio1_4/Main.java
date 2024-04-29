package Ejercicio1_4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Circunferencia circunferencia = new Circunferencia();

        JOptionPane.showMessageDialog(null, circunferencia.toString());

        boolean bandera = true;
        do {
            try {
                circunferencia.setRadio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese la medida del radio: ")));
                bandera = true;
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "El valor porporcionado a la medida del radio debe de ser numerico");
                bandera = false;
            }
        }while(!bandera);


        JOptionPane.showMessageDialog(null, circunferencia.toString());

    }
}
