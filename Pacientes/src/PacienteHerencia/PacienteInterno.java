package PacienteHerencia;

public class PacienteInterno extends Paciente {
    private String area;
    private byte sala, cama;

    public PacienteInterno(String curp, String nombre, String padecimiento, String tratamiento, String area, byte sala, byte cama) {
        super(curp, nombre, padecimiento, tratamiento);
        setArea(area);
        setSala(sala);
        setCama(cama);
    }

    public PacienteInterno() {
        this("Sin CURP", "Sin Nombre", "Sin Padecimientos", "Sin Tratamiento", "Sin Area", (byte) 1, (byte) 1);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public byte getSala() {
        return sala;
    }

    public void setSala(byte sala) {
        this.sala = sala;
        if (this.sala <= 0) {
            this.sala = 1;
        }
    }

    public byte getCama() {
        return cama;
    }

    public void setCama(byte cama) {
        this.cama = cama;
        if (this.cama <= 0) {
            this.cama = 1;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\narea= " + area +
                "\nsala= " + sala +
                "\ncama= " + cama;
    }
}
