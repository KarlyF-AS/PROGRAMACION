/**
 * Porgrama para ver la disponibilidad de habitaciones de un hotel
 *
 */
public class ExArrays3 {
    /**
     * Funcion principal
     * @param args parametros del hotel
     */
    public static void main(String[] args) {

        /**
         *
         *
         */
        String hotel [][] = new String [4][6];
        rexistraUsuario (hotel, "Pepe Gomez", 23);
        rexistraUsuario (hotel, "Amalia Sanz", 33);
        rexistraUsuario (hotel, "Ana Perez", 43);
        ocupacionHabitacions(hotel);
        deixarHabitacion(hotel, 43);

        ocupacionHabitacions(hotel);
    }
    public static boolean rexistraUsuario (String[][] h, String cliente, int habitacion) {
        int numPlantas = h.length;
        int numHabitacions = h[0].length;
        int i = (habitacion/10) - 1; //i representa a la platan one se situa a habitacion
        int j = (habitacion % 10) - 1;//j representa a habitacion dentro da planta
        if(numPlantas-1>i || numHabitacions-1>j) {
            if (h[i][j] != null) {
                System.out.println("A habitacion " + habitacion + " esta ocupada. Tentao nunha habitacion baleira");
                return false;

            } else {
                h[i][j] = cliente;
                return true;

            }
        }
        else return false;
    }
        public static void ocupacionHabitacions (String [][]h){
        for (int i = h.length-1; i >0; i--){
            System.out.println("");
            System.out.print("Pranta" +(i+1)+ ":");
            for(int j=0; j<h[i].length;j++){
                if (h[i][j]== null) System.out.print ((i+1)+""+(j+1)+": Valeira");
                else System.out.print((i+1)+""+(j+1)+":"+h [i][j]+"");
            }
        }
    }
    public static void deixarHabitacion (String [][]h, int habitacion){
        int pranta = (habitacion/10)-1;
        int hab = (habitacion%10-1);
        h [pranta][hab] = null;
    }
}