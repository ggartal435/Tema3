package generarNumAleatorio;

import java.util.Scanner;

public class NumeroPrimoAleatorio {

    public static void main(String[] args) {
        //hay que averiguar si un numero es primo
        //1. Preguntar al usuario si quiere introducir el el numero (ha de ser un 
        //numero positivo) o si se genere aleatoriamente.
        //Rango[2-600 000 000] AMBOS INCLUIDOS
        //
        //2. Algoritmo de fuerza bruta optimizado:
        //si N no es 2 o par
        //si no recorrer todo el rango de impares desde 3 hasta N/2
        int respuestaMenu;
        int numEscogido;
        final int NUM_MIN=2;
        final int NUM_MAX=600000000;
        Scanner teclado;
        teclado = new Scanner(System.in);
        do {
            System.out.println("Vamos ha averiguar si un numero es primo");
            System.out.println("Si quieres introcucirlo tu "
                    + "pulsa 1 si no generamos uno aleatorio, "
                    + "si quieres salir pulsa 2");
            respuestaMenu = teclado.nextInt();

            if (respuestaMenu == 1) {
                //Si el usuario decide el numero se ejecuta esto

                do {
                    //Solicita num hasta que se introduzca uno entre NUM_MIN 
                    //y NUM_MAX
                    System.out.println("Introduce un numero positivo entre" + "\n"
                            + " "+ NUM_MIN + "y" + NUM_MAX +" [SEISCIENTOS MILLONES]");
                    numEscogido = teclado.nextInt();
                    if(numEscogido>=NUM_MIN && numEscogido<=NUM_MAX){
                        if(!(numEscogido == 2 || numEscogido%2==0)){
                            for(int x = 3; x <= numEscogido/2 ; x++){
                                if(numEscogido%x==0){
                                    System.out.println(numEscogido + " es divisible "
                                            + "entre " + x + "por lo que no es primo");
                                }else{
                                    System.out.println("Este numero es primo");
                                    break;
                                }
                            }
                        }else{System.out.println("El "+numEscogido+" NO es primo"
                                + " puesto que es divisible por 2");}
                    }else{
                        System.out.println("Ha introducido un numero invalido");
                    }
                } while (numEscogido < NUM_MIN || numEscogido > NUM_MAX);

            } else {
                //Si el usuario decide un numero aleatorio se ejecuta esto
            }
        } while (respuestaMenu != 2);

    }

}
