### Guía que Saúl nos compartió

* String cadena= "Soy Saul Alvarez";
* cadena.metodo();
*
* MÉTODOS:
*
*  - .length(-> Devuelve longitud String
* - .charAt() -› Devuelve carácter según posición en string
* - .compareTo() <> .equals() -> Compara dos String teniendo en cuenta gayus y minus
* - .conpareToIgnoreCase() <→> .equalsIgnoreCase() -> Compara dos String sin tener en cuenta Mayus y minus
* - .concat() -> Concatena dos o mas Strings
* - .contains() > Verifica si una cadena especifica se encuentra en un String
* - .startswith() -> Verifica si un String comienza con una cadena especifica
* - .endsWith() -› Verifica si un String ternina con una cadena especifica
* - .indexof( -> Devuelve primera coincidencia en String según cadena especifica
* - .lastIndex0f() -> Devuelve última coincidencia en String según cadena especifica
* - .replace() → Remplaza cadenas en un String
* - .toLowerCase() -> Convierte String en minúsculas
* - .toUpperCase() →> Convierte String en mayúsculas
* - .trim() -> Elimina espacios al final e inicio de un String
* - .substring() -> Extrae caracteres de un String según dos posiciones, intolo y fin.
*/

´´´

        String cadena = "Soy Saul Alvarez"; //DECLARACION NORMAL DE STRING

        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        // .LENGTH

        int largo = cadena.length(); // OBTENER LARGO DE LA CADENA :: RETORNA NUMERO ENTERO ( NÚMERO EL CUAL HACE REFERENCIA A LA LONGITUD DEL STRING )
        System.out.println("// .LENGTH = El string * "+ cadena + " * tiene " + largo +  " caracteres contando los espacios en blanco");
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
´´´


        // CHARAT()

        char letraEncontrada = cadena.charAt(5); // OBTENER EL CARACTER QUE HAY EN EL INDICE INDICADO EN LOS PARAMETROS DEL METODO
        System.out.println("// .CHARAT = En el string * " + cadena + " * la letra que se encuentra en la posición 5 es la (" + letraEncontrada+")");
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // COMPARETO() e EQUALS()

        /* 
         * ( COMPARE TO DEVUELVE 0 SI SON IGUALES O UN NUMERO DISTINO CUADNO LOS STRIGNS A COMPARAR NO SON IGUALES ) 
         * ( EQUALS DEVUELVE TRUE O FALSE DEPENDIENDO SI SON O NO IGUALES ) 
         */

        String segundaCadena = "Soy Saul DAM";
        String terceraCadena = "Saul saul alvarez";
        String cuartaCadena = "soy saul alvarez";

        int resultadoComparacion = cadena.compareTo(segundaCadena);
        int resultadoMayusculasCompareTo = cadena.compareToIgnoreCase(cuartaCadena);

        boolean resultadoComparacionEquals = cadena.equals(segundaCadena);
        boolean resultadoComparacionEqualsIgnoreCase = cadena.equalsIgnoreCase(cuartaCadena);

        System.out.println("// .COMPARETO = Si el resultado es 0, estos Strings /" + cadena+"/ y /" + segundaCadena + "/ son iguales");
        System.out.println("Resultado = " + resultadoComparacion);
        System.out.println();

        System.out.println("// .COMPARETOIGNORECASE compareToIgnoreCase no distingue entre mayusculas o minusculas, por lo tanto si son las mismas letras nos devolverá 0 = " + cadena + " comparada con compareTo con " + cuartaCadena + " es: " );
        System.out.println("Resultado = " + resultadoMayusculasCompareTo);
        System.out.println();

        System.out.println("// .EQUALS = Si el resultado es true, estos Strings /" + cadena+"/ y /" + segundaCadena + "/ son iguales");
        System.out.println("Resultado = "+ resultadoComparacionEquals);
        System.out.println();

        System.out.println("// .EQUALSIGNORECASE = Si el resultado es true, estos Strings /" + cadena+"/ y /" + cuartaCadena + "/ son iguales sin tener en cuenta las mayusculas o minusculas");
        System.out.println("Resultado = "+ resultadoComparacionEqualsIgnoreCase);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .CONCAT

        String palabra1 = "Nueva";
        String palabra2 = "York";
        String concatenacionFinal = palabra1.concat(palabra2);
        System.out.println("// .CONCAT = La concatenación de " + palabra1 + " y " + palabra2 +" es " + concatenacionFinal);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .CONTAINS

        // Verifica si una cadena de caracteres se encuentra dentro de otra ( si un string se encuentra dentro de otro )
        // Retorna true or false dependiendo si la cadena es encontrada o no

        String palabra = "Esternocleidomastoideo";
        String cadenaQueQueremosBuscar = "terno";
        boolean resultadoMetodoContains = palabra.contains(cadenaQueQueremosBuscar);
        System.out.println("// .CONTAINS = ¿Se encuentra la cadena <"+ cadenaQueQueremosBuscar + "> dentro de la palabra <"+ palabra + "> ? ");
        System.out.println("Resultado = "+ resultadoMetodoContains);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .STARTSWITH & .ENDSWITH

        // Verifica si el String comienza con una cadena de caracteres específica
        // De ser veradera esa condición, nos devolverá un true, de lo contrario false

        String palabrita = "Cojonero";
        String cadenaBuscarSiEmpieza = "Cojon";
        boolean resultadoStartsWith = palabrita.startsWith(cadenaBuscarSiEmpieza);
        System.out.println("// .STARTSWITH = ¿ Empieza la palabra " +palabrita+" con la cadena "+cadenaBuscarSiEmpieza+"?");
        System.out.println("Resultado = " + resultadoStartsWith);
        System.out.println();

        String cadenaBuscarSiAcaba = "nero";
        boolean resultadoEndsWith = palabrita.endsWith(cadenaBuscarSiAcaba);
        System.out.println("// .ENDSWITH = ¿ Acaba la palabra "+palabrita+ " con la cadena " + cadenaBuscarSiAcaba+"?");
        System.out.println("Resultado = " + resultadoEndsWith);
        System.out.println();





        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .INDEXOF

        // Encuentra el índice de la posicion de la cadena que deseamos buscar dentro del Stringç
        // RECORDAR QUE LOS INDICES EMPIEZAN POR 0 POR LO TANTO LA PRIMERA LETRA DE LA FRASE VA A ESTAR EN EL INDEX 0
        // Retorna un número entero que es la posición de la cadena dentro del string

        String frase = "El sol arde de la ostia";
        int posicionCadena = frase.indexOf("sol");
        System.out.println("// .INDEXOF = En la frase *"+frase+"* se ha buscado en que posición está la palabra luna, este es el resultado =>");
        System.out.println("Resultado en número que indica la posición de la palabra buscada en la frase es = " + posicionCadena);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .LASTINDEXOF

        // Encuentra la ÚLTIMA posición de la cadena que deseamos buscar en el string indicado
        // Retorna el número de la última posición de la cadena que deseamos buscar en el string indicado

        String segundaFrase = "El sol arde de la ostia, joder para el puto sol";
        int ultimaPosicion = segundaFrase.lastIndexOf("sol");
        System.out.println("// .LASTINDEXOF = En la frase * "+segundaFrase+" *se ha buscado el indice de la última posición en la que se encuentra la palabra sol");
        System.out.println("Resultado = "+ultimaPosicion);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .REPLACE

        // Busca una cadena dentro del String, si la encuentra la reemplaza por la cadena especificada
        // Retorna un nuevo String con la cadena reemplazada

        String frase3 = "El chico se puso se puso un calcetin de color amarillo";
        String nuevafrase3 = frase3.replace("amarillo","azul");
        System.out.println("// .REPLACE = En la frase * "+frase3+" * se va a sustituir la palabra amarillo por azul");
        System.out.println("Resultado = " + nuevafrase3);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .TOLOWERCASE y .TOUPPERCASE

        // .TOLOWERCASE Convierte el String a minúsculas
        // .TOUPPERCASE Convierte el String a mayúsculas

        String mayusculas = "LA TENGO ENORME";
        String minusculas = mayusculas.toLowerCase();
        System.out.println("// .TOLOWERCASE = Convertimos en minúsculas la frase : "+mayusculas);
        System.out.println("Resultado = " + minusculas);
        System.out.println();

        String vueltaMayusculas = minusculas.toUpperCase();
        System.out.println("// .TOUPPERCASE = Convertimos la frase anterior convertida completamente en minúsculas nuevamente a mayúsculas ( frase : "+minusculas+" )");
        System.out.println("Resultado = " + vueltaMayusculas);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .TRIM

        // Elimina espacios que pueda haber en un String tanto al principio como al final

        String frase4 = "            Estudio DAM             ";
        String trim = frase4.trim();
        System.out.println("// .TRIM = Se eliminaron los espacios en el principio y final de la frase : "+frase4);
        System.out.println("Resultado = " + trim);
        System.out.println();



        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



        // .SUBSTRING

        // Extrae caracteres de un String entre dos índices
        // Retorna la extración de un índice a otro

        String caracteresAextraer = "Te huele la boca a culo";
        String caracteresExtraidos = caracteresAextraer.substring(10, 18);
        System.out.println("// .SUBSTRING = De la frase : * "+ caracteresAextraer + " * se extrajeron caracteres desde el índice 10 al índice 18");
        System.out.println("Resultado = "+ caracteresExtraidos);

# Ejercicios de Strings en Java

```java
public class Ejercicio1 {

Ejercicio 1: Longitud de un String
Objeti: Usar el método `.length()` para contar la cantidad de caracteres de una cadena.

    public static void main(String[] args) {
        String frase = "Java es divertido";
        int longitud = frase.length(); // El método .length() devuelve la longitud de la cadena
        System.out.println("La longitud de la frase es: " + longitud); // Muestra la longitud
    }
}

Comentario: Este ejercicio muestra cómo obtener la longitud de un String. El método .length() cuenta todos los caracteres (incluyendo espacios).



Ejercicio 2: Extraer un carácter de una posición específica
Objetivo: Usar el método .charAt() para obtener un carácter en una posición determinada.

public class Ejercicio2 {
    public static void main(String[] args) {
        String texto = "Programacion en Java";
        char letra = texto.charAt(6); // El método .charAt() obtiene el carácter en la posición indicada
        System.out.println("El carácter en la posición 6 es: " + letra); // Muestra el carácter encontrado
    }
}

Comentario: Este ejercicio utiliza el método .charAt() para obtener un carácter de una posición específica dentro de un String. Recuerda que las posiciones en Java comienzan desde 0.


Ejercicio 3: Comparar dos cadenas
Objetivo: Usar los métodos .compareTo() y .equals() para comparar dos cadenas.

public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";
        String cadena2 = "hola mundo";
        
        int comparacion = cadena1.compareTo(cadena2); // .compareTo() compara dos cadenas considerando mayúsculas/minúsculas
        boolean sonIguales = cadena1.equals(cadena2); // .equals() compara cadenas exactamente, incluyendo mayúsculas/minúsculas

        System.out.println("Comparación (compareTo): " + comparacion); // Resultado de la comparación con mayúsculas/minúsculas
        System.out.println("¿Son iguales (equals)? " + sonIguales); // Muestra si las cadenas son exactamente iguales
    }
}

Comentario: El método .compareTo() compara dos cadenas lexicográficamente, es decir, le da un valor numérico (positivo, negativo o cero). El método .equals() simplemente verifica si las cadenas son exactamente iguales (incluyendo mayúsculas y minúsculas).


Ejercicio 4: Concatenar cadenas
Objetivo: Usar el método .concat() para unir varias cadenas.

public class Ejercicio4 {
    public static void main(String[] args) {
        String parte1 = "Java";
        String parte2 = " es divertido";
        String resultado = parte1.concat(parte2); // .concat() concatena dos cadenas
        System.out.println("Resultado de la concatenación: " + resultado); // Muestra la cadena concatenada
    }
}

Comentario: Este ejercicio muestra cómo usar .concat() para combinar dos cadenas en una sola. Aunque también podrías usar el operador +, .concat() es útil cuando quieres concatenar más de dos cadenas de manera más eficiente.


Ejercicio 5: Verificar si una cadena contiene otra
Objetivo: Usar el método .contains() para verificar si una cadena está dentro de otra.

public class Ejercicio5 {
    public static void main(String[] args) {
        String frase = "El sol brilla muy fuerte";
        boolean contieneSol = frase.contains("sol"); // .contains() verifica si una cadena está dentro de otra
        System.out.println("¿La frase contiene la palabra 'sol'? " + contieneSol); // Muestra el resultado
    }
}

Comentario: Este ejercicio utiliza el método .contains() para verificar si una palabra está dentro de un String. Devuelve true si la cadena se encuentra, o false en caso contrario.


Ejercicio 6: Convertir a minúsculas y mayúsculas
Objetivo: Usar los métodos .toLowerCase() y .toUpperCase() para convertir una cadena a minúsculas y mayúsculas.

public class Ejercicio6 {
    public static void main(String[] args) {
        String texto = "Java es INCREÍBLE";
        String minusculas = texto.toLowerCase(); // Convierte todo el texto a minúsculas
        String mayusculas = texto.toUpperCase(); // Convierte todo el texto a mayúsculas

        System.out.println("Texto en minúsculas: " + minusculas); // Muestra el texto en minúsculas
        System.out.println("Texto en mayúsculas: " + mayusculas); // Muestra el texto en mayúsculas
    }
}

Comentario: Los métodos .toLowerCase() y .toUpperCase() permiten convertir todo el texto de una cadena a minúsculas o mayúsculas, respectivamente. Es útil para normalizar el texto.


Ejercicio 7: Eliminar espacios en blanco
Objetivo: Usar el método .trim() para eliminar espacios al principio y al final de un String.

public class Ejercicio7 {
    public static void main(String[] args) {
        String frase = "    Hola Mundo    ";
        String resultado = frase.trim(); // .trim() elimina los espacios en blanco al principio y al final
        System.out.println("Frase sin espacios al inicio y al final: '" + resultado + "'");
    }
}

Comentario: Este ejercicio muestra cómo usar .trim() para eliminar los espacios en blanco al inicio y al final de una cadena. Es útil cuando trabajas con entradas de texto que pueden tener espacios adicionales.


Ejercicio 8: Extraer una subcadena
Objetivo: Usar el método .substring() para extraer una parte de un String.

public class Ejercicio8 {
    public static void main(String[] args) {
        String frase = "Programación en Java";
        String subcadena = frase.substring(0, 11); // .substring() extrae caracteres desde el índice 0 hasta 11 (sin incluir el 11)
        System.out.println("Subcadena extraída: " + subcadena); // Muestra la subcadena extraída
    }
}

Comentario: El método .substring() se utiliza para extraer una parte específica de un String. Se deben indicar dos índices: el índice de inicio y el índice final (sin incluir este último).