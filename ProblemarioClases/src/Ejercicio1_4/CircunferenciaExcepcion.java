package Ejercicio1_4;

public class CircunferenciaExcepcion extends Exception {
    public CircunferenciaExcepcion(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Error: " + super.getMessage();
    }
}
