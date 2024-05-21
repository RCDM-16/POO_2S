public class Tablet extends DispositivoElectronico{

    private byte pulgadas;
    private float ghz;

    public Tablet(String marca, float precio, byte descuento, byte pulgadas, float ghz) {
        super(marca, precio, descuento);
        setPulgadas(pulgadas);
        setGhz(ghz);

    }

    public Tablet() {
        this("Sin Marca", (float) 1, (byte) 1,(byte) 1,(float) 1 );
    }

    public byte getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(byte pulgadas) {
        this.pulgadas = pulgadas > 0 ? pulgadas : (byte) 1;
    }

    public float getGhz() {
        return ghz;
    }

    public void setGhz(float ghz) {
        this.ghz = ghz > 0 ? ghz : (float) 1;



    }
    public String toString() {
        return  super.toString() +
                "\nTablet: " +
                "\nPulgadas: " + pulgadas +
                "\nGhZ: " + ghz;
    }

}
