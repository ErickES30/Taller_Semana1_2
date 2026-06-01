package caso_04;

class Contador {

    static int contador = 0;

    public Contador() {
        contador++;
    }

    public static void mostrarContador() {
        System.out.println("Objetos creados: " + contador);
    }
}

public class Caso04 {

    public static void main(String[] args) {

        new Contador();
        new Contador();
        new Contador();

        Contador.mostrarContador();
    }
}
