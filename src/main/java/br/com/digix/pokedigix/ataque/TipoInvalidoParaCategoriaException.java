package br.com.digix.pokedigix.ataque;

import br.com.digix.pokedigix.tipo.Tipo;

public class TipoInvalidoParaCategoriaException extends Exception  {
   public TipoInvalidoParaCategoriaException (Tipo tipo){
    super("não deve ser vazio");
   }
}
