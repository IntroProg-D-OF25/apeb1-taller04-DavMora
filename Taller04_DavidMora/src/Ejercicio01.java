import java.util.Scanner;
public class Ejercicio01 {
   
    public static void main(String[] args) {
        double baseTriangulo, alturaTriangulo, areaTriangulo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la base del Triangulo");
        baseTriangulo = teclado.nextDouble();
        System.out.println("Dame el area del Triangulo");
        alturaTriangulo = teclado.nextDouble();
        
        
        areaTriangulo= ((baseTriangulo * alturaTriangulo)/2);
        System.out.println("Area del Triangulo = " + areaTriangulo);
        
                
               
    }
}
/***
 * Dame la base del Triangulo
2
Dame el area del Triangulo
5
Area del Triangulo = 5.0
 */