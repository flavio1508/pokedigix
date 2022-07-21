package br.com.digix.pokedigix.endereco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class EnderecoRepositoryTest {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Test
    public void deve_salvar_um_endereco(){
        String cidade = "Campo Grande";
        String regiao = "Centro-Oeste";
        Long id = 1L;

        Endereco  endereco = new Endereco( cidade , regiao);

        enderecoRepository.save(endereco);

        assertEquals(id, endereco.getId());
      
    }
    
}
