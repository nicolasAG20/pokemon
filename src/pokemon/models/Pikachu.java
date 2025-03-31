package pokemon.models;

// @author vanes
public class Pikachu extends Pokemon implements PokemonElectrico {
    
    

    @Override   
    public String atacarPunioTrueno() {
        return "Pikachu usa punio trueno";
    }

    @Override
    public String atacarRayo() {
        return "Pikachu usa rayo";
    }

    @Override
    public String atacarRayoCarga() {
        return "pikachu usa rayo carga";
    }

    @Override
    public String atacarImpactrueno() {
        return "";
    }
}
