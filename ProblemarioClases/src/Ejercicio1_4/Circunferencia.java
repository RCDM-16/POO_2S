package Ejercicio1_4;

public class Circunferencia {
    private float radio;

    public Circunferencia(float radio) throws CircunferenciaExcepcion {
        setRadio(radio);
    }

    public Circunferencia() throws CircunferenciaExcepcion {
        this(1);
    }

    public void setRadio(float a) throws CircunferenciaExcepcion {
        radio = a;
        if (a <= 0) {
            throw new CircunferenciaExcepcion("El valor no debe de ser negativo");
        }
    }

    public float getRadio() {
        return radio;
    }

    public String toString() {
        return "Radio: " + radio + "\nArea: " + calculoArea() + "\nPerímetro: " + calculoPerimetro();
    }

    public double calculoArea() {
        return (3.1416 * Math.pow(radio, 2));
    }

    public double calculoPerimetro() {
        return ((3.1416 * 2) * radio);
    }
}
