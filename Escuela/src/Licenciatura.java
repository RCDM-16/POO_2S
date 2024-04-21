public class Licenciatura extends Alumno {
    private String carrera;
    private byte semestre;

    public Licenciatura(String noControl, String nombre, String carrera, byte semestre) {
        super(noControl, nombre);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Licenciatura() {
        this("Sin Numero", "Sin Nombre", "Sin carrera", (byte) 0);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre < 0 ? 1 : semestre;
    }

    @Override
    public String toString() {
        return "\nLicenciatura: " +
                "\n" + super.toString() +
                "\ncarrera: " + carrera +
                "\nsemestre: " + semestre;
    }

    @Override
    public double Inscripcion() {
        return (getSemestre() < 5 ? 7500 : 5600);
    }
}
