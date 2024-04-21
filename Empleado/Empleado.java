package Empleado;

public class Empleado {

    Nombre2 nombre2;
    Direccion direccion;
    Fecha fecha;

    public Empleado() {

    }


    public Nombre2 getNombre() {
        return nombre2;
    }

    public void setNombre(Nombre2 nombre) {
        this.nombre2 = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Empleado(Nombre2 nombre, Direccion direccion, Fecha fecha) {
        setNombre(nombre);
        setDireccion(direccion);
        setFecha(fecha);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "\nnombre2=" + nombre2 +
                "\n, direccion=" + direccion +
                "\n, fecha=" + fecha +
                '}';
    }
}