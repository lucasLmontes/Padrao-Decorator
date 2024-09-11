package com.resumo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HamburguerTest {

    @Test
    public void deveRetornarPrecoDeHamburguerSimples(){
        Hamburguer hamburguer = new HamburguerSimples(20.0f);

        assertEquals(20.0f, hamburguer.getPreco(), 0.1f);
    }

    @Test
    public void deveRetornarPrecoDeHamburguerSimplesComAlface(){
        Hamburguer hamburguer = new Alface(new HamburguerSimples(20.0f));

        assertEquals(20.6f, hamburguer.getPreco(), 0.1f);
    }

    @Test
    public void deveRetornarPrecoDeHamburguerSimplesComBacon(){
        Hamburguer hamburguer = new Bacon(new HamburguerSimples(20.0f));

        assertEquals(22.4f, hamburguer.getPreco(), 0.1f);
    }

    @Test
    public void deveRetornarPrecoDeHamburguerSimplesComQueijo(){
        Hamburguer hamburguer = new Queijo(new HamburguerSimples(20.0f));

        assertEquals(21.2f, hamburguer.getPreco(), 0.1f);
    }

    @Test
    public void deveRetornarPrecoDeHamburguerSimplesComAlfaceEBacon(){
        Hamburguer hamburguer = new Bacon(new Alface(new HamburguerSimples(20.0f)));

        assertEquals(23.0f, hamburguer.getPreco(), 0.1f);
    }

    @Test
    public void deveRetornarPrecoDeHamburguerSimplesComAlfaceEQueijo(){
        Hamburguer hamburguer = new Queijo(new Alface(new HamburguerSimples(20.0f)));

        assertEquals(21.8f, hamburguer.getPreco(), 0.1f);
    }

    @Test
    public void deveRetornarPrecoDeHamburguerSimplesComBaconEQueijo(){
        Hamburguer hamburguer = new Queijo(new Bacon(new HamburguerSimples(20.0f)));

        assertEquals(23.7f, hamburguer.getPreco(), .1f);
    }

    @Test
    public void deveRetornarPrecoDeHamburguerSimplesComAlfaceBaconEQueijo(){
        Hamburguer hamburguer = new Queijo(new Bacon(new Alface(new HamburguerSimples(20.0f))));

        assertEquals(24.4f, hamburguer.getPreco(), 0.1f);
    }

    @Test
    public void deveRetornarIngredientesDeHamburguerSimples(){
        Hamburguer hamburguer = new HamburguerSimples();

        assertEquals("Pão - Carne", hamburguer.getIngredientes());
    }

    @Test
    public void deveRetornarIngredientesDeHamburguerSimplesComAlface(){
        Hamburguer hamburguer = new Alface(new HamburguerSimples());

        assertEquals("Pão - Carne - Alface", hamburguer.getIngredientes());
    }

    @Test
    public void deveRetornarIngredientesDeHamburguerSimplesComBacon(){
        Hamburguer hamburguer = new Bacon(new HamburguerSimples());

        assertEquals("Pão - Carne - Bacon", hamburguer.getIngredientes());
    }

    @Test
    public void deveRetornarIngredientesDeHamburguerSimplesComQueijo(){
        Hamburguer hamburguer = new Queijo(new HamburguerSimples());

        assertEquals("Pão - Carne - Queijo", hamburguer.getIngredientes());
    }

    @Test
    public void deveRetornarIngredientesDeHamburguerSimplesComAlfaceEBacon(){
        Hamburguer hamburguer = new Bacon(new Alface(new HamburguerSimples()));

        assertEquals("Pão - Carne - Alface - Bacon", hamburguer.getIngredientes());
    }

    @Test
    public void deveRetornarIngredientesDeHamburguerSimplesComAlfaceEQueijo(){
        Hamburguer hamburguer = new Queijo(new Alface(new HamburguerSimples()));

        assertEquals("Pão - Carne - Alface - Queijo", hamburguer.getIngredientes());
    }

    @Test
    public void deveRetornarIngredientesDeHamburguerSimplesComBaconEQueijo(){
        Hamburguer hamburguer = new Queijo(new Bacon(new HamburguerSimples()));

        assertEquals("Pão - Carne - Bacon - Queijo", hamburguer.getIngredientes());
    }

    @Test
    public void deveRetornarIngredientesDeHamburguerSimplesComAlfaceBaconEQueijo(){
        Hamburguer hamburguer = new Queijo(new Bacon(new Alface(new HamburguerSimples())));

        assertEquals("Pão - Carne - Alface - Bacon - Queijo", hamburguer.getIngredientes());
    }
}