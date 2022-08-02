package br.com.digix.pokedigix.pokemon;

public class FelicidadeInvalidaException extends Exception {
    public FelicidadeInvalidaException(){
       super("Deve estar entre 0 e 100"); 
    }

}
