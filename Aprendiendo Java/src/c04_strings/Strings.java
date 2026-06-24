package c04_strings;

public class Strings {
    public static void main(String[] args) {


        // Cadenas de texto

        // Declaracion

        String name = "Ariel";
        var surname = new String("Seijo");

        System.out.println(name);
        System.out.println(surname);

        // Operaciones basicas
        // Concatenacion

        System.out.println(name + surname); // ArielSeijo
        System.out.println(name + " " + surname); // Ariel Seijo

        //Longitud

        System.out.println(name.length()); // 5

        // Obtener caracter
        System.out.println(name.charAt(2)); // i

        // Obtener primer y ultimo caracter
        System.out.println(name.charAt(0)); // A
        System.out.println(name.charAt(name.length()-1)); // l

        // Obtener porcion de texto (substring)

        System.out.println(name.substring(1)); // riel

        // Obtener porcion de texto inicio y final

        System.out.println(name.substring(1, 3)); // ri

        // Mayusculas y minusculas

        System.out.println(name.toUpperCase()); // ARIEL
        System.out.println(name.toLowerCase()); // ariel

        // Comprobar contenido

        System.out.println(name.contains("riel")); // true
        System.out.println(name.contains("Riel")); // false
        System.out.println(name.toUpperCase().contains("RIEL")); //true

        // Comparacion

        var name2 = "Ariel";
        String name3 = "Ariel";
        var name4 = new String("Ariel");

        System.out.println(name2.equals("Ariel")); // true
        System.out.println(name2.equals("ariel")); // false
        System.out.println(name2.equalsIgnoreCase("ariel")); // true
        System.out.println(name3.equals("Ariel")); // true
        System.out.println(name4.equals("Ariel")); // true

        // == vs equals -> no es lo mismo String y var = "" que new String

        System.out.println(name2 == "Ariel"); // true
        System.out.println(name2 == name3); // false
        System.out.println(name2 == name4); // false
        System.out.println(name3 == name4); // true

        // Trim -> borra espacios al principio y al final

        System.out.println(" Hola, qué tal? ".trim()); // "Hola, qué tal?"

        // Replace

        System.out.println(" Hola, qué tal? ".replace(" ", "")); //Hola,quétal?

        // Format

        String nombre = "Ariel";
        String ubicacion = "New York";
        int edad = 23;
        System.out.println(String.format("Me llamo %s y vivo en %s,tengo %d años", nombre, ubicacion, edad));
        // Me llamo Ariel y vivo en New York,tengo 23 años

    }
}
