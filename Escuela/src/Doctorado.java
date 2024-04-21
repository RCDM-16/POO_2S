public class Doctorado extends Alumno {
    private String tituloInvestigacion;
    private byte porcentajeBeca;

    public Doctorado(String noControl, String nombre, String tituloInvestigacion, byte porcentajeBeca) {
        super(noControl, nombre);
        this.tituloInvestigacion = tituloInvestigacion;
        this.porcentajeBeca = porcentajeBeca;
    }

    public Doctorado() {
        this("Sin Numero", "Sin Nombre", "Sin titulo de investigacion", (byte) 0);
    }

    public String getTituloInvestigacion() {
        return tituloInvestigacion;
    }

    public void setTituloInvestigacion(String tituloInvestigacion) {
        this.tituloInvestigacion = tituloInvestigacion;
    }

    public byte getPorcentajeBeca() {
        return porcentajeBeca;
    }

    public void setPorcentajeBeca(byte porcentajeBeca) {
        this.porcentajeBeca = porcentajeBeca < 0 || porcentajeBeca > 100 ? 0 : porcentajeBeca;
    }

    @Override
    public String toString() {
        return "\nDoctorado: " +
                "\n" + super.toString() +
                "\ntituloInvestigacion: " + tituloInvestigacion +
                "\nporcentajeBeca: " + porcentajeBeca;
    }

    @Override
    public double Inscripcion() {
        float costo = 10700;
        return costo - (costo * getPorcentajeBeca() / 100);
    }
}
