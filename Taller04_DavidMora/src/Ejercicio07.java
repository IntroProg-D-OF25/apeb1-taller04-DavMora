
import java.util.Scanner;


public class Ejercicio07 {
    public static void main(String[] args) {
        double costokvh, numkv, totalplanilla, descuento;
        int edad;
        Scanner Teclado = new Scanner (System.in);
        System.out.println("Ingrese su edad");
        edad= Teclado.nextInt();
        System.out.println("Dame el costo del kilovatio por hora");
        costokvh= Teclado. nextDouble();
        System.out.println("Dame el numero de kilovatios consumidos en el mes");
        numkv= Teclado.nextDouble();
        descuento= (costokvh*numkv)*(0.10);
        totalplanilla= (costokvh*numkv)-(descuento);
        System.out.println("El total de la planilla es de = " + totalplanilla);
        
    }
}
/***Ingrese su edad
65
Dame el costo del kilovatio por hora
23
Dame el numero de kilovatios consumidos en el mes
56
El total de la planilla es de = 1159.2
 * 
 * 
 */