package pokemon.models;

/**
 * 
 * @author Nicolas Agudelo 
 * @author Vanessa Toro
 * @version 20250331
 * @since  1.0
 * @see  pokemon.models.Pokemon
 * @see  pokemon.models.PokemonPlanta
 * 
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta {
    /**
    * Constructor de Bulbasaur
    */
    public Bulbasaur() {
    }
    
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    
    @Override
    public String atacarPlacaje() {
        return "bulbasaur usa placaje  ";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarArañazo() {
        return "bulbasaur usa araniaso ";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarMordisco() {
        return "bulbasaur usa mordisco ";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarParalizar() {
        return "bulbasaur usa paralizar";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarLatigoCepa() {
        return "bulbasaur usa latigo cepa";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarDrenaje() {
        return "bulbasaur usa drenaje ";
    }
    /**
     * 
     * @return la accion realizada
     * @since 1.0
     */
    @Override
    public String atacarHojaAfilada() {
        return "bulbasaur usa hoja afilada ";
    }
    /**
     * muestra los ataques que puede realizar el pokemon 
     * 
     * @since 1.0
     * @return String con los ataques del pokemon
     */
    @Override
    public String mostrarAtaques() {
        return "Ataques de Bulbasaur:\n" 
                + atacarPlacaje() + "\n"
                + atacarArañazo() + "\n" 
                + atacarMordisco() + "\n" 
                + atacarParalizar() + "\n" 
                + atacarLatigoCepa() + "\n" 
                + atacarDrenaje() + "\n" 
                + atacarHojaAfilada();
    }
}
