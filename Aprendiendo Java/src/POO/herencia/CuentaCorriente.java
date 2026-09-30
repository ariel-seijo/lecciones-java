package POO.herencia;

public class CuentaCorriente extends Cuenta {

    private double limiteDescubierto;

    public CuentaCorriente(String duenio, String cvu, String alias) {
        super(duenio, cvu, alias);
        this.limiteDescubierto = 500.00;
    }

    @Override
    public void retirar(double monto) {
        if ((this.consultarSaldo() + this.limiteDescubierto) >= monto) {
            restarSaldo(monto);
        }
    }

}
