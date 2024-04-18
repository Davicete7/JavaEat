
package ClasesJavaEat;

//IMPORTES
import java.io.Serializable;
import java.util.ArrayList;


/**
 *-Clase encargada de almacenar todos los datos de una comida.
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 */
public class Comida implements Serializable
{
    //ATRIBUTOS
    private String nombreComida;
    private ArrayList<String> ingredientes;
    private String precio;
    private String rutaImagen;                  //Como no se puede añadir una imagen, se le añadira la ruta de la imagen
    
    
    
    //CONSTRUCTORES
    public Comida(String nombreComida, ArrayList<String> ingredientes, String precio, String rutaImagen)
    {
        this.nombreComida = nombreComida;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
    }
    
    
    //METODOS
    
    
    //GETTERS
    public String getNombreComida(){return nombreComida;}
    public ArrayList<String> getIngredientes(){return ingredientes;}
    public String getPrecio(){return precio;}
    public String getRutaImagen(){return rutaImagen;}
    
    
    //SETTERS
    public void setNombreComida(String nombreComida){this.nombreComida = nombreComida;}
    public void setIngredientes(ArrayList<String> ingredientes){this.ingredientes = ingredientes;}
    public void setPrecio(String precio){this.precio = precio;}
    public void setRutaImagen(String rutaImagen){this.rutaImagen = rutaImagen;}    
    
         
    //TO STRING
    @Override
    public String toString() 
    {
        return "Comida{" + "nombreComida=" + nombreComida + ", ingredientes=" + ingredientes + ", precio=" + precio + ", rutaImagen=" + rutaImagen + '}';
    }
    
    
}
