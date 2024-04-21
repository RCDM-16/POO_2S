package Empleado;

import javax.swing.*;
import java.awt.event.*;
import java.time.Year;
import java.util.Map;
import java.util.Scanner;

public class CalendarioDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox cbMes;
    private JSpinner sAnio;
    private JSpinner sDia;

    Fecha fecha = new Fecha();

    public CalendarioDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        SpinnerNumberModel spAnio = new SpinnerNumberModel(Integer.parseInt(Year.now().toString()), 1900, null, 1);
        sAnio.setModel(spAnio);


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        cbMes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                sAnio.setEnabled(false);
                cbMes.setEnabled(false);
                byte max = 31;

                switch (Byte.parseByte(cbMes.getSelectedItem().toString())) {
                    case 4, 6, 9, 11:
                        max = 30;
                        break;

                    case 2:
                        max = (byte) ((int) sAnio.getValue() % 4 == 0 ? 29 : 28);
                        break;

                }

                SpinnerNumberModel spDia = new SpinnerNumberModel(1, 1, max, 1);
                sDia.setModel(spDia);
            }

        });


    }

    private void onOK() {
        int anio = (int) sAnio.getValue();
        int mes = Byte.parseByte(cbMes.getSelectedItem().toString());
        int dia = (int) sDia.getValue();
        fecha = new Fecha((short) anio, (byte) mes, (byte) dia);
        System.out.println(mes);
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public Fecha getFecha() {
        return fecha;
    }

}

