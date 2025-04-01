package pokemon.models;

/**
 * 
 * @author Vanessa Toro
 * @version 20250331
 * @since  1.0
 * @see  pokemon.models.Pokemon
 * @see  pokemon.models.PokemonAgua
 * 
 */
public class Squirtle extends Pokemon implements PokemonAgua {    
    /**
    * Constructor de Squirtle
    */
    public Squirtle() {
    }
    
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */

    @Override
    public String atacarPlacaje() {
        return "Squirtle usa placaje";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarArañazo() {
        return "Squirtle usa arañazo";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarMordisco() {
        return "Squirtle usa mordisco";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarHidrobombas() {
        return "Squirtle usa hidrobombas";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarPistolaAgua() {
        return "Squirtle usa pistola de agua";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarBurbuja() {
        return "Squirtle usa burbuja";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarHidropulso() {
        return "Squirtle usa hidropulso";
    }
    
    @Override
    public String mostrarAtaques() {
        return "Ataques de Squirtle:\n" 
                + atacarPlacaje() + "\n"
                + atacarArañazo() + "\n" 
                + atacarMordisco() + "\n" 
                + atacarHidrobombas() + "\n" 
                + atacarPistolaAgua() + "\n" 
                + atacarBurbuja() + "\n"                 
                + atacarHidropulso();                              
    }     

}
