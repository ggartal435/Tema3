package ejParesONones;

import java.util.Scanner;

//URL del ejercicio : https://github.com/ggartal435/EjParesONones.git

public class ParesONonesVSJugador {

    public static void main(String[] args) {
        
        //Creamos las variables enteras que seran necesarias
        //Continuar= seleccion de menu para seguir jugando
        //num1 es el numero escogido por el primer jugador
        //num2 es el numero escogido por el segundo jugador
        //resultado la suma de los numeros de ambos jugadores
        int continuar, num1, num2, resultado;
        
        //Creamos la clase teclado para poder intricudir caracteres
        Scanner teclado;
        teclado= new Scanner(System.in);
        do{
            //Preguntamos si quieren jugar y creamos un bucle hasta que digan que si
            System.out.println("¿Quereis jugar a pares o nones? [1=Si] [2=No]");
            continuar = teclado.nextInt();
            if(continuar==1){
                //codigo del juego
                               
                do{
                    //Jugador 1 respuesta entre 0 y 10
                    System.out.println("Jugador 1, escoge un numero entre 0 y 10");
                    num1= teclado.nextInt();
                    if(num1 <0 || num1 >10){
                        System.out.println("El numero introducido no es valido");
                    }
                }while(num1 <0 || num1 >10);
                
                do{
                    //Jugador 2 respuesta entre 0 y 10
                    System.out.println("Vico, escoge un numero entre 0 y 10");
                    num2= teclado.nextInt();
                    if(num2 <0 || num2 >10){
                        System.out.println("El numero introducido no es valido");
                    }
                }while(num2 <0 || num2 >10);
                
                //suma de ambos jugadores
                resultado= num1 +num2;
                
                if((resultado % 2)==0){
                    //En caso de que el resultado sea par
                    System.out.println("Gana pares ha tocado " + resultado);
                }else{
                    //En caso de que el resultado sea impar
                    System.out.println("Gana impares ha tocado " + resultado);
                }
                
            }
        }while(continuar!=1);
    }
    
}
