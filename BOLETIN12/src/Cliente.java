import java.io.Serializable;

public class Cliente implements Serializable {
    int id;
    String nome;
    String telefono;

    public Cliente(int id, String nome, String telefono) {
        this.id = id;
        this.nome = nome;
        this.telefono = telefono;
    }

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Teléfono: " + telefono;
    }
}
