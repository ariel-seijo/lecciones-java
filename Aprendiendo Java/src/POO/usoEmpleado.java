package POO;
import POO.Empleado;

public class usoEmpleado {
    public static void main(String[] args) {
        Empleado [] misEmpleados = new Empleado[3];

        misEmpleados[0] = new Empleado("Jorge", "Varela", 21, 1800000.50);
        misEmpleados[1] = new Empleado("Ariel", "Seijovich", 23, 1900000.30);
        misEmpleados[2] = new Empleado("Pedrito", "Estevanez", 28, 1400000.50);

/*        System.out.println("Nombre: " + misEmpleados[0].getNombre() +
                "\nApellido: " + misEmpleados[0].getApellido() +
                "\nEdad: " + misEmpleados[0].getEdad() +
                "\nSalario: " + misEmpleados[0].getSalario());*/

        for (Empleado empleado: misEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre() +
                    "\nApellido: " + empleado.getApellido() +
                    "\nEdad: " + empleado.getEdad() +
                    "\nSalario: " + empleado.getSalario());
        }
    }
}
