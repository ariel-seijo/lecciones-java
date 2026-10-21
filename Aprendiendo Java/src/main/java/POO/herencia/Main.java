package POO.herencia;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 = new CuentaAhorro(
                "Ariel",
                "566565466458",
                "arielo.mp"
        );

        Cuenta cuenta2 = new CuentaCorriente(
                "Mateo",
                "512313212312",
                "arielo.mpa"
        );

        Cuenta cuenta3 = new CuentaAhorro("Ariel", "123", "ariel");
        Cuenta cuenta4 = new CuentaAhorro("Mateo", "123", "mateo");
        Banco banco = new Banco();
        banco.registrarCuenta(cuenta4);

        cuenta1.depositar(10000);
        cuenta1.retirar(554.45);
        cuenta1.retirar(566.60);
        cuenta1.retirar(5553.23);

        OperacionCuenta imprimirSaldo = cuenta -> System.out.println(cuenta.getSaldo());
        OperacionCuenta imprimirCvu = cuenta -> System.out.println(cuenta.getCvu());
        OperacionCuenta imprimirMovimientos = cuenta -> System.out.println(cuenta.getMovimientos());

        List<Movimiento> retiros = cuenta1.getMovimientos().stream()
                .filter(m -> m.getTipo() == TipoMovimiento.RETIRO)
                .sorted(Comparator.comparing(Movimiento::getMonto).reversed())
                .limit(3)
                .toList();

        System.out.println(retiros);

        ConexionDB db = new ConexionDB();

        try (Connection conexion = db.conectar()) {
            System.out.println("¡Conexión exitosa!");
            System.out.println("¿Está abierta? " + !conexion.isClosed());
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos.");
            e.printStackTrace();
        }
    }

    public static void procesarRetiro(Cuenta cuenta) {
        cuenta.retirar(300);
    }

    public static void ejecutarOperacion(
            Cuenta cuenta,
            OperacionCuenta operacion) {
        operacion.operar(cuenta);
    }


}
