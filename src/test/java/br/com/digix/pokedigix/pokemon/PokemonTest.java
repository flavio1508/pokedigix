package br.com.digix.pokedigix.pokemon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;
import org.junit.jupiter.api.Test;

import br.com.digix.pokedigix.tipo.Tipo;

public class PokemonTest { 
    @Test
    public void deve_criar_um_pokemom() throws PokemonInvalidoParaCategoriaException, FelicidadeInvalidaException{
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
     * @throws PokemonInvalidoParaCategoriaException
     * @throws FelicidadeInvalidaException
     * 
     */
    @Test  
    public void deve_cadastrar_um_tipo_para_o_pokemom() throws PokemonInvalidoParaCategoriaException, FelicidadeInvalidaException{
        
        Tipo tipo = new Tipo("Capitão America");
        
        //Act
        Pokemon  pokemon = new PokemonBuilder().comTipo(tipo).construir();

        //Assert
       assertTrue(pokemon.getTipos().contains(tipo));
    }
    
    @Test
    public void deve_ter_nivel_minimo_um() throws PokemonInvalidoParaCategoriaException, FelicidadeInvalidaException{ 
        int nivelMinimo = 1;
        Pokemon pokemon = new PokemonBuilder().comNivel(nivelMinimo).construir();

        assertEquals(nivelMinimo, pokemon.getNivel());
    } 
    
        @Test
        public void deve_ter_nivel_maximo_cem() throws PokemonInvalidoParaCategoriaException, FelicidadeInvalidaException{
            int nivelMaximo = 100;
    
            Pokemon pokemon = new PokemonBuilder().comNivel(nivelMaximo).construir();
    
            assertEquals(nivelMaximo, pokemon.getNivel());
        }
    
        @Test
        public void nao_pode_ter_o_nivel_menor_que_um(){
            int nivelMenor = 0;
            assertThrows(PokemonInvalidoParaCategoriaException.class,() -> {
                new PokemonBuilder().comNivel(nivelMenor).construir();
            });
            
        }

        @Test
        public void nao_pode_ter_o_nivel_maior_que_cem(){
            int nivelMaior = 101;

            assertThrows(PokemonInvalidoParaCategoriaException.class,() -> {
                new PokemonBuilder().comNivel(nivelMaior).construir();
            });
            
        } 

        @Test
        public void deve_ter_felicidade_minima_zero() throws PokemonInvalidoParaCategoriaException, FelicidadeInvalidaException{
            double felicidadeMinima = 0;

            Pokemon pokemon = new PokemonBuilder().comFelicidade(felicidadeMinima).construir();

            assertEquals(felicidadeMinima, pokemon.getFelicidade());
        }

        @Test
        public void deve_ter_felicidade_maxima_cem() throws PokemonInvalidoParaCategoriaException, FelicidadeInvalidaException{
            double felicidadeMaxima = 100;

            Pokemon pokemon = new PokemonBuilder().comFelicidade(felicidadeMaxima).construir();

            assertEquals(felicidadeMaxima, pokemon.getFelicidade());
        } 

        @Test
        public void nao_deve_ter_felicidade_menor_que_zero(){
            double felicidadeInvalida = -1;

            assertThrows(FelicidadeInvalidaException.class, () -> {
                new PokemonBuilder().comFelicidade(felicidadeInvalida).construir();
            });
        }
        @Test
        public void nao_deve_ter_felicidade_meior_que_cem(){
            double felicidadeInvalida = 101;

            assertThrows(FelicidadeInvalidaException.class, () -> {
                new PokemonBuilder().comFelicidade(felicidadeInvalida).construir();
            });
        }
}
