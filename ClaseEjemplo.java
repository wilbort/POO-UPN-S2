package modificadoresenjava;

public class ClaseEjemplo extends Empleado { //esta heredando de empleado

    String direccion;
    int gastosMensuales;

    public ClaseEjemplo(String direccion, int gastosMensuales, 
            String nombre, String apellido, int sueldo, String mascota) {
        super(nombre, apellido, sueldo, mascota);  
        //asigna con super recibe los datos y llama a la clase madre y 
        // dice estos son los valores que debes asignar
        
        
        //llamas al constructor
        this.direccion = direccion;
        this.gastosMensuales = gastosMensuales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getGastosMensuales() {
        return gastosMensuales;
    }

    public void setGastosMensuales(int gastosMensuales) {
        this.gastosMensuales = gastosMensuales;
    }
    
}
