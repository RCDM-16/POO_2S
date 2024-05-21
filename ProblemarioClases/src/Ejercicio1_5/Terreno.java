package Ejercicio1_5;

public class Terreno {
    private float alturaTerrenoIzq, alturaTerrenoDere, baseTerreno;

    public Terreno(float alturaTerrenoIzq, float alturaTerrenoDere, float baseTerreno) {
        setAlturaTerrenoIzq(alturaTerrenoIzq);
        setAlturaTerrenoDere(alturaTerrenoDere);
        setBaseTerreno(baseTerreno);
    }

    public Terreno() {
        this(1,1,1);
    }

    public void setAlturaTerrenoIzq(float i) {
        alturaTerrenoIzq = i;
        if (i <= 0) {
            alturaTerrenoIzq = 1;
        }
    }

    public void setAlturaTerrenoDere(float d) {
        alturaTerrenoDere = d;
        if (d <= 0) {
            alturaTerrenoDere = 1;
        }
    }

    public void setBaseTerreno(float b) {
        baseTerreno = b;
        if (b <= 0) {
            baseTerreno = 1;
        }
    }

    public float getAlturaTerrenoIzq() {
        return alturaTerrenoIzq;
    }

    public float getAlturaTerrenoDere() {
        return alturaTerrenoDere;
    }

    public float getBaseTerreno() {
        return baseTerreno;
    }

    public String toString() {
        return "Altura izquierda del terreno: " + alturaTerrenoIzq +
                "\nAltura derecha del terreno: " + alturaTerrenoDere +
                "\nBase del terreno: " + baseTerreno +
                "\nÁrea: " + calculoArea();
    }

    public double calculoArea() {
        float alturaTriangulo, areaTriangulo, areaRectangulo;
        alturaTriangulo = alturaTerrenoIzq - alturaTerrenoDere;
        areaTriangulo = (baseTerreno * alturaTriangulo) / 2;
        areaRectangulo = baseTerreno * alturaTerrenoDere;
        return (areaTriangulo + areaRectangulo);
    }
}
