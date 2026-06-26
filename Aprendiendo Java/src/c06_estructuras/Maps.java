package c06_estructuras;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // DECLARACION

        HashMap<String, String> usuarios = new HashMap<>();
        var users = new HashMap<String, String>();

        // AGREGAR ELEMENTO

        usuarios.put("Arielo", "arielo@gmail.com");
        usuarios.put("Arieloide", "arielo2@gmail.com");
        users.put("Arielo", "arielo@gmail.com");

        System.out.println(usuarios);
        System.out.println(users);

        // AGREGAR SI NO EXISTE

        usuarios.putIfAbsent("Arielovich", "arielovich.com");

        // TAMAÑO

        System.out.println(usuarios.size());

        // VERIFICAR ELEMENTO

        System.out.println(usuarios.containsKey("Arielo")); // true
        System.out.println(usuarios.containsKey("Arielo")); // false

        // ELIMINAR ELEMENTO

        usuarios.remove("Arielo");
        System.out.println(usuarios);

        // REEMPLAZAR ELEMENTO

        usuarios.replace("Arieloide", "arieloideide@gmai.com");
        System.out.println(usuarios);

    }

}
