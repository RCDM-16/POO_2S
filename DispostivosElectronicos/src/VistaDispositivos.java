import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DecimalFormat;

public class VistaDispositivos {
    private JPanel pPrincipal;
    private JComboBox cbMarca;
    private JSpinner sDescuento;
    private JFormattedTextField ftfprecio;
    private JComboBox cbCompania;
    private JComboBox cbTipo;
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
    private JComboBox cbProdcuto;
    private JPanel pLaptop;
    private JPanel pTelefono;
    private JPanel pTablet;
    private JPanel pReloj;
    private JCheckBox inteligenteCheckBox;
    private JPanel pInteligente;
    private JButton registrarButton;
    private JButton cancelarButton;
    private JLabel errorDuracion;
    private JLabel errorCarga;
    private JLabel errorSlots;
    private JLabel errorUsb;
    private JLabel errorPulgadas;
    private JLabel lErrorHz;
    private JLabel errorDescuento;
    private JLabel lErrorTipoProducto;
    private JFormattedTextField ftfHz;


    public VistaDispositivos() {

        pLaptop.setVisible(false);
        pTelefono.setVisible(false);
        pReloj.setVisible(false);
        pTablet.setVisible(false);
        pInteligente.setVisible(false); //Panel de reloj inteligente


        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);

