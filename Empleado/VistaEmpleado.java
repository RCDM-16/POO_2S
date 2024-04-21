package Empleado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaEmpleado {
    private JPanel pPrincipal;
    private JTextField tfTitulo;
    private JTextField tfNombre;
    private JButton bRegistrar;
    private JTextField tfSegundoNombre;
    private JTextField tfApellidoP;
    private JTextField tfApellidoM;
    private JTextField tfCalle;
    private JTextField tfNumeroInt;
    private JTextField tfColonia;
    private JTextField tfMunicipio;
    private JTextField tfCP;
    private JTextField tfNumeroExt;
    private JTextField tfCiudad;
    private JTextField tfPais;
    private JButton bCalendario;
    private JLabel lAnio;
    private JLabel lMes;
    private JLabel lDia;

    public VistaEmpleado() {
        bRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Nombre2 nombre2 = new Nombre2();

                nombre2.setTitulo(tfTitulo.getText());
                nombre2.setPrimerNombre(tfNombre.getText());
                nombre2.setSegundoNombre(tfSegundoNombre.getText());
                nombre2.setApellidoPaterno(tfApellidoP.getText());
                nombre2.setApellidoMaterno(tfApellidoM.getText());

                Direccion direccion = new Direccion();

                direccion.setCalle(tfCalle.getText());
                direccion.setNoInterior(tfNumeroInt.getText());
                direccion.setColonia(tfColonia.getText());
                direccion.setMunicipio(tfMunicipio.getText());
                direccion.setCodigoPostal(tfCP.getText());
                direccion.setNoExterior(Float.parseFloat(tfNumeroExt.getText()));
                direccion.setCiudad(tfCiudad.getText());
                direccion.setPais(tfPais.getText());

                Fecha fecha = new Fecha();
                fecha.setAnio(Short.parseShort(lAnio.getText()));
                fecha.setMes(Byte.parseByte(lMes.getText()));
                fecha.setDia(Byte.parseByte(lDia.getText()));

                Empleado empleado = new Empleado();
                empleado.setNombre(nombre2);
                empleado.setDireccion(direccion);
                empleado.setFecha(fecha);

                JOptionPane.showMessageDialog(null, empleado.toString());


            }
        });

        bCalendario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalendarioDialog calendarioDialog = new CalendarioDialog();
                calendarioDialog.pack();
                calendarioDialog.setLocationRelativeTo(null);
                calendarioDialog.setVisible(true);

                Fecha fecha = calendarioDialog.getFecha();
                    lAnio.setText(""+fecha.getAnio());
                    lMes.setText(""+fecha.getMes());
                    lDia.setText(""+fecha.getDia());

            }
        });



    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VistaEmpleado");
        frame.setContentPane(new VistaEmpleado().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

