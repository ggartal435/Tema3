package pwdRandom;

import java.util.ArrayList;
import java.util.Random;

public class PwdRandomArrayList {

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
        int posicion1, posicion2, posicion3, posicion4, sumePosicion1Posicion4,
            productoPosicion2Posicion3, i, digito1, digito2, digito3, digito4;
        int digitos[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        char letra;
        boolean continuar = true, suma = false, producto = false;

        //Creamos el objeto random
        Random numAleatorio = new Random();

        do {
            //Genereamos 4 num random [0-9] diferentes entre si
            ArrayList<Integer> numerosArray = new ArrayList<>();

            for (i = 0; i < 10; i++) {
                numerosArray.add(i);
            }
            
            //obtenemos un digito del array de manera aleatoria gracias a su
            //posicion en el array y lo borramos
            
            //Buscamos una posicion aleatoria del array
            posicion1 = numAleatorio.nextInt(numerosArray.size());
            //Extraemos lo que haya en esa posicion y la guardamos
            digito1 = numerosArray.get(posicion1);
            //Borramos lo que hubiera en esa posicion para que ne se repita el dig
            numerosArray.remove(posicion1);

            posicion2 = numAleatorio.nextInt(numerosArray.size());
            digito2 = numerosArray.get(posicion2);
            numerosArray.remove(posicion2);
            
            posicion3 = numAleatorio.nextInt(numerosArray.size());
            digito3 = numerosArray.get(posicion3);
            numerosArray.remove(posicion3);
            
            posicion4 = numAleatorio.nextInt(numerosArray.size());
            digito4 = numerosArray.get(posicion4);
            numerosArray.remove(posicion4);

            //Generamos una letra random [F-X]MAYUS
            letra = (char) (numAleatorio.nextInt(19) + 'F');

            sumePosicion1Posicion4 = posicion1 + posicion4;

            //Comprobamos si la suma de 1º y 4º digitos es impar
            suma = (sumePosicion1Posicion4 % 2 == 1);

            productoPosicion2Posicion3 = posicion2 * posicion3;

            //Comprobamos si producto de 2º y 3º digitos es par
            producto = (productoPosicion2Posicion3 % 2 == 0);

            if (suma && producto) {
                System.out.println(posicion1 + "" + posicion2 + "" + posicion3 + "" + posicion4
                        + "" + letra + " Es una contraseña valida");
                continuar = false;
            } else {
                System.out.println(posicion1 + "" + posicion2 + "" + posicion3 + "" + posicion4
                        + "" + letra + " No es una contraseña valida");
            }

        } while (continuar);
    }

}
