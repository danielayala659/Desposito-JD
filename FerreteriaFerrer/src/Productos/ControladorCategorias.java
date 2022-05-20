package Productos;

import Conexion.Conexion;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ControladorCategorias extends Conexion {
    
    int IdCat;
    String NombreCat;

    // componentes sql
    Connection cn = this.getConexion();
    Statement st;
    String cadena;
    ResultSet rs;

    public int getIdCat() {
        return IdCat;
    }
  
    public ControladorCategorias() {
    }

    public ControladorCategorias(int IdCat, String NombreCat) {
        this.IdCat = IdCat;
        this.NombreCat = NombreCat;
    }   
    
    public DefaultTableModel listarCategorias() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            st = cn.createStatement();
            cadena = "select * from tblCategorias";
            rs = st.executeQuery(cadena);
            modelo.setColumnIdentifiers(new Object[]{"Codigo categoria", "Categoria"});
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("IdCat"), rs.getString("NombreCat")});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo;
    }

    public String insertarCategorias(String NombreCat) {
        String resultado = "";
        try {
            st = cn.createStatement();
            cadena = "insert into tblCategorias values ('" + NombreCat + "')";
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

    public String modificarCategorias(int IdCat, String NombreCat) {
        String resultado = "";
        try {
            st = cn.createStatement();
            cadena = "update tblCategorias set NombreCat='" + NombreCat + "' where IdCat = " + IdCat;
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

    public DefaultTableModel buscarCategorias(int IdCat) {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            st = cn.createStatement();
            cadena = "select * from tblCategorias where IdCat = " + IdCat;
            rs = st.executeQuery(cadena);
            modelo.setColumnIdentifiers(new Object[]{"Codigo categoria", "Categoria"});
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("IdCat"), rs.getString("NombreCat")});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo;
    }

    public String eliminarCategorias(int IdCat) {
        String resultado = "";
        try {
            st = cn.createStatement();
            cadena = "delete from tblCategorias where IdCat = " + IdCat;
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

    public void setCategorias(JComboBox<ControladorCategorias> categoria) {
        try {
            st = cn.createStatement();
            cadena = "select * from tblCategorias";
            rs = st.executeQuery(cadena);
            while (rs.next()) {
                categoria.addItem(
                        new ControladorCategorias(rs.getInt("IdCat"), rs.getString("NombreCat"))
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public int noEliminarCat(int idCat) {
        int nDatos = 0;
        try {
            st = cn.createStatement();
            cadena = "select TipoProducto from tblProductos inner join tblCategorias on IdCat=TipoProducto where TipoProducto="+idCat;
            boolean r = st.execute(cadena);
            if (r == false) {
                nDatos = rs.getInt("TipoProducto");
            }
        } catch (Exception e) {
            System.out.println(e);
        }               
        return nDatos;
    }
    
    public String toString() {
        return this.NombreCat;
    }
    
}
