package PacienteHerencia;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        PacienteInterno pacienteInterno;
        PacienteExterno pacienteExterno;
        PacienteTrasladado pacienteTrasladado;
        PacienteInterconsulta pacienteInterconsulta;
        byte opc = 0;

        opc = Byte.parseByte(JOptionPane.showInputDialog("1. Interno\n2. Externo\n3. Trasladado \n4. Interconsulta"));

        switch (opc) {
            case 1:
                pacienteInterno = new PacienteInterno();

                pacienteInterno.setCurp(JOptionPane.showInputDialog("CURP: "));
                pacienteInterno.setNombre(JOptionPane.showInputDialog("Nombre: "));
                pacienteInterno.setPadecimiento(JOptionPane.showInputDialog("Padecimiento: "));
                pacienteInterno.setTratamiento(JOptionPane.showInputDialog("Tratamiento: "));

                pacienteInterno.setArea(JOptionPane.showInputDialog("Area: "));
                pacienteInterno.setSala(Byte.parseByte(JOptionPane.showInputDialog("Sala: ")));
                pacienteInterno.setCama(Byte.parseByte(JOptionPane.showInputDialog("Cama: ")));

                JOptionPane.showMessageDialog(null, pacienteInterno.toString());

                break;
            case 2:
                pacienteExterno = new PacienteExterno();

                pacienteExterno.setCurp(JOptionPane.showInputDialog("CURP: "));
                pacienteExterno.setNombre(JOptionPane.showInputDialog("Nombre: "));
                pacienteExterno.setPadecimiento(JOptionPane.showInputDialog("Padecimiento: "));
                pacienteExterno.setTratamiento(JOptionPane.showInputDialog("Tratamiento: "));

                pacienteExterno.setMedicoTratante(JOptionPane.showInputDialog("Medico Tratante: "));
                pacienteExterno.setConsultorio(Byte.parseByte(JOptionPane.showInputDialog("Consultorio: ")));
                pacienteExterno.setFecha(JOptionPane.showInputDialog("Fecha: "));
                pacienteExterno.setHora(JOptionPane.showInputDialog("Hora: "));

                JOptionPane.showMessageDialog(null, pacienteExterno.toString());
                break;
            case 3:
                pacienteTrasladado = new PacienteTrasladado();

                pacienteTrasladado.setCurp(JOptionPane.showInputDialog("CURP: "));
                pacienteTrasladado.setNombre(JOptionPane.showInputDialog("Nombre: "));
                pacienteTrasladado.setPadecimiento(JOptionPane.showInputDialog("Padecimiento: "));
                pacienteTrasladado.setTratamiento(JOptionPane.showInputDialog("Tratamiento: "));

                pacienteTrasladado.setHospitalProcedencia(JOptionPane.showInputDialog("Hospital de Procedencia: "));

                JOptionPane.showMessageDialog(null, pacienteTrasladado.toString());
                break;
            case 4:
                pacienteInterconsulta = new PacienteInterconsulta();

                pacienteInterconsulta.setCurp(JOptionPane.showInputDialog("CURP: "));
                pacienteInterconsulta.setNombre(JOptionPane.showInputDialog("Nombre: "));
                pacienteInterconsulta.setPadecimiento(JOptionPane.showInputDialog("Padecimiento: "));
                pacienteInterconsulta.setTratamiento(JOptionPane.showInputDialog("Tratamiento: "));

                pacienteInterconsulta.setMedicoTratante(JOptionPane.showInputDialog("Medico Tratante: "));
                pacienteInterconsulta.setConsultorio(Byte.parseByte(JOptionPane.showInputDialog("Consultorio: ")));
                pacienteInterconsulta.setFecha(JOptionPane.showInputDialog("Fecha: "));
                pacienteInterconsulta.setHora(JOptionPane.showInputDialog("Hora: "));

                pacienteInterconsulta.setEspecialistaConsultado(JOptionPane.showInputDialog("Especialista Consultado: "));

                JOptionPane.showMessageDialog(null, pacienteInterconsulta.toString());

                break;
            default:
                JOptionPane.showMessageDialog(null, "Este valor no es valido");
                break;
        }

    }
}

