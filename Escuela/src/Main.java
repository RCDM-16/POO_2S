import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Alumno alumno;
        char tipoAlumno = JOptionPane.showInputDialog("Seleccione el tipo alumnado al que pertenece: \na)Licenciatura\nb)Maestria\nc)Doctorado ").toLowerCase().charAt(0);

        switch (tipoAlumno) {
            case 'a':
                alumno = new Licenciatura();

                datosAlumno(alumno);
                ((Licenciatura) alumno).setCarrera(JOptionPane.showInputDialog("Ingrese la carrera a la que pertenece: "));
                ((Licenciatura) alumno).setSemestre(Byte.parseByte(JOptionPane.showInputDialog("Ingrese el semestre en el que se encuentra actualmente: ")));
                estado(alumno);
                break;

            case 'b':
                alumno = new Maestria();

                datosAlumno(alumno);
                ((Maestria) alumno).setModalidad(JOptionPane.showInputDialog("Ingrese la modalidad a la que pertenece: "));
                ((Maestria) alumno).setCreditos(Short.parseShort(JOptionPane.showInputDialog("Ingrese la cantidad de creditos actuales: ")));
                estado(alumno);
                break;

            case 'c':
                alumno = new Doctorado();

                datosAlumno(alumno);
                ((Doctorado) alumno).setTituloInvestigacion(JOptionPane.showInputDialog("Titulo de Investigacion: "));
                ((Doctorado) alumno).setPorcentajeBeca(Byte.parseByte(JOptionPane.showInputDialog("Porcentaje de Beca: ")));
                estado(alumno);
                break;

            default:
                JOptionPane.showMessageDialog(null, "No valido");
        }
    }

    public static void datosAlumno(Alumno alumno) {
        alumno.setNombre(JOptionPane.showInputDialog("Numero de control: "));
        alumno.setNoControl(JOptionPane.showInputDialog("Nombre: "));
    }

    public static void estado(Alumno alumno) {
        JOptionPane.showMessageDialog(null, alumno.toString());
        JOptionPane.showMessageDialog(null, alumno.Inscripcion());
    }
}
