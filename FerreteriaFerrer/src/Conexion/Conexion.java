package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {

    boolean sw = true;

    public static final String url = "jdbc:sqlserver://PNR-SISTEMAS\\SQLEXPRESS:1433;database=FERRETERIA";
    public static final String driveName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String contraseña = "practica12345";
    public static final String usuario = "Practica";

    public Connection getConexion() {
        Connection cn = null;
        try {
            Class.forName(driveName);
            cn = DriverManager.getConnection(url,usuario,contraseña);
        } catch (ClassNotFoundException | SQLException e) {
            sw = false;
        }
        return cn;
    }

    public boolean getSw() {
        return sw;
    }

    public void setSw(boolean sw) {
        this.sw = sw;
    }

}
