package com.company;

import java.util.Scanner;

public class MenuJuego {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        menuPrincipal();
    }

    private void menuPrincipal() {
        int option;

        do {
            System.out.println("1. Juego de los Dados");
            System.out.println("2. Jugar al Parchis");
            System.out.println("3. Jugar al Tic Tac Toe");
            System.out.println("4. EXIT");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    dado();
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
                case 4:
                    break;
                default:
                    System.out.println("ATENCIÓ!!!! ha de ser 1,2 o 3");
            }
        } while (option != 4 );
    }

    private void dado() {
        System.out.println("### ESTAS JUGANDO AL JUEGO DE LOS DADOS ###");

        JuegoDados juego = new JuegoDados();

        int tiradas = 0;
        int ganadas = 0;

        int opc = 0;

        do {
            for (; opc != 2 ; tiradas++) {
                boolean b = juego.jugar();
                System.out.println(juego);
                if (b) {
                    System.out.println("HAS GANADO !!");
                    ganadas++;
                }
                opc = scanner.nextInt();
            }
            System.out.println("¡ Has ganado " + ganadas + " partidas !");
            //Falta cuantas partidas se ha perdido..
            System.out.println("Saliendo del juego de los dados ....");
            System.out.println(".... volviendo al Menu principal");
            System.out.println(" ");
            System.out.println("####################################");
            System.out.println("#            JUEGOS 2020           #");
            System.out.println("####################################");

            switch (opc) {
                case 1:
                    seguir();
                    break;
                case 2:

                    break;
                default:
                    System.out.println("¡Opción invalida! Elige la opción 1 o 2");
            }
        } while ((opc != 2));
    }

    public void seguir(){
        dado();
    }
}


