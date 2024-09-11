package com.resumo;

public abstract class HamburguerDecorator implements Hamburguer {

    private Hamburguer hamburguer;
    private String ingredientes;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public abstract float getVariacaoPreco();

    public float getPreco(){
        return this.hamburguer.getPreco() * (1 + (this.getVariacaoPreco() / 100));
    }

    public abstract String getNomeIngredientes();

    public String getIngredientes() {
        return this.hamburguer.getIngredientes() + " - " + this.getNomeIngredientes();
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
