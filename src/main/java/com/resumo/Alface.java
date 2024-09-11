package com.resumo;

public class Alface extends HamburguerDecorator {

    public Alface(Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getVariacaoPreco(){
        return 3.0f;
    }

    public String getNomeIngredientes(){
        return "Alface";
    }
}
