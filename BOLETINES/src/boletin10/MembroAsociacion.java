package BOLETINES.src.boletin10;

public class MembroAsociacion {
    private String dni;
    private String nome;

    public  MembroAsociacion (String dni, String nome){
       setDni(dni);
        this.nome = nome;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        char letraDni   [] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H'
        };
        if (dni.length() == 9) {
            int num = Integer.getInteger(dni.substring(0, 9));
            if (dni.charAt(8) == letraDni[num % 23])
                this.dni = dni;
            else dni = "00000000T";
        } else {
            dni = "00000000T";
            System.out.println("O nif é incorrecto");
        }
    }
     else{
        dni = "00000000T";
        System.out.println("O nif é incorrecto");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String aCadea(){
        return "Membro con dni: " + this.dni + ", nome = " + this.nome;
    }
}
