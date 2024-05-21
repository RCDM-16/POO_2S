package Objeto;

import javax.swing.JOptionPane;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Celda celda;
        int opc;
        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new
                    FileOutputStream("Celda.dat"));
            do {
                celda = new Celda();
                celda.setIdCelda(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la celda")));
                celda.setArea(JOptionPane.showInputDialog("Ingrese el valor del area: "));
                celda.setNoRetretes(Byte.parseByte(JOptionPane.showInputDialog("Ingrese el No. de retretes dentro de la celda: ")));
                celda.setNoLiteras(Byte.parseByte(JOptionPane.showInputDialog("Ingrese el numero de literas que hay dentro de la celda: ")));
                celda.setTipoCelda(JOptionPane.showInputDialog("Tipo de celda: ").charAt(0));

                escribir.writeObject(celda);

                opc = JOptionPane.showConfirmDialog(null, "Se agregara otro registro?", "preguntilla",
                        JOptionPane.YES_NO_OPTION);

            } while (opc == 0);
            escribir.close();


            ObjectInputStream leer = new ObjectInputStream(new
                    FileInputStream("Celda.dat"));
            while ((celda = (Celda) leer.readObject()) != null) {
                JOptionPane.showMessageDialog(null, celda.toString());
            }
            leer.close();
        } catch (Exception e) {
        }
    }
}
