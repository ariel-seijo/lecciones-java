package POO.biblioteca;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro(
                "El Nombre del Viento",
                "Patrick Rothfuss",
                "151646549684",
                2007
        );

        Libro libro2 = new Libro(
                "El Temor de Un Hombre Sabio",
                "Patrick Rothfuss",
                "1516465497894",
                2013
        );

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);

        libro1.prestar();

        for (Libro libro: libros) {
            System.out.println("Nombre del libro: " + libro.titulo);
            if (libro.prestado) {
                System.out.println("Estado del libro: prestado.");
            } else {
                System.out.println("Estado del libro: disponible.");
            }
        }
    }
}

