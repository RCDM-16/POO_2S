import java.util.Scanner;

public class Mexcal2_10 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float costoMateriaPrima;
        byte claveProducto;
        double costoProduccion, precioVenta, manoObra, gastoFabricacion;

        System.out.print("Ingrese la clave del producto (1 - 6): ");
        claveProducto = ent.nextByte();
        System.out.print("Ingrese el costo de la materia prima: $: ");
        costoMateriaPrima = ent.nextByte();

        manoObra = calculoManoObra(costoMateriaPrima, claveProducto);
        gastoFabricacion = calculoFabricacion(costoMateriaPrima, claveProducto);

        costoProduccion = calculoCostoProduccion(costoMateriaPrima, manoObra, gastoFabricacion);
        precioVenta = calculoPrecioVenta(costoProduccion);

        System.out.println("El precio de venta del producto es de: " + precioVenta);
    }

    public static double calculoManoObra(float costoMateriaPrima, byte clave) {
        float carga;
        if (clave == 3 || clave == 4) {
            carga = 75;
        } else if (clave == 1 || clave == 5) {
            carga = 80;
        } else {
            carga = 85;
        }
        return costoMateriaPrima * (carga / 100);
    }

    public static double calculoFabricacion(float costoMateriaPrima, byte clave) {
        float carga;
        if (clave == 2 || clave == 5) {
            carga = 30;
        } else if (clave == 3 || clave == 6) {
            carga = 35;
        } else {
            carga = 28;
        }
        return costoMateriaPrima * (carga / 100);
    }

    public static double calculoCostoProduccion(float materiaPrima, double manoObra, double gastoFabricacion) {
        return materiaPrima + manoObra + gastoFabricacion;
    }

    public static double calculoPrecioVenta(double costoProduccion) {
        return costoProduccion + (costoProduccion * 0.45);
    }

}
