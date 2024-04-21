package Ejercicio1_3;

public class Rombo {
    private float lado, diagonalMayor, diagonalMenor;

    public Rombo() {
        lado = 1;
        diagonalMayor = 1;
        diagonalMenor = 1;
    }

    public void setLado(float a) {
        lado = a;
        if (a <= 0) {
            lado = 1;
        }
    }

    public void setDiagonalMayor(float a) {
        diagonalMayor = a;
        if (a <= 0) {
            diagonalMayor = 1;
        }
    }

    public void setDiagonalMenor(float a) {
        diagonalMenor = a;
        if (a <= 0) {
            diagonalMenor = 1;
        }
    }

    public float getLado() {
        return lado;
    }

    public float getDiagonalMayor() {
        return diagonalMayor;
    }

    public float getDiagonalMenor() {
        return diagonalMenor;
    }

    public String toString(){
        return "Lado: "+lado+
                "\nDiagonal Mayor: "+diagonalMayor+
                "\nDiagonal Menor: "+diagonalMenor+
                "\nArea: "+calculoArea()+
                "\nPerímetro: "+calculoPerimetro();
    }

    public double calculoArea() {
        return ((diagonalMayor * diagonalMenor) / 2);
    }

    public double calculoPerimetro() {
        return (lado * 4);
    }
}
