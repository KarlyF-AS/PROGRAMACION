package eje1;

public class Deportista extends Person {
    private String deporte;
    private String clube;
    private String licencia;

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getClube() {
        return clube;
    }

    public void setLicencia(String licencia) throws Exception {
        if (licencia == null || licencia.length() != 13 ||
                !licencia.substring(0, 4).matches("[0-9]{4}") ||
                !licencia.substring(4, 7).matches("[a-z]{3}") ||
                !licencia.substring(7).matches("[0-9]{6}")) {
            throw new Exception("Formato de licencia no válido. Debe ser aaaadddnnnnnn");
        }
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }
}