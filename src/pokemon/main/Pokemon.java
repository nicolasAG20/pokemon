
package pokemon.main;

import pokemon.models.Bulbasaur;
import pokemon.models.Charmander;
import pokemon.models.Pikachu;
import pokemon.models.Squirtle;

/**
 *
 * @author Vanessa
 */
public class Pokemon {

    public static void main(String[] args) {
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();
        
        System.out.println(bulbasaur.mostrarAtaques()+ "\n");
        System.out.println(charmander.mostrarAtaques()+ "\n");
        System.out.println(pikachu.mostrarAtaques()+ "\n");
        System.out.println(squirtle.mostrarAtaques()+ "\n");        
    }
    
}
