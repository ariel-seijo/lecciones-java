package POO.biblioteca;
import java.util.ArrayList;

public class Autor {

    private String nombre;
    private String apellido;
    private ArrayList<Libro> libros;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.libros = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Libro> getLibros() {
        return new ArrayList<>(libros);
    }

    public void addBook(Libro libro) {
        this.libros.add(libro);
        System.out.println("Se ha añadido el libro: " + libro.getTitulo());
    }

}
