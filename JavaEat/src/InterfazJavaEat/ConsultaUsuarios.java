package InterfazJavaEat;

/**
 * @author David Sánchez
 */


//IMPORTES
import ClasesJavaEat.Cliente;
import ClasesJavaEat.Empresa;
import ClasesJavaEat.Sistema;
import java.awt.Color;
import java.io.Serializable;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




/**
 * -Clase encargada de mostrarle al ADMIN una lista de {@link Cliente} y  otras de {@link Empresa} registradas en la aplicacion.
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 * @see Cliente
 * @see Empresa
 * @see Sistema
 * @see Color
 * @see Serializable
 * @see DefaultListModel
 * @see ImageIcon
 * @see JOptionPane
 */
public class ConsultaUsuarios extends javax.swing.JFrame implements Serializable{

    DefaultListModel modeloClientes = new DefaultListModel();           //Creamos un modelo para clientesLista(JList)
    DefaultListModel modeloEmpresas = new DefaultListModel();           //Creamos un modelo para empresasLista(JList)
    int xMouse,yMouse;
    
    
    public ConsultaUsuarios() {
        
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
        
        //Le damos un modelo a usuariosLista(JList)
        clientesLista.setModel(modeloClientes);
        empresasLista.setModel(modeloEmpresas);
        
        //Quitamos todos los datos que haya en las dos listas (Para poner los actalizados)
        modeloClientes.removeAllElements();
        modeloEmpresas.removeAllElements();
        
        /*
        Añadimos primero todos los clientes (Se puede hacer todo en una sola linea de codigo para ahorrar espacio 
        en memoria pero se a optado por obtener mejor claridad).
        */
        for(Cliente cliente : Sistema.getListaClientes())
        
        {
            String dni = cliente.getDni();
            String nombre = cliente.getNombre();
            String correo = cliente.getCorreoElectronico();
            String telefono = cliente.getTelefono();
            String txt = "Cliente:"+nombre+", con DNI:"+dni+" y Telefono:"+telefono+". Asociado al correo:"+correo+".";
            modeloClientes.addElement(txt);
        }
        
        /*
        Añadimos ahora todas las empresas  (Se puede hacer todo en una sola linea de codigo para ahorrar espacio 
        en memoria pero se a optado por obtener mejor claridad).
        */
        for (Empresa empresa : Sistema.getListaEmpresas()) 
        {
            String dni = empresa.getCif();
            String nombre = empresa.getNombre();
            String correo = empresa.getCorreoElectronico();
            String web = empresa.getWeb();
            String telefono = empresa.getTelefono();
            String txt = "Empresa:"+nombre+", con CIF:"+dni+", Telefono:"+telefono+" y Pagina web:"+web+". Asociado al correo:"+correo+".";
            
            modeloEmpresas.addElement(txt);
        }
        
        
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
        atrasBoton = new javax.swing.JButton();
        BarraFunciones = new javax.swing.JPanel();
        botonExit = new javax.swing.JPanel();
        exitTexto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empresasLista = new javax.swing.JList<>();
        tituloEmpresasTexto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tituloClientesTexto = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientesLista = new javax.swing.JList<>();

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

        atrasBoton.setBackground(new java.awt.Color(6, 193, 103));
        atrasBoton.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        atrasBoton.setForeground(new java.awt.Color(0, 0, 0));
        atrasBoton.setBorder(null);
        atrasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atrasBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atrasBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atrasBotonMouseExited(evt);
            }
        });
        atrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoVerdeDerechaLayout = new javax.swing.GroupLayout(FondoVerdeDerecha);
        FondoVerdeDerecha.setLayout(FondoVerdeDerechaLayout);
        FondoVerdeDerechaLayout.setHorizontalGroup(
            FondoVerdeDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eatsTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(javaTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeDerechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarSesionTexto)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeDerechaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(atrasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(atrasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        atrasBoton.setIcon(new ImageIcon("Imagenes/logoAtras.png"));

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
                .addGap(0, 859, Short.MAX_VALUE))
        );
        BarraFuncionesLayout.setVerticalGroup(
            BarraFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraFuncionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(BarraFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        empresasLista.setBackground(new java.awt.Color(6, 193, 103));
        empresasLista.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        empresasLista.setForeground(new java.awt.Color(0, 0, 0));
        empresasLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        empresasLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(empresasLista);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 610, 150));

        tituloEmpresasTexto.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        tituloEmpresasTexto.setForeground(new java.awt.Color(0, 0, 0));
        tituloEmpresasTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEmpresasTexto.setText("Informacion Relevante de Empresas");
        background.add(tituloEmpresasTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 640, 20));

        tituloClientesTexto.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        tituloClientesTexto.setForeground(new java.awt.Color(0, 0, 0));
        tituloClientesTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloClientesTexto.setText("Informacion Relevante de Clientes");
        background.add(tituloClientesTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 640, 20));

        clientesLista.setBackground(new java.awt.Color(6, 193, 103));
        clientesLista.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        clientesLista.setForeground(new java.awt.Color(0, 0, 0));
        clientesLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        clientesLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(clientesLista);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 610, 150));

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

    private void atrasBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasBotonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasBotonMouseClicked

    private void atrasBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasBotonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasBotonMouseEntered

    private void atrasBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasBotonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasBotonMouseExited

    private void atrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBotonActionPerformed
        // TODO add your handling code here:
        InicioAdmin ventanaAnterior = new InicioAdmin();
        ventanaAnterior.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasBotonActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ConsultaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraFunciones;
    private javax.swing.JPanel FondoVerdeDerecha;
    private javax.swing.JButton atrasBoton;
    private javax.swing.JPanel background;
    private javax.swing.JPanel botonExit;
    private javax.swing.JLabel cerrarSesionTexto;
    private javax.swing.JList<String> clientesLista;
    private javax.swing.JLabel eatsTexto;
    private javax.swing.JList<String> empresasLista;
    private javax.swing.JLabel exitTexto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel javaTexto;
    private javax.swing.JLabel tituloClientesTexto;
    private javax.swing.JLabel tituloEmpresasTexto;
    // End of variables declaration//GEN-END:variables
}
