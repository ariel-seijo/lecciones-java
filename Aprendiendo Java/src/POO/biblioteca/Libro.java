package POO.biblioteca;

public class Libro {

    String titulo;
    String autor;
    String isbn;
    int anioPublicacion;
    boolean prestado;

    public Libro(String titulo, String autor, String isbn, int anioPublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.prestado = prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro ha sido prestado correctamente.");
        } else {
            System.out.println("El libro no se encuentra disponible.");
        }
    }

    public void devolver() {
        if (prestado) {
            System.out.println("El libro se ha devuelto.");
            prestado = false;
        } else {
            System.out.println("El libro no se puede devolver porque no ha sido prestado.");
        }
    }
}