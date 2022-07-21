package br.com.digix.pokedigix.lider;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LiderTest {
    @Test
    public void deve_poder_criar_um_lider(){
        //Arrange
         Long id  = 1L;
         String nome = "Fravour";
         int nivel = 5;
         String insignia = "equilibrio";
    
        //Act
        Lider  lider = new Lider(  nome , nivel, insignia );

        //Assert
        assertEquals(nome, lider.getNome());
        assertEquals(nivel, lider.getNivel());
        assertEquals(insignia, lider.getInsignia());
    } 
}
