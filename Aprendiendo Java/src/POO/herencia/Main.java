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
        try {
            banco.registrarCuenta(cuenta1);
        } catch (CvuDuplicadoException e) {
            System.out.println("No se pudo registrar la cuenta: " + e.getMessage());
        }
        banco.registrarCuenta(cuenta2);

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


        cuenta2.depositar(10000);
        System.out.println(cuenta1.consultarSaldo());

        try {
            cuenta2.retirar(15000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("No se pudo realizar el retiro: " + e.getMessage());
        }
        System.out.println(cuenta2.consultarSaldo());

    }

    public static void procesarRetiro(Cuenta cuenta) {
        cuenta.retirar(300);
    }

}
