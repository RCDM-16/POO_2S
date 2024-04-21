public abstract  class Empleado {
    private String id, nombre;

    public Empleado(String id, String nombre) {
        setId(id);
        setNombre(nombre);
    }

    public Empleado() {
        this("Sin CURP", "Sin nombre");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nid= " + id +
                "\nnombre= " + nombre;
    }

    public abstract double Sueldo();

}
