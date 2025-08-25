package poo;

public class Persona {
    // Atributos
    String nombre;
    int edad;
    String ocupacion;
    boolean trabajando;
    
    // Constructor
    public Persona() {
    }
    
    public Persona(String nombre, int edad, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.trabajando = false;
    }
    
    // Métodos
    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre + ", tengo " 
                + edad + " años y soy " + ocupacion + ".");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println("¡Feliz cumpleaños " + nombre 
                + "! Ahora tienes " + edad + " años.");
    }

    public void cambiarEstadoTrabajo(boolean nuevoEstado) {
        trabajando = nuevoEstado;
        if (trabajando) {
            System.out.println(nombre + " ha empezado a trabajar.");
        } else {
            System.out.println(nombre + " ha dejado de trabajar.");
        }
    }
}


