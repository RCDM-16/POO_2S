public class Laptop extends DispositivoElectronico {

    private byte slots, noEntradaUsb;

    public Laptop(String marca, float precio, byte descuento, byte slots, byte noEntradaUsb){
        super(marca, precio, descuento);
        this.slots = slots;
        this.noEntradaUsb = noEntradaUsb;
    }

    public Laptop()  {
        this("Sin Marca", (float) 1, (byte) 1, (byte) 1, (byte) 1);
    }

    public byte getSlots() {
        return slots;
    }

    public void setSlots(byte slots) throws DispositivosExeption {
        //this.slots = (slots <= 0 || slots > 6) ?; throw new DispositivosExeption("El valor debe ser mayor pero menor a 6 "); : slots;
        if (slots >= 0 || slots <= 6) {
            this.slots = slots;
        } else {
            throw new DispositivosExeption("El valor debe ser mayor a 0 y menor a 6 ");
        }
    }

    public byte getNoEntradaUsb() {
        return noEntradaUsb;
    }

    public void setNoEntradaUsb(byte noEntradaUsb) throws DispositivosExeption {
//        this.noEntradaUsb = (noEntradaUsb <= 0 || noEntradaUsb > 10) ? 1 : noEntradaUsb;
        if (noEntradaUsb > 0 && noEntradaUsb <= 10) {
            this.noEntradaUsb = noEntradaUsb;
        } else {
            throw new DispositivosExeption("El valor debe ser mayor a 0 y menor a 10 ");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLaptop: " +
                "\nSlots: " + slots +
                "\nNúmero de Entradas USB=" + noEntradaUsb;
    }

    @Override
    public double precioTotal() {

        return getPrecio() - ((double) (getPrecio() * getDescuento()) / 100);
    }

    @Override
    public double puntosTienda() {
        return precioTotal() * 0.005;
    }
}


