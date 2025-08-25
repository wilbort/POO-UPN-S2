package primeraprueba;

public class Alumno {
    int id;
    String nombre;
    String apellido;
    int calificacion;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, int calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

}
