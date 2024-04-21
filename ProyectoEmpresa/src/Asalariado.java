public class Asalariado extends Empleado {
    private float salario;

    public Asalariado(String id, String nombre, float salario) {
        super(id, nombre);
        setSalario(salario);
    }

    public Asalariado() {
        this("Sin CURP", "Sin nombre", (float) 1);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;

        if (this.salario <= 0) {
            this.salario = 1;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                        "\nAsalariado: " +
                        "\nsalario= " + salario;
    }

    @Override
    public double Sueldo() {
        return salario;
    }
}
