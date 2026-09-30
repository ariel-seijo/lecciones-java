package POO.biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private int dni;
    private ArrayList<Libro> libros;

    public Usuario(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.libros = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public void addBook(Libro libro) {
        libros.add(libro);
    }

    public void devolverLibro(Libro libroADevolver) {
        libros.removeIf(libro -> libro.getIsbn().equals(libroADevolver.getIsbn()));
    }

    public ArrayList<Libro> getLibros(){
        return new ArrayList<>(libros);
    }
}
