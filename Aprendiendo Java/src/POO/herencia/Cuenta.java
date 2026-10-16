package POO.herencia;

import java.util.ArrayList;
import java.util.List;

public abstract class Cuenta implements Transferible {

    private String duenio;
    private String cvu;
    private String alias;
    private double saldo;
    private List<Movimiento> movimientos;

    public Cuenta(String duenio, String cvu, String alias) {
        this.duenio = duenio;
        this.cvu = cvu;
        this.alias = alias;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    @Override
    public abstract boolean transferir(double monto, Cuenta destino);

    public List<Movimiento> getMovimientos() {
        return new ArrayList<>(movimientos);
    }

    protected void agregarMovimiento(TipoMovimiento tipo, double monto) {
        movimientos.add(new Movimiento(tipo, monto));
    }

    public void depositar(double monto) {
        saldo += monto;
        agregarMovimiento(TipoMovimiento.DEPOSITO, monto);
    }

    public abstract void retirar(double monto);

    public double consultarSaldo() {
        return saldo;
    }

    protected void restarSaldo(double monto) {
        saldo -= monto;
    }

    public String getCvu() {
        return cvu;
    }

    public String getDuenio() {
        return duenio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cuenta cuenta2) {
            return this.cvu.equals(cuenta2.getCvu());
        }
        return false;
    }

    @Override
    public int hashCode(){
        return cvu.hashCode();
    }

}
