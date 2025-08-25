package poo;

public class POO {

    public static void main(String[] args) {
        
        // Crear un objeto Persona
        Persona persona1 = new Persona("Carlos", 30, "Ingeniero");

        // Usar los métodos
        persona1.presentarse();
        persona1.cumplirAnios();
        persona1.cambiarEstadoTrabajo(true);   // Ahora está trabajando
        persona1.cambiarEstadoTrabajo(false);  // Ahora dejó de trabajar
    }
}
