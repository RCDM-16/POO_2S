public class Reloj extends DispositivoElectronico {

    private String tipoCorrea, categoria;

    public Reloj(String marca, float precio, byte descuento, String tipoCorrea, String categoria) {
        super(marca, precio, descuento);
        setCategoria(categoria);
        setTipoCorrea(tipoCorrea);
    }


    public Reloj() {
        this("Sin Marca", (float) 1, (byte) 1, "Sin correa", "Sin categoría");
    }

    public void setTipoCorrea(String tipoCorrea) {
        this.tipoCorrea = tipoCorrea;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nReloj :" +
                "\nTipo de correa: " + tipoCorrea +
                "\nCategoria: " + categoria;
    }

    public double precioTotal() {

        short valorAgregado = switch (tipoCorrea) {
            case "Cuero" -> 150;
            case "Acero" -> 200;
            case "Tela" -> 100;
            case "Malla" -> 170;
            default -> 0;
        };

        return getPrecio() - ((double) (getPrecio() * getDescuento()) / 100) + valorAgregado;
    }

    public double puntosTienda() {
        return  precioTotal()*0.001;
    }

}
