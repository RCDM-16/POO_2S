package Empleado;

public class Nombre2 {

    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String titulo;

    public Nombre2(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String titulo) {
        setPrimerNombre(primerNombre);
        setSegundoNombre(segundoNombre);
        setApellidoPaterno(apellidoPaterno);
        setApellidoMaterno(apellidoMaterno);
        setTitulo(titulo);
    }

    public Nombre2() {
        this("Sin primer nombre", "Sin segundo nombre","Sin apellido paterno","Sin appelido materno","Sin titulo");
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        if(segundoNombre.isEmpty()){
            this.segundoNombre = "";
        } else {
            this.segundoNombre = segundoNombre;
        }

    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.isEmpty()){
            this.titulo = "";
        } else {
            this.titulo = titulo;
        }
    }

    public String toString() {
        return "Nombre2{" +
                "\nprimerNombre = '" + primerNombre + '\'' +
                "\n, segundoNombre = '" + segundoNombre + '\'' +
                "\n, apellidoPaterno = '" + apellidoPaterno + '\'' +
                "\n, apellidoMaterno = '" + apellidoMaterno + '\'' +
                "\n, titulo = '" + titulo + '\'' +
                '}';
    }
}