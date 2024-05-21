package Objeto;

import javax.swing.*;
import java.io.*;

public class MainMenu {
    public static void main(String[] args) {
        Celda[] arreglo = new Celda[20];
        Celda celda;

        int opc;
        byte contador = 0;

        //primer paso
        try {
            ObjectInputStream leer = new ObjectInputStream(new
                    FileInputStream("Celda.dat"));
            while ((celda = (Celda) leer.readObject()) != null && contador != arreglo.length) {
                arreglo[contador] = celda;
                contador++;
            }
            leer.close();
        } catch (Exception e) {

        }

        //segundo paso
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu:\nTeclee el numero para seleccionar:\n1- Agregar\n2- Consulta General\n0- Salir"));
            switch (opc) {
                case 1:
                    arreglo[contador] = new Celda();

                    arreglo[contador].setIdCelda(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la celda")));
                    arreglo[contador].setArea(JOptionPane.showInputDialog("Ingrese el valor del area: "));
                    arreglo[contador].setNoRetretes(Byte.parseByte(JOptionPane.showInputDialog("Ingrese el No. de retretes dentro de la celda: ")));
                    arreglo[contador].setNoLiteras(Byte.parseByte(JOptionPane.showInputDialog("Ingrese el numero de literas que hay dentro de la celda: ")));
                    arreglo[contador].setTipoCelda(JOptionPane.showInputDialog("Tipo de celda: ").charAt(0));

                    contador++;
                    break;
                case 2:
                    for (int i = 0; i < contador; i++) {
                        JOptionPane.showMessageDialog(null, arreglo[i].toString());
                    }
                    break;
            }

            System.out.println(opc);
        } while (opc == 1 || opc == 2);

        //tercer paso
        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new
                    FileOutputStream("Celda.dat"));

            for (int i = 0; i < contador; i++) {
                escribir.writeObject(arreglo[i]);
            }

            escribir.close();

        } catch (Exception e) {
        }

    }
}
