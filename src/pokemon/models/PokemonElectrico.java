/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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
