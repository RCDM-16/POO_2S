import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        byte tipoEmpleado;

        tipoEmpleado = Byte.parseByte(JOptionPane.showInputDialog("Seleccione el tipo de empleado: \n1. Asalariado\n2. Por horas\n3. Por comision\n4. Por comision + base "));

        switch (tipoEmpleado) {
            case 1:
                Asalariado asalariado = new Asalariado();

                asalariado.setId(JOptionPane.showInputDialog("id: "));
                asalariado.setNombre(JOptionPane.showInputDialog("Nobre: "));
                asalariado.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario: ")));
                JOptionPane.showMessageDialog(null, asalariado.toString());
                break;
            case 2:
                PorHoras porHoras = new PorHoras();

                porHoras.setId(JOptionPane.showInputDialog("id: "));
                porHoras.setNombre(JOptionPane.showInputDialog("Nombre: "));
                porHoras.setHorasTrabajadas(Byte.parseByte(JOptionPane.showInputDialog("Horas trabajadas: ")));
                porHoras.setPagohora(Float.parseFloat(JOptionPane.showInputDialog("Pago por Hora: ")));
                JOptionPane.showMessageDialog(null, porHoras.toString());
                break;
            case 3:
                Comision comision = new Comision();

                comision.setId(JOptionPane.showInputDialog("id: "));
                comision.setNombre(JOptionPane.showInputDialog("Nobre: "));
                comision.setPorcentajeComision(Byte.parseByte(JOptionPane.showInputDialog("Procentaje de la comision: ")));
                comision.setVenta(Float.parseFloat(JOptionPane.showInputDialog("Total de la venta: ")));
                JOptionPane.showMessageDialog(null, comision.toString());
                break;
            case 4:
                ComisionMasBase comisionMasBase = new ComisionMasBase();

                comisionMasBase.setId(JOptionPane.showInputDialog("id: "));
                comisionMasBase.setNombre(JOptionPane.showInputDialog("Nobre: "));
                comisionMasBase.setVenta(Float.parseFloat(JOptionPane.showInputDialog("Sueldo Base: ")));
                JOptionPane.showMessageDialog(null, comisionMasBase.toString());
                break;
            default:
                JOptionPane.showMessageDialog(null, "No valido");
        }

    }
}
