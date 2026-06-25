package c06_estructuras;

import java.sql.Array;
import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {

        // DECLARACION Y CREACION

        ArrayList<String> nombres = new ArrayList<>();
        var edades = new ArrayList<Integer>();

        // TAMAÑO

        System.out.println(nombres.size()); // 0

        // AÑADIR ELEMENTOS (AL FINAL)

        nombres.add("Naruto");
        nombres.add("Sasuke");
        nombres.add("Sakura");

        System.out.println(nombres);

        // ACCEDER A ELEMENTO

        System.out.println(nombres.get(1));
        System.out.println(nombres.getLast());
        System.out.println(nombres.getFirst());

        // MODIFICAR

        nombres.set(1, "Kimimaro");
        System.out.println(nombres.get(1));

        // ELIMINAR

        nombres.remove(1); // borra kimimaro
//        nombres.removeLast();
//        nombres.removeFirst();

        // BUSCAR ELEMENTO

        System.out.println(nombres.contains("Kimimaro"));
        System.out.println(nombres.contains("Naruto"));

        // LIMPIAR ARRAYLIST

        nombres.clear();
        System.out.println(nombres);
    }
}
