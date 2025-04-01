
package pokemon.models;
/**
 * 
 * @author Nicolas Agudelo
 * @version 20250331
 * @since  1.0
 * 
 */
public interface PokemonElectrico {
    /**
     * 
     * @return La accion realizada ( impactrueno )
     */
    public abstract String atacarImpactrueno();
    /**
     * 
     * @return La accion realizada ( punio trueno )
     */
    public abstract String atacarPunioTrueno();
    /**
     * 
     * @return La accion realizada ( rayo )
     */
    public abstract String atacarRayo();
    /**
     * 
     * @return La accion realizada ( rayo carga )
     */
    public abstract String atacarRayoCarga();
}
