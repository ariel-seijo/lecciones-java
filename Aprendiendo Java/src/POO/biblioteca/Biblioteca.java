package POO.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public ArrayList<Libro> getLibros() {
        return new ArrayList<>(libros);
    }

    public void addBook(Libro libro) {
        libros.add(libro);
    }

    public Libro searchBook(String isbn) {
        for (Libro libro: libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        System.out.println("El ISBN no corresponde a un libro registrado.");
        return null;
    }

    public ArrayList<Libro> librosDisponibles() {
        ArrayList<Libro> disponibles = new ArrayList<Libro>();
        for (Libro libro: libros) {
            if (!libro.isPrestado()) {
                disponibles.add(libro);
            }
        }
        return disponibles;
    }

    public void prestarLibro(Libro libro) {
        if (this.libros.contains(libro)){
            libro.prestar();
        } else {
            System.out.println("El libro no pertenece a la biblioteca");
        }
    }

    public void devolverLibro(Libro libro) {
        if (this.libros.contains(libro)){
            libro.devolver();
        } else {
            System.out.println("El libro no pertenece a la biblioteca");
        }
    }

    public int getRegistrados() {
        return this.libros.size();
    }

}
