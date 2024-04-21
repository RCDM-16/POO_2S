package Ejercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String centinela;
        Cooperacion coperacha = new Cooperacion();


        do {
            coperacha.total += Float.parseFloat(JOptionPane.showInputDialog("Cooperacion por el integrante actual: "));
            coperacha.integrantes++;
            centinela = JOptionPane.showInputDialog("Se agregara otro integrante: ").toLowerCase();
        } while (centinela.equals("si"));

        JOptionPane.showMessageDialog(null, "Integrantes: "+ coperacha.integrantes+"\nTotal Reunido: "+ coperacha.total+"\nCantidad de dinero a cada participe: "+ coperacha.reparto(coperacha.total, coperacha.integrantes));

    }
}

