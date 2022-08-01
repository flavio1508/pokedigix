package br.com.digix.pokedigix.ataque;

public class ForcaInvalidaParaCategoriaExceptio extends Exception {
    public ForcaInvalidaParaCategoriaExceptio(Categoria categoria){
        super("A categoria" + categoria.name() + "deve ter forca maior que zero");
    }
}
