package Ejercicio1_2;

public class Promedio {
    private int[] calificaciones = new int[4];

    public Promedio(int calif1, int calif2, int calif3, int calif4) throws PromedioException {
        setCalificaciones(0, calif1);
        setCalificaciones(1, calif2);
        setCalificaciones(2, calif3);
        setCalificaciones(3, calif4);

        /*
        tambien podria funcionar:

        for (int i : calificaciones) {
            calificaciones[i] = 1;
        }
        */
    }

    public Promedio() throws PromedioException {
        this(1, 2, 3, 4);

    }

    public void setCalificaciones(int b, int i) throws PromedioException {
        calificaciones[i] = b;
        if (b <= 0) {
            throw new PromedioException("El valor no debe de ser negativo");
        }
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public String toString() {
        return "Calificación 1: " + calificaciones[0] +
                "\nCalificación 3: " + calificaciones[2] +
                "\nCalificación 4: " + calificaciones[3] +
                "\nCalificación 2: " + calificaciones[1] +
                "\nPromedio: " + calculoPromedio();

    }

    public double calculoPromedio() {
        float sumaCalificaciones = 0;
        for (byte i = 0; i < calificaciones.length; ++i) {
            sumaCalificaciones += calificaciones[i];
        }
        return (sumaCalificaciones / calificaciones.length);

    }
}
