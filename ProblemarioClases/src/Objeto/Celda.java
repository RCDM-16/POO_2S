package Objeto;

import java.io.Serializable;

public class Celda implements Serializable {
    private int idCelda;
    private String area;
    private byte noRetretes, noLiteras;
    private char tipoCelda;

    public Celda() {
        idCelda = 0;
        area = "Sin area asignada";
        noRetretes = 0;
        noLiteras = 0;
        tipoCelda = 'n';
    }


    public int getIdCelda() {
        return idCelda;
    }

    public void setIdCelda(int ic) {
        idCelda = ic;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String a) {
        if (a.equalsIgnoreCase("interna") || a.equalsIgnoreCase("externa") || a.equalsIgnoreCase("especial") || a.equalsIgnoreCase("castigo")) {
            area = a;
        } else {
            area = "Ninguna";
        }
    }

    public byte getNoRetretes() {
        return noRetretes;
    }

    public void setNoRetretes(byte nr) {
        noRetretes = nr;
        if (nr <= 0) {
            noRetretes = 1;
        }
    }

    public byte getNoLiteras() {
        return noLiteras;
    }

    public void setNoLiteras(byte nl) {
        noLiteras = nl;
        if (nl <= 0) {
            noLiteras = 1;
        }
    }

    public char getTipoCelda() {
        return tipoCelda;
    }

    public void setTipoCelda(char tp) {
        if (tp == 'N' || tp == 'P' || tp == 'G' || tp == 'X') {
            tipoCelda = tp;
        } else {
            tipoCelda = 'N';
        }
    }


    public String toString() {
        return "Id: " + idCelda +
                "\nArea: " + area +
                "\nNumero de retretes: " + noRetretes +
                "\nNumero de lineas: " + noLiteras +
                "\nTipo de celda: " + tipoCelda;
    }
}
