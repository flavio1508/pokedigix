package br.com.digix.pokedigix.pokemon;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import br.com.digix.pokedigix.ataque.Ataque;
import br.com.digix.pokedigix.tipo.Tipo;

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
    
    @Enumerated(EnumType.STRING)
    @Column (length = 10, nullable = false)
    private Genero genero;
    
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String treinador; 
    
    @Column(nullable = false)
    private double nivel;
    
    
    @Column(nullable = false)
    private double felicidade;

    @Column(nullable = false)
    private int numeroPokedex;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name="tipos", 
    joinColumns = @JoinColumn(name = "pokemon_id"),
    inverseJoinColumns = @JoinColumn(name = "tipo_id"))
    
    private Collection <Tipo> tipos;

    
        @ManyToMany(cascade = CascadeType.PERSIST)
        @JoinTable( 
            name = "pokemon_ataque",
            joinColumns = @JoinColumn(name = "pokemon_id"),
            inverseJoinColumns = @JoinColumn(name = "ataque_id")
    
        )
    private Collection<Ataque> ataques;

    
    public Pokemon(String nome, double altura, double peso, Genero genero, String treinador, double nivel,
    double felicidade, int numeroPokedex, Collection<Tipo> tipos, Collection<Ataque> ataques) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.treinador = treinador;
        this.nivel = nivel;
        this.felicidade = felicidade;
        this.numeroPokedex = numeroPokedex;
        this.tipos = tipos;
        this.ataques = ataques;
    }
    
    public Collection<Ataque> getAtaques() {
            return ataques;
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
    public Genero getGenero() {
        return this.genero;
    }
    public void setGenero(Genero genero) {
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
    
    public int getNumeroPokedex() {
        return this.numeroPokedex;
    }
    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }
    public Collection<Tipo> getTipos() {
        return this.tipos;
    }
    public void setTipo(Tipo tipo) {
        this.tipos = tipos;
    }
}
