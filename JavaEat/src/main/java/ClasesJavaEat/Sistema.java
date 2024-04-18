
package ClasesJavaEat;


//IMPORTES
import InterfazJavaEat.CrearRestaurante;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



/**
 *-Esta clase es la encargada de haecer la mayoria del trabajo en toda la aplicacion
 *-Todos sus metodos deben de ser estaticos ya que asi no deberemos de instanciar la clase nunca
 * @author David Sanchez
 * @version 5.0
 * @since 23/05/2023
 * @see Cliente
 * @see Empresa
 * @see Restaurante
 * @see Comida
 * @see VentaCliente
 * @see VentaEmpresa
 * @see VentaCatering
 * @see CrearRestaurante
 * 
 */
public class Sistema implements Serializable
{
    
    
    //ATRIBUTOS PARA MANEJO DE CARGA Y GUARDADO DE DATOS
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Empresa> listaEmpresas = new ArrayList<>();
    private static ArrayList<Restaurante> listaRestaurantes = new ArrayList<>(); 
    private static ArrayList<Comida> listaComidas = new ArrayList<>();
    private static ArrayList<VentaCliente> listaVentasClientes = new ArrayList<>();
    private static ArrayList<VentaEmpresa> listaVentasEmpresas = new ArrayList<>();
    private static ArrayList<VentaCatering> listaVentasCatering = new ArrayList<>();
    
    //ATRIBUTO RELACIONADO CON LA CARGA DE IMAGENES EN EL JFILECHOOSER
    private static String imagenActual;
    
    //PARA LA COMUNICACION ENTRE INTERFACES
    private static Cliente clienteActual;
    private static Empresa empresaActual;
    private static Restaurante restauranteActual;
    private static ArrayList<Comida> carritoCompra = new ArrayList<>();
    private static ArrayList<Integer> cantidadesCarritoCompra = new ArrayList<>();  //Lista paralela a carrito compra con las cantidades de cada producto
    
    
    //GETTERS
    public static ArrayList<Cliente> getListaClientes(){return listaClientes;}
    public static ArrayList<Empresa> getListaEmpresas(){return listaEmpresas;}
    public static ArrayList<Restaurante> getListaRestaurantes(){return listaRestaurantes;}
    public static ArrayList<Comida> getListaComidas(){return listaComidas;}
    public static Cliente getClienteActual(){return clienteActual;}
    public static Restaurante getRestauranteActual(){return restauranteActual;}
    public static String getImagenActual(){return imagenActual;}
    public static ArrayList<Comida> getCarritoCompra(){return carritoCompra;}
    public static ArrayList<Integer> getCantidadesCarritoCompra(){return cantidadesCarritoCompra;}
    public static ArrayList<VentaCliente> getListaVentasClientes(){return listaVentasClientes;}
    public static Empresa getEmpresaActual(){return empresaActual;}
    public static ArrayList<VentaEmpresa> getListaVentasEmpresas(){return listaVentasEmpresas;}
    public static ArrayList<VentaCatering> getListaVentasCatering(){return listaVentasCatering;}
    
    
    
    
    
    
    
    //SETTERS
    public static void setListaClientes(ArrayList<Cliente> listaClientes){Sistema.listaClientes = listaClientes;}
    public static void setListaEmpresas(ArrayList<Empresa> listaEmpresas){Sistema.listaEmpresas = listaEmpresas;}
    public static void setListaRestaurantes(ArrayList<Restaurante> listaRestaurantes){Sistema.listaRestaurantes = listaRestaurantes;}
    public static void setListaComidas(ArrayList<Comida> listaComidas){Sistema.listaComidas = listaComidas;}
    public static void setClienteActual(Cliente clienteActual) {Sistema.clienteActual = clienteActual;}
    public static void setImagenActual(String imagenActual){Sistema.imagenActual = imagenActual;}
    public static void setRestauranteActual(Restaurante restauranteActual) {Sistema.restauranteActual = restauranteActual;}
    public static void setCarritoCompra(ArrayList<Comida> carritoCompra) {Sistema.carritoCompra = carritoCompra;}
    public static void setCantidadesCarritoCompra(ArrayList<Integer> cantidadesCarritoCompra){Sistema.cantidadesCarritoCompra = cantidadesCarritoCompra;}
    public static void setListaVentasClientes(ArrayList<VentaCliente> listaVentasClientes){Sistema.listaVentasClientes = listaVentasClientes;}
    public static void setEmpresaActual(Empresa empresaActual){Sistema.empresaActual = empresaActual;}
    public static void setListaVentasEmpresas(ArrayList<VentaEmpresa> listaVentasEmpresas){Sistema.listaVentasEmpresas = listaVentasEmpresas;}
    public static void setListaVentasCatering(ArrayList<VentaCatering> listaVentasCatering){Sistema.listaVentasCatering = listaVentasCatering;}




   

