package br.com.digix.pokedigix.pokemon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class PokemonRepositoryTest {
    @Autowired
    private PokemonRepository pokemonRepository;


    @Test
    public void deve_salvar_um_pokemon(){
        Long id = 1L;
        String nome = "Capitão America";
        double altura = 1.75;
        double peso = 80;
        String genero = "masculino";
        String treinador = "fravour";
        double nivel = 70;
        double felicidade = 10 ;
        
        Pokemon pokemon =  new Pokemon( nome, altura, peso, genero, treinador, nivel, felicidade);

        pokemonRepository.save(pokemon);

        assertEquals(id, pokemon.getId());
    }
    
}
