import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Laptop[] laptops = new Laptop[15];

        for (int i = 0; i < laptops.length; ++i) {
            laptops[i] = new Laptop();
            laptops[i].procesador = JOptionPane.showInputDialog("Nueva laptop:\nProcesador: ");
            laptops[i].resolucion = JOptionPane.showInputDialog("Resolucion: ");
            laptops[i].marca = JOptionPane.showInputDialog("Marca: ");
            laptops[i].teclado = JOptionPane.showInputDialog("Teclado: ");
            laptops[i].almacenamieto = Float.parseFloat(JOptionPane.showInputDialog("Almacenamiento: "));
        }

        for (int i = 0; i <= 15; ++i) {
            JOptionPane.showMessageDialog(null, "\nProcesador: " + laptops[i].procesador +
                    "\nResolucion: " + laptops[i].resolucion +
                    "\nMarca: " + laptops[i].marca +
                    "\nTeclado: " + laptops[i].teclado +
                    "\nAlmacenamiento: " + laptops[i].almacenamieto);
        }
    }
}