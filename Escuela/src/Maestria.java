public class Maestria extends Alumno {
    private String modalidad;
    private short creditos;

    public Maestria(String noControl, String nombre, String modalidad, short creditos) {
        super(noControl, nombre);
        this.modalidad = modalidad;
        this.creditos = creditos;
    }

    public Maestria() {
        this("Sin Numero", "Sin Nombre", "Sin Modalida", (short) 0);
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public short getCreditos() {
        return creditos;
    }

    public void setCreditos(short creditos) {
        this.creditos = creditos < 0 ? 0 : creditos;
    }

    @Override
    public String toString() {
        return "\nMaestria: " +
                "\n" + super.toString() +
                "\nmodalidad: " + modalidad +
                "\ncreditos: " + creditos;
    }

    @Override
    public double Inscripcion() {
        return getCreditos() * 478.90;
    }
}
