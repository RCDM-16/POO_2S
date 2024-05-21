package Ejercicio1_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

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
                try {
                    suma.setNumero1(Short.parseShort(tfNumero1.getText()));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "El valor 1 necesita ser numerico");
                }


                try {
                    suma.setNumero2(Short.parseShort(tfNumero2.getText()));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El valor 2 necesita ser numerico");
                }


                tfResultado.setText("" + suma.sumaNumeros());

            }
        });

        tfNumero1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                tfNumero1.setText("");
            }
        });
        tfNumero2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                tfNumero1.setText("");
            }
        });
    }
}
