package InterfazJavaEat;


//IMPORTES
import ClasesJavaEat.Cliente;
import ClasesJavaEat.Comida;
import ClasesJavaEat.Empresa;
import ClasesJavaEat.Sistema;
import ClasesJavaEat.VentaCatering;
import ClasesJavaEat.VentaCliente;
import ClasesJavaEat.VentaEmpresa;
import java.awt.Color;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




/**
 * -Clase encargada de mostrar al ADMIN de la aplicacion las ventas realizadas
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 * @see Cliente
 * @see Comida
 * @see Empresa
 * @see Sistema
 * @see VentaCatering
 * @see VentaCliente
 * @see VentaEmpresa
 * @see Color
 * @see Serializable
 * @see LocalDate
 * @see DateTimeFormatter
 * @see ArrayList
 * @see DefaultListModel
 * @see ImageIcon
 * @see JOptionPane
 */
public class ConsultaVentas extends javax.swing.JFrame implements Serializable{

    
    int xMouse,yMouse;
    DefaultListModel modeloVentas = new DefaultListModel();           //Creamos un modelo para ventasLista(JList)
    
    
    public ConsultaVentas() {
        
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
        ventasLista.setModel(modeloVentas);
        
        //Quitamos todos los datos que haya en las dos listas (Para poner los actalizados)
        modeloVentas.removeAllElements();
        
        
        /*
        Añadimos todas las ventas(Se puede hacer todo en una sola linea de codigo para ahorrar espacio 
        en memoria pero se a optado por obtener mejor claridad).
        */
        //Ventas de clientes
        for(VentaCliente venta : Sistema.getListaVentasClientes())
        
        {
            String fecha = venta.getFechaVenta().toString();
            String nombreRestaurante = venta.getRestaurante().getNombre();
            String cifRestaurante = venta.getRestaurante().getCif();
            Cliente cliente = venta.getCliente();

            String txt = "Venta realizada el: "+fecha+", con el restaurante "+nombreRestaurante
                    +" con CIF: "+cifRestaurante+", al cliente con nombre "+cliente.getNombre()+" y DNI: "+cliente.getDni()+".";
            modeloVentas.addElement(txt);
        }
        //Ventas de empresas
        for(VentaEmpresa venta : Sistema.getListaVentasEmpresas())
        
        {
            String fecha = venta.getFechaVenta().toString();
            String nombreRestaurante = venta.getRestaurante().getNombre();
            String cifRestaurante = venta.getRestaurante().getCif();
            Empresa empresa = venta.getEmpresa();

            String txt = "Venta realizada el: "+fecha+", con el restaurante "+nombreRestaurante
                    +" con CIF: "+cifRestaurante+", al cliente con nombre "+empresa.getNombre()+" y DNI: "+empresa.getCif()+".";
            modeloVentas.addElement(txt);
        }
        //Ventas de Catering
        for(VentaCatering venta : Sistema.getListaVentasCatering())
        
        {
            String fecha = venta.getFechaVenta().toString();
            String nombreRestaurante = venta.getRestaurante().getNombre();
            String cifRestaurante = venta.getRestaurante().getCif();
            Empresa empresa = venta.getEmpresa();

            String txt = "Venta realizada el: "+fecha+", con el restaurante "+nombreRestaurante
                    +" con CIF: "+cifRestaurante+", al cliente con nombre "+empresa.getNombre()+" y DNI: "+empresa.getCif()+".";
            modeloVentas.addElement(txt);
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
        BarraFunciones = new javax.swing.JPanel();
        botonExit = new javax.swing.JPanel();
        exitTexto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ventasLista = new javax.swing.JList<>();
        javaTexto1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        relevanciatexto = new javax.swing.JLabel();
        fechaCaducidadInfo = new javax.swing.JFormattedTextField();
        aplicarFechaFiltro = new javax.swing.JButton();

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

        javax.swing.GroupLayout FondoVerdeDerechaLayout = new javax.swing.GroupLayout(FondoVerdeDerecha);
        FondoVerdeDerecha.setLayout(FondoVerdeDerechaLayout);
        FondoVerdeDerechaLayout.setHorizontalGroup(
            FondoVerdeDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eatsTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeDerechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarSesionTexto)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoVerdeDerechaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(FondoVerdeDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atrasBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(javaTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        FondoVerdeDerechaLayout.setVerticalGroup(
            FondoVerdeDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoVerdeDerechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrarSesionTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(javaTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eatsTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
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

        ventasLista.setBackground(new java.awt.Color(6, 193, 103));
        ventasLista.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        ventasLista.setForeground(new java.awt.Color(0, 0, 0));
        ventasLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ventasLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(ventasLista);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 610, 280));

        javaTexto1.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        javaTexto1.setForeground(new java.awt.Color(0, 0, 0));
        javaTexto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        javaTexto1.setText("Informacion Ventas Relevante");
        background.add(javaTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 630, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 640, 20));

        relevanciatexto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        relevanciatexto.setForeground(new java.awt.Color(0, 0, 0));
        relevanciatexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        relevanciatexto.setText("A partir de la fecha");
        background.add(relevanciatexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 20));

        fechaCaducidadInfo.setBackground(new java.awt.Color(255, 255, 255));
        fechaCaducidadInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        fechaCaducidadInfo.setForeground(new java.awt.Color(0, 0, 0));
        try {
            fechaCaducidadInfo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fechaCaducidadInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaCaducidadInfoActionPerformed(evt);
            }
        });
        background.add(fechaCaducidadInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, 40));

        aplicarFechaFiltro.setBackground(new java.awt.Color(6, 193, 103));
        aplicarFechaFiltro.setFont(new java.awt.Font("Roboto Black", 2, 18)); // NOI18N
        aplicarFechaFiltro.setForeground(new java.awt.Color(0, 0, 0));
        aplicarFechaFiltro.setText("Aplicar");
        aplicarFechaFiltro.setBorder(null);
        aplicarFechaFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aplicarFechaFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aplicarFechaFiltroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aplicarFechaFiltroMouseExited(evt);
            }
        });
        aplicarFechaFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarFechaFiltroActionPerformed(evt);
            }
        });
        background.add(aplicarFechaFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 90, 40));

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

    private void fechaCaducidadInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCaducidadInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaCaducidadInfoActionPerformed

    private void aplicarFechaFiltroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aplicarFechaFiltroMouseEntered
        // TODO add your handling code here:
        aplicarFechaFiltro.setForeground(Color.BLUE);
    }//GEN-LAST:event_aplicarFechaFiltroMouseEntered

    private void aplicarFechaFiltroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aplicarFechaFiltroMouseExited
        // TODO add your handling code here:
        aplicarFechaFiltro.setForeground(Color.BLACK);
    }//GEN-LAST:event_aplicarFechaFiltroMouseExited

    private void aplicarFechaFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarFechaFiltroActionPerformed
        // TODO add your handling code here:

        //Obtengo lo que quiero buscar
        String texto = fechaCaducidadInfo.getText();

        //Creo un array auxiliar
        ArrayList<VentaCliente> ventasAUXcliente = new ArrayList<>();
        ArrayList<VentaEmpresa> ventasAUXempresa = new ArrayList<>();
        ArrayList<VentaCatering> ventasAUXcatering = new ArrayList<>();

        //Busco y creo la lista que cumpla los filtros
        if(texto.equals("    /  /  "))
        {
            //Borro lo que hubiese
            modeloVentas.clear();

            //Y ahora restablezco la lista
            for(VentaCliente venta : Sistema.getListaVentasClientes())
            {
                String fecha = venta.getFechaVenta().toString();
                String nombreRestaurante = venta.getRestaurante().getNombre();
                String cifRestaurante = venta.getRestaurante().getCif();
                Cliente cliente = venta.getCliente();

                String txt = "Venta realizada el: "+fecha+", con el restaurante "+nombreRestaurante
                        +" con CIF: "+cifRestaurante+", al cliente con nombre "+cliente.getNombre()+" y DNI: "+cliente.getDni()+".";
                modeloVentas.addElement(txt);
            }
            
            //Le aviso de que no esta poniendo ninguna fecha
            JOptionPane.showMessageDialog(this, "Debe poner una fecha", "INFO"
                    , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            // Creo un objeto DateTimeFormatter con el formato deseado
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        
            // Parsear el String utilizando el formateador personalizado
            LocalDate buscado = LocalDate.parse(texto, formateador);

            //Borro lo que hubiese
            modeloVentas.clear();

            //Aplico el filtro

            for(VentaCliente venta : Sistema.getListaVentasClientes())
                {
                    LocalDate fecha = venta.getFechaVenta();
                    if(fecha.isAfter(buscado) )
                    {
                        ventasAUXcliente.add(venta);
                    }
                }
            for(VentaEmpresa venta : Sistema.getListaVentasEmpresas())
                {
                    LocalDate fecha = venta.getFechaVenta();
                    if(fecha.isAfter(buscado) )
                    {
                        ventasAUXempresa.add(venta);
                    }
                }
            for(VentaCatering venta : Sistema.getListaVentasCatering())
                {
                    LocalDate fecha = venta.getFechaVenta();
                    if(fecha.isAfter(buscado) )
                    {
                        ventasAUXcatering.add(venta);
                    }
                }
            

            //Muestro al usuario la lista con los filtros
            for(VentaCliente venta : ventasAUXcliente)

            {
                String fecha = venta.getFechaVenta().toString();
                String nombreRestaurante = venta.getRestaurante().getNombre();
                String cifRestaurante = venta.getRestaurante().getCif();
                Cliente cliente = venta.getCliente();

                String txt = "Venta realizada el: "+fecha+", con el restaurante "+nombreRestaurante
                        +" con CIF: "+cifRestaurante+", al cliente con nombre "+cliente.getNombre()+" y DNI: "+cliente.getDni()+".";
                modeloVentas.addElement(txt);
            }
            for(VentaEmpresa venta : ventasAUXempresa)

            {
                String fecha = venta.getFechaVenta().toString();
                String nombreRestaurante = venta.getRestaurante().getNombre();
                String cifRestaurante = venta.getRestaurante().getCif();
                Empresa empresa = venta.getEmpresa();

                String txt = "Venta realizada el: "+fecha+", con el restaurante "+nombreRestaurante
                        +" con CIF: "+cifRestaurante+", al cliente con nombre "+empresa.getNombre()+" y DNI: "+empresa.getCif()+".";
                modeloVentas.addElement(txt);
            }
            for(VentaCatering venta : ventasAUXcatering)

            {
                String fecha = venta.getFechaVenta().toString();
                String nombreRestaurante = venta.getRestaurante().getNombre();
                String cifRestaurante = venta.getRestaurante().getCif();
                Empresa empresa = venta.getEmpresa();

                String txt = "Venta realizada el: "+fecha+", con el restaurante "+nombreRestaurante
                        +" con CIF: "+cifRestaurante+", al cliente con nombre "+empresa.getNombre()+" y DNI: "+empresa.getCif()+".";
                modeloVentas.addElement(txt);
            }
            

            //Vacio el campo de texto
            fechaCaducidadInfo.setText("");

        }
    }//GEN-LAST:event_aplicarFechaFiltroActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ConsultaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraFunciones;
    private javax.swing.JPanel FondoVerdeDerecha;
    private javax.swing.JButton aplicarFechaFiltro;
    private javax.swing.JButton atrasBoton;
    private javax.swing.JPanel background;
    private javax.swing.JPanel botonExit;
    private javax.swing.JLabel cerrarSesionTexto;
    private javax.swing.JLabel eatsTexto;
    private javax.swing.JLabel exitTexto;
    private javax.swing.JFormattedTextField fechaCaducidadInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel javaTexto;
    private javax.swing.JLabel javaTexto1;
    private javax.swing.JLabel relevanciatexto;
    private javax.swing.JList<String> ventasLista;
    private javax.swing.JFormattedTextField x;
    private javax.swing.JFormattedTextField x1;
    // End of variables declaration//GEN-END:variables
}
