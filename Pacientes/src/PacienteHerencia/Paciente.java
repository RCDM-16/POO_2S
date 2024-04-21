package PacienteHerencia;

public class Paciente {
    private String curp, nombre, padecimiento, tratamiento;

    public Paciente(String curp, String nombre, String padecimiento, String tratamiento) {
        setCurp(curp);
        setNombre(nombre);
        setPadecimiento(padecimiento);
        setTratamiento(tratamiento);
    }

    public Paciente() {
        this("Sin CURP", "Sin Nombre", "Sin Padecimientos", "Sin Tratamiento");
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "\ncurp= " + curp +
                "\nnombre= " + nombre +
                "\npadecimiento= " + padecimiento +
                "\ntratamiento= " + tratamiento;
    }
}
