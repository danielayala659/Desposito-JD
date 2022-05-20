package Productos;

import Conexion.Conexion;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ControladorProductos extends Conexion {

    // variables tabla
    int IdProducto;
    String TipoProducto, NombrePro;
    int Precio;

    // componentes sql
    Connection cn = this.getConexion();
    Statement st;
    String cadena;
    ResultSet rs;

    public ControladorProductos() {
    }

    public ControladorProductos(int IdProducto, String TipoProducto, String NombrePro, int Precio) {
        this.IdProducto = IdProducto;
        this.TipoProducto = TipoProducto;
        this.NombrePro = NombrePro;
        this.Precio = Precio;
    }

    public DefaultTableModel listarProductos() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            st = cn.createStatement();
            cadena = "select IdProducto,NombreCat,NombrePro,Precio,TipoProducto from tblProductos inner join tblCategorias on IdCat=TipoProducto";
            rs = st.executeQuery(cadena);
            modelo.setColumnIdentifiers(new Object[]{"Identificador", "Tipo", "Nombre", "Precio"});
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("IdProducto"), rs.getString("NombreCat"), rs.getString("NombrePro"), rs.getString("Precio")});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo;
    }

    public String insertarProductos(int TipoProducto, String NombrePro, int Precio) {
        String resultado = "";
        try {
            st = cn.createStatement();
            cadena = "insert into tblProductos values (" + TipoProducto + ",'" + NombrePro + "'," + Precio + ")";
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

    public void modificarProductos(int IdProducto, int TipoProducto, String NombrePro, int Precio) {
        try {
            st = cn.createStatement();
            cadena = "update tblProductos set tipoProducto='" + TipoProducto + "',NombrePro='" + NombrePro + "',Precio=" + Precio + " where IdProducto = " + IdProducto;
            rs = st.executeQuery(cadena);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public DefaultTableModel buscarProductos(int IdProducto) {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            st = cn.createStatement();
            cadena = "select IdProducto,NombreCat,NombrePro,Precio,TipoProducto from tblProductos inner join tblCategorias on IdCat=TipoProducto where IdProducto = " + IdProducto;
            rs = st.executeQuery(cadena);
            modelo.setColumnIdentifiers(new Object[]{"Codigo producto", "Tipo", "Nombre", "Precio"});
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("IdProducto"), rs.getString("NombreCat"), rs.getString("NombrePro"), rs.getString("Precio")});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo;
    }

    public String eliminarProductos(int IdProducto) {
        String resultado = "";
        try {
            st = cn.createStatement();
            cadena = "delete from tblProductos where IdProducto = " + IdProducto;
            rs = st.executeQuery(cadena);
            if (rs.next()) {
                resultado = "registro eliminado";
            } else {
                resultado = "registro no eliminado";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public void setProductos(JComboBox<ControladorProductos> producto) {
        try {
            st = cn.createStatement();
            cadena = "select * from tblProductos";
            rs = st.executeQuery(cadena);
            while (rs.next()) {
                producto.addItem(
                        new ControladorProductos(rs.getInt("IdProducto"), rs.getString("TipoProducto"), rs.getString("NombrePro"), rs.getInt("Precio")
                        )
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String toString() {
        return this.NombrePro;
    }

   
}
