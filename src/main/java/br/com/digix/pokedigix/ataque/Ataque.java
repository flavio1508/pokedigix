package br.com.digix.pokedigix.ataque;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Columns;

@Entity
public class Ataque {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
        private Long id;

    @Column (nullable = false, length = 15)   
        private String nome;

    @Column(nullable = false, length = 15)    
        private String descricao;

    @Column(nullable = false, length = 15)
        private Categoria categoria;

    @Column(nullable = false)
        private double forca;

    @Column(nullable = false)
        private int acuracia;

    @Column(nullable = false, length = 15)
        private int pontosDePoder;
        
        public Ataque( String nome, String descricao, Categoria categoria, Double forca, int acuracia, int pontosDePoder) {
            this.nome = nome;
            this.descricao = descricao;
            this.pontosDePoder = pontosDePoder;
            this.forca = forca;
            this.acuracia = acuracia;
            this.categoria = categoria;
            
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

        public String getDescricao() {
            return this.descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public int getPontosDePoder() {
            return this.pontosDePoder;
        }

        public void setPontosDePoder(int pontosDePoder) {
            this.pontosDePoder = pontosDePoder;
        }

        public Double getForca() {
            return this.forca;
        }

        public void setForca(Double forca) {
            this.forca = forca;
        }

        public int getAcuracia() {
            return this.acuracia;
        }

        public void setAcuracia(int acuracia) {
            this.acuracia = acuracia;
        }

        public Categoria getCategoria() {
            return this.categoria;
        }
    
    }
    
    

