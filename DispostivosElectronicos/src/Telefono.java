public class Telefono extends DispositivoElectronico{

    private String compania;
    private String tipoEntrada;

    public Telefono(String marca, float precio, byte descuento, String compania, String tipoEntrada) {
        super(marca, precio, descuento);
        setCompania(compania);
        setTipoEntrada(tipoEntrada);
    }

    Telefono(){
        this("Sin Marca", (float) 1, (byte) 1, "Sin Compania", "Tactil");
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTelefono: " +
                "\nCompania:" + compania +
                "\nTipo de Entrada:" + tipoEntrada;
    }

    @Override
    public double precioTotal() {
        return getPrecio() - ((double) (getPrecio() * getDescuento()) / 100)+100;
    }

    public double puntosTienda() {
        return  precioTotal()*0.006;
    }
}
