package POO.herencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CuentaAhorroTest {

    CuentaAhorro cuenta;

    @BeforeEach
    void prepararCuenta() {
        cuenta = new CuentaAhorro("ariel", "123456", "arieloide");
        cuenta.depositar(500);
    }

    @Test
    void retirar_conSaldoSuficiente_actualizaSaldo(){
        cuenta.retirar(200);
        assertEquals(300, cuenta.consultarSaldo());
    }

    @Test
    void retirar_conSaldoInsuficiente_lanzaExcepcion(){
        assertThrows(
                SaldoInsuficienteException.class,
                () -> cuenta.retirar(700)
        );
        assertEquals(500, cuenta.getSaldo());
    }

    @Test
    void depositar_conMontoNegativo_lanzaExcepcion(){
        assertThrows(
                IllegalArgumentException.class,
                () -> cuenta.depositar(-200)
        );
        assertEquals(1, cuenta.getMovimientos().size());
    }

}
