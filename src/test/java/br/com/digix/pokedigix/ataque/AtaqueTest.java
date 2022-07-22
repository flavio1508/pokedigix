package br.com.digix.pokedigix.ataque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import br.com.digix.pokedigix.tipo.Tipo;


public class AtaqueTest {
    @Test
    public void deve_poder_criar_um_ataque(){
        //Arrange
        String nomeEsperado = "Capitão America";
        String descricao = "joga o escudo";
        Categoria categoria = Categoria.FISICO;
        int forca = 80;
        int  acuracia = 100;
        int pontosDePoder = 32;
        Tipo tipo = new Tipo("Normal");
        //Act
        Ataque  ataque = new Ataque( nomeEsperado , descricao, categoria ,  forca , acuracia , pontosDePoder, tipo);

        //Assert
        assertEquals(nomeEsperado, ataque.getNome());
        assertEquals(descricao, ataque.getDescricao());
        assertEquals(categoria, ataque.getCategoria());
        assertEquals(forca, ataque.getForca());
        assertEquals(pontosDePoder, ataque.getPontosDePoder());

    } 

    @Test
    public void deve_ser_obrigatorio_informar_um_tipo(){
        String nomeEsperado = "Capitão America";
        String descricao = "joga o escudo";
        Categoria categoria = Categoria.FISICO;
        int forca = 80;
        int  acuracia = 100;
        int pontosDePoder = 32;
        Tipo tipoEsperado = new Tipo("Normal");

        Ataque ataque = new Ataque(nomeEsperado, descricao, categoria, forca, acuracia, pontosDePoder,tipoEsperado );

        assertEquals(tipoEsperado, ataque.getTipo());
    }
   

}
