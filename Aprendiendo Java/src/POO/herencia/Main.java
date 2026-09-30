package POO.herencia;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 = new CuentaAhorro(
                "Ariel",
                "566565466458",
                "arielo.mp"
        );

        Cuenta cuenta2 = new CuentaCorriente(
                "Ariel",
                "512313212312",
                "arielo.mpa"
        );

        procesarRetiro(cuenta1);
        procesarRetiro(cuenta2);

    }

    public static void procesarRetiro(Cuenta cuenta) {
        cuenta.retirar(300);
    }

}
