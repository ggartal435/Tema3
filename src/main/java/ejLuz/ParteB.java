package ejLuz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParteB {

    public static void main(String[] args) {
        //Creamos todas las variables necesarias:
        Scanner teclado;
        teclado = new Scanner(System.in);
        int seguir;
        int veces;
        double potencia;    //Potencia del electrodomestico
        double horaInicio;  //Hora de inicio de consumo
        double horaFin;     //Hora de final de consumo
        double rango1;      //--||
        double rango2;      //  ||
        double rango3;      //  ||Variables para el control de las horas en
        double total1;      //  ||diferentes rangos
        double total2;      //  ||
        double total3;      //--||
        double precioValle; //Precio luz mas bajo   00.00h=>08.00h= horaValle
        double precioLlano; //Precio luz intermedio 16.00h=>24.00h= horaLlano
        double precioPunta; //Precio luz mas alto   08.00h=>16.00h= horaPunta
        double precioFinal=0;

        List<Double> consumos;
        consumos = new ArrayList<>();

        //Creamos una secuencia que se EJECUTARA y REPETIRA mientras el usuario
        //asi lo quiera, con el DO-WHILE
        do {
            //Pregumtamos si quiere conocer el consumo
            System.out.println("\n" + "Si quieres calcular el consumo introduce 0,"
                    + "si no pulsa 1");
            seguir = teclado.nextInt();

            //Si confirma que quiere, se ejecutara el if, de lo contrario acabara
            if (seguir == 0) {

                //Creamos 3 bucles y los controlamos para que nos de un
                //precio por rango
                //NOTA:No sabemos como controlar el que el precioPunta se mayor que los demas
                do {
                    System.out.println("¿Cuanto cuesta el KW en Punta?");
                    precioPunta = teclado.nextDouble();
                } while (precioPunta < 0.10 || precioPunta > 0.45);

                do {
                    System.out.println("¿Cuanto cuesta el KW en Llano?");
                    precioLlano = teclado.nextDouble();
                    if(precioLlano>precioPunta){
                        System.out.println("El precio Llano no puede ser superior"
                                + "al del precio Punta");
                    }
                } while (precioLlano < 0.10 || precioLlano > precioPunta
                        || precioLlano > 0.45);

                do {
                    System.out.println("¿Cuanto cuesta el KW en Valle?");
                    precioValle = teclado.nextDouble();
                    if(precioValle>precioLlano){
                        System.out.println("El precio Valle no puede ser superior"
                                + "al precio Llano");
                    }
                } while (precioValle < 0.10 || precioValle > precioLlano
                        || precioValle > 0.45);

                //Preguntamos la cantidad de W de consumo y ponemos un rango
                do {
                    System.out.println("¿Cuanto consume? Recuerde que el"
                            + " valor ha de comprenderse entre 1W y 4500W");
                    potencia = teclado.nextDouble();
                } while (potencia < 1 || potencia > 4500);

                //Preguntamos cuantas veces al dia esta encendido
                System.out.println("¿Cuantas veces al dia esta funcionando"
                        + "(aprox)[En caso de que sea todo el dia equivaldia a 1]");
                veces = teclado.nextInt();

                //con un bucle for calcularemos el consumo por vez
                for (int i = 1; i <= veces; i++) {
                    //Le pedimos la hora de inicio al rango correspondiente
                    System.out.println("cuando inicia el " + i + "º uso");
                    horaInicio = teclado.nextDouble();
                    //Le pedimos la hora de finalizacion al rango correspondiente
                    System.out.println("Cuando termina el " + i + "º uso");
                    horaFin = teclado.nextDouble();

                    //Creamos un If para delimitar los rangos y saber el precio
                    //por rango:
                    //00.00h=>08.00h= horaValle
                    //08.00h=>16.00h= horaPunta
                    //16.00h=>24.00h= horaLlano
                    if (horaInicio >= 0 && horaInicio < 8 && horaFin <= 8 && horaFin > horaInicio) {
                        rango1 = horaFin - horaInicio;  //Si solo es hora valle
                        total1 = rango1 * precioValle;
                        consumos.add(total1);
                    } else if (horaInicio >= 0 && horaInicio < 8 && horaFin >= 8 && horaFin < 16 && horaFin > horaInicio) {
                        rango1 = 8 - horaInicio;
                        total1 = rango1 * precioValle;    //Si Empieza en valle y
                        rango2 = horaFin - 8;             //termina en punta
                        total2 = rango2 * precioLlano;
                        total3 = total1 + total2;
                        consumos.add(total3);
                    } else if (horaInicio >= 8 && horaFin < 16) {
                        rango1 = horaFin - horaInicio;  //Si solo esta en punta
                        total1 = rango1 * precioPunta;
                        consumos.add(total1);
                    } else if (horaInicio >= 8 && horaInicio < 16 && horaFin > 16 && horaFin <= 24 && horaFin > horaInicio) {
                        rango1 = 16 - horaInicio;
                        total1 = rango1 * precioPunta;
                        rango2 = 24 - horaFin;             //Si empieza en punta
                        total2 = rango2 * precioLlano;     //y termina en llana
                        total3 = total1 + total2;
                        consumos.add(total3);
                    } else if (horaInicio >= 16 && horaFin <= 24 && horaFin > horaInicio) {
                        rango1 = horaFin - horaInicio;     //Si solo esta en llana
                        total1 = rango1 * precioLlano;
                        consumos.add(total1);
                    } else {
                        rango1 = 8 - horaInicio;
                        total1 = rango1 * precioValle;
                        total2 = 8 * precioPunta;           //Si esta en los 3
                        rango3 = horaFin - 16;              //rangos
                        total3 = rango3 * precioLlano;
                        total3 = total1 + total2 + total3;
                        consumos.add(total3);
                    }
                }
            }
            for (int i = 0; i < consumos.size() ; i++) {
               precioFinal+= consumos.get(i);               //Calculo precio final
                
            }
            System.out.printf("el total es de: %.2f euros" , precioFinal );
        } while (seguir == 0);
    }

}
