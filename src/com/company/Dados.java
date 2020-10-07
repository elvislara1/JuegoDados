package com.company;

import java.util.Random;

public class Dados {

    Random random = new Random();
    private int valor;
    private int maximo;

    public void tirar(){
        maximo = random.nextInt(6)+1;
    }

    public int getValor() {
        return valor;
    }

    public int setValor(int valor) {
        this.valor = valor;
        return valor;
    }
}
