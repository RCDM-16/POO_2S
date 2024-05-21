public class RelojInteligente extends Reloj {

    private byte duracionHrs, tiempoCarga;

    public RelojInteligente(String marca, float precio, byte descuento, String tipoCorrea, String categoria, byte duracionHrs, byte tiempoCarga) {
        super(marca, precio, descuento, tipoCorrea, categoria);
        this.tiempoCarga = tiempoCarga;
        this.duracionHrs = duracionHrs;
    }

    public RelojInteligente() {
        this("Sin Marca", (float) 1, (byte) 1, "Sin correa", "Sin categoría", (byte) 1, (byte) 1);
    }

    public byte getDuracionHrs() {
        return duracionHrs;
    }

    public void setDuracionHrs(byte duracionHrs)throws DispositivosExeption {
        if (duracionHrs < 8 || duracionHrs > 80){
            this.duracionHrs = duracionHrs;
        } else {
            throw new DispositivosExeption("Ingrese un valor positivo");
        }

    }

    public byte getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(byte tiempoCarga) throws DispositivosExeption{
       if (tiempoCarga <= 0 || tiempoCarga > 60){
           this.tiempoCarga = tiempoCarga;
       }else{
           throw new DispositivosExeption("Ingrese un valor positivo");
       }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nReloj Inteligent: " +
                "\nHoras de duracion: " + duracionHrs +
                "\nTiempo de carga: " + tiempoCarga;
    }


    public double precioTotal() {
        int valorAgregado = duracionHrs > 40 ? 500 : 300;

        return super.precioTotal() + valorAgregado;
    }

    @Override
    public double puntosTienda() {
        return  precioTotal()*0.002;
    }
}
