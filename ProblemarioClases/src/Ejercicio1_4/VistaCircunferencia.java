package Ejercicio1_4;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class VistaCircunferencia {
    private JPanel pPrincipal;
    private JButton calcularButton;
    private JLabel jlResuladoArea;
    private JFormattedTextField ftfRadio;
    private JLabel jlResuladoPerimetro;


    public static void main(String[] args) {
        JFrame frame = new JFrame("VistaCircunferencia");
        frame.setContentPane(new VistaCircunferencia().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public VistaCircunferencia() {
        NumberFormatter formatoNumero = new NumberFormatter();
        DefaultFormatterFactory formato = new DefaultFormatterFactory(formatoNumero);

        ftfRadio.setFormatterFactory(formato);


        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Circunferencia circunferencia = null;
                try {
                    jlResuladoArea.setText("");
                    jlResuladoPerimetro.setText("");

                    circunferencia = new Circunferencia();
                    circunferencia.setRadio(Float.parseFloat(ftfRadio.getText().replace(",", "")));
                    jlResuladoArea.setText(String.format("%.2f", circunferencia.calculoArea()));
                    jlResuladoPerimetro.setText(String.format("%.2f", circunferencia.calculoPerimetro()));
                } catch (NumberFormatException nfe) {
                    ftfRadio.setForeground(Color.red);
                    ftfRadio.setText("Error: El valor del radio debe de ser numerico");
                } catch (CircunferenciaExcepcion ce) {
                    ftfRadio.setForeground(Color.red);
                    ftfRadio.setText(ce.toString());
                }


            }
        });

        ftfRadio.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                ftfRadio.setForeground(Color.black);
                ftfRadio.setText("");
            }
        });
    }
}
