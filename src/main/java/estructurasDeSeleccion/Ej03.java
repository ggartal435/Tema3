
package estructurasDeSeleccion;


public class Ej03 {

    public static void main(String[] args) {
        //¿Qué devuelven estas expresiones?
        
        boolean unaCondicion = true;
        String resultado = unaCondicion ? "valor1" : "valor2"; //Devuelve valor1
        
        int x = 10;
        int y = (x > 9) ? 100 : 200; //Devuelve 100

        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente" : 
                (vendidas < aforo) ? "Aun no hemos vendido todo" : //todo vendido
                "Esta todo vendido";

    }
    
}
