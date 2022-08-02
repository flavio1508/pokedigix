package br.com.digix.pokedigix.personagem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.digix.pokedigix.pokemon.FelicidadeInvalidaException;
import br.com.digix.pokedigix.pokemon.PokemonInvalidoParaCategoriaException;

@DataJpaTest
public class TreinadorRepositoryTest { 

    @Autowired
    private TreinadorRepository treinadorRepository;
    @Test 
    public void deve_salvar_um_treinador() throws LimiteDePokemonExpeception, PokemonInvalidoParaCategoriaException, FelicidadeInvalidaException{
        //Arrange
        Treinador treinador = new TreinadorBuilder().construir();
         
        treinadorRepository.save(treinador);
         
         assertNotNull(treinador.getId());
    }

   
}
