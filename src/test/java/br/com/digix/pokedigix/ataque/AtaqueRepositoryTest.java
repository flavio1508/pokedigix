package br.com.digix.pokedigix.ataque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class AtaqueRepositoryTest { 
    

    @Autowired
    private AtaqueRepository ataqueRepository;

    @Test
    public void deve_salvar_um_ataque(){
        String nomeEsperado = "Capitão America";
        String descricao = "joga o escudo";
        Categoria categoria = Categoria.FISICO;
        double forca = 80;
        int  acuracia = 100;
        int pontosDePoder = 32;
        Long IdEsperado = 1L;

        Ataque  ataque = new Ataque( nomeEsperado , descricao, categoria ,  forca , acuracia , pontosDePoder);

        ataqueRepository.save(ataque);

        assertEquals(IdEsperado, ataque.getId());
      
    }

    
}
