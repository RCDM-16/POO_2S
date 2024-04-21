package Ejercicio1_10;

public class Pedido {
    private float metros;

    public Pedido() {
        metros = 1;
    }

    public void setMetros(float m) {
        metros = m;
        if (metros <= 0) {
            metros = 1;
        }
    }

    public float getMetros() {
        return metros;
    }

    public String toString() {
        return "Metros: " + metros +
                "\nPulgadas: " + calculoPedido();
    }

    public double calculoPedido() {
        return (metros/0.0254);
    }

}
