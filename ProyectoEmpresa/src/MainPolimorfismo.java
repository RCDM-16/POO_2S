import javax.swing.*;

public class MainPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado;
        byte tipoEmpleado;

        tipoEmpleado = Byte.parseByte(JOptionPane.showInputDialog("Seleccione el tipo de empleado: \n1. Asalariado\n2. Por horas\n3. Por comision\n4. Por comision + base "));

        switch (tipoEmpleado) {
            case 1:
                empleado = new Asalariado();

                ingresoIdNombre(empleado);
                ((Asalariado) empleado).setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario: ")));
                estado(empleado);
                break;
            case 2:
                empleado = new PorHoras();

                ingresoIdNombre(empleado);
                ((PorHoras) empleado).setHorasTrabajadas(Byte.parseByte(JOptionPane.showInputDialog("Horas trabajadas: ")));
                ((PorHoras) empleado).setPagohora(Float.parseFloat(JOptionPane.showInputDialog("Pago por Hora: ")));
                estado(empleado);
                break;
            case 3:
                empleado = new Comision();

                ingresoIdNombre(empleado);
                datosVenta(empleado);
                estado(empleado);
                break;
            case 4:
                empleado = new ComisionMasBase();

                ingresoIdNombre(empleado);
                datosVenta(empleado);
                ((ComisionMasBase) empleado).setBase(Float.parseFloat(JOptionPane.showInputDialog("Sueldo Base: ")));
                estado(empleado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No valido");
        }

    }

    public static void ingresoIdNombre(Empleado emp) {
        emp.setId(JOptionPane.showInputDialog("id: "));
        emp.setNombre(JOptionPane.showInputDialog("Nobre: "));
    }

    public static void estado(Empleado e) {
        JOptionPane.showMessageDialog(null, e.toString());
        JOptionPane.showMessageDialog(null, e.Sueldo());
    }

    public  static void datosVenta(Empleado emp){
        ((Comision) emp).setPorcentajeComision(Byte.parseByte(JOptionPane.showInputDialog("Procentaje de la comision: ")));
        ((Comision) emp).setVenta(Float.parseFloat(JOptionPane.showInputDialog("Total de la venta: ")));

    }
}
