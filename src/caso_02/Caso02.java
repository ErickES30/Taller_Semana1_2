package caso_02;

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Caso02 {

    public static void main(String[] args) {

        Persona p1 = new Persona("Erick", 25);
        Persona p2 = new Persona("Juan", 30);

        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}