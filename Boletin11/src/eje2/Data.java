package eje2;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Método para comprobar si un año es bisiesto
    private boolean esBisiesto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Método para validar la fecha completa
    public void setData(int dia, int mes, int ano) throws FormatoDataErroneo {
        // Validar año (1970-2999)
        if (ano < 1970 || ano > 2999) {
            throw new FormatoDataErroneo("Ano non válido. Debe estar entre 1970 e 2999.");
        }

        // Validar mes (1-12)
        if (mes < 1 || mes > 12) {
            throw new FormatoDataErroneo("Mes non válido. Debe estar entre 1 e 12.");
        }

        // Validar día según mes y año
        int maxDias;
        switch (mes) {
            case 2: // Febrero
                maxDias = esBisiesto(ano) ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11: // Abril, Junio, Septiembre, Noviembre
                maxDias = 30;
                break;
            default: // Resto de meses
                maxDias = 31;
        }

        if (dia < 1 || dia > maxDias) {
            throw new FormatoDataErroneo("Dia non válido. Para o mes " + mes + ", o día debe estar entre 1 e " + maxDias + ".");
        }

        // Si todo es correcto, asignar valores
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Getters (opcionales)
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}