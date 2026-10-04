package POO.herencia;

import java.util.ArrayList;

public abstract class Cuenta {

    private String duenio;
    private String cvu;
    private String alias;
    private double saldo;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(String duenio, String cvu, String alias) {
        this.duenio = duenio;
        this.cvu = cvu;
        this.alias = alias;
        this.saldo = 0;
        this.movimientos = new ArrayList<Movimiento>();
    }

    public ArrayList<Movimiento> getMovimientos() {
        return new ArrayList<>(movimientos);
    }

    protected void agregarMovimiento(String tipo, double monto) {
        movimientos.add(new Movimiento(tipo, monto));
    }

    public void depositar(double monto) {
        saldo += monto;
        agregarMovimiento("deposito", monto);
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
