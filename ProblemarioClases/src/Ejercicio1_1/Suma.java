package Ejercicio1_1;

public class Suma {

    private short numero1, numero2;

    public Suma(short numero1, short numero2) {
        setNumero1(numero1);
        setNumero2(numero2);
    }

    public Suma() {
        numero1 = 1;
        numero2 = 1;
    }

    public void setNumero1(short a) {
        numero1 = a;
    }

    public void setNumero2(short b) {
        numero2 = b;
    }

    public short getNumero1() {
        return numero1;
    }

    public short getNumero2() {
        return numero2;
    }

    public String toString() {
        return "Número 1: " + numero1 +
                "\nNúmero 2: " + numero2+
                "\nSuma: " + sumaNumeros();
    }

    public double sumaNumeros() {
        return numero1 + numero2;
    }
}
