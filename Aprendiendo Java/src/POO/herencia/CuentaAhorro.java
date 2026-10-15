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
        agregarMovimiento("retiro", monto);
    }

    @Override
    public boolean transferir(double monto, Cuenta destino) {
        if (this.consultarSaldo()>=monto) {
            this.restarSaldo(monto);
            destino.depositar(monto);
            agregarMovimiento("transferencia", monto);
            return true;
        }
        return false;
    }

}
