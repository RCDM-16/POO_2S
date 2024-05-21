import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class VistaDispositivos {
    private JPanel pPrincipal;
    private JComboBox cbMarca;
    private JSpinner sDescuento;
    private JFormattedTextField ftfprecio;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JComboBox cbCompania;
    private JComboBox cbTipo;
    private JButton bRegistrarTelefono;
    private JButton bResgitrarInteligente;
    private JButton bRegistrarReloj;
    private JButton bRegistrarTablet;
    private JButton bRegistrarLaptop;
    private JSpinner sRam;
    private JSpinner sUsb;
    private JLabel s;
    private JSpinner sPulgadas;
    private JTextField tfHz;
    private JSpinner sDuracion;
    private JSpinner sCarga;
    private JComboBox cbCorrea;
    private JRadioButton rbAnaligo;
    private JRadioButton digítalRadioButton;
    private JFormattedTextField ftfHz;


    public VistaDispositivos() {

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);

        ftfprecio.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(decimalFormat)));

        SpinnerNumberModel snmDescuento = new SpinnerNumberModel(0,0,100,1);
        sDescuento.setModel(snmDescuento);

        SpinnerNumberModel snmSlotsRam = new SpinnerNumberModel(1,1,6,1);
        sRam.setModel(snmSlotsRam);
        SpinnerNumberModel snmSlotsUSB = new SpinnerNumberModel(1,1,10,1);
        sUsb.setModel(snmSlotsUSB);

        SpinnerNumberModel snmPulgadas = new SpinnerNumberModel(7,7,12,1);
        sPulgadas.setModel(snmPulgadas);

        SpinnerNumberModel snmDuracion = new SpinnerNumberModel(8,8,80,1);
        sDuracion.setModel(snmDuracion);
        SpinnerNumberModel snmTiempoCarga = new SpinnerNumberModel(1,1,60,1);
        sCarga.setModel(snmTiempoCarga);

        rbAnaligo.setSelected(true);

        bRegistrarLaptop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Laptop laptop = new Laptop();

                laptop.setMarca(cbMarca.getSelectedItem().toString());
                laptop.setPrecio(Float.parseFloat(ftfprecio.getValue().toString()));
                laptop.setDescuento(Byte.parseByte(sDescuento.getValue().toString()));

                laptop.setNoEntradaUsb(Byte.parseByte(sUsb.getValue().toString()));
                laptop.setSlots(Byte.parseByte(sRam.getValue().toString()));

                JOptionPane.showMessageDialog(null,laptop.toString());

            }
        });

        bRegistrarTelefono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Telefono telefono = new Telefono();

                telefono.setMarca(cbMarca.getSelectedItem().toString());
                telefono.setPrecio(Float.parseFloat(ftfprecio.getValue().toString()));
                telefono.setDescuento(Byte.parseByte(sDescuento.getValue().toString()));

                telefono.setCompania(cbCompania.getSelectedItem().toString());
                telefono.setTipoEntrada(cbTipo.getSelectedItem().toString());

                JOptionPane.showMessageDialog(null,telefono.toString());
            }
        });

        bRegistrarTablet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Tablet tablet = new Tablet();

                tablet.setMarca(cbMarca.getSelectedItem().toString());
                tablet.setPrecio(Float.parseFloat(ftfprecio.getValue().toString()));
                tablet.setDescuento(Byte.parseByte(sDescuento.getValue().toString()));

                tablet.setPulgadas(Byte.parseByte(sPulgadas.getValue().toString()));
                tablet.setGhz(Float.parseFloat(tfHz.getText()));

                JOptionPane.showMessageDialog(null,tablet.toString());

            }
        });


        bRegistrarReloj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Reloj reloj = new Reloj();

                reloj.setMarca(cbMarca.getSelectedItem().toString());
                reloj.setPrecio(Float.parseFloat(ftfprecio.getValue().toString()));
                reloj.setDescuento(Byte.parseByte(sDescuento.getValue().toString()));

                reloj.setTipoCorrea(cbCorrea.getSelectedItem().toString());
                reloj.setCategoria(rbAnaligo.isSelected() ? "Analogíco":"Digital");

                JOptionPane.showMessageDialog(null, reloj.toString());
            }
        });


        bResgitrarInteligente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RelojInteligente relojInteligente = new RelojInteligente();

                relojInteligente.setMarca(cbMarca.getSelectedItem().toString());
                relojInteligente.setPrecio(Float.parseFloat(ftfprecio.getValue().toString()));
                relojInteligente.setDescuento(Byte.parseByte(sDescuento.getValue().toString()));

                relojInteligente.setTipoCorrea(cbCorrea.getSelectedItem().toString());
                relojInteligente.setCategoria(rbAnaligo.isSelected() ? "Analogíco":"Digital");

                relojInteligente.setTiempoCarga(Byte.parseByte(sCarga.getValue().toString()));
                relojInteligente.setDuracionHrs(Byte.parseByte(sDuracion.getValue().toString()));

                JOptionPane.showMessageDialog(null, relojInteligente.toString());

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("VistaDispositivos");
        frame.setContentPane(new VistaDispositivos().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
