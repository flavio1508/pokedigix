package br.com.digix.pokedigix.personagem;

import br.com.digix.pokedigix.pokemon.FelicidadeInvalidaException;
import br.com.digix.pokedigix.pokemon.Pokemon;
import br.com.digix.pokedigix.pokemon.PokemonBuilder;
import br.com.digix.pokedigix.pokemon.PokemonInvalidoParaCategoriaException;

public class TreinadorBuilder { 
    private String  nome;
    private Endereco endereco;
    private Pokemon pokemon;

    public TreinadorBuilder() throws PokemonInvalidoParaCategoriaException, FelicidadeInvalidaException{
        this.nome = "Ash";
        this.endereco = new EnderecoBuilder().construir();
        this.pokemon = new PokemonBuilder().construir();

    }

    public Treinador construir() throws LimiteDePokemonExpeception{
        return new Treinador(nome, endereco, pokemon);
    }

    public TreinadorBuilder comPokemonInicial(Pokemon pokemonInicial) {
        this.pokemon = pokemonInicial;
        return this;
    }
    
}
