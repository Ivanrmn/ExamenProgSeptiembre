package org.mvpigs.pulpo.diario;

import org.mvpigs.pulpo.registro.Registro;

import java.util.ArrayList;
import java.util.List;

public class Diario {

    private List<Registro> registros;

    public void incluirRegistro(Registro registro) {

        registros = new ArrayList<>();

        registros.add(registro);
    }

    public List<Registro> mostrarDiario() {
        return registros;
    }
}
