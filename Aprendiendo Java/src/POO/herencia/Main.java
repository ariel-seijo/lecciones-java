package POO.herencia;

public class Main {

    public static void main(String[] args) {
        Cuenta cuentaa1 = new CuentaAhorro(
                "Ariel",
                "566565466458",
                "arielo.mp"
        );

        Cuenta cuentac1 = new CuentaCorriente(
                "Ariel",
                "566565466458",
                "arielo.mp"
        );

        System.out.println(cuentaa1.consultarSaldo());
        cuentaa1.depositar(100);
        System.out.println(cuentaa1.consultarSaldo());
        cuentaa1.retirar(300);
        System.out.println(cuentaa1.consultarSaldo());

        System.out.println(cuentac1.consultarSaldo());
        cuentac1.depositar(100);
        System.out.println(cuentac1.consultarSaldo());
        cuentac1.retirar(300);
        System.out.println(cuentac1.consultarSaldo());


    }

}
