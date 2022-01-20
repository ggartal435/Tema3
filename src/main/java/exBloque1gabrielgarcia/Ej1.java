package exBloque1gabrielgarcia;

import javax.swing.JOptionPane;

public class Ej1 {

    public static void main(String[] args) {
        //Variables
        String aString, bString, cString;

        JOptionPane.showMessageDialog(null, "Vamos ha calcular la siguiente ecuacion: aX²+bX+c=0");
        System.out.println();
        aString = JOptionPane.showInputDialog("Cual es el valor de A:");
        bString = JOptionPane.showInputDialog("Cual es el valor de b:");
        cString = JOptionPane.showInputDialog("Cual es el valor de c:");

        int a = Integer.parseInt(aString);
        int b = Integer.parseInt(bString);
        int c = Integer.parseInt(cString);

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
