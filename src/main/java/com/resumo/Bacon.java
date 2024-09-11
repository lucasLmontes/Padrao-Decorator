package com.resumo;

public class Bacon extends HamburguerDecorator {

    public Bacon(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getVariacaoPreco(){
        return 12.0f;
    }

    public String getNomeIngredientes(){
        return "Bacon";
    }
}
