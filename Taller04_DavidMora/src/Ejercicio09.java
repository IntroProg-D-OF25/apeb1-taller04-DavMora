import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        double ladoCuadrado, alturaTriangulo, areaCuadrado, areaTriangulo, areaRectangulo, areaTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        ladoCuadrado = teclado.nextDouble();
        System.out.print("Ingrese la altura de los triangulos: ");
        alturaTriangulo = teclado.nextDouble();
        areaCuadrado = Math.pow(ladoCuadrado, 2);
        areaTriangulo = (ladoCuadrado * alturaTriangulo) / 2;
        areaRectangulo = ladoCuadrado * alturaTriangulo;
        areaTotal = areaCuadrado + (3 * areaTriangulo) + areaRectangulo;
        System.out.println("El area del poligono es: " + areaTotal);
    }
}
  
/***
 * Ingrese el lado del cuadrado: 9
Ingrese la altura de los triangulos: 8
El area del poligono es: 261.0
 */
