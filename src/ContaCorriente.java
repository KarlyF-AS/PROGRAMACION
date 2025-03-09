package src;

public class ContaCorriente {
    private double saldo;
    private String nomeTitular;
    private String numeroConta;
    private String nif;
    public static int contadorContas;

    //constructor
    public ContaCorriente(double saldo, String nomeTitular, String numeroConta, String nif) {
        setSaldo(saldo);
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        setNif(nif);
        contadorContas++;
    }

    public void setNif(String nif) {
        char letraNif[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H'
        };
        if (nif.length() == 9) {
            int num = Integer.getInteger(nif.substring(0, 9));
            if (nif.charAt(8) == letraNiF[num % 23])
                this.nif = nif;
            else nif = "00000000T";
        } else {
            nif = "00000000T";
            System.out.println("O nif é incorrecto");
        }
    }
     else{
        nif = "00000000T";
        System.out.println("O nif é incorrecto");
    }






    public void setSaldo(double saldo) {
        if (saldo > 0)
            this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacarDinero(double cantidad){
        if(cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
        } else if (saldo < cantidad){
        }else{

        }
    }
}
