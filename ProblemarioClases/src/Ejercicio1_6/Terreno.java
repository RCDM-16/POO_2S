package Ejercicio1_6;

public class Terreno {
    private float radioTerreno;

    public Terreno() {
        radioTerreno = 1;
    }

    public void setRadioTerreno(float r) {
        radioTerreno = r;
        if (radioTerreno <= 0) {
            radioTerreno = 1;
        }
    }

    public float getRadioTerreno() {
        return radioTerreno;
    }

    public String toString() {
        return "Radio: " + radioTerreno +
                "\nÁrea: " + calculoArea();
    }

    public double calculoArea() {
        double areaSemicirculo, areaTriangulo;
        areaSemicirculo = (3.1416 * Math.pow(radioTerreno, 2)) / 2;
        areaTriangulo = (radioTerreno * 2);
        return (areaSemicirculo + (areaTriangulo * 2));
    }
}
