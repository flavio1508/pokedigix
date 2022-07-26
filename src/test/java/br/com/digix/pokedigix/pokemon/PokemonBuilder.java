package br.com.digix.pokedigix.pokemon;

import java.util.ArrayList;
import java.util.Collection;

import br.com.digix.pokedigix.ataque.Ataque;
import br.com.digix.pokedigix.ataque.AtaqueBuilder;
import br.com.digix.pokedigix.tipo.Tipo;

public class PokemonBuilder { 
    private Collection<Ataque> ataques;
    private String nome;
    private double altura;
    private int peso;
    private Genero genero;
    private String treinador;
    private int nivel;
    private int felicidade;
    private int numeroPokedex;
    private Collection<Tipo> tipos;

    public PokemonBuilder(){   
        this.nome = "Capitão America";
        this.altura = 1.75;
        this.peso = 80;
        this.genero = Genero.MASCULINO;
        this.treinador = "fravour";
        this.nivel = 70;
        this.felicidade = 10 ;
        this.numeroPokedex = 92;
        this.tipos = new ArrayList<>();
        this.ataques = new ArrayList<>();

    } 

    public PokemonBuilder comAtaque(Ataque ataque){
        this.ataques.add(ataque);
        return this;
        
    }
     
    public Pokemon construir(){
        return new Pokemon(nome, altura, peso, genero, treinador, nivel, felicidade, numeroPokedex, tipos, ataques);
    }

    public PokemonBuilder comTipo(Tipo tipo) {
        this.tipos.add(tipo);
        return this;
    }

} 