    /**
     * -Encargada de cargar en {@link Sistema#listaVentasCatering} los datos almacenados hasta el momento.
     */
    public static void cargarDatosVentasCatering() 
    {
        try 
        {
            try (FileInputStream istreampro = new FileInputStream("ventasCateringInfo.dat")) 
            {
                ObjectInputStream oispro = new ObjectInputStream(istreampro);
                listaVentasCatering = (ArrayList) oispro.readObject();
                System.out.println("Ventas catering cargadas exitosamente");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) 
        {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }
    
    /**
     * -Encargada de guardar en un fichero *.dat el array {@link Sistema#listaVentasCatering}.
     */
    public static void guardarDatosVentasCatering() 
    {
        try 
        {
            //Si hay datos los guardamos...
            if (!listaVentasCatering.isEmpty()) 
            {
                try (FileOutputStream ostreampro = new FileOutputStream("ventasCateringInfo.dat")) 
                {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(listaVentasCatering);
                    System.out.println("Ventas catering guardadas exitosamente");
                }
            } 
            else 
            {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
    
    /**
     * -Encargada de cargar en {@link Sistema#listaVentasEmpresas} los datos almacenados hasta el momento.
     */
    public static void cargarDatosVentasEmpresas() 
    {
        try 
        {
            try (FileInputStream istreampro = new FileInputStream("ventasEmpresasInfo.dat")) 
            {
                ObjectInputStream oispro = new ObjectInputStream(istreampro);
                listaVentasEmpresas = (ArrayList) oispro.readObject();
                System.out.println("Ventas empresas cargadas exitosamente");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) 
        {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }
    
    /**
     * -Encargada de guardar en un fichero *.dat el array {@link Sistema#listaVentasEmpresas}.
     */
    public static void guardarDatosVentasEmpresas() 
    {
        try 
        {
            //Si hay datos los guardamos...
            if (!listaVentasEmpresas.isEmpty()) 
            {
                try (FileOutputStream ostreampro = new FileOutputStream("ventasEmpresasInfo.dat")) 
                {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(listaVentasEmpresas);
                    System.out.println("Ventas empresas guardadas exitosamente");
                }
            } 
            else 
            {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
    
    /**
     * -Encargada de cargar en {@link Sistema#listaVentasClientes} los datos almacenados hasta el momento.
     */
    public static void cargarDatosVentasClientes() 
    {
        try 
        {
            try (FileInputStream istreampro = new FileInputStream("ventasClientesInfo.dat")) 
            {
                ObjectInputStream oispro = new ObjectInputStream(istreampro);
                listaVentasClientes = (ArrayList) oispro.readObject();
                System.out.println("Ventas clientes cargadas exitosamente");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) 
        {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }
    
    /**
     * -Encargada de guardar en un fichero *.dat el array {@link Sistema#listaVentasClientes}.
     */
    public static void guardarDatosVentasClientes() 
    {
        try 
        {
            //Si hay datos los guardamos...
            if (!listaVentasClientes.isEmpty()) 
            {
                try (FileOutputStream ostreampro = new FileOutputStream("ventasClientesInfo.dat")) 
                {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(listaVentasClientes);
                    System.out.println("Ventas clientes guardadas exitosamente");
                }
            } 
            else 
            {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
    
    /**
     * -Encargada de cargar en {@link Sistema#listaRestaurantes} los datos almacenados hasta el momento.
    */
    public static void cargarDatosRestaurantes() 
    {
        try 
        {
            try (FileInputStream istreampro = new FileInputStream("restaurantesInfo.dat")) 
            {
                ObjectInputStream oispro = new ObjectInputStream(istreampro);
                listaRestaurantes = (ArrayList) oispro.readObject();
                System.out.println("Restaurantes cargados exitosamente");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) 
        {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }


    /**
     * -Encargada de guardar en un fichero *.dat el array {@link Sistema#listaRestaurantes}.
     */
    public static void guardarDatosRestaurantes() 
    {
        try 
        {
            //Si hay datos los guardamos...
            if (!listaRestaurantes.isEmpty()) 
            {
                try (FileOutputStream ostreampro = new FileOutputStream("restaurantesInfo.dat")) 
                {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(listaRestaurantes);
                    System.out.println("Restaurantes guardados exitosamente");
                }
            } 
            else 
            {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
    
    /**
     * -Encargada de cargar en {@link Sistema#listaComidas} los datos almacenados hasta el momento.
     */
    public static void cargarDatosComidas() 
    {
        try 
        {
            try (FileInputStream istreampro = new FileInputStream("comidasInfo.dat")) 
            {
                ObjectInputStream oispro = new ObjectInputStream(istreampro);
                listaComidas = (ArrayList) oispro.readObject();
                System.out.println("Comidas cargadas exitosamente");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) 
        {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }


    /**
     * -Encargada de guardar en un fichero *.dat el array {@link Sistema#listaComidas}.
     */
    public static void guardarDatosComidas() 
    {
        try 
        {
            //Si hay datos los guardamos...
            if (!listaComidas.isEmpty()) 
            {
                try (FileOutputStream ostreampro = new FileOutputStream("comidasInfo.dat")) 
                {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(listaComidas);
                    System.out.println("Comidas guardadas exitosamente");
                }
            } 
            else 
            {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
    
    /**
     * -Encargada de cargar en {@link Sistema#listaEmpresas} los datos almacenados hasta el momento.
     */
    public static void cargarDatosEmpresas() 
    {
        try 
        {
            try (FileInputStream istreampro = new FileInputStream("empresasInfo.dat")) 
            {
                ObjectInputStream oispro = new ObjectInputStream(istreampro);
                listaEmpresas = (ArrayList) oispro.readObject();
                System.out.println("Empresas cargadas exitosamente");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) 
        {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }

    /**
     * -Encargada de cargar en {@link Sistema#listaClientes} los datos almacenados hasta el momento.
     */
    public static void cargarDatosClientes() 
    {
        try 
        {
            try (FileInputStream istreampro = new FileInputStream("clientesInfo.dat")) 
            {
                ObjectInputStream oispro = new ObjectInputStream(istreampro);
                listaClientes = (ArrayList) oispro.readObject();
                System.out.println("Clientes cargados exitosamente");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        } 
        catch (ClassNotFoundException cnfe) 
        {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }
 
    /**
     * -Encargada de guardar en un fichero *.dat el array {@link Sistema#listaEmpresas}.
     */
    public static void guardarDatosEmpresas() 
    {
        try 
        {
            //Si hay datos los guardamos...
            if (!listaEmpresas.isEmpty()) 
            {
                try (FileOutputStream ostreampro = new FileOutputStream("empresasInfo.dat")) 
                {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(listaEmpresas); 
                    System.out.println("Empresas guardadas exitosamente");
                }
            } 
            else 
            {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }

    
    /**
     * -Encargada de guardar en un fichero *.dat el array {@link Sistema#listaClientes}.
     */
    public static void guardarDatosClientes() 
    {
        try 
        {
            //Si hay datos los guardamos...
            if (!listaClientes.isEmpty()) 
            {
                try (FileOutputStream ostreampro = new FileOutputStream("clientesInfo.dat")) 
                {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    oospro.writeObject(listaClientes);
                    System.out.println("Clientes guardados exitosamente");
                }
            } 
            else 
            {
                System.out.println("Error: No hay datos...");
            }
        } 
        catch (IOException ioe) 
        {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }

    

    
//**********************************************************************************************************************    
// Metodos para la intefaz de Registro y Inicio de Sesion  (Incluye registros de comidas y restaurantes)

    
    /**
     * -Comprueba si un String esta vacio y devulve al usuario un aviso de que hay un hueco en blanco.
     * @param s String que se desea comprobar.
     * @return boolean en funcion de si es correcto o no.
     * @see JOptionPane {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int) }
     */
    public static boolean esStringCorrecto(String s) 
    {
        boolean esCorrecto = true;
        if (s == null || s.equals("") || s.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Error: " + " Rellene los huecos en blanco", "Espacios en blanco", JOptionPane.INFORMATION_MESSAGE);
            esCorrecto = false;
        }
        return esCorrecto;
    }
    

        /**
         * -Comprueba que la fecha introducida es correcta para una tarjeta de credito.
         * @param fechaCadStr la fecha convertida en String con formato MM/yyyy de {@link LocalDate}.
         * @return boolean en funcion de si es correcta o no.
         * @see JOptionPane {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int) }.
         */
        public static boolean esFechaCorrecta(String fechaCadStr) 
        {
            boolean esCorrecta = true;
            String[] partes = fechaCadStr.split("/");
            int m1 = Integer.parseInt(partes[0]);
            int a1 = Integer.parseInt(partes[1]);
            if (m1 < 1 || m1 > 12) 
            {
                JOptionPane.showMessageDialog(null, "Error: " + " Introduce un mes mayor o igual a 1 y menor o igual a 12", "ERROR FECHA", JOptionPane.INFORMATION_MESSAGE);
                esCorrecta = false;
            } 
            else if (a1 < LocalDate.now().getYear()) 
            {
                JOptionPane.showMessageDialog(null, "Error: " + " Introduce un año mayor o igual al actual (" + LocalDate.now().getYear() + ")", "ERROR FECHA", JOptionPane.INFORMATION_MESSAGE);
                esCorrecta = false;
            } 
            else if (LocalDate.now().getYear() + 5 < a1) 
            {
                JOptionPane.showMessageDialog(null, "Error: " + " Las tarjetas del " + LocalDate.now().getYear() + " caducaran como maximo en " + (LocalDate.now().getYear() + 5), "ERROR FECHA", JOptionPane.INFORMATION_MESSAGE);
                esCorrecta = false;
            } 
            else if (a1 == LocalDate.now().getYear() && m1 < LocalDate.now().getMonthValue()) 
            {
                JOptionPane.showMessageDialog(null, "Error: " + " Introduzca un mes que sea mayor al actual", "ERROR FECHA", JOptionPane.INFORMATION_MESSAGE);
                esCorrecta = false;
            }
            return esCorrecta;
        }
        
    
        /**
         * Comprueba si el correo introducido es un correo con un formato correcto.
         * @param correo String
         * @return boolean en funcion de si es correcto o no.
         * @see JOptionPane {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int) }.
         * @see Pattern {@link Pattern#matcher(java.lang.CharSequence) },{@link Pattern#compile()}
         * @see Matcher {@link Matcher#find()}
         */
    public static boolean esCorreoCorrecto(String correo) 
    {
        boolean esCorrecto = false;
        if (correo == null || correo.equals("") || correo.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Error: " + " Rellene los huecos en blanco del correo", "Espacios en blanco", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(correo.equals("admin@javaeat.com"))
        {
            JOptionPane.showMessageDialog(null, "El correo 'admin@javaeat.com esta' "
                    + "reservado para uso de desarrolladores, "
                    + "porfavor registre otro correo", "COORREO RESERVADO", JOptionPane.INFORMATION_MESSAGE);
        }
        else 
        {
            // Patrón para validar el email
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");;
            Matcher mather = pattern.matcher(correo);

            if (mather.find() == true) {
                esCorrecto = true;
            } else {
                JOptionPane.showMessageDialog(null, "El correo introduccido no es válido", "Correo incorrecto", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return esCorrecto;
    }
    
    
    
    /**
     * -Comprueba si los datos introducidos coninciden con alguna empresa de {@link Sistema#listaEmpresas}.
     * @param correo correo de la empresa.
     * @param contrasena contraseña de la empresa.
     * @param listaEmpresas lista con todas las empresas en las que se desea buscar.
     * @return  booleano en funcion de si existe o no.
     */
    public static boolean existeEmpresa(String correo, String contrasena, ArrayList<Empresa> listaEmpresas) {

        boolean existeEmpresa = false;
        if (!listaEmpresas.isEmpty())
        { 
            for (Empresa empresa : listaEmpresas) 
            {
                String correoEmpresa = empresa.getCorreoElectronico();
                String contrasenaEmpresa = empresa.getClave();
                if (correoEmpresa.equals(correo) && contrasenaEmpresa.equals(contrasena)) 
                {
                    existeEmpresa = true;
                }
            }
        }
        return existeEmpresa;
    }
    
    
    
    /**
     * -Añade una empresa a{@link Sistema#listaEmpresas} comprobando antes si ya existe dentro de la lista.
     * @param e empresa que se desea añadir.
     * @return booleano en funcion de si la a añadido o no.
     * @see JOptionPane {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}.
     */
    public static boolean anadirEmpresa(Empresa e) // e = empresa
        {
            boolean distintos = true;
            boolean anadido = false;
            for (Empresa el : listaEmpresas) //el = empresa en la lista
            {
                if (
                        e.getCif().equals(el.getCif())                                  || 
                        e.getWeb().equals(el.getWeb())                                  ||
                        e.getTelefono().equals(el.getTelefono())                        ||
                        e.getCorreoElectronico().equals(el.getCorreoElectronico())
                    ) 
                        {
                            distintos = false;
                        }
            }
            if (distintos) 
            {
                listaEmpresas.add(e);
                anadido = true;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Ya existe una empresa con estos datos, porfavor inicia sesion con estos datos", "Cuenta existente", JOptionPane.WARNING_MESSAGE);
            }
            return anadido;
        }
        
    /**
     * -Comprueba si los datos introducidos coninciden con algun cliente de {@link Sistema#listaClientes}.
     * @param correo correo del cliente.
     * @param contrasena contraseña del cliente.
     * @param listaClientes  lista con todas los clientes en las que se desea buscar.
     * @return  booleano en funcion de si existe o no.
     */
    public static boolean existeCliente(String correo, String contrasena, ArrayList<Cliente> listaClientes) 
        {

            boolean existeCliente = false;
            if (!listaClientes.isEmpty())
            { 
                for (Cliente cliente : listaClientes) 
                {
                    String correoCliente = cliente.getCorreoElectronico();
                    String contrasenaCliente = cliente.getClave();
                    if (correoCliente.equals(correo) && contrasenaCliente.equals(contrasena)) 
                    {
                        existeCliente = true;
                    }
                }
            }
            return existeCliente;
        }
        
    /**
     * -Le pasa a {@link Sistema#clienteActual} el {@link Cliente} que se esta logeando en la aplicacion.
     * @param correo correo del Cliente que se logea
     * @param contrasena contraseña del cliente que se logea
     * @param listaClientes lista de clientes que hay registrados en la aplicacion
     */
    public static void actualizarClienteActual(String correo, String contrasena, ArrayList<Cliente> listaClientes) 
        {
 
            for (Cliente cliente : listaClientes) 
            {
                String correoCliente = cliente.getCorreoElectronico();
                String contrasenaCliente = cliente.getClave();
                if (correoCliente.equals(correo) && contrasenaCliente.equals(contrasena)) 
                {
                    setClienteActual(cliente);
                }
            }
        }
    

    /**
     * -Añade un cliente a{@link Sistema#listaClientes} comprobando antes si ya existe dentro de la lista.
     * @param c cliente que se desea añadir.
     * @return booleano en funcion de si se le a añadido o no.
     * @see JOptionPane {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}.
     */
    public static boolean anadirCliente(Cliente c) //C = cliente
        {
            boolean distintos = true;
            boolean anadido = false;
            for (Cliente cl : listaClientes) //cl = cliente en la lista
            {
                if (
                        c.getDni().equals(cl.getDni())                                  || 
                        c.getTelefono().equals(cl.getTelefono())                        || 
                        c.getCorreoElectronico().equals(cl.getCorreoElectronico())
                    ) 
                        {
                            distintos = false;
                        }
            }
            if (distintos) 
            {
                listaClientes.add(c);
                anadido = true;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Ya existe una cuenta con estos datos, porfavor inicia sesion con ella", "Cuenta existente", JOptionPane.WARNING_MESSAGE);
            }
            return anadido;
        }
        
    
    /**
     * -Comprueba si la imagen es distinta a la que hay por defecto con la ruta "fondoNegro.png".
     * @param imagen ruta de la imagen
     * @return boolean en funcion de si es correcta o no.
     * @see JOptionPane {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}.
     */
    public static boolean esImagenCorrecta(String imagen) 
        {
            boolean esCorrecto = true;
            if (imagen.equals("fondoNegro.png")) 
            {
                JOptionPane.showMessageDialog(null, "Porfavor, seleccione una imagen", "Falta de imagen", JOptionPane.WARNING_MESSAGE);
                esCorrecto = false;
            }
            return esCorrecto;
        }
    
    /**
     * -Añade una comida a {@link Sistema#listaComidas}.
     * @param c comida que se desea añadir.
     * @return boolean en funcion de si la añade o no.
     * @see JOptionPane {@link JOptionPane#showMessageDialog(java.awt.Component, java.lang.Object, java.lang.String, int)}.
     */
    public static boolean anadirComida(Comida c) // c = Comida
        {
            boolean distintos = true;
            boolean anadido = false;
            for (Comida cl : listaComidas) //cl = Comida en la lista
            {
                if (
                        c.getNombreComida().equals(cl.getNombreComida())
                    ) 
                        {
                            distintos = false;
                        }
            }
            if (distintos) 
            {
                listaComidas.add(c);
                anadido = true;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Ya existe una empresa con estos datos, porfavor inicia sesion con estos datos", "Cuenta existente", JOptionPane.WARNING_MESSAGE);
            }
            return anadido;
        }
        
    
    /**
     * -Elimina una comida de {@link Sistema#listaComidas}
     * @param index indice de la comida que se quiere eliminar
     */
    public static void eliminarComida(int index)
        {
            listaComidas.remove(index);
        }
    
    /**
     * -Obtiene una comida de {@link Sistema#listaComidas}
     * @param index indice de la comida que se quiere obtener
     */
    public static Comida getComida(int index)
        {
            return listaComidas.get(index);
        }
     
    /**
     * -Ccomprueba si el plato que se proporciona ya esta en {@link CrearRestaurante#listaMenu}.
     * @param plato {@link Comida} que se quiere comprobar.
     * @return boolean en funcion de si esta añadido o no.
     */
    public static boolean esPlatoAñadido(Comida plato)
        {
            //Miro si ese plato ya esta añadido
            boolean annadido = false;
            for (Comida platoLista : CrearRestaurante.getListaMenu())
            {
                if(platoLista.getNombreComida().equals(plato.getNombreComida()))
                {
                    annadido = true;
                    break;          //Para que no siga recoriendo la lista
                }
            }
            return annadido;
        }
    
    /**
     * -Comprueba si existe un restaurante en la lista de restaurantes que se proporciona.
     * @param cif cif del {@link Restaurante} que se quiere comprobar.
     * @param nombre nombre del {@link Restaurante} que se quiere comprobar.
     * @param listaRestaurantes lista de restaurantes en la que se quiere buscar.
     * @return  boolean en funcion de si existe o no.
     */
    public static boolean existeRestaurante(String cif, String nombre, ArrayList<Restaurante> listaRestaurantes) 
        {

            boolean existeRestaurante = false;
            if (listaRestaurantes.isEmpty())
            { 
                for (Restaurante restaurante : listaRestaurantes) 
                {
                    String cifRes = restaurante.getCif();
                    String nombreRes = restaurante.getNombre();
                    if (cifRes.equals(cif) || nombreRes.equals(nombre)) 
                    {
                        existeRestaurante = true;
                    }
                }
            }
            return existeRestaurante;
        }
    

    /**
     * -Añade un {@link Restaurante} a {@link Sistema#listaRestaurantes}.
     * @param restaurante restaurante que se quiere añadir
     */
    public static void añadirRestaurante(Restaurante restaurante)
        {
            listaRestaurantes.add(restaurante);
        }
     
    /**
     * -Elimina un {@link Restaurante} de {@link Sistema#listaRestaurantes}.
     * @param index indice del restaurante que se quiere eliminar
     */
    public static void eliminarRestaurante(int index)
        {
            listaRestaurantes.remove(index);
        }
        
        
    /**
     * -Manda a {@link Sistema#empresaActual} la {@link Empresa} que se a logeado en la aplicacion.
     * @param correo correo de la empresa que se quiere actualizar.
     * @param contrasena contraseña de la empresa que se quiere actualizar.
     * @param listaEmpresas lista de empresas en la que reside la {@link Empresa} que se quiere actualizar
     */
    public static void actualizarEmpresaActual(String correo, String contrasena, ArrayList<Empresa> listaEmpresas) 
        {
 
            for (Empresa empresa : listaEmpresas) 
            {
                String correoEmpresa = empresa.getCorreoElectronico();
                String contrasenaEmpresa = empresa.getClave();
                if (correoEmpresa.equals(correo) && contrasenaEmpresa.equals(contrasena)) 
                {
                    setEmpresaActual(empresa);
                }
            }
        }
        
        
    
    
    
        
//***********************************************************************************************************************************
//Para la generacion de una compra por parte de un CLIENTE o EMPRESA
        /**
         * -Añade una {@link Comida} al {@link Sistema#carritoCompra}.
         * @param comida comida que se quiere añadir.
         */
        public static void annadirComidaCarritoCompra(Comida comida)
        {
            carritoCompra.add(comida);
        }
        
        /**
         * -Elimina una {@link Comida} al {@link Sistema#carritoCompra}.
         * @param index de la comida que se quiere eliminar.
         */
        public static void eliminarComidaCarritoCompra(int index)
        {
            carritoCompra.remove(index);
        }
        
        /**
         * -Añade una cantidad a {@link Sistema #carritoCompra}.
         * @param cantidad cantidad que se quiere añadir.
         */
        public static void annadirCantidadCarritoCompra(int cantidad)
        {
            cantidadesCarritoCompra.add(cantidad);
        }
        
        /**
         * -Elimina una cantidad de {@link Sistema #carritoCompra}.
         * @param cantidad cantidad que se quiere eliminar.
         */
        public static void eliminarCantidadCarritoCompra(int cantidad)
        {
            cantidadesCarritoCompra.remove(cantidad);
        }
        
        /**
         * -Añade una venta a{@link Sistema#listaVentasClientes}.
         * @param venta venta que se quiere añadir
         */
        public static void annadirVentaCliente(VentaCliente venta)
        {
            listaVentasClientes.add(venta);
        }
        
        /**
         * -Añade una venta a{@link Sistema#listaVentasEmpresas}.
         * @param venta venta que se quiere añadir
         */
        public static void annadirVentaEmpresa(VentaEmpresa venta)
        {
            listaVentasEmpresas.add(venta);
        }
        
        /**
         * -Añade una venta a{@link Sistema#listaVentasCatering}.
         * @param venta venta que se quiere añadir
         */
        public static void annadirVentaCatering(VentaCatering venta)
        {
            listaVentasCatering.add(venta);
        }
        
    
        
        
    /**
     * -Genera una factura de una {@link VentaCliente} generando un fichero de texto con los datos.
     * @param venta venta de la que se quiere hacer la factura.
     * @throws IOException 
     */   
    public static void generaFacturaCliente(VentaCliente venta) throws IOException {

        Cliente cliente = venta.getCliente();
        String rutaFicheroFactura = "./Facturas/Factura(" + cliente.getDni() + ").txt";

        try {
            //Si no existe el directorio Facturas, lo creamos
            File dirFacturas = new File("./Facturas");

            if (!dirFacturas.exists()) 
            {
                dirFacturas.mkdir();
            }

            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {

                salida.println("¦==================================// Factura Venta //====================================/");
                salida.println("¦");
                salida.println("¦------------------------------------    Datos Cliente    ---------------------------------");
                salida.println("¦");
                salida.println("¦ » DNI: " + cliente.getDni());
                salida.println("¦ » Nombre: " + cliente.getNombre());
                salida.println("¦ » Correo: " + cliente.getCorreoElectronico());
                salida.println("¦");
                salida.println("¦------------------------------------  Datos Venta  ---------------------------------------");
                salida.println("¦");
                salida.println("¦ » Fecha De la Venta: " + venta.getFechaVenta().toString());
                salida.println("¦ » Comidas compradas: " + venta.getListaCompra().toString());
                salida.println("¦ » Cantidades compradas: " + venta.getListaCantidades().toString());
                salida.println("¦");
                salida.println("¦------------------------------------  Datos Restaurante  ---------------------------------");
                salida.println("¦");
                salida.println("¦ » CIF: " + venta.getRestaurante().getCif());
                salida.println("¦ » Nombre: " + venta.getRestaurante().getNombre());
                salida.println("¦ » Especialidad: " + venta.getRestaurante().getEspecialidad());
                salida.println("¦");
                salida.println("¦------------------------------------------------------------------------------------------");
                salida.println("¦");
                salida.println("¦ » JAVAEATS © By David Sanchez Sanchez. ");
                salida.println("¦");
                salida.println("¦------------------------------------------------------------------------------------------");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
    
    /**
     * -Genera una factura de una {@link VentaEmpresa} generando un fichero de texto con los datos.
     * @param venta venta de la que se quiere hacer la factura.
     * @throws IOException 
     */ 
    public static void generaFacturaEmpresa(VentaEmpresa venta) throws IOException {

        Empresa empresa = venta.getEmpresa();
        String rutaFicheroFactura = "./Facturas/Factura(" + empresa.getCif() + ").txt";

        try {
            //Si no existe el directorio Facturas, lo creamos
            File dirFacturas = new File("./Facturas");

            if (!dirFacturas.exists()) 
            {
                dirFacturas.mkdir();
            }

            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {

                salida.println("¦==================================// Factura Venta //====================================/");
                salida.println("¦");
                salida.println("¦------------------------------------    Datos Empresa    ---------------------------------");
                salida.println("¦");
                salida.println("¦ » DNI: " + empresa.getCif());
                salida.println("¦ » Nombre: " + empresa.getNombre());
                salida.println("¦ » Correo: " + empresa.getCorreoElectronico());
                salida.println("¦");
                salida.println("¦------------------------------------  Datos Venta  ---------------------------------------");
                salida.println("¦");
                salida.println("¦ » Fecha De la Venta: " + venta.getFechaVenta().toString());
                salida.println("¦ » Comidas compradas: " + venta.getListaCompra().toString());
                salida.println("¦ » Cantidades compradas: " + venta.getListaCantidades().toString());
                salida.println("¦");
                salida.println("¦------------------------------------  Datos Restaurante  ---------------------------------");
                salida.println("¦");
                salida.println("¦ » CIF: " + venta.getRestaurante().getCif());
                salida.println("¦ » Nombre: " + venta.getRestaurante().getNombre());
                salida.println("¦ » Especialidad: " + venta.getRestaurante().getEspecialidad());
                salida.println("¦");
                salida.println("¦------------------------------------------------------------------------------------------");
                salida.println("¦");
                salida.println("¦ » JAVAEATS © By David Sanchez Sanchez. ");
                salida.println("¦");
                salida.println("¦------------------------------------------------------------------------------------------");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
    
    /**
     * -Genera una factura de una {@link VentaCatering} generando un fichero de texto con los datos.
     * @param venta venta de la que se quiere hacer la factura.
     * @throws IOException 
     */ 
    public static void generaFacturaCatering(VentaCatering venta) throws IOException {

        Empresa empresa = venta.getEmpresa();
        String rutaFicheroFactura = "./Facturas/Factura(" + empresa.getCif() + ").txt";

        try {
            //Si no existe el directorio Facturas, lo creamos
            File dirFacturas = new File("./Facturas");

            if (!dirFacturas.exists()) 
            {
                dirFacturas.mkdir();
            }

            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {

                salida.println("¦==================================// Factura Venta //====================================/");
                salida.println("¦");
                salida.println("¦------------------------------------    Datos Empresa    ---------------------------------");
                salida.println("¦");
                salida.println("¦ » DNI: " + empresa.getCif());
                salida.println("¦ » Nombre: " + empresa.getNombre());
                salida.println("¦ » Correo: " + empresa.getCorreoElectronico());
                salida.println("¦");
                salida.println("¦------------------------------------  Datos Venta  ---------------------------------------");
                salida.println("¦");
                salida.println("¦ » Venta con inclusion de un servicio de CATERING");
                salida.println("¦ » Fecha De la Venta: " + venta.getFechaVenta().toString());
                salida.println("¦ » Comidas compradas: " + venta.getListaCompra().toString());
                salida.println("¦ » Cantidades compradas: " + venta.getListaCantidades().toString());
                salida.println("¦ » Servicios prestados: " + venta.getServicioPrestados().toString());
                salida.println("¦ » Lugar: " + venta.getLugar());
                salida.println("¦");
                salida.println("¦------------------------------------  Datos Restaurante  ---------------------------------");
                salida.println("¦");
                salida.println("¦ » CIF: " + venta.getRestaurante().getCif());
                salida.println("¦ » Nombre: " + venta.getRestaurante().getNombre());
                salida.println("¦ » Especialidad: " + venta.getRestaurante().getEspecialidad());
                salida.println("¦");
                salida.println("¦------------------------------------------------------------------------------------------");
                salida.println("¦");
                salida.println("¦ » JAVAEATS © By David Sanchez Sanchez. ");
                salida.println("¦");
                salida.println("¦------------------------------------------------------------------------------------------");
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
    
    
//***********************************************************************************************************************************
//Para la modificacion de datos de CLIENTES Y EMPRESAS
    
    
    /**
     * -Elimina un cliente de {@link Sistema#listaClientes}.
     * @param index index del cliente que se quiere eliminar.
     */
    public static void eliminarCliente(int index)
    {
        listaClientes.remove(index);
    }
    
    /**
     * -Elimina una empresa de {@link Sistema#listaEmpresas}.
     * @param index index de la empresa que se quiere eliminar.
     */
    public static void eliminarEmpresa(int index)
    {
        listaEmpresas.remove(index);
    }

//***********************************************************************************************************************************

        
        
        
        
        
        
        
        
        
}
