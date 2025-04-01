package pokemon.models;

/**
 *
 * @author Vanessa
 */
public class Squirtle extends Pokemon implements PokemonAgua {

    public Squirtle() {
    }
    
    @Override
    public String atacarPlacaje() {
        return "Squirtle usa placaje";
    }

    @Override
    public String atacarArañazo() {
        return "Squirtle usa arañazo";
    }

    @Override
    public String atacarMordisco() {
        return "Squirtle usa mordisco";
    }

    @Override
    public String atacarHidrobombas() {
        return "Squirtle usa hidrobombas";
    }

    @Override
    public String atacarPistolaAgua() {
        return "Squirtle usa pistola de agua";
    }

    @Override
    public String atacarBurbuja() {
        return "Squirtle usa burbuja";
    }

    @Override
    public String atacarHidropulso() {
        return "Squirtle usa hidropulso";
    }
    
    @Override
    public String mostrarAtaques() {
        return "Ataques de Squirtle:\n" 
                + atacarPlacaje() + "\n"
                + atacarArañazo() + "\n" 
                + atacarMordisco() + "\n" 
                + atacarHidrobombas() + "\n" 
                + atacarPistolaAgua() + "\n" 
                + atacarBurbuja() + "\n"                 
                + atacarHidropulso();                              
    }     

}
