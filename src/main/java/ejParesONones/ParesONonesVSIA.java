package ejParesONones;

//URL del ejercicio : https://github.com/ggartal435/EjParesONones.git

import java.util.Random;
import java.util.Scanner;

public class ParesONonesVSIA {

    public static void main(String[] args) {
        //Creamos las variables enteras que seran necesarias
        //Continuar= seleccion de menu para seguir jugando
        //num1 es el numero escogido por el primer jugador
        //num2 es el numero escogido por la maquina
        //resultado la suma de los numeros de ambos jugadores
        int continuar, num1, num2, resultado;
        
        //Creamos la clase aleatorio
        Random numAleatorio;
        numAleatorio= new Random();
        
        Scanner teclado;
        teclado= new Scanner(System.in);
        
        do{
            //Preguntamos si quieren jugar y creamos un bucle hasta que digan que si
            System.out.println("¿Quereis jugar a pares o nones? [1=Si] [2=No]");
            continuar = teclado.nextInt();
            if(continuar==1){
                
                do{
                    //Jugador 1 respuesta entre 0 y 10
                    System.out.println("Vico, escoge un numero entre 0 y 10");
                    num1= teclado.nextInt();
                    if(num1 <0 || num1 >10){
                        System.out.println("El numero introducido no es valido");
                    }
                }while(num1 <0 || num1 >10);
                
                //IA escoge entre 0 y 10 (11 cifras en total)
                num2= numAleatorio.nextInt(11);
                
                System.out.println("La IA ha escogido " + num2);
                
                resultado= num1 +num2;
                
                if((resultado % 2)==0){
                    System.out.println("Gana pares ha tocado " + resultado);
                }else{
                    System.out.println("Gana impares ha tocado " + resultado);
                }
                
            }
        }while(continuar!=1);
    }
    
}
