/*

public class Arrays {
    public static void main(String[] args) {
        // Definir el horario utilizando un array bidimensional
        String[][] horario = {
                // Lunes
                {
                        "BD - Bases de datos", "BD - Bases de datos", "BD - Bases de datos", "BD - Bases de datos",
                        "PROG - Programación", "PROG - Programación", "PROG - Programación"
                },
                // Martes
                {
                        "BD - Bases de datos", "BD - Bases de datos", "BD - Bases de datos", "SI - Sistemas Informáticos",
                        "SI - Sistemas Informáticos", "SASP - Sustentabilidad", "IPE - Itinerario Personal"
                },
                // Miércoles
                {
                        "PROG - Programación", "PROG - Programación", "PROG - Programación", "LMSXI - Lenguajes de marcas",
                        "LMSXI - Lenguajes de marcas", "COD - Contornos de desarrollo", "COD - Contornos de desarrollo"
                },
                // Jueves
                {
                        "ING - Inglés profesional", "ING - Inglés profesional", "SI - Sistemas Informáticos",
                        "SI - Sistemas Informáticos", "PROG - Programación", "PROG - Programación", "PROG - Programación"
                },
                // Viernes
                {
                        "COD - Contornos de desarrollo", "LMSXI - Lenguajes de marcas", "LMSXI - Lenguajes de marcas",
                        "SI - Sistemas Informáticos", "SI - Sistemas Informáticos", "IPE - Itinerario Personal", "IPE - Itinerario Personal"
                }
        };

        // Arreglo de días para referencias
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        // Solicitar la asignatura al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué asignatura deseas contar las horas (por ejemplo, BD, PROG, SI)?");
        String asignatura = scanner.nextLine();

        // Variable para contar las horas
        int horas = 0;

        // Recorrer los días
        for (int i = 0; i < dias.length; i++) {
            // Recorrer las horas de cada día
            for (int j = 0; j < horario[i].length; j++) {
                // Si la asignatura está en el horario, contar una hora
                if (horario[i][j].contains(asignatura)) {
                    horas++;
                }
            }
        }/

        // Mostrar el resultado
        System.out.println("La asignatura " + asignatura + " tiene " + horas + " horas a la semana.");

        scanner.close();

}


public static int horasModulo (String horario[][], String modulo) {
        int cantHoras =0;
}
        for (int dia=0; dia<5; dia++){
        for(int hora=0; hora<=8; hora++){

                if(modulo.equals(horario[hora][dia])){
                    cantHoras++;
                }

            }/*
        }
            return cantHoras;


}

 */