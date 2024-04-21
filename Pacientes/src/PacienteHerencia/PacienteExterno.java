package PacienteHerencia;

public class PacienteExterno extends Paciente {
    private String medicoTratante, fecha, hora;
    private byte consultorio;

    public PacienteExterno(String curp, String nombre, String padecimiento, String tratamiento, String medicoTratante, String fecha, String hora, byte consultorio) {
        super(curp, nombre, padecimiento, tratamiento);
        this.medicoTratante = medicoTratante;
        this.fecha = fecha;
        this.hora = hora;
        this.consultorio = consultorio;
    }

    public PacienteExterno() {
        this("Sin CURP", "Sin Nombre", "Sin Padecimientos", "Sin Tratamiento", "Sin Medico Tratante", "Sin Fecha", "Sin hora", (byte) 1);
    }

    public String getMedicoTratante() {
        return medicoTratante;
    }

    public void setMedicoTratante(String medicoTratante) {
        this.medicoTratante = medicoTratante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public byte getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(byte consultorio) {
        this.consultorio = consultorio;
        if (this.consultorio <= 0) {
            this.consultorio = 1;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMedicoTratante= " + medicoTratante +
                "\nFecha= " + fecha +
                "\nHora= " + hora +
                "\nConsultorio= " + consultorio;
    }
}
