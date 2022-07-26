package br.com.digix.pokedigix.pokemon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;
import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.tipo.Tipo;

public class PokemonTest { 
    @Test
    public void deve_criar_um_pokemom(){
        //Arrange
        Long id = 4L;
        String nome = "Capitão America";
        double altura = 1.75;
        double peso = 80;
        Genero genero = Genero.MASCULINO;
        String treinador = "fravour";
        double nivel = 70;
        double felicidade = 10;
        int numeroPokedex = 92;

        List<Tipo> tipos = new ArrayList<>();

        tipos.add (new Tipo("Capitão America"));
        
        //Act
        Pokemon  pokemon = new PokemonBuilder().construir();

        //Assert
       assertEquals(nome, pokemon.getNome());
       assertEquals(altura, pokemon.getAltura());
       assertEquals(peso, pokemon.getPeso());
       assertEquals(genero, pokemon.getGenero());
       assertEquals(treinador, pokemon.getTreinador() );
       assertEquals(nivel, pokemon.getNivel());
       assertEquals(felicidade, pokemon.getFelicidade());
       assertEquals(numeroPokedex, pokemon.getNumeroPokedex());
       
    } 

    /**
     * 
     */
    @Test  
    public void deve_cadastrar_um_tipo_para_o_pokemom(){
        
        Tipo tipo = new Tipo("Capitão America");
        
        //Act
        Pokemon  pokemon = new PokemonBuilder().comTipo(tipo).construir();

        //Assert
       assertTrue(pokemon.getTipos().contains(tipo));
    }
    
}
