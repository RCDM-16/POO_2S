package Ejercicio1_3;

public class Rombo {
    private float lado, diagonalMayor, diagonalMenor;

    public Rombo(float lado, float diagonalMayor, float diagonalMenor) throws RomboException{
        setLado(lado);
        setDiagonalMayor(diagonalMayor);
        setDiagonalMenor(diagonalMenor);
    }

    public Rombo() throws RomboException {
        this(1, 2, 2);
    }

    public void setLado(float a) throws RomboException{
        lado = a;
        if (a <= 0) {
            throw new RomboException("El valor no debe de ser negativo");
        }
    }

    public void setDiagonalMayor(float a) throws RomboException{
        diagonalMayor = a;
        if (a <= 0) {
            throw new RomboException("El valor no debe de ser negativo");
        }
    }

    public void setDiagonalMenor(float a)throws RomboException {
        diagonalMenor = a;
        if (a <= 0) {
            throw new RomboException("El valor no debe de ser negativo");
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

    public String toString() {
        return "Lado: " + lado +
                "\nDiagonal Mayor: " + diagonalMayor +
                "\nDiagonal Menor: " + diagonalMenor +
                "\nArea: " + calculoArea() +
                "\nPerímetro: " + calculoPerimetro();
    }

    public double calculoArea() {
        return ((diagonalMayor * diagonalMenor) / 2);
    }

    public double calculoPerimetro() {
        return (lado * 4);
    }
}
