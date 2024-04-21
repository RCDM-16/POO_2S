package Ejercicio1_7;

public class Produccion {
    private float litros, pagoGalon;

    public Produccion() {
        litros = 1;
        pagoGalon = 1;
    }

    public void setLitros(float l) {
        litros = l;
        if (litros <= 0) {
            litros = 1;
        }
    }

    public void setPagoGalon(float p) {
        pagoGalon = p;
        if (pagoGalon <= 0) {
            pagoGalon = 1;
        }
    }

    public float getLitros() {
        return litros;
    }

    public float getPagoGalon() {
        return pagoGalon;
    }

    public String toString() {
        return "Litros: " + litros +
                "\nPago por galón: " + pagoGalon +
                "\nPago total: " + calculoPago();
    }

    public double calculoPago() {
        return (pagoGalon * (litros / 3.785));
    }

}
