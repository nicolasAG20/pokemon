package pokemon.models;

    
 /**
 * @author Vanessa Toro
 * @version 20250331
 * @since  1.0
 * @see  pokemon.models.Pokemon
 * @see  pokemon.models.PokemonFuego
 * 
 */
public class Charmander extends Pokemon implements PokemonFuego{
    /**
    * Constructor de Charmander
    */    
    public Charmander() {
    }  
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */

    @Override
    public String atacarPunioFuego() {
        return "Charmender usa puño fuego" ;
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarAscuas() {
        return "Charmender usa ascuas";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarLanzallamas() {
        return "Charmender usa lanza llamas";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarPlacaje() {
        return "Charmender usa placaje";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarArañazo() {
        return "Charmender usa arañazo";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarMordisco() {
        return "Charmender usa mordisco";
    }
    /**
     * muestra los ataques que puede realizar el pokemon 
     * 
     * @since 1.0
     * @return String con los ataques del pokemon
     */
    @Override
    public String mostrarAtaques() {
        return "Ataques de Charmander:\n" 
                + atacarPlacaje() + "\n"
                + atacarArañazo() + "\n" 
                + atacarMordisco() + "\n" 
                + atacarPunioFuego() + "\n" 
                + atacarAscuas() + "\n" 
                + atacarLanzallamas();                              
    }
}
