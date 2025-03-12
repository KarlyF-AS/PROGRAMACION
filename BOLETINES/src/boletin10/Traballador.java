package BOLETINES.src.boletin10;
import class data
package data;

public class Traballador extendes MembroAsociacion{
    private String dataIngreso;

    public Traballador(String dni, String nome, String dataIngreso){
        super (dni, nome);
        this.dataIngreso = dataIngreso;
    }

    public String getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(String dataIngreso) {
        this.dataIngreso = dataIngreso;
    }
    public String aCadea(){
        return super.aCadea() + ", data de ingreso = " + dataIngreso,toString();
    }
}
