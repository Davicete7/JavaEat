package ClasesJavaEat;



//IMPORTES
import java.io.Serializable;
import java.time.LocalDate;


/**
 * -Clase encargada de almacenar los datos de una TarjetaDeCredito de un cliente
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 */
public class TarjetaDeCredito implements Serializable
{
    //ATRIBUTOS
    private String nombreTitular;
    private String numeroDeTarjeta;        //Este ocupara EXACTAMENTE 16 dígitos
    private String fechaDeCaducidad;
    
    //CONSTRUCTOR
    public TarjetaDeCredito(String nombreTitular, String numeroDeTarjeta, String fechaDeCaducidad)
    {
        this.nombreTitular = nombreTitular;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.fechaDeCaducidad = fechaDeCaducidad;
    }
    
    //METODOS
    
    
    //GETTERS
    public String getNombreTitular(){return this.nombreTitular;}
    public String getNumeroDeTarjeta(){return this.numeroDeTarjeta;}
    public String getFechaDeCaducidad(){return this.fechaDeCaducidad;}
    
    //SETTERS
    public void setNombreTitular(String nombreTitular){this.nombreTitular = nombreTitular;}
    public void setNumeroDeTarjeta(String numeroDeTarjeta){this.numeroDeTarjeta = numeroDeTarjeta;}
    public void setFechaDeCaducidad(String fechaDeCaducidad){this.fechaDeCaducidad = fechaDeCaducidad;}
    
    //TO STRING
    @Override
    public String toString() 
    {
        return "TarjetaDeCredito{" + "nombreTitular=" + nombreTitular + ", numeroDeTarjeta=" + numeroDeTarjeta + ", fechaDeCaducidad=" + fechaDeCaducidad + '}';
    }
    
}
