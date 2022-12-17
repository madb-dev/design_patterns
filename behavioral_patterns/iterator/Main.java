import com.example.Pokemon;
import com.example.collection.impl.PokemonCollection;
import com.example.iterator.Iterator;

public class Main {

  public static void main(String[] args) {
    PokemonCollection pc = new PokemonCollection();
    Iterator pokemonIterator = pc.createIterator();
    while (pokemonIterator.hasNext()) {
      Pokemon pokemon = (Pokemon) pokemonIterator.next();
      System.out.println(pokemon.getTypePokemon());
    }
  }
}