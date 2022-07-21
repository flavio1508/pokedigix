package br.com.digix.pokedigix.ataque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;


public class AtaqueTest {
    @Test
    public void deve_poder_criar_um_ataque(){
        //Arrange
        String nomeEsperado = "Capitão America";
        String descricao = "joga o escudo";
        Categoria categoria = Categoria.FISICO;
        double forca = 80;
        int  acuracia = 100;
        int pontosDePoder = 32;
        //Act
        Ataque  ataque = new Ataque( nomeEsperado , descricao, categoria ,  forca , acuracia , pontosDePoder);

        //Assert
        assertEquals(nomeEsperado, ataque.getNome());
        assertEquals(descricao, ataque.getDescricao());
        assertEquals(categoria, ataque.getCategoria());
        assertEquals(forca, ataque.getForca());
        assertEquals(pontosDePoder, ataque.getPontosDePoder());

    } 
   

}
