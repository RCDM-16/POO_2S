public abstract class Alumno {
    private String noControl, nombre;

    public Alumno(String noControl, String nombre) {
        this.noControl = noControl;
        this.nombre = nombre;
    }

    public Alumno() {
        this("Sin Numero", "Sin Nombre");
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nAlumno: " +
                "\nnoControl: " + noControl +
                "\nnombre: " + nombre;
    }

    public abstract double Inscripcion();
}
