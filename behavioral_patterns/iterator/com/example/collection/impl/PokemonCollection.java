package com.example.collection.impl;

import com.example.Pokemon;
import com.example.collection.Collection;
import com.example.iterator.Iterator;
import com.example.iterator.impl.PokemonIterator;

public class PokemonCollection implements Collection {

  private Pokemon[] pokemonList = new Pokemon[50];

  public PokemonCollection() {
    addItem(new Pokemon("Pikachu"));
    addItem(new Pokemon("Squirtle"));
    addItem(new Pokemon("Charizard"));
    addItem(new Pokemon("Gengar"));
    addItem(new Pokemon("Arcanine"));
    addItem(new Pokemon("Bulbasaur"));
    addItem(new Pokemon("Eevee"));
    addItem(new Pokemon("Dragonite"));
    addItem(new Pokemon("Ninetales"));
    addItem(new Pokemon("Snorlax"));
    addItem(new Pokemon("Blastoise"));
    addItem(new Pokemon("Charmander"));
  }

  @Override
  public Iterator createIterator() {
    return new PokemonIterator(pokemonList);
  }

  public void addItem(Pokemon pokemon) {
    for (int i = 0; i < pokemonList.length; i++) {
      if (pokemonList[i] == null) {
        pokemonList[i] = pokemon;
        break;
      }
    }
  }
}
