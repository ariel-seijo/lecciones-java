package POO.herencia;

public class CuentaCorriente extends Cuenta {

    private double limiteDescubierto;

    public CuentaCorriente(String duenio, String cvu, String alias) {
        super(duenio, cvu, alias);
        this.limiteDescubierto = 5000.00;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo.");
        }
        if ((this.consultarSaldo() + this.limiteDescubierto) < monto) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        restarSaldo(monto);
        agregarMovimiento("retiro", monto);
    }

    @Override
    public boolean transferir(double monto, Cuenta destino) {
        if ((this.consultarSaldo() + this.limiteDescubierto) >= monto) {
            restarSaldo(monto);
            destino.depositar(monto);
            agregarMovimiento("transferencia", monto);
            return true;
        }
        return false;
    }

}
