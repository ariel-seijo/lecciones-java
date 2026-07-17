package POO;

public class Empleado {

    public Empleado(String nom, String ape, int eda, double sal) {
        nombre = nom;
        apellido = ape;
        edad = eda;
        salario = sal;
    }

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public void setNombre(String nom) {
        this.nombre = nom;
    };

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    };

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int eda) {
        this.edad = eda;
    };

    public int getEdad() {
        return edad;
    }

    public void setSalario(double sal) {
        this.salario = sal;
    };

    public double getSalario(){
        return salario;
    }

}
