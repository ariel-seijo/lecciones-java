package POO.herencia;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Cuenta> cuentasPorCvu;

    public Banco() {
        this.cuentasPorCvu = new HashMap<>();
    }

    public boolean registrarCuenta(Cuenta cuenta) {
        String cvu = cuenta.getCvu();
        if (cuentasPorCvu.containsKey(cvu)) {
            return false;
        } else {
            cuentasPorCvu.put(cvu, cuenta);
            return true;
        }
    }

    public Cuenta buscarCuentaPorCvu(String cvu) {
        return cuentasPorCvu.get(cvu);
    }

    public boolean eliminarCuenta(String cvu) {
        return cuentasPorCvu.remove(cvu) != null;
    }
}


