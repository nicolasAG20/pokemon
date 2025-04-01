
package pokemon.main;

import pokemon.models.Bulbasaur;
import pokemon.models.Charmander;
import pokemon.models.Pikachu;
import pokemon.models.Squirtle;

/**
 * 
 * @author Vanessa Toro
 * @version 20250331
 * @since  1.0
 * @see  pokemon.models.Pokemon
 * @see  pokemon.models.PokemonElectrico
 * 
 */
public class Pokemon {

    public static void main(String[] args) {
        
        /*
        instancia de bulbasaur
        */
        Bulbasaur bulbasaur = new Bulbasaur();
        /*
        instancia de charmander
        */
        Charmander charmander = new Charmander();
        /*
        instancia de pikachu
        */
        Pikachu pikachu = new Pikachu();
        /*
        instancia de squirtle
        */
        Squirtle squirtle = new Squirtle();
        /*
            se muestran los ataques de cada pokemon y cada uno de estos realiza sus repectivos ataques 
        */
        System.out.println(bulbasaur.mostrarAtaques()+ "\n");
        System.out.println(charmander.mostrarAtaques()+ "\n");
        System.out.println(pikachu.mostrarAtaques()+ "\n");
        System.out.println(squirtle.mostrarAtaques()+ "\n");        
    }
    
}
