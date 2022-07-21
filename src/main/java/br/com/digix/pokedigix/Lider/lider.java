package br.com.digix.pokedigix.lider;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lider { 
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (nullable = false, length = 15) 
    private String nome;
    
    @Column(nullable = false)
    private int nivel;
    
    @Column (nullable = false, length = 15) 
    private String insignia;
    
    public Lider( String nome, int nivel, String insignia) {
        this.nome = nome;
        this.nivel = nivel;
        this.insignia = insignia;
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
    public int getNivel() {
        return this.nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getInsignia() {
        return this.insignia;
    }
    public void setInsignia(String insignia) {
        this.insignia = insignia;
    }
}
