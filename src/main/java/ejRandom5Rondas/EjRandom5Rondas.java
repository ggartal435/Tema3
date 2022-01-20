package ejRandom5Rondas;

import java.util.Random;
import java.util.Scanner;

public class EjRandom5Rondas {

    public static void main(String[] args) {
        //numJugador1 jugador1
        //numJugador2 jugador2
        //vicJugador1 victorias del jugador 1
        //vicJugador12 victorias del jugador 2
        //sumaResultados vcJugador1+vicJugador2
        int continuar, numJugador1, numJugador2, vicJugador1 = 0, vicJugador2 = 0,
            sumaResultados;
        final int RONDAS=5, RONDAS_GANADAS=3;

        Scanner teclado;
        teclado = new Scanner(System.in);

        Random numAleatorio;
        numAleatorio = new Random();

        do {
            
            //Creamos el menu para el juego
            System.out.println("¿Jugamos? [1=Si] [2=No]");
            continuar = teclado.nextInt();
            //Separamos en caso de que quiera jugar o no
            switch (continuar) {
                case 1:
                    //En caso de que quiera jugar se le explica el juego y se ejecuta
                    System.out.println("La maquina va a asignar 1 valor a "
                            + "2 jugadores entre [1 y 5]");
                    System.out.println("Si la suma de ambos valores es menor "
                            + "a 7 gana el jugador 1, si es superior a 7 "
                            + "gana el jugador 2");
                    System.out.println("En caso de empate la ronda no cuenta.");
                    System.out.println("Gana el mejor de 5");
                    
                    
                    //Creamos un bucle para que el juego asigne valores a los jugadores
                    for (int ronda = 1; ronda <= RONDAS && vicJugador1 < RONDAS_GANADAS &&
                            vicJugador2 < RONDAS_GANADAS; ronda++) {
                        numJugador1 = numAleatorio.nextInt(5) + 1;
                        numJugador2 = numAleatorio.nextInt(5) + 1;
                        sumaResultados = numJugador1 + numJugador2;
                        
                        //Condiciones para que gane el jugador 1 o 2
                        if (sumaResultados < 7) {
                            System.out.println("Ronda: " + ronda
                                    + " El jugador 1 ha sacado un "
                                    + numJugador1 + "\n"
                                    + "El jugador 2 ha sacado un "
                                    + numJugador2 + "\n"
                                    + "El resultado es :"
                                    + sumaResultados + "\n"
                                    + "Esta ronda gana el jugador 1");
                            vicJugador1++;

                        } else if (sumaResultados > 7) {
                            System.out.println("Ronda: " + ronda
                                    + " El jugador 1 ha sacado un "
                                    + numJugador1 + "\n"
                                    + "El jugador 2 ha sacado un "
                                    + numJugador2 + "\n"
                                    + "El resultado es :"
                                    + sumaResultados + "\n"
                                    + "Esta ronda gana el jugador 2");
                            vicJugador2++;
                        } else {
                            System.out.println("Ronda: " + ronda
                                    + " El jugador 1 ha sacado un "
                                    + numJugador1 + "\n"
                                    + "El jugador 2 ha sacado un "
                                    + numJugador2 + "\n"
                                    + "El resultado es :"
                                    + sumaResultados + "\n"
                                    + "Esta ronda es empate");
                            ronda--;//En caso de empate no se cuenta la ronda
                        }
                    }

                case 2:
                    break;//en caso de no querer jugar
                default://si pone algo que no sea 1 o 2
                    System.out.println("Seleccione 1 o 2");

            }
            if(vicJugador1==3){//Especifica el ganador
                        System.out.println("Ha ganado el jugador 1");
                    }else if(vicJugador2==3){
                        System.out.println("Ha ganado el jugador 2");
                    }
            vicJugador1=0;//Reseteo de los contadores de victoria
            vicJugador2=0;

        } while (continuar != 2);//En caso de no querer seguir jugando

    }

}
