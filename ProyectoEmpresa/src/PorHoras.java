public class PorHoras extends Empleado {
    private byte horasTrabajadas;
    private float pagohora;

    public PorHoras(String id, String nombre, byte horasTrabajadas, float pagohora) {
        super(id, nombre);
        setHorasTrabajadas(horasTrabajadas);
        setPagohora(pagohora);
    }

    public PorHoras() {
        this("Sin CURP", "Sin nombre", (byte) 1, (float) 1);
    }

    public byte getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(byte horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        if (this.horasTrabajadas <= 0) {
            this.horasTrabajadas = 1;
        }
    }

    public float getPagohora() {
        return pagohora;
    }

    public void setPagohora(float pagohora) {
        this.pagohora = pagohora;
        if (this.pagohora <= 0) {
            this.pagohora = 1;
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAsalariado: " +
                "\nhorasTrabajadas= " + horasTrabajadas +
                "\npagohora= " + pagohora;
    }

    @Override
    public double Sueldo() {
        return pagohora * horasTrabajadas;
    }
}

