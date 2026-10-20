package POO.herencia;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(String duenio, String cvu, String alias){
        super(duenio, cvu, alias);
    }

    @Override
    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo.");
        } else if (this.consultarSaldo()<monto) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        this.restarSaldo(monto);
        agregarMovimiento(TipoMovimiento.RETIRO, monto);
    }

    @Override
    public boolean transferir(double monto, Cuenta destino) {
        if (this.consultarSaldo()>=monto) {
            this.restarSaldo(monto);
            destino.depositar(monto);
            agregarMovimiento(TipoMovimiento.TRANSFERENCIA, monto);
            return true;
        }
        return false;
    }

}
