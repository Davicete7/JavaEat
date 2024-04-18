package InterfazJavaEat;




//IMPORTES
import ClasesJavaEat.Comida;
import ClasesJavaEat.Sistema;
import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 * -Clase encargada de mostrarle a la empresa las distintas opciones que tiene.
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 * @see Comida
 * @see Sistema
 * @see Color
 * @see Serializable
 * @see ArrayList
 * @see JOptionPane
 */
public class InicioEmpresa extends javax.swing.JFrame implements Serializable {

    int xMouse,yMouse;
    
    
    public InicioEmpresa() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Actualizamos los datos como siempre
        Sistema.cargarDatosClientes();
        Sistema.cargarDatosEmpresas();
        Sistema.cargarDatosRestaurantes();
        Sistema.cargarDatosComidas();
        Sistema.cargarDatosVentasClientes();
        Sistema.cargarDatosVentasEmpresas();
        Sistema.cargarDatosVentasCatering();
        
        //Borramos el carrito de la compra y sus cantidades
        ArrayList<Comida> borrar = new ArrayList<>();
        ArrayList<Integer> borrar2 = new ArrayList<>();
        
        Sistema.setCarritoCompra(borrar);
        Sistema.setCantidadesCarritoCompra(borrar2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        FondoVerdeDerecha = new javax.swing.JPanel();
        javaTexto = new javax.swing.JLabel();
        eatsTexto = new javax.swing.JLabel();
        cerrarSesionTexto = new javax.swing.JLabel();
        BarraFunciones = new javax.swing.JPanel();
        botonExit = new javax.swing.JPanel();
        exitTexto = new javax.swing.JLabel();
        calificarRestauranteBoton = new javax.swing.JButton();
        MenuPrincipalTexto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pedirBoton = new javax.swing.JButton();
        modificarDatosBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoVerdeDerecha.setBackground(new java.awt.Color(6, 193, 103));

        javaTexto.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        javaTexto.setForeground(new java.awt.Color(0, 0, 0));
        javaTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaTexto.setText("JAVA");

        eatsTexto.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        eatsTexto.setForeground(new java.awt.Color(0, 0, 0));
        eatsTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eatsTexto.setText("EATS");

        cerrarSesionTexto.setBackground(new java.awt.Color(255, 255, 255));
        cerrarSesionTexto.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cerrarSesionTexto.setForeground(new java.awt.Color(0, 0, 0));
        cerrarSesionTexto.setText("Cerrar Sesión");
        cerrarSesionTexto.setBorder(null);
        cerrarSesionTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesionTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionTextoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarSesionTextoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarSesionTextoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoVerdeDerechaLayout = new javax.swing.GroupLayout(FondoVerdeDerecha);
        FondoVerdeDerecha.setLayout(FondoVerdeDerechaLayout);
        FondoVerdeDerechaLayout.setHorizontalGroup(
            FondoVerdeDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eatsTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(javaTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeDerechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarSesionTexto)
                .addContainerGap())
        );
        FondoVerdeDerechaLayout.setVerticalGroup(
            FondoVerdeDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoVerdeDerechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrarSesionTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(javaTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eatsTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(FondoVerdeDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 280, 550));

        BarraFunciones.setBackground(new java.awt.Color(255, 255, 255));
        BarraFunciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraFuncionesMouseDragged(evt);
            }
        });
        BarraFunciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraFuncionesMousePressed(evt);
            }
        });

        botonExit.setBackground(new java.awt.Color(255, 255, 255));

        exitTexto.setBackground(new java.awt.Color(255, 255, 255));
        exitTexto.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        exitTexto.setForeground(new java.awt.Color(0, 0, 0));
        exitTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTexto.setText("X");
        exitTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTextoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTextoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTextoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botonExitLayout = new javax.swing.GroupLayout(botonExit);
        botonExit.setLayout(botonExitLayout);
        botonExitLayout.setHorizontalGroup(
            botonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonExitLayout.setVerticalGroup(
            botonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BarraFuncionesLayout = new javax.swing.GroupLayout(BarraFunciones);
        BarraFunciones.setLayout(BarraFuncionesLayout);
        BarraFuncionesLayout.setHorizontalGroup(
            BarraFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraFuncionesLayout.createSequentialGroup()
                .addComponent(botonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BarraFuncionesLayout.setVerticalGroup(
            BarraFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraFuncionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(BarraFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        calificarRestauranteBoton.setBackground(new java.awt.Color(6, 193, 103));
        calificarRestauranteBoton.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        calificarRestauranteBoton.setForeground(new java.awt.Color(0, 0, 0));
        calificarRestauranteBoton.setText("Calificar Restaurante");
        calificarRestauranteBoton.setBorder(null);
        calificarRestauranteBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calificarRestauranteBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calificarRestauranteBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calificarRestauranteBotonMouseExited(evt);
            }
        });
        calificarRestauranteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calificarRestauranteBotonActionPerformed(evt);
            }
        });
        background.add(calificarRestauranteBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 380, 70));

        MenuPrincipalTexto.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        MenuPrincipalTexto.setForeground(new java.awt.Color(0, 0, 0));
        MenuPrincipalTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuPrincipalTexto.setText("Menu Principal");
        background.add(MenuPrincipalTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 400, 20));

        pedirBoton.setBackground(new java.awt.Color(6, 193, 103));
        pedirBoton.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        pedirBoton.setForeground(new java.awt.Color(0, 0, 0));
        pedirBoton.setText("Pedir");
        pedirBoton.setBorder(null);
        pedirBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pedirBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pedirBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pedirBotonMouseExited(evt);
            }
        });
        pedirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedirBotonActionPerformed(evt);
            }
        });
        background.add(pedirBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 380, 70));

        modificarDatosBoton.setBackground(new java.awt.Color(6, 193, 103));
        modificarDatosBoton.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        modificarDatosBoton.setForeground(new java.awt.Color(0, 0, 0));
        modificarDatosBoton.setText("Modificar datos/Dar de baja");
        modificarDatosBoton.setBorder(null);
        modificarDatosBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarDatosBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarDatosBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarDatosBotonMouseExited(evt);
            }
        });
        modificarDatosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarDatosBotonActionPerformed(evt);
            }
        });
        background.add(modificarDatosBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 380, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BarraFuncionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraFuncionesMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_BarraFuncionesMousePressed

    private void BarraFuncionesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraFuncionesMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraFuncionesMouseDragged

    private void exitTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextoMouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_exitTextoMouseClicked

    private void exitTextoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextoMouseEntered
        // TODO add your handling code here:
        botonExit.setBackground(Color.red);
        exitTexto.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitTextoMouseEntered

    private void exitTextoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextoMouseExited
        // TODO add your handling code here:
        botonExit.setBackground(Color.WHITE);
        exitTexto.setForeground(Color.BLACK);
    }//GEN-LAST:event_exitTextoMouseExited

    private void cerrarSesionTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionTextoMouseClicked
        // TODO add your handling code here:

        //Le advertimos de lo que va a hacer
        int respuestaUsuario = JOptionPane.showConfirmDialog(this, "¿Seguro que desea cerrar sesion?", "CERRAR SESIÓN"
            ,JOptionPane.YES_NO_OPTION );
        if(respuestaUsuario == JOptionPane.YES_OPTION)
        {
            //Le llevamos a la ventana de Inicio de sesion.
            InicioSesion cerrarSesion = new InicioSesion();
            cerrarSesion.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cerrarSesionTextoMouseClicked

    private void cerrarSesionTextoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionTextoMouseEntered
        // TODO add your handling code here:
        cerrarSesionTexto.setForeground(Color.RED);
    }//GEN-LAST:event_cerrarSesionTextoMouseEntered

    private void cerrarSesionTextoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionTextoMouseExited
        // TODO add your handling code here:
        cerrarSesionTexto.setForeground(Color.BLACK);
    }//GEN-LAST:event_cerrarSesionTextoMouseExited

    private void calificarRestauranteBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calificarRestauranteBotonMouseEntered
        // TODO add your handling code here:
        calificarRestauranteBoton.setForeground(Color.BLUE);
    }//GEN-LAST:event_calificarRestauranteBotonMouseEntered

    private void calificarRestauranteBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calificarRestauranteBotonMouseExited
        // TODO add your handling code here:
        calificarRestauranteBoton.setForeground(Color.BLACK);
    }//GEN-LAST:event_calificarRestauranteBotonMouseExited

    private void calificarRestauranteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calificarRestauranteBotonActionPerformed
            CalificarRestauranteEmpresa ventana = new CalificarRestauranteEmpresa();
            ventana.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_calificarRestauranteBotonActionPerformed

    private void pedirBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedirBotonMouseEntered
        // TODO add your handling code here:
        pedirBoton.setForeground(Color.BLUE);
    }//GEN-LAST:event_pedirBotonMouseEntered

    private void pedirBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedirBotonMouseExited
        // TODO add your handling code here:
        pedirBoton.setForeground(Color.BLACK);
    }//GEN-LAST:event_pedirBotonMouseExited

    private void pedirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedirBotonActionPerformed
        // TODO add your handling code here:
        SeleccionPedir ventana = new SeleccionPedir();
        ventana.setVisible(true);
        this.setVisible(false);
        

    }//GEN-LAST:event_pedirBotonActionPerformed

    private void modificarDatosBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarDatosBotonMouseEntered
        // TODO add your handling code here:
        modificarDatosBoton.setForeground(Color.BLUE);
    }//GEN-LAST:event_modificarDatosBotonMouseEntered

    private void modificarDatosBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarDatosBotonMouseExited
        // TODO add your handling code here:
        modificarDatosBoton.setForeground(Color.BLACK);
    }//GEN-LAST:event_modificarDatosBotonMouseExited

    private void modificarDatosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarDatosBotonActionPerformed
        // TODO add your handling code here:
        ModificarDatosEmpresa ventana = new ModificarDatosEmpresa();
        ventana.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_modificarDatosBotonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InicioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraFunciones;
    private javax.swing.JPanel FondoVerdeDerecha;
    private javax.swing.JLabel MenuPrincipalTexto;
    private javax.swing.JPanel background;
    private javax.swing.JPanel botonExit;
    private javax.swing.JButton calificarRestauranteBoton;
    private javax.swing.JLabel cerrarSesionTexto;
    private javax.swing.JLabel eatsTexto;
    private javax.swing.JLabel exitTexto;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel javaTexto;
    private javax.swing.JButton modificarDatosBoton;
    private javax.swing.JButton pedirBoton;
    // End of variables declaration//GEN-END:variables
}
