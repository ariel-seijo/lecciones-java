package POO.herencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(doubles = {-200, 0})
    void depositar_conMontoInvalido_lanzaExcepcion(double monto){
        assertThrows(
                IllegalArgumentException.class,
                () -> cuenta.depositar(monto)
        );
        assertEquals(500, cuenta.getSaldo());
        assertEquals(1, cuenta.getMovimientos().size());
    }

}
