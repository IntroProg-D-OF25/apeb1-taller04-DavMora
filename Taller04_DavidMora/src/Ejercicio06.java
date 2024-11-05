import java.util.Scanner;
public class Ejercicio06 {



    public static void main(String[] args) {
        double montoPrestamo, interesMensual, pagoMensual;
        int plazoMeses = 12; // Plazo de 1 año en meses
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el monto del prestamo: ");
        montoPrestamo = teclado.nextDouble();

        System.out.print("Ingrese el interes mensual en porcentaje: ");
        interesMensual = teclado.nextDouble() / 100;

    
        pagoMensual = montoPrestamo * (interesMensual * Math.pow(1 + interesMensual, plazoMeses)) /
                      (Math.pow(1 + interesMensual, plazoMeses) - 1);

        System.out.println("El pago mensual es de: " + pagoMensual);
    }
}

/***
 * Ingrese el monto del prestamo: 31
Ingrese el interes mensual en porcentaje: 2
El pago mensual es de: 2.931347495311494
 */
