package PacienteHerencia;

public class PacienteTrasladado extends Paciente {
    private String HospitalProcedencia;

    public PacienteTrasladado(String curp, String nombre, String padecimiento, String tratamiento, String hospitalProcedencia) {
        super(curp, nombre, padecimiento, tratamiento);
        HospitalProcedencia = hospitalProcedencia;
    }

    public PacienteTrasladado() {
        this("Sin CURP", "Sin Nombre", "Sin Padecimientos", "Sin Tratamiento", "Sin Hospital de Procedencia");
    }

    public String getHospitalProcedencia() {
        return HospitalProcedencia;
    }

    public void setHospitalProcedencia(String hospitalPriocedencia) {
        HospitalProcedencia = hospitalPriocedencia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHospital Procedencia= " + HospitalProcedencia;
    }
}
