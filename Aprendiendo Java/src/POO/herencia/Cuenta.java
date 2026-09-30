package POO.herencia;

public class Cuenta {

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

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        }
    }

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
