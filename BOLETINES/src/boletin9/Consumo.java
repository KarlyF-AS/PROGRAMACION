package boletin9;
class Consumo {
    // Atributos
    private double kms;
    private double litros;
    private double vMedvelocidade;
    private double pGas;

    // Constructor sin parámetros
    public Consumo() {
        this.kms = 0;
        this.litros = 0;
        this.vMedvelocidade = 0;
        this.pGas = 0;
    }

    // Constructor con parámetros
    public Consumo(double kms, double litros, double vMed, double pGas) {
        this.kms = kms;
        this.litros = litros;
        this.vMedvelocidade = vMed;
        this.pGas = pGas;
    }

    public double getTempo() {
        return kms / vMedvelocidade;
    }

    public double consumoMedio() {
        return (litros / kms) * 100;
    }

    public double consumoEuros() {
        return consumoMedio() * pGas;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setvMedvelocidade(double vMedvelocidade) {
        this.vMedvelocidade = vMedvelocidade;
    }

    public void setPGas(double pGas) {
        this.pGas = pGas;
    }

    public double getvMedvelocidade() {
        return vMedvelocidade;
    }
}
