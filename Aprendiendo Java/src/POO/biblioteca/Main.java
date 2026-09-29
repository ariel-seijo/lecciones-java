package POO.biblioteca;

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

        Libro libro3 = new Libro(
                "Las puertas de piedra",
                "Patrick Rothfuss",
                "1516465497724",
                2027
        );

        Autor autor1 = new Autor(
                "Patrick",
                "Rothfuss"
        );

        autor1.addBook(libro1);
        autor1.addBook(libro2);
        autor1.addBook(libro3);

        for (Libro libro: autor1.getLibros()) {
            System.out.println(libro.getTitulo());
        }

        libro1.prestar();
        System.out.println(libro1.isPrestado());
        libro1.prestar();

    }
}

