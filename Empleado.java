package modificadoresenjava;

public class Empleado {
    private String nombre;
    String apellido;    //este caso se aplica default
    private int sueldo;
    protected String mascota;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int sueldo, String mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }
    
}
