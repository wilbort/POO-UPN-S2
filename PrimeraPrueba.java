package primeraprueba;

public class PrimeraPrueba {

    public static void main(String[] args) {
        Alumno A1 = new Alumno();
        Alumno A2 = new Alumno(12, "Luis", "Mercer", 15);
        System.out.println("La id del alumno es: " + A2.getId());
        System.out.println("El nombre del alumno es: " + A2.getNombre());
        System.out.println("El apellido del alumno es: " + A2.getApellido());
        System.out.println("La calificación del alumno es: " 
                + A2.getCalificacion());

        A2.setCalificacion(2);
        System.out.println("La calificación del alumno es: " 
                + A2.getCalificacion());

        A2.setNombre("Luis");
        A2.setApellido("Ramirez");
        A2.setId(123);
        System.out.println("Nuevo Alumno:" + A2.getNombre() + " " 
                + A2.getApellido() + " ID: " + A2.getId());
    }    
}
