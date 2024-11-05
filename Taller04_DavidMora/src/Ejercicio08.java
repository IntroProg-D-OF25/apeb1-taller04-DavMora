
import java.util.Scanner;




public class Ejercicio08 {
    public static void main(String[] args) {
        int edad;
        double netflix, youtube, dropbox, spotify, descuento, total;
        Scanner Teclado= new Scanner(System.in);
        System.out.print("Ingrese su edad:");
        edad = Teclado.nextInt();
        System.out.print("Ingrese el valor de su suscripcion a netflix:");
        netflix = Teclado.nextDouble();
        System.out.print("Ingrese el valor de su suscripcion a YouTube Premium:");
        youtube = Teclado.nextDouble();
        System.out.print("Ingrese el valor de su suscripcion a dropbox:");
        dropbox = Teclado.nextDouble();
        System.out.print("Ingrese el valor de su suscripcion a Spotify:");
        spotify = Teclado.nextDouble();
        descuento=  (netflix+youtube+dropbox+spotify) * 0.20 ;
        total= (netflix+youtube+dropbox+spotify) - descuento;
        System.out.println("El pago mensual total de sus suscripciones es: = " + total);
        
    }/***
     * Ingrese su edad:15
Ingrese el valor de su suscripcion a netflix:23
Ingrese el valor de su suscripcion a YouTube Premium:42
Ingrese el valor de su suscripcion a dropbox:54
Ingrese el valor de su suscripcion a Spotify:12
El pago mensual total de sus suscripciones es: = 104.8
     */
            
}
