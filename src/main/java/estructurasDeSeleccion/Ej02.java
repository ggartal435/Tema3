package estructurasDeSeleccion;

import javax.swing.JOptionPane;

public class Ej02 {

    public static void main(String[] args) {
        /*Utilizando el operador ternario ?: de Java, implementa las siguientes
        sentencias:
        
        Si el número “x” es mayor o igual que 135 se devolverá “mayor”,
        si es menor se devolverá “menor”. Las cadenas que se devuelven se
        guardarán en una variable llamada resultado.
        
        Si el número “x” es menor o igual que cero se imprimirá en pantalla
        “Menor que cero”, si no se imprimirá “Mayor que cero”.

        Guardar el valor absoluto de un número entero en una variable entera
        (sin usar la función Math.abs())
         */
        
        String num = JOptionPane.showInputDialog("Dime un numero");
        
        int x = Integer.parseInt(num);
        
        String solucionA = (x >=135) ? "mayor que 135" : "menor que 135";
        JOptionPane.showConfirmDialog(null, solucionA);
        String solucionB = (x <= 0 ) ? "Menor que cero" : "Mayor que cero";
        JOptionPane.showConfirmDialog(null, solucionB);
    }
    
}
