package generarNumAleatorio;

import java.util.Random;

public class GenerarNumAleatorio {

    public static void main(String[] args) {
        //java.util.Random genera un numero aleatorio entre 0 y el numero maximo
        //excluyendo el numero max
        Random numAleatorio = new Random();
        int n = numAleatorio.nextInt(75-25+1)+25;
        System.out.println(n);        
        
    }
    
}
