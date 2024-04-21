package Ejercicio1_2;

public class Promedio {
    private int[] calificaciones = new int[4];

    public Promedio() {


        calificaciones[0] = 1;
        calificaciones[1] = 1;
        calificaciones[2] = 1;
        calificaciones[3] = 1;

        /*
        tambien podria funcionar:

        for (int i : calificaciones) {
            calificaciones[i] = 1;
        }
        */
    }

    public void setCalificaciones(int b, int i) {
        calificaciones[i] = b;
        if (b <= 0) {
            calificaciones[i] = 1;
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
