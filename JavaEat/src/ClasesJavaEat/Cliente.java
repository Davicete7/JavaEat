package ClasesJavaEat;


//IMPORTES
import java.io.Serializable;
import java.time.LocalDate;


/**
 * -Clase encargada de guardar todos los datos de un cliente.
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 * @see Direccion
 * @see TarjetaDeCredito
*/
public class Cliente implements Serializable
{
    //ATRIBUTOS
    private String dni;
    private String nombre;
    private String correoElectronico;
    private String clave;
    private Direccion direccion;
    private TarjetaDeCredito tarjetaDeCredito;
    private String telefono;
    
    //CONSTRUCTOR
    public Cliente(String dni, String nombre, String correoElectronico, String clave
            , Direccion direccion, TarjetaDeCredito tarjetaDeCredito, String telefono)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.clave = clave;
        this.direccion = direccion;
        this.tarjetaDeCredito = tarjetaDeCredito;
        this.telefono = telefono;
    }
    
    //METODOS
    
    
    //GETTERS
    public String getDni(){return dni;}
    public String getNombre(){return nombre;}
    public String getCorreoElectronico(){return correoElectronico;}
    public String getClave(){return clave;}
    public Direccion getDireccion(){return direccion;}
    public TarjetaDeCredito getTarjetaDeCredito(){return tarjetaDeCredito;}
    public String getTelefono(){return telefono;}

    //SETTERS
    public void setDni(String dni){this.dni = dni;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setCorreoElectronico(String correoElectronico){this.correoElectronico = correoElectronico;}
    public void setClave(String clave){this.clave = clave;}
    public void setDireccion(Direccion direccion){this.direccion = direccion;}
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){this.tarjetaDeCredito = tarjetaDeCredito;}
    public void setTelefono(String telefono){this.telefono = telefono;}

    //TO STRING
    @Override
    public String toString() 
    {
        return "ClienteParticular{" + "dni=" + dni + ", nombre=" + nombre + ", correoElectronico=" 
                + correoElectronico + ", clave=" + clave + ", direccion=" + direccion + ", tarjetaDeCredito=" 
                + tarjetaDeCredito + ", telefono=" + telefono + '}';
    }
    
    
}
