
public class DispositivoElectronico {
    private String marca;
    private float precio;
    private byte descuento;

    public DispositivoElectronico(String marca, float precio, byte descuento) {
        setDescuento(descuento);
        setMarca(marca);
        setPrecio(precio);
    }

    public DispositivoElectronico() {
        this("Sin Marca", (float) 1, (byte) 1);
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = (precio <= 0) ? 1 : precio;
    }

    public byte getDescuento() {
        return descuento;
    }

    public void setDescuento(byte descuento) {
        this.descuento = (descuento < 0 || descuento > 100) ? 0 : descuento;
    }

    private double calculoDescuentoPrecio(float precio, byte descuento) {
        return precio - (precio * ((double) descuento / 100));
    }

    @Override
    public String toString() {
        return "\nDispositivo Electronico:" +
                "\nmarca: " + marca +
                "\nprecio: " + precio +
                "\ndescuento: " + descuento +
                "\nPrecio con descuento: " + calculoDescuentoPrecio(precio, descuento);
    }
}