        ftfprecio.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(decimalFormat)));

        SpinnerNumberModel snmDescuento = new SpinnerNumberModel(0, 0, 100, 1);
        sDescuento.setModel(snmDescuento);

        SpinnerNumberModel snmSlotsRam = new SpinnerNumberModel(1, 1, 6, 1);
        sRam.setModel(snmSlotsRam);
        SpinnerNumberModel snmSlotsUSB = new SpinnerNumberModel(1, 1, 10, 1);
        sUsb.setModel(snmSlotsUSB);

        SpinnerNumberModel snmPulgadas = new SpinnerNumberModel(7, 7, 12, 1);
        sPulgadas.setModel(snmPulgadas);

        SpinnerNumberModel snmDuracion = new SpinnerNumberModel(8, 8, 80, 1);
        sDuracion.setModel(snmDuracion);
        SpinnerNumberModel snmTiempoCarga = new SpinnerNumberModel(1, 1, 60, 1);
        sCarga.setModel(snmTiempoCarga);

        rbAnaligo.setSelected(true);


        cbProdcuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (cbProdcuto.getSelectedItem().toString()) {
                    case "Laptop":

                        pLaptop.setVisible(true);
                        pReloj.setVisible(false);
                        pTablet.setVisible(false);
                        pTelefono.setVisible(false);

                        break;

                    case "Tablet":

                        pLaptop.setVisible(false);
                        pReloj.setVisible(false);
                        pTablet.setVisible(true);
                        pTelefono.setVisible(false);


                        break;

                    case "Telefono":

                        pLaptop.setVisible(false);
                        pReloj.setVisible(false);
                        pTablet.setVisible(false);
                        pTelefono.setVisible(true);


                        break;


                    case "Reloj":

                        pLaptop.setVisible(false);
                        pReloj.setVisible(true);
                        pTablet.setVisible(false);
                        pTelefono.setVisible(false);


                        break;

                }
            }
        });

        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean bandera;
                switch (cbProdcuto.getSelectedItem().toString()) {

                    case "Laptop":

                        Laptop laptop = new Laptop();
                        errorSlots.setText("");

                        laptop.setMarca(cbMarca.getSelectedItem().toString());

                        try {
                            laptop.setPrecio(Float.parseFloat(ftfprecio.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException cfe) {
                            ftfprecio.setText("Ingrese un valor númerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            ftfprecio.setText(de.toString());
                            bandera = false;
                        } catch (NullPointerException ne) {
                            ftfprecio.setText("Error: ingrese un valor");
                            bandera = false;
                        }

                        try {
                            laptop.setDescuento(Byte.parseByte(sDescuento.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException cfe) {
                            ftfprecio.setText("Ingrese un valor númerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            errorDescuento.setText(de.toString());
                            bandera = false;
                        }

                        try {
                            laptop.setNoEntradaUsb(Byte.parseByte(sUsb.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException cfe) {
                            ftfprecio.setText("Ingrese un valor númerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            errorUsb.setText(de.toString());
                            bandera = false;
                        }


                        try {
                            laptop.setSlots(Byte.parseByte(sRam.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException cfe) {
                            errorSlots.setText("Ingrese un valor númerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            errorSlots.setText(de.toString());
                            bandera = false;
                        }

                        if (bandera) {
                            JOptionPane.showMessageDialog(null, laptop.toString());
                            JOptionPane.showMessageDialog(null, "Precio Total: " + laptop.precioTotal());
                            JOptionPane.showMessageDialog(null, "Puntos ganados: " + laptop.puntosTienda());
                        }

                        break;

                    case "Tablet":

                        Tablet tablet = new Tablet();

                        tablet.setMarca(cbMarca.getSelectedItem().toString());

                        try {
                            tablet.setPrecio(Float.parseFloat(ftfprecio.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException cfe) {
                            ftfprecio.setText("Ingrese un valor númerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            ftfprecio.setText(de.toString());
                            bandera = false;
                        } catch (NullPointerException ne) {
                            ftfprecio.setText("Error: ingrese un valor");
                            bandera = false;
                        }


                        try {
                            tablet.setDescuento(Byte.parseByte(sDescuento.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException cfe) {
                            ftfprecio.setText("Ingrese un valor númerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            errorDescuento.setText(de.toString());
                            bandera = false;
                        }


                        try {
                            tablet.setGhz(Float.parseFloat(tfHz.getText().replace(",", "")));
                            bandera = true;
                        } catch (NumberFormatException nf) {
                            lErrorHz.setText("EL valor debe de ser numerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            lErrorHz.setText(de.toString());
                            bandera = false;
                        }

                        try {
                            tablet.setPulgadas(Byte.parseByte(sPulgadas.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException nf) {
                            errorPulgadas.setText("EL valor debe de ser numerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            errorPulgadas.setText(de.toString());
                            bandera = false;
                        } catch (ClassCastException cc) {
                            errorPulgadas.setText("El valor es muy grande");
                            bandera = false;
                        }

                        if (bandera) {
                            JOptionPane.showMessageDialog(null, tablet.toString());
                            JOptionPane.showMessageDialog(null, "Precio Total: " + tablet.precioTotal());
                            JOptionPane.showMessageDialog(null, "Puntos ganados: " + tablet.puntosTienda());
                        }

                        break;

                    case "Telefono":

                        Telefono telefono = new Telefono();

                        telefono.setMarca(cbMarca.getSelectedItem().toString());

                        try {
                            telefono.setPrecio(Float.parseFloat(ftfprecio.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException cfe) {
                            ftfprecio.setText("Ingrese un valor númerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            ftfprecio.setText(de.toString());
                            bandera = false;
                        } catch (NullPointerException ne) {
                            ftfprecio.setText("Error: ingrese un valor");
                            bandera = false;
                        }


                        try {
                            telefono.setDescuento(Byte.parseByte(sDescuento.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException cfe) {
                            ftfprecio.setText("Ingrese un valor númerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            errorDescuento.setText(de.toString());
                            bandera = false;
                        }


                        telefono.setCompania(cbCompania.getSelectedItem().toString());
                        telefono.setTipoEntrada(cbTipo.getSelectedItem().toString());

                        if (bandera) {
                            JOptionPane.showMessageDialog(null, telefono.toString());
                            JOptionPane.showMessageDialog(null, "Precio Total: " + telefono.precioTotal());
                            JOptionPane.showMessageDialog(null, "Puntos ganados: " + telefono.puntosTienda());
                        }


                        break;

                    case "Reloj":

                        Reloj reloj = new Reloj();

                        reloj.setMarca(cbMarca.getSelectedItem().toString());
                        try {
                            reloj.setPrecio(Float.parseFloat(ftfprecio.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException cfe) {
                            ftfprecio.setText("Ingrese un valor númerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            ftfprecio.setText(de.toString());
                            bandera = false;
                        } catch (NullPointerException ne) {
                            ftfprecio.setText("Error: ingrese un valor");
                            bandera = false;
                        }


                        try {
                            reloj.setDescuento(Byte.parseByte(sDescuento.getValue().toString()));
                            bandera = true;
                        } catch (NumberFormatException cfe) {
                            ftfprecio.setText("Ingrese un valor númerico");
                            bandera = false;
                        } catch (DispositivosExeption de) {
                            errorDescuento.setText(de.toString());
                            bandera = false;
                        }

                        reloj.setTipoCorrea(cbCorrea.getSelectedItem().toString());
                        reloj.setCategoria(String.valueOf(rbAnaligo.isSelected() ? 'A' : 'D'));

                        if (bandera) {
                            JOptionPane.showMessageDialog(null, reloj.toString());
                            JOptionPane.showMessageDialog(null, "Precio Total: " + reloj.precioTotal());
                            JOptionPane.showMessageDialog(null, "Puntos ganados: " + reloj.puntosTienda());
                        }


                        break;
                    default:
                        lErrorTipoProducto.setText("Seleccione un tio de producto");
                        break;
                }
            }
        });
        inteligenteCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (inteligenteCheckBox.isSelected()) {
                    pInteligente.setVisible(true);
                } else {
                    pInteligente.setVisible(false);
                }
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cbProdcuto.setSelectedIndex(0);
                pLaptop.setVisible(false);
                pReloj.setVisible(false);
                pTablet.setVisible(false);
                pTelefono.setVisible(false);
                pInteligente.setVisible(false);


            }
        });
        ftfprecio.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                ftfprecio.setText("");
            }
        });
        sDescuento.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                errorDescuento.setText("");
            }
        });
        cbProdcuto.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                lErrorTipoProducto.setText("");
            }
        });
        sDuracion.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                errorDuracion.setText("");
            }
        });
        sCarga.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                errorCarga.setText("");
            }
        });
        sRam.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                errorSlots.setText("");
            }
        });
        sUsb.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                errorUsb.setText("");
            }
        });
        sPulgadas.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                errorPulgadas.setText("");
            }
        });
        tfHz.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                lErrorHz.setText("");
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("VistaDispositivos");
        frame.setContentPane(new VistaDispositivos().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}