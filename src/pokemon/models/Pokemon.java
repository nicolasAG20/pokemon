/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.models;

/**
 * 
 * @author Nicolas Agudelo 
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
    
}
