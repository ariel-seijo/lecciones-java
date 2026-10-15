package POO.herencia;

public class Movimiento {

    private TipoMovimiento tipo;
    private double monto;

    public Movimiento(TipoMovimiento tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    public TipoMovimiento getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }
}
