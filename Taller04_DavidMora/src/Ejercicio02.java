
import java.util.Scanner;


public class Ejercicio02 {
    public static void main(String[] args) {
        double gastosHijo1, gastosHijo2, gastosHijo3, TotalGastos;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Dame los gastos del primer hijo");
        gastosHijo1= Teclado.nextDouble();
        System.out.println("Dame los gastos del segundo hijo");
        gastosHijo2 = Teclado.nextDouble();
        System.out.println("Dame los gastos del tercer hijo");
        gastosHijo3= Teclado.nextDouble();
        TotalGastos= (gastosHijo1+gastosHijo2+gastosHijo3);
        System.out.println("TotalGastos = " + TotalGastos);
    }
}
/***
 * Dame los gastos del primer hijo
33
Dame los gastos del segundo hijo
33
Dame los gastos del tercer hijo
45
TotalGastos = 111.0
 */