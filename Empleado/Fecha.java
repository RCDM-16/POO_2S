package Empleado;

import java.time.Year;
import java.util.Date;

public class Fecha {
    private short anio;
    private byte mes, dia;

    public Fecha() {
        setAnio((short) 2005);
        setMes((byte) 1);
        setDia((byte) 1);
    }

    public Fecha(short anio, byte mes, byte dia) {
        setAnio(anio);
        setMes(mes);
        setDia(dia);
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

        boolean biciesto = Year.isLeap(Long.parseLong(Short.toString(anio)));

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                dia = (d <= 31 ? d : 1);
                break;

            case 4, 6, 9, 11:
                dia = (d <= 30 ? d : 1);
                break;

            case 2:
                dia = (biciesto && d <= 29 ? d : 1);
                break;

        }

        if (dia <= 0) {
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