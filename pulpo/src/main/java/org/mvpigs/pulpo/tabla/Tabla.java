package org.mvpigs.pulpo.tabla;

import org.mvpigs.pulpo.diario.Diario;
import org.mvpigs.pulpo.registro.Registro;

import java.util.List;

public class Tabla {

    private List<Long> matrizEventos;

    public void tablaPara(Registro evento, Diario diario) throws Exception {
        for(int i = 0; i<diario.mostrarDiario().size(); i++ ) {

            if (evento == null && evento.prueba() == null ) {
                matrizEventos.set(0, Long.valueOf(i++));

            } else if (evento != null && evento.prueba() == null) {
                matrizEventos.set(1, Long.valueOf(i++));

            } else if (evento == null && evento.prueba() != null) {
                matrizEventos.set(2, Long.valueOf(i++));

            } else {
                matrizEventos.set(3, Long.valueOf(i++));
            }
        }
    }

    public List<Long> muestraTabla() {
        return matrizEventos;
    }
}
