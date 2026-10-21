package POO.herencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

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
    void retirar_conSaldoExacto_actualizaSaldoYMovimiento(){
        cuenta.retirar(500);
        assertEquals(0, cuenta.getSaldo());
        assertEquals(2, cuenta.getMovimientos().size());
    }

    @Test
    void retirar_despuesDeAgotarSaldo_lanzaExcepcionYNoActualizaSaldo(){
        cuenta.retirar(500);
        assertThrows(
                SaldoInsuficienteException.class,
                () -> cuenta.retirar(1)
        );
        assertAll(
                () -> assertEquals(0, cuenta.getSaldo()),
                () -> assertEquals(2, cuenta.getMovimientos().size())
        );
    }

    @ParameterizedTest
    @ValueSource(doubles = {-200, 0, -1})
    void depositar_conMontoInvalido_lanzaExcepcion(double monto){
        assertThrows(
                IllegalArgumentException.class,
                () -> cuenta.depositar(monto)
        );
        assertEquals(500, cuenta.getSaldo());
        assertEquals(1, cuenta.getMovimientos().size());
    }

    @ParameterizedTest
    @ValueSource(doubles = {-100, 0})
    void retirar_conMontoInvalido_lanzaExcepcion(double monto) {
        assertThrows(
                IllegalArgumentException.class,
                () -> cuenta.retirar(monto)
        );
        assertEquals(500, cuenta.getSaldo());
        assertEquals(1, cuenta.getMovimientos().size());
    }

    @ParameterizedTest
    @CsvSource({"100, 400", "200, 300", "300, 200"})
    void retirar_conMontoValido_actualizaSaldo(double monto, double saldoEsperado){
        cuenta.retirar(monto);
        assertEquals(saldoEsperado, cuenta.getSaldo());
        assertEquals(2, cuenta.getMovimientos().size());
    }


}
