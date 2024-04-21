package Empleado;

import javax.swing.*;

public class main {
    public static void main (String[]args){
        Fecha fecha = new Fecha();
        fecha.setAnio(Short.parseShort(JOptionPane.showInputDialog("Ingrese el anio: ")));
        fecha.setMes(Byte.parseByte(JOptionPane.showInputDialog("Ingrese el mes: ")));
        fecha.setDia(Byte.parseByte(JOptionPane.showInputDialog("Ingrese en dia: ")));



        Nombre2 nombre2 = new Nombre2();
        nombre2.setPrimerNombre(JOptionPane.showInputDialog("Ingrese su primer nombre: "));
        nombre2.setSegundoNombre(JOptionPane.showInputDialog("Ingrese su segundo nombre: "));
        nombre2.setApellidoPaterno(JOptionPane.showInputDialog("Ingrese el apellido paterno: "));
        nombre2.setApellidoMaterno(JOptionPane.showInputDialog("Ingrese el apellido materno: "));
        nombre2.setTitulo(JOptionPane.showInputDialog("Ingrese su titulo: "));

        Direccion direccion = new Direccion();
        direccion.setPais(JOptionPane.showInputDialog("Ingrese el pais: "));
        direccion.setCiudad(JOptionPane.showInputDialog("Ingrese la ciudad:"));
        direccion.setMunicipio(JOptionPane.showInputDialog("Ingrese el municipio al que pertenece: "));
        direccion.setColonia(JOptionPane.showInputDialog("Ingrese la colonia donde recide: "));
        direccion.setCodigoPostal(JOptionPane.showInputDialog("Ingrese su codigo postal: "));
        direccion.setCalle(JOptionPane.showInputDialog("Ingrese la calle de su vivienda: "));
        direccion.setNoExterior(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero exterior: ")));
        direccion.setNoInterior(JOptionPane.showInputDialog("Ingrese el numero interior: "));

        Empleado empleado = new Empleado();
        empleado.setFecha(fecha);
        empleado.setNombre(nombre2);
        empleado.setDireccion(direccion);

        JOptionPane.showMessageDialog(null, empleado.toString());

    }
}