package POO.herencia;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(String duenio, String cvu, String alias){
        super(duenio, cvu, alias);
    }

    @Override
    public void retirar(double monto) {
        if (this.consultarSaldo()>=monto) {
            this.restarSaldo(monto);
            agregarMovimiento("retiro", monto);
        }
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
