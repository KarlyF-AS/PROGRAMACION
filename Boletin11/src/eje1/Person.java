package eje1;

public class Person {
    private String name;
    private String direction;
    private String dni;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDni(String dni) throws DniNonValido {
        if (dni == null || !dni.matches("^[0-9]{8}[A-Za-z]$")) {
            throw new DniNonValido("DNI no válido. Debe tener 8 números y una letra.");
        }
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
}