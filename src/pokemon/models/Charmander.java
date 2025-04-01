package pokemon.models;

/**
 * 
 * @author Vanessa Toro
 * @version 20250331
 * @since  1.0
 * @see  pokemon.models.Pokemon
 * @see  pokemon.models.PokemonFuego
 * 
 */
public class Charmander extends Pokemon implements PokemonFuego{
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarPunioFuego() {
        return "Charmender usa punio fuego" ;
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

}
