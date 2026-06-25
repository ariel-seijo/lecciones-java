package c06_estructuras;

public class Arrays {

    public static void main(String[] args) {

        // DECLARACION CON TAMAÑO FIJO

        String[] apellidos = new String[3];
        int[] titulos = new int[3];

        // DECLARACION CON VALORES

        String[] nombres = new String[]{"Naruto", "Sasuke", "Sakura"};
        int[] edades = new int[]{15, 16, 16};

//         EN JAVA +10

        var apellidos2 = new String[3];
        var titulos2 = new int[3];
        var nombres2 = new String[]{"Naruto", "Sasuke", "Sakura"};
        var edades2 = new int[]{15, 16, 17};

//         ACCEDER A UN VALOR

        System.out.println(apellidos[0]); // null para arrays vacios
        System.out.println(titulos[0]); // 0 para ints por defecto

        System.out.println(nombres[1]); //Sasuke
        System.out.println(edades[1]); //16

//         MODIFICACION VALOR

        nombres[1] = "Kimimaro";
        System.out.println(nombres[1]); // Sasuke -> Kimimaro

    }
}
