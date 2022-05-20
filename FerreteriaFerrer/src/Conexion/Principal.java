package Conexion;

import Productos.VentanaProductos;
import Productos.ventanaCategorias;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
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

        escritorio.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );

        jMenu1.setForeground(new java.awt.Color(102, 102, 255));
        jMenu1.setText("Productos");

        miRegistroP.setForeground(new java.awt.Color(153, 153, 255));
        miRegistroP.setText("Registro productos");
        miRegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistroPActionPerformed(evt);
            }
        });
        jMenu1.add(miRegistroP);

        jMenuItem2.setForeground(new java.awt.Color(153, 153, 255));
        jMenuItem2.setText("Entradas de productos");
        jMenu1.add(jMenuItem2);

        miTiposProductos.setForeground(new java.awt.Color(153, 153, 255));
        miTiposProductos.setText("Tipos productos");
        miTiposProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTiposProductosActionPerformed(evt);
            }
        });
        jMenu1.add(miTiposProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(102, 102, 255));
        jMenu2.setText("Vendedores");
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(102, 102, 255));
        jMenu3.setText("Proveedores");
        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(102, 102, 255));
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
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miTiposProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTiposProductosActionPerformed
        if (venC == null) {
            venC = new ventanaCategorias();
            escritorio.add(venC);
            venC.setVisible(true);
            venC.toFront();
        }
    }//GEN-LAST:event_miTiposProductosActionPerformed

    private void miRegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistroPActionPerformed
        if (vent == null) {
            vent = new VentanaProductos();
            escritorio.add(vent);
            vent.setVisible(true);
            vent.toFront();
        }
    }//GEN-LAST:event_miRegistroPActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
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
