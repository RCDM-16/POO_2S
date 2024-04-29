package Ejercicio1_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaSuma {
    private JPanel panel1;
    private JTextField tfNumero1;
    private JTextField tfNumero2;
    private JButton btnSuma;
    private JTextField tfResultado;


    public static void main(String[] args) {
        JFrame frame = new JFrame("VistaSuma");
        frame.setContentPane(new VistaSuma().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        //frame.setSize(500,500);
        frame.setVisible(true);
    }

    public VistaSuma() {
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Suma suma = new Suma();
                boolean bandera = true;
                do {
                    try {
                        suma.setNumero1(Short.parseShort(tfNumero1.getText()));
                        bandera = true;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "El valor denecita un valor numerico");
                        bandera = false;
                    }

                } while (!bandera);

                do {
                    try {
                        suma.setNumero2(Short.parseShort(tfNumero2.getText()));
                        bandera = true;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "El valor denecita un valor numerico");
                        bandera = false;
                    }

                } while (!bandera);

                tfResultado.setText("" + suma.sumaNumeros());

            }
        });

    }
}
