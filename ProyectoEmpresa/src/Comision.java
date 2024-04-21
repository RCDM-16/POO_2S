public class Comision extends Empleado {
    private byte porcentajeComision;
    private float venta;

    public Comision(String id, String nombre, byte porcentajeComision, float venta) {
        super(id, nombre);
        setPorcentajeComision(porcentajeComision);
        setVenta(venta);
    }

    public Comision() {
        this("Sin CURP", "Sin nombre", (byte) 1, (float) 1);
    }

    public byte getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(byte porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
        if (this.porcentajeComision < 0 || this.porcentajeComision >= 100) {
            this.porcentajeComision = 0;
        }
    }

    public float getVenta() {
        return venta;
    }

    public void setVenta(float venta) {
        this.venta = venta;
        if (this.venta <= 0) {
            this.venta = 1;
        }
    }

    public String toString() {
        return super.toString() +
                "\nComision:" +
                "\nporcentajeComision= " + porcentajeComision +
                "\nventa= " + venta;
    }

    @Override
    public double Sueldo() {
        return venta * porcentajeComision / 100;
    }
}
