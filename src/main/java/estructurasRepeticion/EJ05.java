package estructurasRepeticion;

import javax.swing.JOptionPane;

public class EJ05 {

    public static void main(String[] args) {
        String numFinalString = JOptionPane.showInputDialog("Ponga el valor final");
        int numFinal = Integer.parseInt(numFinalString);
        int x = 0;
        
        do{
            System.out.println(x);
            x++;
        }while(x <= numFinal);
    }
    
}
