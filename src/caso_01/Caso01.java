package caso_01;
import java.util.Scanner;

public class Caso01 {

    public static double calcular(double a, double b, int opcion) {
        switch (opcion) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            default:
                return 0;
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("1._ Suma");
        System.out.println("2._ Resta");
        System.out.println("3._ Multiplicación");
        System.out.println("4._ División");
        System.out.print("Seleccione una opción: ");

        int opcion = sc.nextInt(); 

        System.out.println("Resultado final: " + calcular(num1, num2, opcion));
 
        sc.close();
    }
}