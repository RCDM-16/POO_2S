import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpresaVista {
    private JPanel jPrincipal;
    private JTabbedPane tabbedPane1;
    private JPanel jAsalariado;
    private JTextField tfId1;
    private JTextField tfNombre1;
    private JSpinner spSalario;
    private JTextField tfId2;
    private JTextField tfId3;
    private JTextField tfId4;
    private JTextField tfNombre2;
    private JTextField tfNombre3;
    private JTextField tfNombre4;
    private JButton btnRegistrar1;
    private JSpinner spHorasTrabajadas;
    private JSpinner spPagoPorHora;
    private JButton btnRegistar2;
    private JSpinner spPorcentajeComision;
    private JSpinner spVenta;

    private JButton btnRegistrar3;
    private JSpinner spPorcentajeComision2;
    private JSpinner spVenta2;
    private JSpinner spBase;
    private JButton btnRegistrar4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EmpresaVista");
        frame.setContentPane(new EmpresaVista().jPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public EmpresaVista() {
        SpinnerNumberModel modelSpSalario = new SpinnerNumberModel(1, 0, null, 1);
        spSalario.setModel(modelSpSalario);

        SpinnerNumberModel modelSpPorcentaje = new SpinnerNumberModel(1, 0, 100, 1);
        spPorcentajeComision.setModel(modelSpPorcentaje);
        spPorcentajeComision2.setModel(modelSpPorcentaje);

        SpinnerNumberModel modelSpVenta = new SpinnerNumberModel(1, 0, null, 1);
        spVenta.setModel(modelSpVenta);
        spVenta2.setModel(modelSpVenta);

        SpinnerNumberModel modelSpBase = new SpinnerNumberModel(1, 0, null, 1);
        spBase.setModel(modelSpBase);

        SpinnerNumberModel modelSpHorasTrabajadas = new SpinnerNumberModel(1, 0, null, 1);
        spHorasTrabajadas.setModel(modelSpHorasTrabajadas);

        SpinnerNumberModel modelSpPagoHora = new SpinnerNumberModel(1, 0, null, 1);
        spPagoPorHora.setModel(modelSpPagoHora);


        btnRegistrar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Asalariado asalariado = new Asalariado();

                asalariado.setId(tfId1.getText());
                asalariado.setNombre(tfNombre1.getText());
                asalariado.setSalario(Float.parseFloat(spSalario.getValue().toString()));
                JOptionPane.showMessageDialog(null, asalariado.toString());

            }
        });
        btnRegistar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                 PorHoras porHoras = new PorHoras();

                porHoras.setId(tfId2.getText());
                porHoras.setNombre(tfNombre2.getText());
                porHoras.setHorasTrabajadas(Byte.parseByte(spHorasTrabajadas.getValue().toString()));
                porHoras.setPagohora(Float.parseFloat(spPagoPorHora.getValue().toString()));
                JOptionPane.showMessageDialog(null, porHoras.toString());

            }
        });
        btnRegistrar3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Comision comision = new Comision();

                comision.setId(tfId3.getText());
                comision.setNombre(tfNombre3.getText());
                comision.setPorcentajeComision(Byte.parseByte(spPorcentajeComision.getValue().toString()));
                comision.setVenta(Float.parseFloat(spVenta.getValue().toString()));
                JOptionPane.showMessageDialog(null, comision.toString());

            }
        });
        btnRegistrar4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ComisionMasBase comisionMasBase = new ComisionMasBase();

                comisionMasBase.setId(tfId4.getText());
                comisionMasBase.setNombre(tfNombre4.getText());
                comisionMasBase.setPorcentajeComision(Byte.parseByte(spPorcentajeComision2.getValue().toString()));
                comisionMasBase.setVenta(Float.parseFloat(spVenta2.getValue().toString()));
                comisionMasBase.setBase(Float.parseFloat(spBase.getValue().toString()));
                JOptionPane.showMessageDialog(null, comisionMasBase.toString());

            }
        });
    }
}
