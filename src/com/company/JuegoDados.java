package com.company;

import java.util.Random;

public class JuegoDados {

    Random random = new Random();

    Dados dado1 = new Dados();  // Object 1
    Dados dado2 = new Dados();  // Object 2
    Dados dado3 = new Dados();  // Object 3

    public int getDado1() {
        return dado1.setValor(random.nextInt(6)+1);
    }
    public int getDado2() {
        return dado2.setValor(random.nextInt(6)+1);
    }
    public int getDado3() {
        return dado3.setValor(random.nextInt(6)+1);
    }


}
