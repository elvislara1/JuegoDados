package com.company;

import java.util.Random;

public class Dados {

    Random random = new Random();
    private int valor;

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int tirar() {
        this.valor = random.nextInt(6)+1;
        return this.valor;
    }

    public String toString(){
            return "Dado valor: " + this.valor;
    }
}
