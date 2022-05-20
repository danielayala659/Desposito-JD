package Proveedor;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ControladorProveedores extends Conexion {

    /*create table tblProveedores(
Cedula varchar(11) primary key not null,
NombreProveedor varchar(20),
ApellidosProveedor varchar(30),
TelefonoProveedor varchar(11),
Ciudad varchar(20)*/
    String Cedula, NombreProveedor, ApellidosProveedor, TelefonoProveedor, Ciudad;

    Connection cn = this.getConexion();
    Statement st;
    String cadena;
    ResultSet rs;

    public ControladorProveedores() {
    }

    public ControladorProveedores(String Cedula, String NombreProveedor, String ApellidosProveedor, String TelefonoProveedor, String Ciudad) {
        this.Cedula = Cedula;
        this.NombreProveedor = NombreProveedor;
        this.ApellidosProveedor = ApellidosProveedor;
        this.TelefonoProveedor = TelefonoProveedor;
        this.Ciudad = Ciudad;
    }

    public DefaultTableModel listarProveedores() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            st = cn.createStatement();
            cadena = "select * from tblProveedores";
            rs = st.executeQuery(cadena);
            modelo.setColumnIdentifiers(new Object[]{"Cedulas", "Nombres", "Apellidos", "Telefonos", "Ciudades"});
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("Cedula"), rs.getString("NombreProveedor"), rs.getString("ApellidosProveedor"), rs.getString("TelefonoProveedor"), rs.getString("Ciudad")});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo;
    }

    public String insertarProveedores(String Cedula, String NombreProveedor, String ApellidosProveedor, String TelefonoProveedor, String Ciudad) {
        String resultado = "";
        try {
            st = cn.createStatement();
            cadena = "insert into tblProveedores values ('" + Cedula + "','" + NombreProveedor + "','" + ApellidosProveedor + "','" + TelefonoProveedor + "','" + Ciudad + "')";
            boolean r = st.execute(cadena);
            if (r == false) {
                resultado = "registro almacenado";
            } else {
                resultado = "registro no almacenado";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public String modificarCategorias(String Cedula, String NombreProveedor, String ApellidosProveedor, String TelefonoProveedor, String Ciudad) {
        String resultado = "";
        try {
            st = cn.createStatement();
            cadena = "update tblProveedores set NombreProveedor='" + NombreProveedor + "',"
                    + " ApellidosProveedor='" + ApellidosProveedor + "',"
                    + " TelefonoProveedor='" + TelefonoProveedor + "',"
                    + "Ciudad='" + Ciudad + "'  where IdCat = " + Cedula;
            rs = st.executeQuery(cadena);
            if (rs.next()) {
                resultado = "registro modificado";
            } else {
                resultado = "registro no modificado";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

}
