package estructurasRepeticion;

import javax.swing.JOptionPane;

public class Ej06 {

    public static void main(String[] args) {
        String numFinalString = JOptionPane.showInputDialog("Ponga el valor final");
        int numFinal = Integer.parseInt(numFinalString);
        
        for(int n=0;n <= numFinal;n++)
            System.out.println(n);
    }
    
}
