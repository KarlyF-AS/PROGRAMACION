import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TratamentoDeClientes {
    public static void main (String args[]){
        Collection<Cliente> coleccionCliente;
        coleccionCliente = new ArrayList<>();
        coleccionCliente.add(new Cliente("35678Y","Pepe", "12/09/2001"));
        coleccionCliente.add(new Cliente("44444Z","Ana", "11/03/2011"));
        coleccionCliente.add(new Cliente("55655R","Mari", "22/05/1991"));
        Cliente unCliente = new Cliente("77777Z","Oscar", "02/01/1991");
        coleccionCliente.add(unCliente);
        coleccionCliente.remove(unCliente);
        System.out.println(coleccionCliente.size());
        coleccionCliente.clear();
        System.out.println(coleccionCliente.size());
        System.out.println(coleccionCliente.isEmpty());
        System.out.println(coleccionCliente.contains(unCliente));
        Object [] clientes = coleccionCliente.toArray();
        Iterator<Cliente> indice = coleccionCliente.iterator();
        for ( ;indice.hasNext();){
            System.out.println(indice.next());
        }
        for(Cliente cli : coleccionCliente){
            System.out.println(cli);
        }
    }
}
/*
Calcualr la media de edad de clientes
 */