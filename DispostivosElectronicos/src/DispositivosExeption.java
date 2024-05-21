public class DispositivosExeption extends Exception{

    public DispositivosExeption(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Error: " + super.getMessage();
    }
}
