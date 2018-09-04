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

    public List<String> mostrarRegistro() throws Exception {
        try {
            if (!eventos.isEmpty()) {
                return eventos;
            }
        } catch (Exception e) {
            throw new Exception("No hay eventos en el registro");
        }

        System.out.println("Registro: " + eventos);
        System.out.println("Pulpo: " + cambiarBoolean());
        return null;
    }

    public String cambiarBoolean() {
        if (pulpo == true) {
            pulpo = Boolean.valueOf("Sí");
        } else {
            pulpo = Boolean.valueOf("No");
        }
        return String.valueOf(pulpo);
    }

}
