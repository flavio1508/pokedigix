package br.com.digix.pokedigix.pokemon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.digix.pokedigix.ataque.Ataque;
import br.com.digix.pokedigix.ataque.AtaqueBuilder;
import br.com.digix.pokedigix.tipo.Tipo;

// @DataJpaTest
// public class PokemonRepositoryTest {
//     @Autowired
//     private PokemonRepository pokemonRepository;


//     @Test
//     public void deve_salvar_um_pokemon(){
//         String nome = "Capitão America";
//         double altura = 1.75;
//         double peso = 80;
//         Genero genero = Genero.MASCULINO;
//         String treinador = "fravour";
//         double nivel = 70;
//         double felicidade = 10 ;
//         int numeroPokedex = 92;
//         List<Tipo> tipos = new ArrayList<>();

//         tipos.add (new Tipo("Capitão America"));
        
//         Pokemon pokemon =  new PokemonBuilder().construir();

//         pokemonRepository.save(pokemon);

//         assertNotNull(pokemon.getId());
//     } 

//     @Test 
//     public void deve_salvar_um_pokemon_com_um_tipo(){
//         int quantidadeDeTiposEsperada = 1;
//         Tipo CapitaoAmerica = new Tipo("Capitão America");
                
        
//         Pokemon pokemon =  new PokemonBuilder().comTipo(CapitaoAmerica).construir();

//         pokemonRepository.save(pokemon);

//         Pokemon pokemonRetornado =  pokemonRepository.findById(pokemon.getId()).get();

//         assertNotNull(pokemonRetornado.getTipos());

//         assertEquals(quantidadeDeTiposEsperada, pokemonRetornado.getTipos().size());

//         assertTrue(pokemonRetornado.getTipos().contains(CapitaoAmerica));
//     } 

//     @Test 
//     public void deve_salvar_um_pokemon_com_ataque(){
//         Ataque ataque = new AtaqueBuilder().construir();
//         Pokemon pokemon = new PokemonBuilder().comAtaque(ataque).construir();
        
//         pokemonRepository.save(pokemon);

//         assertTrue(pokemon.getAtaques().contains(ataque));
//     }

// }
