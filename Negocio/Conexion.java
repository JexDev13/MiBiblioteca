package Negocio;
import java.sql.Connection;
import java.sql.DriverManager;
/*
 * @author Arias,Tibanta, Armijo, Salazar J, Salazar S
 */
public class Conexion {
    Connection cn;

    public Connection getConnection() {
        return cn;
    }

    public Connection conectar() {
        try {
            String user = "root";
            String password = "root";
            String direccion = "jdbc:mysql://localhost:3306/base_biblioteca";
            cn = DriverManager.getConnection(direccion, user, password);
            System.out.println("Se hizo la conexion de forma correcta");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }

    public Connection conect(String user, String password) {
        try {
            String direccion = "jdbc:mysql://localhost:3306/base_biblioteca";
            cn = DriverManager.getConnection(direccion, user, password);
            System.out.println("Se hizo la conexion de forma correcta");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }
}