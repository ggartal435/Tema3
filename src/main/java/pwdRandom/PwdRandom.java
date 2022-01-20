package pwdRandom;

import java.util.Random;

public class PwdRandom {

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
        int num1, num2, num3, num4, sumaNum1Num4, productoNum2Num3;
        char letra;
        boolean continuar = true, suma = false, producto = false;

        //Creamos el objeto random
        Random numAleatorio = new Random();

        do {
            //Genereamos 4 num random [0-9] diferentes entre si
            num1 = numAleatorio.nextInt(10);

            do {
                num2 = numAleatorio.nextInt(10);
            } while (num2 == num1);
            do {
                num3 = numAleatorio.nextInt(10);
            } while (num3 == num1 || num3 == num2);

            do {
                num4 = numAleatorio.nextInt(10);
            } while (num4 == num1 || num4 == num2 || num4 == num3);

            //Generamos una letra random [F-X]MAYUS
            letra = (char) (numAleatorio.nextInt(19) + 'F');

            sumaNum1Num4 = num1 + num4;

            //Comprobamos si la suma de 1º y 4º digitos es impar
            suma = (sumaNum1Num4 % 2 == 1);

            productoNum2Num3 = num2 * num3;

            //Comprobamos si producto de 2º y 3º digitos es par
            producto = (productoNum2Num3 % 2 == 0);

            if (suma && producto) {
                System.out.println(num1 + "" + num2 + "" + num3 + "" + num4
                        + "" + letra + " Es una contraseña valida");
                continuar = false;
            } else {
                System.out.println(num1 + "" + num2 + "" + num3 + "" + num4
                        + "" + letra + " No es una contraseña valida");
            }

        } while (continuar);

        //        //Creamos un array ocn los numeros posibles
//        int[] arrayNums = {0,1,2,3,4,5,6,7,8,9};
//        
//        do{
//            //Generamos un n aleatorio para cada variable entre 0y 9 (10 caracteres)
//            num1= numAleatorio.nextInt(arrayNums.length);
//            for(int posicion = num1+1 ; posicion < arrayNums.length ; posicion++){
//                arrayNums[posicion] = arrayNums[posicion+1];
//            }
//            
//            num2= numAleatorio.nextInt(arrayNums.length-1);
//            for(int posicion = num2+1 ; posicion < arrayNums.length ; posicion++){
//                arrayNums[posicion] = arrayNums[posicion+1];
//            }
//            
//            num3= numAleatorio.nextInt(arrayNums.length-2);
//            for(int posicion = num3+1 ; posicion < arrayNums.length ; posicion++){
//                arrayNums[posicion] = arrayNums[posicion+1];
//            }
//            
//            num4= numAleatorio.nextInt(arrayNums.length-3);
//            for(int posicion = num1+4 ; posicion < arrayNums.length ; posicion++){
//                arrayNums[posicion] = arrayNums[posicion+1];
//            }
    }

}
