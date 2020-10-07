package com.company;

import java.util.Random;

public class JuegoDados {
    Dados dado1;  // Object 1
    Dados dado2;  // Object 2
    Dados dado3;  // Object 3

    public JuegoDados(){
        this.dado1 = new Dados();
        this.dado2 = new Dados();
        this.dado3 = new Dados();
    }

    public boolean jugar(){
        int d1 = this.dado1.tirar();
        int d2 = this.dado2.tirar();
        int d3 = this.dado3.tirar();

        return d1 == d2 && d2 == d3;
    }

    public String toString(){
        return  "Resultado: " + dado1 + " " + dado2 + " " + dado3;
    }
}
