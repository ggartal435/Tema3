package practicaTeTimo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TeTimo {

    public static void main(String[] args) {

        //Declaramos las constantes y solicitamos la edad del cliente
        int edad;
        int plazoEntrega;
        final int EDAD_MIN = 18;
        final int EDAD_MAX = 65;
        final int PLAZO_MAX = 30;
        final int PLAZO_MIN = 5;
        final int DEVOLUCION = 75;
        final int MESES_ANUALES = 12;
        final double FACTOR_MULTIPLICATIVO = 5.85;
        final double SUELDO_MAX = 200000;
        double sueldo;
        double prestamo;
        String confirmacion;
        Scanner teclado;
        teclado = new Scanner(System.in);
        do {
            System.out.println("Bienvenido al banco TeTimo");
            System.out.println("¿Quiere solicitar una hipoteca?");
            System.out.println("Introduzca: S para afirmar");
            System.out.println("Introduzca: N para negarse");
            confirmacion = teclado.nextLine();
            if (confirmacion.equals("S") || confirmacion.equals("s")) {
                do {
                    System.out.println("¿Cual es su edad?(Recuerde que "
                            + "ha de ser mayor de edad para solicitar una hipoteca)");

                    edad = teclado.nextInt();

                    if (edad >= EDAD_MIN && EDAD_MAX <= 65) {
                        do {
                            System.out.println("¿Cual es su sueldo bruto mensual?");
                            sueldo = teclado.nextDouble();
                            if (sueldo > 0 && sueldo < 200000) {
                                do {
                                    System.out.println("¿Cuanto desea solicitar?");
                                    prestamo = teclado.nextDouble();
                                    if (prestamo * MESES_ANUALES * FACTOR_MULTIPLICATIVO <= prestamo) {
                                        do {
                                            System.out.println("¿En cuantos años "
                                                    + "quiere devolverlo?");
                                            plazoEntrega = teclado.nextInt();
                                            if (plazoEntrega <= PLAZO_MAX && plazoEntrega <= PLAZO_MIN && edad + plazoEntrega < DEVOLUCION) {
                                                System.out.println("Enhorabuena ha sido timado");
                                            } else {
                                                System.out.println("No le podemos conceder el prestamo");
                                            }
                                        } while (plazoEntrega < PLAZO_MIN || plazoEntrega > PLAZO_MAX || edad + plazoEntrega > DEVOLUCION);
                                    } else {
                                        System.out.println("No podemos concederle"
                                                + " el prestamo");
                                    }
                                } while (sueldo < 0 || sueldo > SUELDO_MAX);
                            } else {
                                System.out.println("Ha introducido un sueldo no valido");
                            }

                        } while (sueldo < 0 || sueldo > 200000);
                    } else {
                        System.out.println("La edad no corresponde");
                    }

                } while (edad < EDAD_MIN || edad > EDAD_MAX);
            }

        } while (!confirmacion.equals("N") || !confirmacion.equals("n"));
    }
}
//        String edadString = JOptionPane.showInputDialog("¿Cual es su edad?");
//        int edad = Integer.parseInt(edadString);
//
//        //Aqui empezamos el if para ver si el cliente cumple con los requisitos
//        //de edad en caso afirmativo se ejecutara en caso nevativo salta al else
//        if (18 < edad && edad < 65) {
//            //le solicitamos cuanto gana
//            String brutoString = JOptionPane.showInputDialog("¿Cual es su sueldo anual [bruto]?");
//            double bruto = Double.parseDouble(brutoString);
//
//            //solicitamos de cuanto quiere la hipoteca
//            String solicitudString = JOptionPane.showInputDialog("¿Cuanto desea solicitar?");
//            double solicitud = Double.parseDouble(solicitudString);
//
//            double brutoFactor = bruto * FACTOR_MULT;
//
//            //Comprobamos si gana lo suficiente como para aceptar
//            if (brutoFactor >= solicitud) {
//
//                // preguntamos en cuantos años quiere devolverlo
//                String añosString = JOptionPane.showInputDialog("¿En cuantos años quiere devolverlo?");
//                double años = Double.parseDouble(añosString);
//
//                //comprobamos la edad
//                if (EDAD_MIN < años && años < PLAZO && años + edad < EDAD_MAX) {
//                    JOptionPane.showMessageDialog(null, "Enhorabuena su"
//                            + "solicitud ha sido aceptada");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Lo sentimo ha sido "
//                            + "considerado NO apto");
//                }
//            } else {// en caso de que la solicitud sea demasiado grande
//                JOptionPane.showMessageDialog(null, "Lo sentimo ha sido "
//                        + "considerado NO apto");
//            }
//            //En caso de no cumplir los requisitos de edad
//        } else {
//            JOptionPane.showMessageDialog(null, "Lo sentimo ha sido "
//                    + "considerado NO apto");
//        }
//    }
