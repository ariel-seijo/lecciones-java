package POO.biblioteca;

public class Libro {

    private String titulo;
    private Autor autor;
    private String isbn;
    private int anioPublicacion;
    private boolean prestado;

    public Libro(String titulo, Autor autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
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