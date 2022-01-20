package estructurasRepeticion;

import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.println("Ingrese el valor final:");
        n = teclado.nextInt();
        //inicializacion de la condicion de control del while
        x = 1;
        //condicion que seguira ejecutandose siempre que true
        while (x <= n) {
            //codigo a ejecutar
            System.out.print(x);
            System.out.print(" - ");
            //actualizacion de variable de control
            x++;
        }

    }

}
