package Empresa;

import java.util.Calendar;

public class Direccion {
        private String calle;
        private String codigoPostal;
        private String colonia;
        private String ciudad;
        private String pais;
        private String municipio;
        private float noExterior;
        private String noInterior;


        public String getCalle() {
            return calle;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public String getCodigoPostal() {
            return codigoPostal;
        }

        public void setCodigoPostal(String codigoPostal) {
            this.codigoPostal = codigoPostal;
        }

        public String getColonia() {
            return colonia;
        }

        public void setColonia(String colonia) {
            this.colonia = colonia;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public String getMunicipio() {
            return municipio;
        }

        public void setMunicipio(String municipio) {
            this.municipio = municipio;
        }

        public float getNoExterior() {
            return noExterior;
        }

        public void setNoExterior(float noExterior) {
            this.noExterior = noExterior;
        }

        public String getNoInterior() {
            return noInterior;
        }

        public void setNoInterior(String noInterior) {
            this.noInterior = noInterior;
        }

        public Direccion(String calle, String codigoPostal, String colonia, String ciudad, String pais, String municipio, float noExterior, String noInterior) {
            setCalle(calle);
            setCodigoPostal(codigoPostal);
            setColonia(colonia);
            setPais(pais);
            setMunicipio(municipio);
            setNoExterior(noExterior);
            setNoInterior(noInterior);
        }

        public Direccion() {
            this ("sin calle","sin codigo postal","sin colonia","sin ciudad","sin pais","sin municipio", (float) 0, "");
        }

        @Override
        public String toString() {
            return "Direccion{" +
                    "\ncalle='" + calle + '\'' +
                    "\n, codigoPostal='" + codigoPostal + '\'' +
                    "\n, colonia='" + colonia + '\'' +
                    "\n, ciudad='" + ciudad + '\'' +
                    "\n, pais='" + pais + '\'' +
                    "\n, municipio='" + municipio + '\'' +
                    "\n, noExterior=" + noExterior +
                    "\n, noInterior=" + noInterior +
                    '}';
        }
    }

