package br.com.digix.pokedigix.endereco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EnderecoTest { 
    @Test
    public void deve_poder_criar_um_endereco(){
        //Arrange
        String cidade = "Campo-Grande";
        String regiao = "Centro-Oeste";
        //Act
        Endereco  endereco = new Endereco( cidade , regiao);

        //Assert
        assertEquals(cidade, endereco.getCidade());
        assertEquals(regiao, endereco.getRegiao());
    } 
   
    
}
