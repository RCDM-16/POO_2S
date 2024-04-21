package FechaPOO;

import java.time.Year;
import java.util.Date;

public class Fecha {
    short anio;
    byte mes, dia;

    public Fecha() {
        anio = 2005;
        mes = 1;
        dia = 1;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short a) {
        anio = a;
        if (a <= 0) {
            anio = 1900;
        }
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte m) {
        mes = m;
        if (mes <= 0 || mes > 12) {
            mes = 1;
        }
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte d) {
        boolean biciesto;
        dia = d;

        if (Year.isLeap(Long.parseLong(Short.toString(anio)))) {
            biciesto = true;
        } else {
            biciesto = false;
        }

        if (dia == 29 && biciesto) {
            dia = d;
        } else if (dia <= 0 || dia > 31) {
            dia = 1;
        }
    }

}
