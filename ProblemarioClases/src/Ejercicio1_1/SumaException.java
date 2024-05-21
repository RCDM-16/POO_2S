package Ejercicio1_1;

public class SumaException extends Exception{
    public SumaException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Error: " + super.getMessage();
    }
}
