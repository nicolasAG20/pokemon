
package pokemon.models;

/**
 * 
 * @author Nicolas Agudelo 
 * @author Vanessa Toro
 * @version 20250331
 * @since  1.0
 * 
 */
public abstract class Pokemon {
    /**
     * atributos
     */
    // numero del pokemon en la pokedex
    private int numPokedex; 
    // nombre del pokemon
    private String nombre;
    // peso del pokemon
    private double peso;
    // temporada en la que salio el pokemon
    private int temporada; 
    /**
     * 
     * @return La accion realizada ( placaje )
     */
    public abstract String atacarPlacaje();   
     /**
     * 
     * @return La accion realizada ( arañazo )
     */
    public abstract String atacarArañazo();
    /**
     * 
     * @return La accion realizada ( mordisco  )
     */
    public abstract String atacarMordisco();
    /**
     * muestra los ataques que puede realizar el pokemon 
     * 
     * @since 1.0
     * @return String con los ataques del pokemon
     */
    public String mostrarAtaques(){
        return "Ataques:\n" 
                + atacarPlacaje() + "\n" 
                + atacarArañazo() + "\n" 
                + atacarMordisco();      
    } 
}
