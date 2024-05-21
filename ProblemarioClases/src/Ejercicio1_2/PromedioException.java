package Ejercicio1_2;

public class PromedioException extends Exception{
    public PromedioException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Error:"+super.getMessage();
    }
}
