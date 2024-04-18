
package ClasesJavaEat;


//IMPORTES
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * -Clase encargada de almacenar los datos de una venta realizada a una empresa.
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 */
public class VentaEmpresa implements Serializable
{
    //ATRIBUTOS
    private LocalDate fechaVenta;
    private Restaurante restaurante;
    private ArrayList<Comida> listaCompra;
    private ArrayList<Integer> listaCantidades;
    private Empresa empresa;
    
    
    //CONSTRUCTORES
    public VentaEmpresa(LocalDate fechaVenta, Restaurante restaurante
            , ArrayList<Comida> listaCompra, ArrayList<Integer> listaCantidades, Empresa empresa) 
    {
        this.fechaVenta = fechaVenta;
        this.restaurante = restaurante;
        this.listaCompra = listaCompra;
        this.listaCantidades = listaCantidades;
        this.empresa = empresa;
    }
    
    //METODOS


    //GETTERS
    public LocalDate getFechaVenta(){return fechaVenta;}
    public Restaurante getRestaurante(){return restaurante;}
    public ArrayList<Comida> getListaCompra(){return listaCompra;}
    public ArrayList<Integer> getListaCantidades(){return listaCantidades;}
    public Empresa getEmpresa(){return empresa;}
    
    
    //SETTERS
    public void setFechaVenta(LocalDate fechaVenta){this.fechaVenta = fechaVenta;}
    public void setRestaurante(Restaurante restaurante){this.restaurante = restaurante;}
    public void setListaCompra(ArrayList<Comida> listaCompra){this.listaCompra = listaCompra;}
    public void setListaCantidades(ArrayList<Integer> listaCantidades){this.listaCantidades = listaCantidades;}
    public void setEmpresa(Empresa empresa){this.empresa = empresa;}

    //TO STRING
    @Override
    public String toString() {
        return "Venta{" + "fechaVenta=" + fechaVenta + ", restaurante=" + restaurante 
                 + ", listaCompra=" + listaCompra + ", listaCantidades=" + listaCantidades + ", cliente=" + empresa + '}';
    }
    




    
}
