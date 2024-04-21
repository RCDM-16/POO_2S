package Ejercicio1_4;

public class Circunferencia {
    private float radio;

    public Circunferencia() {
        radio = 1;
    }

    public void setRadio(float a) {
        radio = a;
        if (a <= 0) {
            radio = 1;
        }
    }

    public float getRadio() {
        return radio;
    }

    public String toString() {
        return "Radio: " + radio + "\nArea: " + calculoArea() + "\nPerímetro: " + calculoPerimetro();
    }

    public double calculoArea() {
        return ((3.1416 * 2) * radio);
    }

    public double calculoPerimetro() {
        return (3.1416 * Math.pow(radio, 2));
    }
}
