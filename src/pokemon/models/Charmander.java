package pokemon.models;

/**
 *
 * @author Vanessa
 */
public class Charmander extends Pokemon implements PokemonFuego{

    public Charmander() {
    }  
    
    @Override
    public String atacarPunioFuego() {
        return "Charmender usa puño fuego" ;
    }

    @Override
    public String atacarAscuas() {
        return "Charmender usa ascuas";
    }

    @Override
    public String atacarLanzallamas() {
        return "Charmender usa lanza llamas";
    }

    @Override
    public String atacarPlacaje() {
        return "Charmender usa placaje";
    }

    @Override
    public String atacarArañazo() {
        return "Charmender usa arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Charmender usa mordisco";
    }
    
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
