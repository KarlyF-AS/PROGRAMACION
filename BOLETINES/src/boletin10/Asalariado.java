package BOLETINES.src.boletin10;

import javax.xml.crypto.Data;

public class Asalariado {
    private String cargo;
    private double soldo;
    private double ss;
    private double irpf;

    public Asalariado(String dni, String nome, Data dataIngreso, String cargo, double soldo, double ss, double irpf) {
        super(dni, nome, dataIngreso);
        this.cargo = cargo;
        setSoldo (soldo);
        SetSs (ss);
        setIrpf (irpf);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSoldo() {
        return soldo;
    }

    public void setSoldo(double soldo) {
        this.soldo = soldo;
    }

    public double getSs() {
        return ss;
    }

    public void setSs(double ss) {
        this.ss = ss;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }
}
