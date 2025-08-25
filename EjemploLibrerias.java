package ejemplolibrerias;

import java.util.ArrayList;
import java.util.HashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EjemploLibrerias {

    public static void main(String[] args) {
        
        // java.util
        // import java.util.ArrayList;
        // import java.util.HashMap;
        
        // Uso de ArrayList
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");

        // Uso de HashMap
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Peru");
        mapa.put(2, "Mexico");

        System.out.println(nombres);
        System.out.println(mapa);
        System.out.println();
        
        // java.io
        // import java.io.BufferedReader;
        // import java.io.FileReader;
        // import java.io.IOException;

        try {
            BufferedReader lector = new BufferedReader(new FileReader("archivo.txt"));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println();
        
        // java.sql
        // import java.sql.Connection;
        // import java.sql.DriverManager;
        // import java.sql.ResultSet;
        // import java.sql.Statement;
           
        try {
            // Conexión a base de datos (ejemplo con MySQL)
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miBD", "usuario", "clave");
            Statement stmt = conn.createStatement();

            // Ejecutar consulta
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");

            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " - " + rs.getInt("edad"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
        
    }
    
}
