package POO.biblioteca;

public class Main {

    public static void main(String[] args) {

        Autor autor1 = new Autor(
                "Patrick",
                "Rothfuss"
        );

        Libro libro1 = new Libro(
                "El Nombre del Viento",
                autor1,
                "151646549684",
                2007
        );

        Libro libro2 = new Libro(
                "El Temor de Un Hombre Sabio",
                autor1,
                "1516465497894",
                2013
        );

        Libro libro3 = new Libro(
                "Las puertas de piedra",
                autor1,
                "1516465497724",
                2027
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

