package br.com.digix.pokedigix.lider;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class LiderRepositoryTest {
    @Autowired
    private LiderRepository liderRepository;

    @Test
    public void deve_salvar_um_lider(){
        Long id  = 1L;
        String nome = "Fravour";
        int nivel = 5;
        String insignia = "equilibrio";

        Lider  lider = new Lider( nome ,nivel, insignia);

        liderRepository.save(lider);

        assertEquals(id, lider.getId());
      
    }


    
}
