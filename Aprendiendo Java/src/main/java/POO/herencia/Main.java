package POO.herencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

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
        String sql = "SELECT titular, cvu, saldo FROM dbo.cuentas";

        try (
                Connection conexion = db.conectar();
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                ResultSet resultado = sentencia.executeQuery()
        ) {

            while (resultado.next()) {
                System.out.println(resultado.getString("titular"));
                System.out.println(resultado.getString("cvu"));
                System.out.println(resultado.getBigDecimal("saldo"));
            }

        } catch (SQLException e) {
            System.out.println("Ocurrió un error al consultar la base de datos.");
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
