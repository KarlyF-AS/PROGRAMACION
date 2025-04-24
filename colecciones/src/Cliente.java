import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente implements Comparable <Cliente> {
    String dni;
    String nome;
    LocalDate dataNacemento;

    public Cliente (String dni, String nome, String dataNacemento){
        this.dni = dni;
        this.nome = nome;
        DateTimeFormatter formatoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNacemento = LocalDate.parse(dataNacemento, formatoDatas);
    }
    int edade(){
        return (int) dataNacemento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
    @Override
    public int compareTo(Cliente outro) {
       /* int res = 0;
            if (this.edade() > outro.edade())res =1;
            else if (this.edade() < outro.edade())res = -1;
            else if (this.edade() == outro.edade()) res = 0;
            return res;
        */
        return this.edade() - outro.edade();
    }
    /*public String toString (){
        return "DNI: " + dni + ",Nome: " + nome + "Data de nacemento: " + LocalDate.parse(this.dataNacemento.toString(), formatoDatas);
    }*/
}
