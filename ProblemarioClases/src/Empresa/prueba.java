package Empresa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prueba {
    private JButton modalButton;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("prueba");
        frame.setContentPane(new prueba().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public prueba() {
        modalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ModalCalendario calendario = new ModalCalendario();
                calendario.pack();
                calendario.setVisible(true);

            }
        });
    }
}
