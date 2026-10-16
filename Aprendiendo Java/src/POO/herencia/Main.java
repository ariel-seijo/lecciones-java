package POO.herencia;

import java.util.HashSet;
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

        System.out.println(cuenta3.equals(cuenta4));
        System.out.println(cuenta3.hashCode() == cuenta4.hashCode());

        Banco banco = new Banco();

        banco.registrarCuenta(cuenta1);
        try {
            banco.registrarCuenta(cuenta1);
        } catch (CvuDuplicadoException e) {
            System.out.println("No se pudo registrar la cuenta: " + e.getMessage());
        }
        banco.registrarCuenta(cuenta4);

        cuenta1.depositar(10000);
        System.out.println(cuenta1.consultarSaldo());

        cuenta1.retirar(5000);
        System.out.println(cuenta1.consultarSaldo());


        try {
            cuenta1.retirar(6000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("No se pudo realizar el retiro: " + e.getMessage());
        }
        System.out.println(cuenta1.consultarSaldo());


        cuenta4.depositar(10000);
        System.out.println(cuenta1.consultarSaldo());

        try {
            cuenta4.retirar(15000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("No se pudo realizar el retiro: " + e.getMessage());
        }
        System.out.println(cuenta4.consultarSaldo());

        System.out.println(TipoMovimiento.RETIRO.getDescripcion());

        System.out.println(cuenta1.getMovimientos().getLast().getFechaHora());

        for (Movimiento movimiento: cuenta1.getMovimientos()) {
            System.out.println(movimiento);
        }

        Set<Cuenta> cuentas = new HashSet<>();

        cuentas.add(cuenta3);
        cuentas.add(cuenta4);

        System.out.println(cuentas.size()); 

    }

    public static void procesarRetiro(Cuenta cuenta) {
        cuenta.retirar(300);
    }

}
