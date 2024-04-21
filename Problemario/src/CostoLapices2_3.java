import java.util.Scanner;

public class CostoLapices2_3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float lapices;

        System.out.print("Lapices Comprados: ");
        lapices = ent.nextFloat();
        System.out.println("Usted debera pagar: " + calculoPrecio(lapices));
    }

    public static float calculoPrecio(float lapices) {
        float pago;
        if (lapices>=1000){
            pago = lapices * 85;
        } else {
            pago = lapices * 90;
        }
        return pago;
    }
}

