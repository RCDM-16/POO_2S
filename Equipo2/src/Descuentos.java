import java.util.Scanner;
public class Descuentos {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);

        byte departamento;
        String nombreDepartamento;
        float costoArticulo;
        double descuento = 0;
        double montoDescuento, costoNeto;

        System.out.print("cual es el No. de departamento del articulo a comprar?: ");
        departamento = entrada.nextByte();
        System.out.print("cual es el costo del articulo?: ");
        costoArticulo = entrada.nextFloat();

        switch (departamento) {
            case 1 :
                descuento = 23;
                nombreDepartamento = "Computo";
                break;
            case 2:
                descuento = 10;
                nombreDepartamento = "Electrodomentico";
                break;
            case 3:
                descuento = 15;
                nombreDepartamento = "Ropa";
                break;
            case 4:
                descuento = 7;
                nombreDepartamento = "Cosmeticos";
                break;
            default:
                nombreDepartamento = "'La Perlita' no cuenta con este departamento";
        }

        montoDescuento = costoArticulo * (descuento / 100);
        costoNeto = costoArticulo - montoDescuento;

        System.out.println("El producto es del departamento de: "+ nombreDepartamento +"\n"+
                        "El porcentaje de descuento aplicacado es del: "+ descuento +"\n"+
                        "El monto de descuento es de: "+ montoDescuento+"\n" +
                        "El costo neto es de articulo de: "+ costoNeto+"\n");
    }
}

