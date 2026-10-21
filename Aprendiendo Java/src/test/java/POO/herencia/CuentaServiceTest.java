package POO.herencia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CuentaServiceTest {
    @Mock
    CuentaRepository repository;

    @InjectMocks
    CuentaService service;

    @Test
    void buscarCuenta_cvuExistente_devuelveCuenta() {
        Cuenta cuenta = new CuentaAhorro("arielo", "123456", "arieloide");
        when(repository.buscarPorCvu("123456"))
                .thenReturn(cuenta);
        Cuenta resultant = service.buscarCuenta("123456");
        assertSame(cuenta, resultant);
        verify(repository).buscarPorCvu("123456");
    }

    @Test
    void buscarCuenta_cvuNoExiste_devuelveNull() {
        when(repository.buscarPorCvu("123")).thenReturn(null);
        assertNull(service.buscarCuenta(("123")));
    }

}
