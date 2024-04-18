package ClasesJavaEat;

//IMPORTES
import java.io.Serializable;

/**
 * -Clase encargada de alamcenar todos los datos de una direccion.
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 */
public class Direccion implements Serializable
{
    //ATRIBUTIOS
    private String calle;
    private String numeroCalle;
    private String codigoPostal;
    private String ciudad;
    
    //CONSTRUCTOR
    public Direccion(String calle,String numeroCalle, String codigoPostal, String ciudad)
    {
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }
    
    //METODOS
    
    
    //GETTERS
    public String getCalle(){return this.calle;}
    public String getNumeroCalle(){return this.numeroCalle;}
    public String getCodigoPostal(){return this.codigoPostal;}
    public String getCiudad(){return this.ciudad;}
    
    
    //SETTERS
    public void setCalle(String calle){this.calle = calle;}
    public void setNumeroCalle(String numeroCalle){this.numeroCalle = numeroCalle;}
    public void setCodigoPostal(String codigoPostal){this.codigoPostal = codigoPostal;}
    public void setCiudad(String ciudad){this.ciudad = ciudad;}
    
    //TO STRING
    @Override
    public String toString() 
    {
        return "Direccion{" + "calle=" + calle + ", numeroCalle=" + numeroCalle + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + '}';
    }


    
}
