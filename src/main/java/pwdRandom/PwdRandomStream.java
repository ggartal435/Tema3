package pwdRandom;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class PwdRandomStream {

    public static void main(String[] args) {
        /*
        Crea contraseñas aleatorias hasta que cumpla las siguientes condiciones:
        1.  4 Digitos[0-9] que no se repitan 
        2.  La suma del primer y cuato digito ha de ser impar
        3.  El producto del segundo y tercer digitos ha de ser par
        4.  La contraseña ha de tener una letra [F-X]Mayuscula
        5.  Ha de mostrar todas las combinaciones probadas hasta dar con un 
            resultado valido
         */

        //Creamos las variables
        int sumaDigito1Digito4, productoDigito2Digito3;
        char letra;
        boolean continuar = true, suma = false, producto = false;
        
        
         var digitos = new Random().ints(0, 10);
         System.out.print(digitos);

//        do {
//
////            //Creamos un Stream de 4 numeros aleatorios entre 0 y 9
//            var digitos = new Random().ints(0, 10);
//            
//            //Generamos una letra random [F-X]MAYUS
//            letra = (char) (numAleatorio.nextInt(19) + 'F');
//
//            sumaDigito1Digito4 = digito1 + digito4;
//
//            //Comprobamos si la suma de 1º y 4º digitos es impar
//            suma = (sumePosicion1Posicion4 % 2 == 1);
//
//            productoDigito2Digito3 = digito2 * digito3;
//
//            //Comprobamos si producto de 2º y 3º digitos es par
//            producto = (productoPosicion2Posicion3 % 2 == 0);
//
//            if (suma && producto) {
//                System.out.println(posicion1 + "" + posicion2 + "" + posicion3 + "" + posicion4
//                        + "" + letra + " Es una contraseña valida");
//                continuar = false;
//            } else {
//                System.out.println(posicion1 + "" + posicion2 + "" + posicion3 + "" + posicion4
//                        + "" + letra + " No es una contraseña valida");
//            }
//
//        } while (continuar);
    }

}
