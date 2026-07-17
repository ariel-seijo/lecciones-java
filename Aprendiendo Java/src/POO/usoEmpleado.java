package POO;
import POO.Empleado;

public class usoEmpleado {
    public static void main(String[] args) {
        Empleado jorge = new Empleado("Jorge", "Varela", 23, 1800.50);
        System.out.println(jorge.getNombre());
        System.out.println(jorge.getApellido());
        System.out.println(jorge.getEdad());
        System.out.println(jorge.getSalario());
    }
}
