package POO.herencia;

import java.time.LocalDateTime;

public class Movimiento {

    private LocalDateTime fechaHora;
    private TipoMovimiento tipo;
    private double monto;

    public Movimiento(TipoMovimiento tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
        this.fechaHora = LocalDateTime.now();
    }

    public TipoMovimiento getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    @Override
    public String toString() {
        return "Tipo: " + getTipo().getDescripcion() + ", Monto: " + monto + ", Fecha: " + fechaHora;
    }
}



