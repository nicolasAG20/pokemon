/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    public String atacarPlacaje(){
        return "placaje";
        
    }
    public String atacarArañazo(){
        return "arañazo";
        
    }
    public String atacarMordisco(){
        return "mordisco";
        
    }
    
}
