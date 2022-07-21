package br.com.digix.pokedigix.treinador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Treinador {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String nome;
    
    @Column(nullable = false)
    private double dinheiro;
   
    @Column(nullable = false)
    private double nivel;

    public Treinador(String nome, double dinheiro, double nivel) {
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.nivel = nivel;
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
    public double getDinheiro() {
        return this.dinheiro;
    }
    
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    public double getNivel() {
        return this.nivel;
    }
    public void setNivel(double nivel) {
        this.nivel = nivel;
    }
    
    
    
}
