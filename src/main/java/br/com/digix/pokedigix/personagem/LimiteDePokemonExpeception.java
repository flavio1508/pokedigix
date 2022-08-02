package br.com.digix.pokedigix.personagem;

public class LimiteDePokemonExpeception extends Exception {
    public LimiteDePokemonExpeception(){
        super("Um treinador pode ter apenas 6 pokemons ao mesmo tempo.");
    } 
    
}
