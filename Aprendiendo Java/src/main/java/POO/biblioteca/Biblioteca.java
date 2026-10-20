package POO.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
        this.usuarios = new ArrayList<Usuario>();
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

    public void prestarLibro(Libro libro, Usuario usuario){
        if (this.isLibroRegistrado(libro) && this.isUsuarioRegistrado(usuario)){
            if (libro.prestar()){
                usuario.addBook(libro);
            }
        }
    }

    public void devolverLibro(Libro libro, Usuario usuario) {
        if (this.isLibroRegistrado(libro) && libro.isPrestado()) {
            for (Libro book: usuario.getLibros()) {
               if (book.getIsbn().equals(libro.getIsbn())){
                   usuario.devolverLibro(libro);
                   libro.devolver();
               }
               break;
            }
        }
    }

    public boolean isUsuarioRegistrado(Usuario user) {
        for (Usuario usuario: usuarios) {
            if (usuario.getDni() == user.getDni()){
                return true;
            };
        }
        return false;
    }

    public boolean isLibroRegistrado(Libro libro) {
        for (Libro book: libros) {
            if (book.getIsbn().equals(libro.getIsbn())){
                return true;
            };
        }
        return false;
    }

    public int getLibrosRegistrados() {
        return this.libros.size();
    }

    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        System.out.println("Se agregó al usuario " + usuario.getNombre());
    }

    public ArrayList<Usuario> getUsuariosRegistrados(){
        return new ArrayList<>(usuarios);
    }

    public Usuario searchUser(int dni) {
        for (Usuario usuario: usuarios){
            if (usuario.getDni() == dni) {
                return usuario;
            }
        }
        System.out.println("El usuario no se encuentra registrado.");
        return null;
    }
}
