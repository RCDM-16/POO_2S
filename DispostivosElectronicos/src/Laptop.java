public class Laptop extends DispositivoElectronico {

    private byte slots, noEntradaUsb;

    public Laptop(String marca, float precio, byte descuento, byte slots, byte noEntradaUsb) {
        super(marca, precio, descuento);
        setSlots(slots);
        setNoEntradaUsb(noEntradaUsb);
    }

    public Laptop() {
        this("Sin Marca", (float) 1, (byte) 1, (byte) 1, (byte) 1);
    }

    public byte getSlots() {
        return slots;
    }

    public void setSlots(byte slots) {
        this.slots = (slots <= 0 || slots > 6) ? 1 : slots;
    }

    public byte getNoEntradaUsb() {
        return noEntradaUsb;
    }

    public void setNoEntradaUsb(byte noEntradaUsb) {
        this.noEntradaUsb = (noEntradaUsb <= 0 || noEntradaUsb > 10) ? 1 : noEntradaUsb;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLaptop: " +
                "\nSlots: " + slots +
                "\nNúmero de Entradas USB=" + noEntradaUsb;
    }
}
