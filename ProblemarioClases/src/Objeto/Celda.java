package Objeto;

public class Celda {
    private String idCelda, area;
    private byte noRetretes, noLiteras;
    private float valorMonetarioCelda, mantenimiento;
    private char tipoCelda, tipoPresos;
    private boolean vacia, enServicio;

    public Celda() {
        idCelda = "Sin numero";
        area = "Sin area asignada";
        noRetretes = 0;
        noLiteras = 0;
        valorMonetarioCelda = 0;
        mantenimiento = 0;
        tipoCelda = 'n';
        tipoPresos = 'n';
        vacia = false;
        enServicio = false;
    }


    public String getIdCelda() {
        return idCelda;
    }

    public void setIdCelda(String ic) {
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

    public float getValorMonetarioCelda() {
        return valorMonetarioCelda;
    }

    public void setValorMonetarioCelda(float vm) {
        valorMonetarioCelda = vm;
        if (vm <= 0) {
            valorMonetarioCelda = 1;
        }
    }

    public float getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(float m) {
        mantenimiento = m;
        if (m <= 0) {
            mantenimiento = 500;//Valor "promedio" que se utilizaria en el mantenimiento"
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

    public char getTipoPresos() {
        return tipoPresos;
    }

    public void setTipoPresos(char tp) {
        tipoPresos = tp;
        if (tp == 'N' || tp == 'A' || tp == 'B' || tp == 'C') {
            tipoCelda = tp;
        } else {
            tipoCelda = 'N';
        }
    }

    public boolean isVacia() {
        return vacia;
    }

    public void setVacia(boolean v) {
        vacia = v;
    }

    public boolean isEnServicio() {
        return enServicio;
    }

    public void setEnServicio(boolean es) {
        enServicio = es;
    }

    public String toString() {
        return "Id: " + idCelda +
                "\nArea: " + area +
                "\nNumero de retretes: " + noRetretes +
                "\nNumero de lineas: " + noLiteras +
                "\nValor monetario de la celda: " + valorMonetarioCelda +
                "\nPrecio del mantenimiento: " + mantenimiento +
                "\nTipo de celda: " + tipoCelda +
                "\nTipo de preso en la celda:" + tipoPresos +
                "\nEsta vacia?: " + (vacia ? "Si" : "No") +
                "\nSe encuentra en servicio?: " + (enServicio ? "Si" : "No");
    }
}
