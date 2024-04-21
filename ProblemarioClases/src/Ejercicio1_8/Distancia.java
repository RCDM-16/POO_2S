package Ejercicio1_8;

public class Distancia {
    private float x1, x2, y1, y2;

    public Distancia() {
        x1 = 1;
        x2 = 1;
        y1 = 1;
        y2 = 1;
    }

    public void setX1(float a) {
        x1 = a;
        if (x1 <= 0) {
            x1 = 1;
        }
    }

    public void setX2(float b) {
        x2 = b;
        if (x2 <= 0) {
            x2 = 1;
        }
    }

    public void setY1(float c) {
        y1 = c;
        if (y1 <= 0) {
            y1 = 1;
        }
    }

    public void setY2(float d) {
        y2 = d;
        if (y2 <= 0) {
            y2 = 1;
        }
    }

    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }

    public float getY1() {
        return y1;
    }

    public float getY2() {
        return y2;
    }

    public String toString() {
        return "Punto x1: " + x1 +
                "\nPunto x1: " + x1 +
                "\nPunto y1: " + y1 +
                "\nPunto y2: " + y2 +
                "\nDistancia: " + calculoDistancia();
    }

    public double calculoDistancia() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
