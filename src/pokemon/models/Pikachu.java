package pokemon.models;

/**
 * 
 * @author Nicolas Agudelo 
 * @version 20250331
 * @since  1.0
 * @see  pokemon.models.Pokemon
 * @see  pokemon.models.PokemonElectrico
 * 
 */
public class Pikachu extends Pokemon implements PokemonElectrico {
    /**
    * Constructor de Pikachu
    */
    public Pikachu() {
    }
       
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    
    @Override   
    public String atacarPunioTrueno() {
        return "Pikachu usa punio trueno";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarRayo() {
        return "Pikachu usa rayo";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarRayoCarga() {
        return "pikachu usa rayo carga";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarImpactrueno() {
        return "pikachu usa impactrueno";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarPlacaje() {
        return "pikachu usa placaje  ";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarArañazo() {
        return "pikachu usa araniaso ";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarMordisco() {
        return "pikachu usa mordisco ";
    }

    @Override
    public String mostrarAtaques() {
        return "Ataques de Pikachu:\n" 
                + atacarPlacaje() + "\n"
                + atacarArañazo() + "\n" 
                + atacarMordisco() + "\n" 
                + atacarPunioTrueno() + "\n" 
                + atacarRayo() + "\n" 
                + atacarRayoCarga() + "\n"                 
                + atacarImpactrueno();                              
    }   
}