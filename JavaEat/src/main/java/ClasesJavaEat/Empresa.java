package ClasesJavaEat;


//IMPORTES
import java.io.Serializable;

/**
 * -Clase encargada de almacenar todos los datos que corresponda a una empresa.
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 * @see Direccion
 * @see TarjetaDeCredito
 */
public class Empresa implements Serializable
{
    //ATRIBUTOS
    private String cif;
    private String nombre;
    private String correoElectronico;
    private String clave;
    private Direccion direccion;
    private TarjetaDeCredito tarjetaDeCredito;
    private String telefono;
    private String web;
    
    //CONSTRUCTORES
    public Empresa(String cif, String nombre, String correoElectronico, String clave
            , Direccion direccion, TarjetaDeCredito tarjetaDeCredito, String telefono, String web)
    {
        this.cif = cif;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.clave = clave;
        this.direccion = direccion;
        this.tarjetaDeCredito = tarjetaDeCredito;
        this.telefono = telefono;
        this.web = web;    
    }
    
    //METODOS
    
    
    //GETTERS
    public String getCif(){return cif;}
    public String getNombre(){return nombre;}
    public String getCorreoElectronico(){return correoElectronico;}
    public String getClave(){return clave;}
    public Direccion getDireccion(){return direccion;}
    public TarjetaDeCredito getTarjetaDeCredito(){return tarjetaDeCredito;}
    public String getTelefono(){return telefono;}
    public String getWeb(){return web;}
    
    //SETTERS
    public void setCif(String cif){this.cif = cif;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCorreoElectronico(String correoElectronico){this.correoElectronico = correoElectronico;}
    public void setClave(String clave){this.clave = clave;}
    public void setDireccion(Direccion direccion){this.direccion = direccion;}
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){this.tarjetaDeCredito = tarjetaDeCredito;}
    public void setTelefono(String telefono){this.telefono = telefono;}
    public void setWeb(String web){this.web = web;}
    
    //TO STRING
    @Override
    public String toString() 
    {
        return "Empresa{" + "cif=" + cif + ", nombre=" + nombre + ", correoElectronico=" 
                + correoElectronico + ", clave=" + clave + ", direccion=" + direccion + ", tarjetaDeCredito=" 
                + tarjetaDeCredito + ", telefono=" + telefono + ", web=" + web + '}';
    }
    

    
}
