public class RelojInteligente extends Reloj {

    private byte duracionHrs, tiempoCarga;

    public RelojInteligente(String marca, float precio, byte descuento, String tipoCorrea, String categoria, byte duracionHrs, byte tiempoCarga) {
        super(marca, precio, descuento, tipoCorrea, categoria);
        setDuracionHrs(duracionHrs);
        setTiempoCarga(tiempoCarga);
    }

    public RelojInteligente() {
        this("Sin Marca", (float) 1, (byte) 1, "Sin correa", "Sin categoría", (byte) 1, (byte) 1);
    }

    public byte getDuracionHrs() {
        return duracionHrs;
    }

    public void setDuracionHrs(byte duracionHrs) {
        this.duracionHrs = (duracionHrs < 8 || duracionHrs > 80) ? 1 : duracionHrs;

    }

    public byte getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(byte tiempoCarga) {
        this.tiempoCarga = (tiempoCarga <= 0 || tiempoCarga > 60) ? 1 : tiempoCarga;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nReloj Inteligent: " +
                "\nHoras de duracion: " + duracionHrs +
                "\nTiempo de carga: " + tiempoCarga;
    }
}
