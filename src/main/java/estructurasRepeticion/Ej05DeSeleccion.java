package estructurasRepeticion;

import java.util.Scanner;

public class Ej05DeSeleccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion;
        do{
            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1. Calcular el área de un Cuadrado");
            System.out.println("2. Calcular el área de un Triángulo");
            System.out.println("3. Calcular el área de un Círculo");
            System.out.println("4. Finalizar");

            System.out.println("Elija una opción: ");
            opcion = entrada.nextLine();
            
            switch (opcion) {
            case "1":
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                System.out.println("Dime el valor del lado");
                double lado = entrada.nextDouble();
                double areaCuadrado = Math.pow(lado, 2);
                System.out.println(areaCuadrado);
                break;
            case "2":
                System.out.println("Ha seleccionado calcular el área de un triángulo...");
                System.out.println("Dime el valor de la altura");
                double altura = entrada.nextDouble();
                System.out.println("Dime el valor de la base");
                double base = entrada.nextDouble();
                double areaTriangulo = altura*base;
                System.out.println(areaTriangulo);
                break;
            case "3":
                System.out.println("Ha seleccionado calcular el área de un círculo...");
                System.out.println("Dime el radio");
                double radio = entrada.nextDouble();
                double areaCirculo = radio * Math.pow(Math.PI, 2);
                System.out.println(areaCirculo);
                break;
            default:
                System.out.println("Ha salido fuera del programa");
                break;
            }
        }while(!opcion.equals("salir"));
            
            
            
    }

}


