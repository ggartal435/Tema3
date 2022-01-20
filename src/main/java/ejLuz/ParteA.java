package ejLuz;

import java.util.Scanner;

public class ParteA {

    public static void main(String[] args) {
        //Creamos una variable para poder introducir datos
        Scanner teclado;
        teclado = new Scanner(System.in);
        int seguir;
        double potencia;
        double horas;
        double precioKW;

        //Creamos una secuencia que se EJECUTARA y REPETIRA mientras el usuario
        //asi lo quiera, con el DO-WHILE
        do {
            //Pregumtamos si quiere conocer el consumo
            System.out.println("\n" + "Si quieres calcular el consumo introduce 0,"
                    + "si no pulsa cualquier otra tecla");
            seguir = teclado.nextInt();

            //Si confirma que quiere, se ejecutara el if, de lo contrario acabara
            if (seguir == 0) {

                //Preguntamos la cantidad de W de consumo y ponemos un rango
                do {
                    System.out.println("¿Cuanto consume? Recuerde que el"
                            + " valor ha de comprenderse entre 1W y 4500W");
                    potencia = teclado.nextDouble();
                } while (potencia < 1 || potencia > 4500);

                //Preguntamos cuanto tiempo esta funcionando y ponemos un rango
                do {
                    System.out.println("¿Cuantas horas al dia esta funcionando?"
                            + "Recuerde usar el formato 24h");
                    horas = teclado.nextDouble();
                } while (horas < 0 || horas > 24);

                //Pedimos precio KW
                do {
                    System.out.println("¿Que precio KW tiene?");
                    precioKW = teclado.nextDouble();
                } while (precioKW < 0.10 || precioKW > 0.45);

                //Calculamos el total
                double total = potencia * horas * precioKW;

                System.out.printf("El precio total seria de: %.2f", total);

            }

        } while (seguir == 0);
    }

}

//System.out.println("¿Cual es su precio kW?");
//double precioKW = teclado.nextDouble();
