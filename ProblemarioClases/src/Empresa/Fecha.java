package Empresa;


import java.time.Year;
import java.util.Date;

public class Fecha {
    private short anio;
    private byte mes, dia;

    public Fecha() {
        setAnio((short)2005);
        setMes((byte)1);
        setDia((byte)1);
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short a) {
        anio = a;
        if (a <= 1900) {
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
        boolean biciesto = true;
        if (Year.isLeap(Long.parseLong(Short.toString(anio)))) {
            biciesto = false;
        }

        if (dia <= 0 || dia > 31) {
            dia = 1;
        } else if (mes == 2 && dia == 29 && biciesto) {
            dia = d;
        } else if (dia == 31 && mes % 2 == 0 && mes < 7) {
            dia = d;
        } else if (dia == 30 && mes % 2 == 1 && mes <= 7) {
            dia = d;
        } else if (dia == 31 && mes % 2 == 0 && mes > 7) {
            dia = d;
        } else if (dia == 30 && mes % 2 == 1 && mes >= 7) {
            dia = d;
        } else {
            dia = 1;
        }


    }

    public String toString() {
        return "\nFecha{" +
                "\nanio=" + anio +
                "\n, mes=" + mes +
                "\n, dia=" + dia +
                '}';
    }
}
