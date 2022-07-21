package br.com.digix.pokedigix.pokemon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PokemonTest { 
    @Test
    public void deve_poder_criar_um_ataque(){
        //Arrange
        Long id = 4L;
        String nome = "Capitão America";
        double altura = 1.75;
        double peso = 80;
        String genero = "masculino";
        String treinador = "fravour";
        double nivel = 70;
        double felicidade = 10 ;
        
        //Act
        Pokemon  pokemon = new Pokemon( nome ,  altura ,  peso , genero , treinador, nivel, felicidade);

        //Assert
       assertEquals(nome, pokemon.getNome());
       assertEquals(altura, pokemon.getAltura());
       assertEquals(peso, pokemon.getPeso());
       assertEquals(genero, pokemon.getGenero());
       assertEquals(treinador, pokemon.getTreinador() );
       assertEquals(nivel, pokemon.getNivel());
       assertEquals(felicidade, pokemon.getFelicidade());
       
    } 
    
}
