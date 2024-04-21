package PacienteHerencia;

public class PacienteInterconsulta extends PacienteExterno{
    private String especialistaConsultado;

    public PacienteInterconsulta(String curp, String nombre, String padecimiento, String tratamiento, String medicoTratante, String fecha, String hora, byte consultorio, String especialistaConsultado) {
        super(curp, nombre, padecimiento, tratamiento, medicoTratante, fecha, hora, consultorio);
        this.especialistaConsultado = especialistaConsultado;
    }
    public PacienteInterconsulta() {
        this("Sin CURP", "Sin Nombre", "Sin Padecimientos", "Sin Tratamiento", "Sin Medico Tratante", "Sin Fecha", "Sin hora", (byte) 1,"Sin Especialista");

    }

    public String getEspecialistaConsultado() {
        return especialistaConsultado;
    }

    public void setEspecialistaConsultado(String especialistaConsultado) {
        this.especialistaConsultado = especialistaConsultado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEspecialista Consultado= " + especialistaConsultado;
    }
}
