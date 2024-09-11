package com.resumo;

public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getVariacaoPreco(){
        return 6.0f;
    }

    public String getNomeIngredientes(){
        return "Queijo";
    }
}
