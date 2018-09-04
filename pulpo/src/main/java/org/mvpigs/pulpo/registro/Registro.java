package org.mvpigs.pulpo.registro;

import java.util.List;

public class Registro {

    private List<String> eventos;
    private Boolean pulpo;

    public String contieneEvento(String evento, List<String> eventos) {
        for (int i = 0; i < eventos.size(); i++) {
            if (eventos.get(i) == evento) {
                return evento + "está en la lista de eventos";
            }
        }
        return null;
    }

    public void mostrarRegistro() {

    }

}
