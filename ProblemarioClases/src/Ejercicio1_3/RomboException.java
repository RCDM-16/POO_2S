package Ejercicio1_3;

public class RomboException extends Exception{
    public RomboException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Error:" + super.getMessage();
    }
}
