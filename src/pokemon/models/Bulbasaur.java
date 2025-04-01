package pokemon.models;


public class Bulbasaur extends Pokemon implements PokemonPlanta {

    public Bulbasaur() {
    }
    
    @Override
    public String atacarPlacaje() {
        return "bulbasaur usa placaje  ";
    }

    @Override
    public String atacarArañazo() {
        return "bulbasaur usa araniaso ";
    }

    @Override
    public String atacarMordisco() {
        return "bulbasaur usa mordisco ";
    }

    @Override
    public String atacarParalizar() {
        return "bulbasaur usa paralizar";
    }

    @Override
    public String atacarLatigoCepa() {
        return "bulbasaur usa latigo cepa";
    }

    @Override
    public String atacarDrenaje() {
        return "bulbasaur usa drenaje ";
    }

    @Override
    public String atacarHojaAfilada() {
        return "bulbasaur usa hoja afilada ";
    }
    
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
