package c06_estructuras;

import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {
        // DECLARACION Y CREACION

        HashSet<String> nombres = new HashSet<>();
        var nombres2 = new HashSet<String>();

        // TAMAÑO

        System.out.println("tamaño " + nombres.size());

        // AÑADIR ELEMENTOS (DESORDENADO Y SIN DUPLICADOS)

        nombres.add("Naruto");
        nombres.add("Sakura");
        nombres.add("Sasuke");

        System.out.println("tamaño " + nombres.size());
        System.out.println(nombres);

        // ACCEDER A ELEMENTO

//        System.out.println(nombres.get(1)); // Error

        // ELIMINAR

        nombres.remove("Sasuke");

        // BUSCAR ELEMENTO

        System.out.println(nombres.contains("Naruto"));

        // LIMPIAR ARRAYLIST

        nombres.clear();

    }
}
