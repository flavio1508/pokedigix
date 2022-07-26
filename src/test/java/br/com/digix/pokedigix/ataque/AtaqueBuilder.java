package br.com.digix.pokedigix.ataque;

import br.com.digix.pokedigix.tipo.Tipo;

public class AtaqueBuilder {
    private String nomeEsperado;
    private String descricao;
    private Categoria categoria;
    private int forca;
    private int acuracia;
    private int pontosDePoder;
    private Tipo tipoEsperado;

    public AtaqueBuilder(){
        this.nomeEsperado = "Capitão America";
        this.descricao = "joga o escudo";
        this.categoria = Categoria.FISICO;
        this.forca = 80;
        this.acuracia = 100;
        this.pontosDePoder = 32;
        this.tipoEsperado = new Tipo("Capitão America");
    }
    public AtaqueBuilder comTipo(Tipo tipoEsperado) {
        this.tipoEsperado = tipoEsperado;
        return this;
    }

    public Ataque construir() {
        return new Ataque(nomeEsperado, descricao, categoria, forca, acuracia, pontosDePoder, tipoEsperado);
    }

    
}
