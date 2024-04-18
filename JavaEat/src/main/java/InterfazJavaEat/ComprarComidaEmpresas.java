package InterfazJavaEat;



//IMPORTES
import ClasesJavaEat.Comida;
import ClasesJavaEat.Restaurante;
import ClasesJavaEat.Sistema;
import ClasesJavaEat.VentaEmpresa;
import java.awt.Color;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 * -Clase encargada de realizar la compra de una {@link Comida} para {@link Sistema#empresaActual}.
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 * @see Comida
 * @see Restaurante
 * @see Sistema
 * @see VentaEmpresa
 * @see Color
 * @see IOException
 * @see Serializable
 * @see LocalDate
 * @see ArrayList
 * @see DefaultListModel
 * @see ImageIcon
 * @see JOptionPane
 */
public class ComprarComidaEmpresas extends javax.swing.JFrame implements Serializable {

    int xMouse,yMouse;
    DefaultListModel modeloComidas = new DefaultListModel();           //Creamos un modelo para comidasLista(JList)
    DefaultListModel modeloCarritoCompra = new DefaultListModel();           //Creamos un modelo para carritoCompraLista(JList)
    
    
    public ComprarComidaEmpresas() {
        
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
        comidasLista.setModel(modeloComidas);
        carritoCompraLista.setModel(modeloCarritoCompra);
        
        //Quitamos todos los datos que haya en las dos listas (Para poner los actalizados)
        modeloComidas.removeAllElements();
        modeloCarritoCompra.removeAllElements();
        
        /*
        Añadimos primero todas las comidas(Se puede hacer todo en una sola linea de codigo para ahorrar espacio 
        en memoria pero se a optado por obtener mejor claridad).
        */
        
        //Primero debemos de cargar el menu del restaurante
        Restaurante res = Sistema.getRestauranteActual();
        
        //Ahora ya añadimos
        for(Comida comida : res.getListaComidas())
        
        {
            String nombre = comida.getNombreComida();
            String ingredientes = comida.getIngredientes().toString();
            String precio = comida.getPrecio();

            String txt = nombre+", ("+precio+"€)"+"    Contiene los ingredientes"+ingredientes+".";
            modeloComidas.addElement(txt);
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
        eatsTexto = new javax.swing.JLabel();
        cerrarSesionTexto = new javax.swing.JLabel();
        atrasBoton = new javax.swing.JButton();
        javaTexto = new javax.swing.JLabel();
        comprarBoton = new javax.swing.JButton();
        BarraFunciones = new javax.swing.JPanel();
        botonExit = new javax.swing.JPanel();
        exitTexto = new javax.swing.JLabel();
        carritoCompratexto = new javax.swing.JLabel();
        menuTexto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        carritoCompraLista = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        comidasLista = new javax.swing.JList<>();
        añadirBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        cantidadSpinner = new javax.swing.JSpinner();
        cantidadTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoVerdeDerecha.setBackground(new java.awt.Color(6, 193, 103));

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

        javaTexto.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        javaTexto.setForeground(new java.awt.Color(0, 0, 0));
        javaTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaTexto.setText("JAVA");

        comprarBoton.setBackground(new java.awt.Color(6, 193, 103));
        comprarBoton.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        comprarBoton.setForeground(new java.awt.Color(0, 0, 0));
        comprarBoton.setText("COMPRAR");
        comprarBoton.setBorder(null);
        comprarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comprarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comprarBotonMouseExited(evt);
            }
        });
        comprarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoVerdeDerechaLayout = new javax.swing.GroupLayout(FondoVerdeDerecha);
        FondoVerdeDerecha.setLayout(FondoVerdeDerechaLayout);
        FondoVerdeDerechaLayout.setHorizontalGroup(
            FondoVerdeDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eatsTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeDerechaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(atrasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeDerechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoVerdeDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeDerechaLayout.createSequentialGroup()
                        .addComponent(javaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeDerechaLayout.createSequentialGroup()
                        .addComponent(comprarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeDerechaLayout.createSequentialGroup()
                        .addComponent(cerrarSesionTexto)
                        .addContainerGap())))
        );
        FondoVerdeDerechaLayout.setVerticalGroup(
            FondoVerdeDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoVerdeDerechaLayout.createSequentialGroup()
                .addComponent(cerrarSesionTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(javaTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eatsTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(comprarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(atrasBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        atrasBoton.setIcon(new ImageIcon("Imagenes/logoAtras.png"));

        background.add(FondoVerdeDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 290, 550));

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

        carritoCompratexto.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        carritoCompratexto.setForeground(new java.awt.Color(0, 0, 0));
        carritoCompratexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carritoCompratexto.setText("Carrito de la Compra");
        background.add(carritoCompratexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 640, -1));

        menuTexto.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        menuTexto.setForeground(new java.awt.Color(0, 0, 0));
        menuTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTexto.setText("Menu");
        background.add(menuTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 640, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 640, 10));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 640, 60));

        carritoCompraLista.setBackground(new java.awt.Color(6, 193, 103));
        carritoCompraLista.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        carritoCompraLista.setForeground(new java.awt.Color(0, 0, 0));
        carritoCompraLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        carritoCompraLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(carritoCompraLista);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 440, -1));

        comidasLista.setBackground(new java.awt.Color(6, 193, 103));
        comidasLista.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        comidasLista.setForeground(new java.awt.Color(0, 0, 0));
        comidasLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        comidasLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane3.setViewportView(comidasLista);

        background.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 440, -1));

        añadirBoton.setBackground(new java.awt.Color(6, 193, 103));
        añadirBoton.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        añadirBoton.setForeground(new java.awt.Color(0, 0, 0));
        añadirBoton.setText("AÑADIR");
        añadirBoton.setBorder(null);
        añadirBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        añadirBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                añadirBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                añadirBotonMouseExited(evt);
            }
        });
        añadirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirBotonActionPerformed(evt);
            }
        });
        background.add(añadirBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 160, 70));

        eliminarBoton.setBackground(new java.awt.Color(6, 193, 103));
        eliminarBoton.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        eliminarBoton.setForeground(new java.awt.Color(0, 0, 0));
        eliminarBoton.setText("ELIMINAR");
        eliminarBoton.setBorder(null);
        eliminarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarBotonMouseExited(evt);
            }
        });
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });
        background.add(eliminarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 160, 70));

        cantidadSpinner.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        cantidadSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(cantidadSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 50, 40));

        cantidadTexto.setBackground(new java.awt.Color(255, 255, 255));
        cantidadTexto.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        cantidadTexto.setForeground(new java.awt.Color(0, 0, 0));
        cantidadTexto.setText("Cantidad");
        background.add(cantidadTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 60, 20));

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
        ServicioNormal ventanaInicioCliente = new ServicioNormal();
        ventanaInicioCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasBotonActionPerformed

    private void añadirBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirBotonMouseEntered
        // TODO add your handling code here:
        añadirBoton.setForeground(Color.BLUE);
    }//GEN-LAST:event_añadirBotonMouseEntered

    private void añadirBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirBotonMouseExited
        // TODO add your handling code here:
        añadirBoton.setForeground(Color.BLACK);
    }//GEN-LAST:event_añadirBotonMouseExited

    private void añadirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirBotonActionPerformed
     
        //Le advertimos de lo que va a hacer 
        if(Integer.parseInt(cantidadSpinner.getValue().toString()) > 0)
        {
            if(!comidasLista.isSelectionEmpty())
            {
                int respuestaUsuario = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres añadir al carrito esta comida?", "AÑADIR COMIDA"
                ,JOptionPane.YES_NO_OPTION );

                if(respuestaUsuario == JOptionPane.YES_OPTION)
                {

                    String comidaAnnadir = comidasLista.getSelectedValue();
                    String[] aux = comidaAnnadir.split(",");             //Solo me interesa el primer elemento que sera el nombre
                    comidaAnnadir = aux[0];

                    //Busco la comida que se quiere eliminar
                    int index = -1;
                    for (Comida comida : Sistema.getListaComidas()) 
                    {
                        index++;
                        if(comida.getNombreComida().equals(comidaAnnadir))
                        {
                            Sistema.annadirCantidadCarritoCompra(Integer.parseInt(cantidadSpinner.getValue().toString()));
                            Sistema.annadirComidaCarritoCompra(comida);
                            JOptionPane.showMessageDialog(this, "Comida añadida con exito", "INFO", JOptionPane.INFORMATION_MESSAGE);
                            break; //Para que no siga recorriendo la lista
                        }
                    }

                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No selecciono ninguna comida", "SIN SELECCION", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(Integer.parseInt(cantidadSpinner.getValue().toString()) == 0) 
        {
            JOptionPane.showMessageDialog(this, "Porfavor añada como minimo 1 cantidad del plato selecionado", "LA CANTIDAD ES 0", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No puede añadir una cantidad de platos negativa", "LA CANTIDAD ES NEGATIVA", JOptionPane.INFORMATION_MESSAGE);
        }
    
        
        
        //Borramos lo que hubiese anteriormente 
        modeloCarritoCompra.clear();
        
        //Siempre actualizamos el carrito de la compra
        int contador = -1;
        ArrayList<Integer> aux = Sistema.getCantidadesCarritoCompra();
        
        for(Comida comida : Sistema.getCarritoCompra())
        {
            contador++;
            int cantidad = aux.get(contador);
            String nombre = comida.getNombreComida();
            String txt = nombre+"  x"+cantidad;
            modeloCarritoCompra.addElement(txt);
        }
        

        
        
    }//GEN-LAST:event_añadirBotonActionPerformed

    private void comprarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarBotonMouseEntered
        // TODO add your handling code here:
        comprarBoton.setForeground(Color.BLUE);
        
    }//GEN-LAST:event_comprarBotonMouseEntered

    private void comprarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarBotonMouseExited
        // TODO add your handling code here:
        comprarBoton.setForeground(Color.BLACK);
    }//GEN-LAST:event_comprarBotonMouseExited

    private void comprarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarBotonActionPerformed
        
        //Le advertimos de lo que va a hacer
        int respuestaUsuario = JOptionPane.showConfirmDialog(this, "¿Seguro que desea finalizar la compra?", "COMPRAR"
            ,JOptionPane.YES_NO_OPTION );
        if(respuestaUsuario == JOptionPane.YES_OPTION)
        {
            if(!Sistema.getCarritoCompra().isEmpty())
            {
                //Para almacenar los datos de la venta debo de crear la venta
                //Creo la fecha de venta
                LocalDate fechaVenta =  LocalDate.now();
                
                //Creo el descuento
                ArrayList<Comida> listaAUX = new ArrayList<>();
                int index = -1;
                
                for (Comida comida : Sistema.getCarritoCompra()) 
                {
                    double precio = Double.parseDouble(comida.getPrecio());    //Consigo el precio
                    double descuento = precio*0.10;                              //Saco el descuento
                    precio -= descuento;                                         //Aplico el descuento
                    comida.setPrecio(String.valueOf(precio));            //Lo establezco
                    
                    //Sustituyo la comida en la nueva lista
                    listaAUX.add(comida);                                     //Añado la comida con el descuento
                    
                }
                
                //Modifico el carrito de la compra con el descuento aplicado en los productos
                Sistema.setCarritoCompra(listaAUX);
                
                //Creo la venta
                VentaEmpresa venta = new VentaEmpresa(fechaVenta, Sistema.getRestauranteActual()
                        ,Sistema.getCarritoCompra() , Sistema.getCantidadesCarritoCompra()
                        ,Sistema.getEmpresaActual());

                //Añado la venta
                Sistema.annadirVentaEmpresa(venta);

                //Guardo las ventas
                Sistema.guardarDatosVentasEmpresas();

                //Guardo la factura
                try
                {
                    Sistema.generaFacturaEmpresa(venta);
                }
                catch(IOException error)
                {
                    System.out.println("Error, no se guardo la factura" + error.toString());
                }

                //Notifico a la empresa de su compra
                JOptionPane.showMessageDialog(this, "Compra realizada con exito", "COMPRA COMPLETADA", JOptionPane.INFORMATION_MESSAGE);


                //Le mando al menu principal
                InicioEmpresa ventana = new InicioEmpresa();
                ventana.setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Debe de comprar al menos 1 producto", "CARRITO DE LA COMPRA VACIO"
                        , JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_comprarBotonActionPerformed

    private void eliminarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBotonMouseEntered
        // TODO add your handling code here:
        eliminarBoton.setForeground(Color.red);
    }//GEN-LAST:event_eliminarBotonMouseEntered

    private void eliminarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBotonMouseExited
        // TODO add your handling code here:
        eliminarBoton.setForeground(Color.BLACK);
    }//GEN-LAST:event_eliminarBotonMouseExited

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        // TODO add your handling code here:
        if(!carritoCompraLista.isSelectionEmpty())
        {
            int index = carritoCompraLista.getSelectedIndex();  //Almaceno la posicion de lo que quiero eliminar del carrito
            modeloCarritoCompra.remove(index);               //Lo elimino
            
            //Actualizo el carrito de la compra
            Sistema.eliminarComidaCarritoCompra(index);
            
            //Actualizo la cantidad carrito de la compra
            Sistema.eliminarCantidadCarritoCompra(index);
            
            
            //Aviso al usuario
            JOptionPane.showMessageDialog(this, "Comida eliminada con exito de su carrito", "COMIDA ELIMINADA"
                    , JOptionPane.INFORMATION_MESSAGE);
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No selecciono ninguna comida", "SIN SELECCION"
                    , JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_eliminarBotonActionPerformed

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
            java.util.logging.Logger.getLogger(ComprarComidaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprarComidaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprarComidaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprarComidaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ComprarComidaEmpresas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraFunciones;
    private javax.swing.JPanel FondoVerdeDerecha;
    private javax.swing.JButton atrasBoton;
    private javax.swing.JButton añadirBoton;
    private javax.swing.JPanel background;
    private javax.swing.JPanel botonExit;
    private javax.swing.JSpinner cantidadSpinner;
    private javax.swing.JLabel cantidadTexto;
    private javax.swing.JList<String> carritoCompraLista;
    private javax.swing.JLabel carritoCompratexto;
    private javax.swing.JLabel cerrarSesionTexto;
    private javax.swing.JList<String> comidasLista;
    private javax.swing.JButton comprarBoton;
    private javax.swing.JLabel eatsTexto;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JLabel exitTexto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel javaTexto;
    private javax.swing.JLabel menuTexto;
    // End of variables declaration//GEN-END:variables
}
