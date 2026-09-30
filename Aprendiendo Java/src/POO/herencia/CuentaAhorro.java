package POO.herencia;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(String duenio, String cvu, String alias){
        super(duenio, cvu, alias);
    }

    @Override
    public void retirar(double monto) {
        if (this.consultarSaldo()>=monto) {
            this.restarSaldo(monto);
        }
    }
}
