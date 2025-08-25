package modificadoresenjava;

public class ModificadoresEnJava {

    public static void main(String[] args) {
        
        Empleado employer = new Empleado();

        Empleado employerDatos = new Empleado("Jonesy", "Garcia", 5000, "Doggie");

        System.out.println("El nombre del empleado es: " + employerDatos.getNombre());
        System.out.println("El apellido del empleado es: " + employerDatos.getApellido());

        /*
        System.out.println("El sueldo del empleado es: "+ employerDatos.getSueldo());  
        employerDatos.setSueldo(70000);
        System.out.println("El sueldo del empleado es: "+ employerDatos.getSueldo());  
         */
    }
    
}
