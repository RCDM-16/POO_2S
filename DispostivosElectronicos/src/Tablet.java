public class Tablet extends DispositivoElectronico {

    private byte pulgadas;
    private float ghz;

    public Tablet(String marca, float precio, byte descuento, byte pulgadas, float ghz) {
        super(marca, precio, descuento);

        this.pulgadas = pulgadas;
        this.ghz = ghz;
    }

    public Tablet() {
        this("Sin Marca", (float) 1, (byte) 1, (byte) 1, (float) 1);
    }

    public byte getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(byte pulgadas) throws DispositivosExeption {
        if (pulgadas > 0) {
            this.pulgadas = pulgadas;
        } else {
            throw new DispositivosExeption("el valor no debe de ser negativo");
        }
    }

    public float getGhz() {
        return ghz;
    }

    public void setGhz(float ghz) throws DispositivosExeption {
        if (ghz > 0 && ghz <= 500) {
            this.ghz = ghz;
        } else {
            throw new DispositivosExeption("El valor debe ser positivo y no mayor a 500");
        }


    }

    public String toString() {
        return super.toString() +
                "\nTablet: " +
                "\nPulgadas: " + pulgadas +
                "\nGhZ: " + ghz;
    }

    @Override
    public double precioTotal() {

        double bonoTabletxd;

        if (pulgadas < 7) {
            bonoTabletxd = 500;
        } else {

            bonoTabletxd = 1000;
        }

        return getPrecio() - (((double) (getPrecio() * getDescuento()) / 100) - bonoTabletxd);
    }

    @Override
    public double puntosTienda() {
        return precioTotal() * 0.004;
    }


}
