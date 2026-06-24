package c04_strings;

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.

        System.out.println("Hola" + " Mundo");

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println("Hola".length());

        // 3. Muestra el primer y último carácter de un string.

        System.out.println("Primero: " + "Hola".charAt(0) + "\nUltimo: " + "Hola".charAt("Hola".length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.

        System.out.println("Hola".toUpperCase());
        System.out.println("Hola".toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        System.out.println("Qué onda, papu?".contains("Qué"));

        // 6. Formatea un string con un entero.
        System.out.println(String.format("Tengo más de %d años", 10));

        // 7. Elimina los espacios en blanco al principio y final de un string.

        System.out.println(" Qué onda, papu? ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(" Qué onda, papu? ".replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.

        String a = "hola";
        String b = "hola";

        System.out.println(a.equals(b));

        // 10. Comprueba si dos strings tienen la misma longitud.

        String c = "holaaa";

        System.out.println(a.length() == c.length());
        System.out.println(a.length() == b.length());

    }
}