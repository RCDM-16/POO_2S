public class ComisionMasBase extends Comision {
    private float base;

    public ComisionMasBase(String id, String nombre, byte porcentajeComision, float venta, float base) {
        super(id, nombre, porcentajeComision, venta);
        setBase(base);
    }

    public ComisionMasBase() {
        this("Sin CURP", "Sin nombre", (byte) 1, (float) 1, (float) 1);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
        if (this.base <= 0) {
            this.base = 1;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nComisionMasBase: " +
                "\nbase= " + base;
    }

    @Override
    public double Sueldo() {
        return super.Sueldo() + base;
    }
}
