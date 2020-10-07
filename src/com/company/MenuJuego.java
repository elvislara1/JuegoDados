package com.company;

import java.util.Scanner;

public class MenuJuego {
    private Scanner scanner = new Scanner(System.in);

    JuegoDados dado1 = new JuegoDados();  // Object 1
    JuegoDados dado2 = new JuegoDados();  // Object 2
    JuegoDados dado3 = new JuegoDados();  // Object 3

    public void start(){
        menuPrincipal();
    }

    private void menuPrincipal() {
        int option;

        do {
            System.out.println("1. Juego de los Dados");
            System.out.println("2. Jugar al Parchis");
            System.out.println("3. Jugar al Tic Tac Toe");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    juego();
                    break;
                case 2:
                    System.out.println("##############################");
                    System.out.println("#  ¡ Unauthorized country !  #");
                    System.out.println("##############################");
                    System.out.println("# We're sorry, this content is only available in certain countries. #");
                    System.out.println(" ");
                    System.out.println("TRY TO PLAY: 'Juego de los Dados' ;)");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("##############################");
                    System.out.println("##        Error 403         ##");
                    System.out.println("##############################");
                    break;
                default:
                    System.out.println("ATENCIÓ!!!! ha de ser 1,2 o 3");
            }
        }while(option != 3);
    }
    private void juego() {
        System.out.println("### ESTAS JUGANDO AL JUEGO DE LOS DADOS ###");
        System.out.println(dado1.getDado1());
        System.out.println(dado2.getDado2());
        System.out.println(dado3.getDado3());
    }
}

