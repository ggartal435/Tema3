package estructurasRepeticion;

public class Ej03 {

    public static void main(String[] args) {
        //Realizar un programa que imprima 25 términos de la serie
        //15 - 30 - 60 - 120, etc. No se introducen valores por teclado.
        

        final int FACTOR_MULT = 2;
        int num =15;
        for(int contador=0 ; contador<=25 ; contador++){
            System.out.println(num);
            num *= FACTOR_MULT;
    }
        
//        while (contador<25) {    
//            System.out.println(a);
//            a = a*FACTOR_MULT;
//            contador++;
//            
//        }
    }
    
}
