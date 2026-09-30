package POO.herencia;

public abstract class Cuenta {

    private String duenio;
    private String cvu;
    private String alias;
    private double saldo;

    public Cuenta(String duenio, String cvu, String alias) {
        this.duenio = duenio;
        this.cvu = cvu;
        this.alias = alias;
        this.saldo = 0;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public abstract void retirar(double monto);

    public double consultarSaldo() {
        return saldo;
    }

    protected void restarSaldo(double monto) {
        saldo -= monto;
    }

    public boolean transferir(Cuenta cuentaDestino) {
        return true;
    }
}
