
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        double costCpu, costTeclado, costPantalla, costRaton, totalcostos;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame el coste del CPU:");
        costCpu = teclado.nextDouble();
        System.out.print("Dame el coste del teclado:");
        costTeclado = teclado.nextDouble();
        System.out.print("Dame el coste de la pantalla:");
        costPantalla = teclado.nextDouble();
        System.out.print("Dame el coste del raton:");
        costRaton = teclado.nextDouble();

        totalcostos = costCpu + costTeclado + costPantalla + costRaton;
        System.out.println("El total de los costos es de = " + totalcostos);
        /**
         * *
         * Dame el coste del CPU:25 Dame el coste del teclado:45 Dame el coste
         * de la pantalla:65 Dame el coste del raton:78 El total de los costos
         * es de = 213.0
         */

    }
}
