package com.example.iterator.impl;

import com.example.Pokemon;
import com.example.iterator.Iterator;

public class PokemonIterator implements Iterator {

  Pokemon[] pokemonList;
  int position = 0;

  public PokemonIterator(Pokemon[] pokemonList) {
    this.pokemonList = pokemonList;
  }

  @Override
  public Boolean hasNext() {
    if (position >= pokemonList.length || pokemonList[position] == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public Object next() {
    Pokemon pokemon = pokemonList[position];
    position += 1;
    return pokemon;
  }
}
