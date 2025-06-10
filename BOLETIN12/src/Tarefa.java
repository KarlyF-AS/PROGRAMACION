import java.io.Serializable;

public class Tarefa implements Serializable {
    String data, hora, nome, descricion;
    int duracion;
    boolean feita;

    public Tarefa(String data, String hora, int duracion, String nome, String descricion, boolean feita) {
        this.data = data;
        this.hora = hora;
        this.duracion = duracion;
        this.nome = nome;
        this.descricion = descricion;
        this.feita = feita;
    }

    public String toString() {
        return data + " " + hora + " (" + duracion + "min) - " + nome + " - " + descricion + " [" + (feita ? "Feita" : "Non feita") + "]";
    }
}
