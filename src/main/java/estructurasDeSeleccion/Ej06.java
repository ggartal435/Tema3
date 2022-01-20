package estructurasDeSeleccion;
import java.util.Scanner;
public class Ej06 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Dime el valor del lado");
            double lado = entrada.nextDouble();
            double areaCuadrado = Math.pow(lado, 2);
            System.out.println(areaCuadrado);
        } 
        
        else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el área de un triángulo...");
            System.out.println("Dime el valor de la altura");
            double altura = entrada.nextDouble();
            double base = entrada.nextDouble();
            double areaTriangulo = altura*base;
            System.out.println(areaTriangulo);
        }
        
        else if (opcion == 3) {
            System.out.println("Ha seleccionado calcular el área de un círculo...");
            System.out.println("Dime el radio");
            double radio = entrada.nextDouble();
            double areaCirculo = radio * Math.pow(Math.PI, 2);
            System.out.println(areaCirculo);
        }
        
        else {
            System.out.println("Ha seleccionado terminar");
        }

    }

}
