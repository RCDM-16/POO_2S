package PacienteHerencia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class PacienteVista {
    private JPanel jPrincipal;
    private JComboBox cbPacientes;
    private JPanel jPacienteInterno;
    private JPanel jPacienteExterno;
    private JPanel jPacienteInterconsulta;
    private JPanel jPacienteTrasladado;
    private JTextField tfCurp;
    private JTextField tfNombre;
    private JTextField tfPadecimiento;
    private JTextField tfTratamiento;
    private JTextField textField1;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JTextField textField2;
    private JSpinner spinner3;w
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton registrarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PacienteVista");
        frame.setContentPane(new PacienteVista().jPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,600);
        frame.setVisible(true);
    }

    public PacienteVista() {
        jPacienteInterno.setVisible(true);
        jPacienteExterno.setVisible(false);
        jPacienteInterconsulta.setVisible(false);
        jPacienteTrasladado.setVisible(false);
        cbPacientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String tipoPaciente = Objects.requireNonNull(cbPacientes.getSelectedItem()).toString();

                if (tipoPaciente.equals("Interno")){
                    jPacienteInterno.setVisible(true);
                    jPacienteExterno.setVisible(false);
                    jPacienteInterconsulta.setVisible(false);
                    jPacienteTrasladado.setVisible(false);

                    System.out.println("si es interno");
                } else if (tipoPaciente.equals("Externo")) {
                    jPacienteInterno.setVisible(false);
                    jPacienteExterno.setVisible(true);
                    jPacienteInterconsulta.setVisible(false);
                    jPacienteTrasladado.setVisible(false);

                } else if (tipoPaciente.equals("Interconsulta")) {
                    jPacienteInterno.setVisible(false);
                    jPacienteExterno.setVisible(false);
                    jPacienteInterconsulta.setVisible(true);
                    jPacienteTrasladado.setVisible(false);

                } else if (tipoPaciente.equals("Trasladado")) {
                    jPacienteInterno.setVisible(false);
                    jPacienteExterno.setVisible(false);
                    jPacienteInterconsulta.setVisible(false);
                    jPacienteTrasladado.setVisible(true);
                }


            }
        });
    }
}
