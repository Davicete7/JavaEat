package ClasesJavaEat;


//IMPORTES
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * -Clase encargada de alamcenar los datos de una venta realizada a una empresa que oncluye el servicio de CATERING.
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 */
public class VentaCatering implements Serializable
{
    //ATRIBUTOS
    private LocalDate fechaVenta;
    private Restaurante restaurante;
    private ArrayList<Comida> listaCompra;
    private ArrayList<Integer> listaCantidades;
    private Empresa empresa;
    private ArrayList<String> servicioPrestados;
    private String lugar;
    
    
    //CONSTRUCTORES
    public VentaCatering(LocalDate fechaVenta, Restaurante restaurante
            , ArrayList<Comida> listaCompra, ArrayList<Integer> listaCantidades, Empresa empresa, ArrayList<String> serviciosPrestados, String lugar) 
    {
        this.fechaVenta = fechaVenta;
        this.restaurante = restaurante;
        this.listaCompra = listaCompra;
        this.listaCantidades = listaCantidades;
        this.empresa = empresa;
        this.servicioPrestados = serviciosPrestados;
        this.lugar = lugar;
    }
    
    //METODOS


    //GETTERS
    public LocalDate getFechaVenta(){return fechaVenta;}
    public Restaurante getRestaurante(){return restaurante;}
    public ArrayList<Comida> getListaCompra(){return listaCompra;}
    public ArrayList<Integer> getListaCantidades(){return listaCantidades;}
    public Empresa getEmpresa(){return empresa;}
    public ArrayList<String> getServicioPrestados(){return servicioPrestados;}
    public String getLugar(){return lugar;}
    
    
    
    //SETTERS
    public void setFechaVenta(LocalDate fechaVenta){this.fechaVenta = fechaVenta;}
    public void setRestaurante(Restaurante restaurante){this.restaurante = restaurante;}
    public void setListaCompra(ArrayList<Comida> listaCompra){this.listaCompra = listaCompra;}
    public void setListaCantidades(ArrayList<Integer> listaCantidades){this.listaCantidades = listaCantidades;}
    public void setEmpresa(Empresa empresa){this.empresa = empresa;}
    public void setServicioPrestados(ArrayList<String> servicioPrestados){this.servicioPrestados = servicioPrestados;}
    public void setLugar(String lugar){this.lugar = lugar;}
    
    //TO STRING
    @Override
    public String toString() {
        return "VentaCatering{" + "fechaVenta=" + fechaVenta + ", restaurante=" 
                + restaurante + ", listaCompra=" + listaCompra + ", listaCantidades=" 
                + listaCantidades + ", empresa=" + empresa + ", servicioPrestados=" 
                + servicioPrestados + ", lugar=" + lugar + '}';
    }
    
    




    
}
