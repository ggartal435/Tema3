package estructurasDeSeleccion;

import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {
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
            System.out.println("Ha seleccionado calcular el área de un cuadrado, "
                    + "¿cual es la medida del primer lado?");
            double lado1 = entrada.nextDouble();

            System.out.println("¿cual es la medida del segundo lado?");
            double lado2 = entrada.nextDouble();

            double areaCuadrado = lado1 * lado2;
            System.out.println("El resultado es:" + areaCuadrado);

        } else {
            if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el área de un triángulo ¿Cual es la altura¿");
                double altTriangulo = entrada.nextDouble();

                System.out.println("Y el valor de la base");
                double baseTriangulo = entrada.nextDouble();

                double areaTriangulo = altTriangulo * baseTriangulo;
                System.out.println("El area del triangulo es de: " + areaTriangulo);
            } else {
                if (opcion == 3) {
                    System.out.println("Ha seleccionado calcular el área de un círculo, ¿Cual es el radio?");
                    double radio = entrada.nextDouble();

                    double areaCirculo = Math.PI * Math.pow(radio, 2);
                    System.out.println("El area del circulo es de: " + areaCirculo);
                } else {
                    System.out.println("Ha seleccionado terminar");
                }
            }
        }
    }
}
