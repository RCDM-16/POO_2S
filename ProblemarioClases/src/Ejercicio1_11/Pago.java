package Ejercicio1_11;

public class Pago {
    private float precioMetros, altura, base;

    public Pago() {
        precioMetros = 1;
        altura = 1;
        base = 1;
    }

    public void setAltura(float a) {
        altura = a;
        if (altura <= 0) {
            altura = 0;
        }
    }

    public void setBase(float b) {
        base = b;
        if (base <= 0) {
            base = 0;
        }
    }

    public void setPrecioMetros(float p) {
        precioMetros = p;
        if (precioMetros <= 0) {
            precioMetros = 0;
        }
    }

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }

    public float getPrecioMetros() {
        return precioMetros;
    }

    public String toString() {
        return "Precio por metro: " + precioMetros +
                "\nAltura: " + altura +
                "\nBase: " + base +
                "\nPago: " + calculoPago();
    }

    public double calculoPago() {
        return ((Math.pow(altura, 2) * base) * precioMetros);
    }
}
