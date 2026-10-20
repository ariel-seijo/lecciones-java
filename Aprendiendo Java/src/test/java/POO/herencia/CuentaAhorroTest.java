package POO.herencia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CuentaAhorroTest {

    @Test
    void retirar_conSaldoSuficiente_actualizaSaldo(){
        Cuenta cuenta = new CuentaAhorro("Ariel", "123456", "ariel.prueba");
        cuenta.depositar(500);
        cuenta.retirar(200);
        assertEquals(300, cuenta.consultarSaldo());
    }

    @Test
    void retirar_conSaldoInsuficiente_lanzaExcepcion(){
        Cuenta cuenta = new CuentaAhorro("Ariel", "123456", "ariel.prueba");
        cuenta.depositar(500);
        assertThrows(
                SaldoInsuficienteException.class,
                () -> cuenta.retirar(700)
        );
        assertEquals(500, cuenta.getSaldo());
    }

}
