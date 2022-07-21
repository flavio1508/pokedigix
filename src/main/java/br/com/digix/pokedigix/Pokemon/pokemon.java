package br.com.digix.pokedigix.pokemon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon { 
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String nome;
    
    @Column(nullable = false)
    private double altura;
    
    @Column(nullable = false)
    private double peso;
    
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String genero;
    
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String treinador; 
    
    @Column(nullable = false)
    private double nivel;
    
    
    @Column(nullable = false)
    private double felicidade;
    
    public Pokemon(String nome, double altura, double peso, String genero, String treinador, double nivel,
    double felicidade) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.treinador = treinador;
        this.nivel = nivel;
        this.felicidade = felicidade;
    }
    public Long getId() {
        return this.id;
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getTreinador() {
        return this.treinador;
    }
    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }
    public Double getNivel() {
        return this.nivel;
    }
    public void setNivel(double nivel) {
        this.nivel = nivel;
    }
    public Double getFelicidade() {
        return this.felicidade;
    }
    public void setFelicidade(double felicidade) {
        this.felicidade = felicidade;
    }
    
}
