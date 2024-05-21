package Objeto;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;


public class CeldaVista {
    private JPanel pPrincipal;
    private JComboBox cbArea;
    private JSpinner spNoRetretes;
    private JSpinner spNumeroLiteras;
    private JSpinner tfIdCelda;
    private JComboBox cbTipoCelda;
    private JButton btnRegistro;
    private JLabel tfExit;


    public static void main(String[] args) {
        JFrame frame = new JFrame("CeldaVista");
        frame.setContentPane(new CeldaVista().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    SpinnerNumberModel nm1 = new SpinnerNumberModel();
    SpinnerNumberModel nm2 = new SpinnerNumberModel();
    NumberFormatter formatoNumero = new NumberFormatter();
    DefaultFormatterFactory formato = new DefaultFormatterFactory(formatoNumero);


    public CeldaVista() {
        nm1.setMaximum(10);
        nm1.setMinimum(1);
        nm1.setValue(1);
        spNoRetretes.setModel(nm1);
        nm2.setMaximum(10);
        nm2.setMinimum(1);
        nm2.setValue(1);
        spNumeroLiteras.setModel(nm2);

        btnRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Celda celda = new Celda();

                celda.setIdCelda(Integer.parseInt(tfIdCelda.getValue().toString()));
                celda.setArea(Objects.requireNonNull(cbArea.getSelectedItem()).toString());
                celda.setNoRetretes(Byte.parseByte(spNoRetretes.getValue().toString()));
                celda.setNoLiteras(Byte.parseByte(spNumeroLiteras.getValue().toString()));
                celda.setTipoCelda(Objects.requireNonNull(cbTipoCelda.getSelectedItem()).toString().charAt(0));

                JOptionPane.showMessageDialog(null, celda.toString());


            }
        });
        tfExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            public void mouseEntered(MouseEvent e) {
                tfExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });

    }

}
