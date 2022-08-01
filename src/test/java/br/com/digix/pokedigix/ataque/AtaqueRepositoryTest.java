package br.com.digix.pokedigix.ataque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.digix.pokedigix.tipo.TipoRepository;

@DataJpaTest
public class AtaqueRepositoryTest { 
    

    @Autowired
    private AtaqueRepository ataqueRepository;
    @Autowired
    private TipoRepository tipoRepository;

    // @Test
    // public void deve_salvar_um_ataque(){
    //     String nomeEsperado = "Capitão America";
    //     String descricao = "joga o escudo";
    //     Categoria categoria = Categoria.FISICO;
    //     int forca = 80;
    //     int  acuracia = 100;
    //     int pontosDePoder = 32;
    //     Tipo tipoEsperado = new Tipo("Capitão America");

    //     Ataque  ataque = new Ataque( nomeEsperado , descricao, categoria ,  forca , acuracia , pontosDePoder, tipoEsperado);

    //     ataqueRepository.save(ataque);

    //     assertNotNull( ataque.getId());
      
    // }
    // @Test 
    // public void deve_salvar_um_tipo_para_um_ataque(){
    //     String nomeEsperado = "Capitão America";
    //     String descricao = "joga o escudo";
    //     Categoria categoria = Categoria.FISICO;
    //     int forca = 80;
    //     int  acuracia = 100;
    //     int pontosDePoder = 32;
    //     Tipo tipoEsperado = new Tipo("Capitão America");

    //     Ataque  ataque = new Ataque( nomeEsperado , descricao, categoria ,  forca , acuracia , pontosDePoder, tipoEsperado);
    //     tipoRepository.save(tipoEsperado);
    //     ataqueRepository.save(ataque);
         
    //     Ataque ataqueRetornado = ataqueRepository.findById(ataque.getId()).get();

    //     assertEquals(tipoEsperado.getNome(), ataqueRetornado.getTipo().getNome());
    //     assertNotNull(ataqueRetornado.getTipo().getId());
    // }

    // @Test 
    // public void deve_buscar_um_ataque_pelo_seu_tipo(){
    //     String nomeEsperado = "Capitão America";
    //     String descricao = "joga o escudo";
    //     Categoria categoria = Categoria.FISICO;
    //     int forca = 80;
    //     int  acuracia = 100;
    //     int pontosDePoder = 32;
    //     Tipo tipoEsperado = new Tipo("Capitão America");

    //     Ataque  ataque = new Ataque( nomeEsperado , descricao, categoria ,  forca , acuracia , pontosDePoder, tipoEsperado);
    //     tipoRepository.save(tipoEsperado);
    //     ataqueRepository.save(ataque);
         
    //     Collection<Ataque> ataqueRetornado = ataqueRepository.findByCategoria(categoria);

    //     assertTrue(ataqueRetornado.contains(ataque));               
    // }

    
}
