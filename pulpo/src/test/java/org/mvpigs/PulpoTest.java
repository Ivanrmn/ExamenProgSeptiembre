package org.mvpigs;

import org.junit.Assert;
import org.junit.Test;
import org.mvpigs.pulpo.correlacion.Correlacion;
import org.mvpigs.pulpo.diario.Diario;
import org.mvpigs.pulpo.registro.Registro;
import org.mvpigs.pulpo.tabla.Tabla;

import java.util.ArrayList;
import java.util.List;

public class PulpoTest {

    private Registro registro;
    private Diario diario;
    private Correlacion correlacion;
    private Tabla tabla;

    public List<String> createEventos() {
        List<String> eventos = new ArrayList<>();
        eventos.add("trabajar");
        eventos.add("tocar un árbol");
        eventos.add("hamburguesa");
        eventos.add("correr");
        eventos.add("twitter");

        return eventos;
    }

    public List<String> createDiario() {
        List<String> registros = new ArrayList<>();

        registros.add("finde");
        registros.add("bicicleta");
        registros.add("descansar");
        registros.add("cacahuetes");
        registros.add("cerveza");

        return registros;
    }

    @Test
    public void testRegistro() {
        Assert.assertEquals(createEventos().get(0), "trabajar");
        Assert.assertEquals(createEventos().get(1), "tocar un árbol");
        Assert.assertEquals(createEventos().get(2), "hamburguesa");
        Assert.assertEquals(createEventos().get(3), "correr");
        Assert.assertEquals(createEventos().get(4), "twitter");
        Assert.assertEquals(createEventos().size(), 5);

        Assert.assertNotEquals(createEventos(), "pulpo");

    }

    @Test
    public void testDiario() throws Exception {
        List<String> lista1 = new ArrayList<>();

        lista1.add("trabajar");
        lista1.add("tocar un árbol");
        lista1.add("pizza");
        lista1.add("correr");
        lista1.add("television");

        List<String> lista2 = new ArrayList<>();
        lista2.add("trabajar");
        lista2.add("helado");
        lista2.add("coliflor");
        lista2.add("lasaña");
        lista2.add("tocar un árbol");
        lista2.add("lavarse los dientes");


        Assert.assertEquals(createDiario().get(0), "finde");
        Assert.assertEquals(createDiario().get(1), "bicicleta");
        Assert.assertEquals(createDiario().get(2), "descansar");
        Assert.assertEquals(createDiario().get(3), "cacahuetes");
        Assert.assertEquals(createDiario().get(4), "cerveza");
        Assert.assertNotEquals(createDiario(), lista1);
        Assert.assertNotEquals(createDiario(), lista2);

    }

    @Test
    public void testCorrelacion() {

    }
}
