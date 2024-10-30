
import java.util.Scanner;


public class Ejercicio04 {
    public static void main(String[] args) {
        double costmins, totalmins, totalcosto;
        Scanner Teclado= new Scanner(System.in);
        System.out.println("Dame el costo por minuto");
        costmins= Teclado.nextDouble();
        System.out.println("Dame el total de minutos al mes");
        totalmins=Teclado.nextDouble();
        totalcosto= (costmins*totalmins);
        System.out.println("El total de la planilla es de = " + totalmins);
        
    }
}
/***
 * Dame el costo por minuto
3
Dame el total de minutos al mes
5
El total de la planilla es de = 5.0
 */
