import javax.swing.*;

public class Main {
    public static void main(String[] Args) {

        //Objetos Tangible: Celda
        Celda celda = new Celda();

        celda.noCelda = JOptionPane.showInputDialog("Número de celda: ");
        celda.tipoCelda = JOptionPane.showInputDialog("Tipo de celda: ").charAt(0);
        celda.noRetretes = Byte.parseByte(JOptionPane.showInputDialog("Número de retretes de la celda: "));
        celda.capacidad = Byte.parseByte(JOptionPane.showInputDialog("Capacidad de la celda: "));
        celda.noCamas = Byte.parseByte(JOptionPane.showInputDialog("Número de camas en la celda: "));

        JOptionPane.showMessageDialog(null, "No. Celda: " + celda.noCelda);
        JOptionPane.showMessageDialog(null, "Tipo de celda: " + celda.tipoCelda);
        JOptionPane.showMessageDialog(null, "No. de retretes: " + celda.noRetretes);
        JOptionPane.showMessageDialog(null, "Capacidad de la celda: " + celda.capacidad);
        JOptionPane.showMessageDialog(null, "No. de camas en la celda: " + celda.noCamas);

        //Objetos Intangible: Antecedente Penal
        AntecedentePenal antecedente = new AntecedentePenal();

        antecedente.nocontrol = JOptionPane.showInputDialog("No. de control: ");
        antecedente.nombre = JOptionPane.showInputDialog("Nombre: ");
        antecedente.edad = Byte.parseByte(JOptionPane.showInputDialog("Edad: "));
        antecedente.razonCondena = JOptionPane.showInputDialog("Razón de la condena: ");
        antecedente.fechaCondena = JOptionPane.showInputDialog("Fecha de la condena: ");

        JOptionPane.showMessageDialog(null, "No. de control: " + antecedente.nocontrol);
        JOptionPane.showMessageDialog(null, "Nombre: " + antecedente.nombre);
        JOptionPane.showMessageDialog(null, "Edad: " + antecedente.edad);
        JOptionPane.showMessageDialog(null, "Razon de la condena: " + antecedente.razonCondena);
        JOptionPane.showMessageDialog(null, "Fecha de la condena: " + antecedente.fechaCondena);

    }
}
