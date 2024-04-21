package Ejercicio1;

public class Iva {
    float ivaPorcentaje = 16;

    public double totalIva(float precio) {
        return (precio * (ivaPorcentaje / 100));
    }

    public double precioNeto(double iva, double precio) {
        return iva + precio;
    }
}
