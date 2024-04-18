package ClasesJavaEat;



//IMPORTES
import java.io.Serializable;
import java.util.ArrayList;
import ClasesJavaEat.Comida;

/**
 * -Clase encargada de almacenar todos los datos de un restaurante.
 * @author David Sanchez
 * @version 1.0
 * @since 23/05/2023
 * @see Comida
 * @see Direccion
 */
public class Restaurante implements Serializable
{
    //ATRIBUTOS
    private String cif;
    private String nombre;
    private Direccion direccion;
    private String especialidad;        //Que tipo de restaurante es (Asiatico, Chino, Americano, Español, Italiano, Pizzeria, Especializado en Pastas, etc...)
    private String calificacion;        //Media de opiniones sobre 5 (Posibles calificaciones 1,2,3,4,5).
    private String gastosDeEnvio;
    private String minTiempoEnvio;
    private boolean servicioCateringEmpresas;
    private ArrayList<Comida> listaComidas;
    
    
    //CONSTRUCTORES
    public Restaurante(String cif, String nombre, Direccion direccion, String especialidad, 
                        String calificacion, String gastosDeEnvio, String minTiempoEnvio
                        , boolean servicioCateringEmpresas, ArrayList<Comida> listaComidas)
    {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.calificacion = calificacion;
        this.gastosDeEnvio = gastosDeEnvio;
        this.minTiempoEnvio = minTiempoEnvio;
        this.servicioCateringEmpresas = servicioCateringEmpresas;
        this.listaComidas = listaComidas;
    }
    
    //METODOS
    
    
    //GETTERS
    public String getCif(){return cif;}
    public String getNombre(){return nombre;}
    public Direccion getDireccion(){return direccion;}
    public String getEspecialidad(){return especialidad;}
    public String getCalificacion(){return calificacion;}
    public String getGastosDeEnvio(){return gastosDeEnvio;}
    public String getMinTiempoEnvio(){return minTiempoEnvio;}
    public boolean isServicioCateringEmpresas(){return servicioCateringEmpresas;}
    public ArrayList<Comida> getListaComidas(){return listaComidas;}
    
    
    //SETTERS
    public void setCif(String cif){this.cif = cif;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setDireccion(Direccion direccion){this.direccion = direccion;}
    public void setEspecialidad(String especialidad){this.especialidad = especialidad;}
    public void setCalificacion(String calificacion){this.calificacion = calificacion;}
    public void setGastosDeEnvio(String gastosDeEnvio){this.gastosDeEnvio = gastosDeEnvio;}
    public void setMinTiempoEnvio(String minTiempoEnvio){this.minTiempoEnvio = minTiempoEnvio;}
    public void setServicioCateringEmpresas(boolean servicioCateringEmpresas){this.servicioCateringEmpresas = servicioCateringEmpresas;}
    public void setListaComidas(ArrayList<Comida> listaComidas){this.listaComidas = listaComidas;}
    
    //TO STRING
    @Override
    public String toString() 
    {
        return "Restaurante{" + "cif=" + cif + ", nombre=" + nombre + ", direccion=" 
                + direccion + ", especialidad=" + especialidad + ", calificacion=" 
                + calificacion + ", gastosDeEnvio=" + gastosDeEnvio + ", minTiempoEnvio=" 
                + minTiempoEnvio + ", servicioCateringEmpresas=" + servicioCateringEmpresas 
                + ", listaComidas=" + listaComidas + '}';
    }

    
    
}
