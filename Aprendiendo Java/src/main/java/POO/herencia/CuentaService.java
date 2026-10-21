package POO.herencia;

public class CuentaService {

    private final CuentaRepository repository;

    public CuentaService(CuentaRepository repository) {
        this.repository = repository;
    }

    public Cuenta buscarCuenta(String cvu) {
        return repository.buscarPorCvu(cvu);
    }
}