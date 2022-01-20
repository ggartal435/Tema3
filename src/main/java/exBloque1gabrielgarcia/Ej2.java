package exBloque1gabrielgarcia;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ej2 {

    public static void main(String[] args) {
        //Variables
        int a = 0, b = 0, c = 0;
        String aString, bString, cString;
        boolean noNumero = true;


        JOptionPane.showMessageDialog(null, "Vamos ha calcular la siguiente ecuacion: aX²+bX+c=0");
        System.out.println();

        do {
            try {
                aString = JOptionPane.showInputDialog("Cual es el valor de A:");
                aString = aString.trim();
                a = Integer.parseInt(aString);
                noNumero = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor introduzca un numero"
                        + "valido");
            }
        } while (noNumero);

        noNumero = true;

        do {
            try {
                bString = JOptionPane.showInputDialog("Cual es el valor de B:");
                bString = bString.trim();
                b = Integer.parseInt(bString);
                noNumero = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Por favor introduzca un numero"
                        + "valido");
            }
        } while (noNumero);

        noNumero = true;

        do {
            try {
                cString = JOptionPane.showInputDialog("Cual es el valor de C:");
                cString = cString.trim();
                c = Integer.parseInt(cString);
                noNumero = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Por favor introduzca un numero"
                        + "valido");
            }
        } while (noNumero);

        if (a == 0 || b == 0) {
            JOptionPane.showMessageDialog(null, "Esta ecuacion no tiene solucion");
        } else if (a == 0 && b != 0) {
            int bDiferente0 = -c / b;
            System.out.println("El resultado es: " + bDiferente0);
        } else if (Math.pow(b, 2) - 4 * a * c < 0) {
            System.out.println("Los valores suminisrados no permiten calcular "
                    + "las soluciones de la ecuacion");
        } else {
            double x1 = (-b + Math.sqrt(Math.pow(b, 2)) / 2 * a);
            double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a);
            System.out.println("Las dos posibles soliciones son: ");
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }
    }

}
