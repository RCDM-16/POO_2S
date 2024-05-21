import javax.swing.*;

public abstract class DispositivoElectronico {
    private String marca;
    private float precio;
    private byte descuento;

    public DispositivoElectronico(String marca, float precio, byte descuento) {
        this.descuento = descuento;
        setMarca(marca);
        this.precio = precio;
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

    public void setPrecio(float precio)throws DispositivosExeption {
        if(precio > 0){
            this.precio = precio;
        } else {
            throw new DispositivosExeption("El valor debe ser positivo");
        }
    }

    public byte getDescuento() {
        return descuento;
    }

    public void setDescuento(byte descuento)throws DispositivosExeption {
        if (descuento >= 0) {
            this.descuento = descuento;
        } else {
            throw new DispositivosExeption("El valor debe ser positivo");
        }
    }
    private double calculoDescuentoPrecio(float precio, byte descuento) {
        return precio - (precio * ((double) descuento / 100));
    }

    public String toString() {
        return "\nDispositivo Electronico:" +
                "\nmarca: " + marca +
                "\nprecio: " + precio +
                "\ndescuento: " + descuento +
                "\nPrecio con descuento: " + calculoDescuentoPrecio(precio, descuento);
    }


    public abstract double precioTotal();

    public abstract double puntosTienda();

}
