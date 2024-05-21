package Ejercicio1_5;

public class TerrenoException extends Exception{
    public TerrenoException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Error: "+super.getMessage();
    }
}
