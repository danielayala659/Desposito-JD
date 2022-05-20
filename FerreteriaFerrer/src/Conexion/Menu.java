package Conexion;

import Productos.*;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    
    
    public Menu() {
        initComponents();     
        setExtendedState(this.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miRegistroP = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        miTiposProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ferreteria Ferrer");
        setBackground(new java.awt.Color(0, 0, 0));

        escritorio.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        jMenu1.setBackground(new java.awt.Color(153, 153, 255));
        jMenu1.setForeground(new java.awt.Color(153, 0, 153));
        jMenu1.setText("Productos");

        miRegistroP.setForeground(new java.awt.Color(204, 0, 204));
        miRegistroP.setText("Registro productos");
        miRegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistroPActionPerformed(evt);
            }
        });
        jMenu1.add(miRegistroP);

        jMenuItem2.setForeground(new java.awt.Color(204, 0, 204));
        jMenuItem2.setText("Entradas de productos");
        jMenu1.add(jMenuItem2);

        miTiposProductos.setForeground(new java.awt.Color(204, 0, 204));
        miTiposProductos.setText("Tipos productos");
        miTiposProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTiposProductosActionPerformed(evt);
            }
        });
        jMenu1.add(miTiposProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(153, 0, 153));
        jMenu2.setText("Vendedores");
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(153, 0, 153));
        jMenu3.setText("Proveedores");
        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(153, 0, 153));
        jMenu4.setText("Reportes");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miRegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistroPActionPerformed
        if (vent==null || vent.isClosed()) {
            vent = new VentanaProductos();
            escritorio.add(vent);
            vent.setVisible(true);
            vent.toFront();
        }
    }//GEN-LAST:event_miRegistroPActionPerformed

    private void miTiposProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTiposProductosActionPerformed
        if (venC==null || venC.isClosed()) {
            venC = new ventanaCategorias();
            escritorio.add(venC);
            venC.setVisible(true);
            venC.toFront();
        }
    }//GEN-LAST:event_miTiposProductosActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    VentanaProductos vent;
    ventanaCategorias venC;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem miRegistroP;
    private javax.swing.JMenuItem miTiposProductos;
    // End of variables declaration//GEN-END:variables
}
