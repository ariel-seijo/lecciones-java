package POO.herencia;

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

        Banco banco = new Banco();

        banco.registrarCuenta(cuenta1);
        banco.registrarCuenta(cuenta1);
        banco.registrarCuenta(cuenta2);
        System.out.println(banco.buscarCuentaPorCvu(cuenta1.getCvu()));
        System.out.println(banco.eliminarCuenta(cuenta2.getCvu()));
        System.out.println(banco.buscarCuentaPorCvu(cuenta2.getCvu()));

    }

    public static void procesarRetiro(Cuenta cuenta) {
        cuenta.retirar(300);
    }

}
