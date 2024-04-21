package Ejercicio1_9;

public class Trabajador {
    private float horasTrabajadas, pagoHora;

    public Trabajador() {
        horasTrabajadas = 1;
        pagoHora = 1;
    }

    public void setHorasTrabajadas(float t) {
        horasTrabajadas = t;
        if (horasTrabajadas <= 0) {
            horasTrabajadas = 1;
        }
    }

    public void setPagoHora(float h) {
        pagoHora = h;
        if (pagoHora <= 0) {
            pagoHora = 1;
        }
    }

    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public float getPagoHora() {
        return pagoHora;
    }

    public String toString() {
        return "Horas Trabajadas: " + horasTrabajadas +
                "\nPago por hora: " + pagoHora +
                "\nSueldo: " + calculoSueldo();
    }

    public double calculoSueldo() {
        return (horasTrabajadas * pagoHora);
    }

}
