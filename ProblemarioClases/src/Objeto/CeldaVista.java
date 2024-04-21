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
    private JFormattedTextField ftfValorMonetarioCelda;
    private JFormattedTextField ftfMantenimiento;
    private JTextField tfIdCelda;
    private JComboBox cbTipoCelda;
    private JComboBox cbTipoPresos;
    private JRadioButton rbVacioTrue;
    private JRadioButton rbVacioFalse;
    private JCheckBox chbServicio;
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
        ButtonGroup grupoRadio = new ButtonGroup();
        grupoRadio.add(rbVacioTrue);
        grupoRadio.add(rbVacioFalse);
        rbVacioTrue.setSelected(true);

        nm1.setMaximum(10);
        nm1.setMinimum(1);
        nm1.setValue(1);
        spNoRetretes.setModel(nm1);
        nm2.setMaximum(10);
        nm2.setMinimum(1);
        nm2.setValue(1);
        spNumeroLiteras.setModel(nm2);


        ftfValorMonetarioCelda.setFormatterFactory(formato);
        ftfMantenimiento.setFormatterFactory(formato);

        btnRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Celda celda = new Celda();

                celda.setIdCelda(tfIdCelda.getText());
                celda.setArea(Objects.requireNonNull(cbArea.getSelectedItem()).toString());
                celda.setNoRetretes(Byte.parseByte(spNoRetretes.getValue().toString()));
                celda.setNoLiteras(Byte.parseByte(spNumeroLiteras.getValue().toString()));
                celda.setValorMonetarioCelda(Float.parseFloat(ftfValorMonetarioCelda.getText()));
                celda.setMantenimiento(Float.parseFloat(ftfMantenimiento.getText()));
                celda.setTipoCelda(Objects.requireNonNull(cbTipoCelda.getSelectedItem()).toString().charAt(0));
                celda.setTipoPresos(Objects.requireNonNull(cbTipoPresos.getSelectedItem()).toString().charAt(0));

                if (rbVacioTrue.isSelected()) {
                    celda.setVacia(true);
                } else if (rbVacioFalse.isSelected()) {
                    celda.setVacia(false);

                }

                if (chbServicio.isSelected()) {
                    celda.setEnServicio(true);
                } else {
                    celda.setEnServicio(false);
                }

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
