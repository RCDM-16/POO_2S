import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.awt.event.*;
import java.text.DecimalFormat;

public class EscuelaForm {
    private JPanel pPrincipal;
    private JTextField tfNombre;
    private JTextField tfNumeroControl;
    private JPanel pDatosBasicos;
    private JPanel pDoctorado;
    private JPanel pLicenciatura;
    private JPanel pMaestria;
    private JComboBox cbTipoEstudiante;
    private JFormattedTextField ftfTituloInvestigacion;
    private JSpinner spPorcentajeBeca;
    private JComboBox cbCarrera;
    private JSpinner spSemestre;
    private JSpinner spCreditos;
    private JButton btnCancelar;
    private JButton btnRegistrar;
    private JComboBox cbModalidad;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EscuelaForm");
        frame.setContentPane(new EscuelaForm().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public EscuelaForm() {

        pLicenciatura.setVisible(false);
        pDoctorado.setVisible(false);
        pMaestria.setVisible(false);

        SpinnerNumberModel modelSpPorcentaje = new SpinnerNumberModel(0, 0, 100, 5);
        spPorcentajeBeca.setModel(modelSpPorcentaje);

     /*   DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);

        ftfTituloInvestigacion.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(decimalFormat)));*/

        cbTipoEstudiante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cbTipoEstudiante.setEnabled(false);

                switch (cbTipoEstudiante.getSelectedIndex()) {
                    case 1:
                        pDoctorado.setVisible(true);
                        break;
                    case 2:
                        pLicenciatura.setVisible(true);
                        break;
                    case 3:
                        pMaestria.setVisible(true);
                        break;
                    default:
                        cbTipoEstudiante.setEnabled(true);
                        break;

                }
                tfNumeroControl.setEnabled(false);
                tfNombre.setEnabled(false);
            }
        });

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Alumno alumno;

                switch (cbTipoEstudiante.getSelectedIndex()) {
                    case 1:
                        alumno = new Doctorado();

                        alumno.setNombre(tfNombre.getText());
                        alumno.setNoControl(tfNumeroControl.getText());
                        ((Doctorado) alumno).setTituloInvestigacion(ftfTituloInvestigacion.getText());
                        ((Doctorado) alumno).setPorcentajeBeca(Byte.parseByte(spPorcentajeBeca.getValue().toString()));
                        estado(alumno);
                        break;

                    case 2:
                        alumno = new Licenciatura();

                        if (cbCarrera.getSelectedIndex() != 0) {
                            alumno.setNombre(tfNombre.getText());
                            alumno.setNoControl(tfNumeroControl.getText());
                            ((Licenciatura) alumno).setCarrera(cbCarrera.getSelectedItem().toString());
                            ((Licenciatura) alumno).setSemestre(Byte.parseByte(spSemestre.getValue().toString()));
                            estado(alumno);
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor, seleccione su carrera");
                        }
                        break;

                    case 3:
                        alumno = new Maestria();

                        if (cbModalidad.getSelectedIndex() != 0) {
                            alumno.setNombre(tfNombre.getText());
                            alumno.setNoControl(tfNumeroControl.getText());
                            ((Maestria) alumno).setModalidad(cbModalidad.getSelectedItem().toString());
                            ((Maestria) alumno).setCreditos(Short.parseShort(spCreditos.getValue().toString()));
                            estado(alumno);
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor, seleccione su Modalidad");
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "No valido");
                        break;
                }

                tfNombre.setText("");
                tfNumeroControl.setText("");

                switch (cbTipoEstudiante.getSelectedIndex()) {
                    case 1:
                        pDoctorado.setVisible(false);
                        ftfTituloInvestigacion.setText("");
                        spPorcentajeBeca.setValue(0);

                        break;

                    case 2:
                        pLicenciatura.setVisible(false);
                        cbCarrera.setSelectedIndex(0);
                        spSemestre.setValue(1);

                        break;

                    case 3:
                        pMaestria.setVisible(false);
                        cbModalidad.setSelectedIndex(0);
                        spCreditos.setValue(0);

                        break;
                }
                cbTipoEstudiante.setSelectedIndex(0);
                cbTipoEstudiante.setEnabled(true);
                tfNombre.setEnabled(true);
                tfNumeroControl.setEnabled(true);
            }

        });

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tfNombre.setText("");
                tfNumeroControl.setText("");

                switch (cbTipoEstudiante.getSelectedIndex()) {
                    case 1:
                        pDoctorado.setVisible(false);
                        ftfTituloInvestigacion.setText("");
                        spPorcentajeBeca.setValue(0);

                        break;

                    case 2:
                        pLicenciatura.setVisible(false);
                        cbCarrera.setSelectedIndex(0);
                        spSemestre.setValue(1);

                        break;

                    case 3:
                        pMaestria.setVisible(false);
                        cbModalidad.setSelectedIndex(0);
                        spCreditos.setValue(0);

                        break;
                }
                cbTipoEstudiante.setSelectedIndex(0);
                cbTipoEstudiante.setEnabled(true);
                tfNombre.setEnabled(true);
                tfNumeroControl.setEnabled(true);
            }
        });

    }

    public static void estado(Alumno alumno) {
        JOptionPane.showMessageDialog(null, alumno.toString());
        JOptionPane.showMessageDialog(null, alumno.Inscripcion());
    }

}

