package caso_03;

class Operacion {

    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

public class Caso03 {

    public static void main(String[] args) {

        Operacion op = new Operacion();

        System.out.println(op.sumar(5, 3));
        System.out.println(op.sumar(5.5, 2.5));
        System.out.println(op.sumar(1, 2, 3));
    }
}
