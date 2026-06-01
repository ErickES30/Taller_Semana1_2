package caso_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        try {
            System.out.print("¿Cuántos estudiantes desea ingresar?: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Nombre del estudiante: ");
                estudiantes.add(sc.nextLine());
            }

            System.out.println("\nLista de estudiantes:");

            for (String estudiante : estudiantes) {
                System.out.println(estudiante);
            }

        } catch (Exception e) {
            System.out.println("Error: Ingrese datos válidos.");
        }

        sc.close();
    }
}
