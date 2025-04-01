
package pokemon.models;

/**
 *
 * @author Nico
 */
public abstract class Pokemon {
    private int numPokedex; 
    private String nombre; 
    private double peso; 
    private int temporada; 
    
    public abstract String atacarPlacaje();   
    public abstract String atacarArañazo();
    public abstract String atacarMordisco();
    
    public String mostrarAtaques(){
        return "Ataques:\n" 
                + atacarPlacaje() + "\n" 
                + atacarArañazo() + "\n" 
                + atacarMordisco();      
    } 
}
