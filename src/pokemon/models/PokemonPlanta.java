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
public interface PokemonPlanta {
    /**
     * 
     * @return La accion realizada ( paralizar )
     */
    public abstract String atacarParalizar();
    /**
     * 
     * @return La accion realizada ( latigo cepa )
     */
    public abstract String atacarLatigoCepa();
    /**
     * 
     * @return La accion realizada ( drenaje )
     */
    public abstract String atacarDrenaje();
    /**
     * 
     * @return La accion realizada ( hoja afilada )
     */
    public abstract String atacarHojaAfilada();
}
