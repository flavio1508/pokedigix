package br.com.digix.pokedigix.ataque;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import br.com.digix.pokedigix.pokemon.Pokemon;
import br.com.digix.pokedigix.tipo.Tipo;

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
        private int forca;

    @Column(nullable = false)
        private int acuracia;

    @Column(nullable = false, length = 15)
        private int pontosDePoder; 
    @ManyToOne
        private Tipo tipo;

    @ManyToMany(mappedBy =  "ataques")
    private Collection<Pokemon>pokemons;  
    
    protected Ataque(){}
        
        public Ataque( String nome, 
        String descricao, 
        Categoria categoria, 
        int forca, 
        int acuracia, 
        int pontosDePoder, 
        Tipo tipo) throws Exception {
            
            validarAcuracia(acuracia);
            validarForca(categoria, forca);
            validarTipo(categoria, tipo);

            this.nome = nome;
            this.descricao = descricao;
            this.pontosDePoder = pontosDePoder;
            this.forca = forca;
            this.acuracia = acuracia;
            this.categoria = categoria;
            this.tipo = tipo;
            
        }

        private void validarTipo(Categoria categoria, Tipo tipo) throws TipoInvalidoParaCategoriaException {
              if((categoria.equals(Categoria.FISICO) && tipo == null  ) || (categoria.equals(Categoria.ESPECIAL) && tipo == null) ) 
               throw new TipoInvalidoParaCategoriaException(tipo);
            }  

        private void validarAcuracia(int acuracia) throws AcuraciaInvalidaException {
            if(acuracia < 0 || acuracia > 100){
                throw new AcuraciaInvalidaException();
            }
        } 
        private void validarForca(Categoria categoria, int forca) throws ForcaInvalidaParaCategoriaExceptio {
            if((categoria.equals(Categoria.FISICO) && forca <= 0) || (categoria.equals(Categoria.ESPECIAL) && forca <= 0)){
                throw new ForcaInvalidaParaCategoriaExceptio(categoria);
            }
        }

        public Ataque(String nomeEsperado, String descricao, int acuracia, int pontosDePoder) throws AcuraciaInvalidaException, ForcaInvalidaParaCategoriaExceptio {
             validarAcuracia(acuracia); 
             this.acuracia = acuracia;
             this.pontosDePoder = pontosDePoder;
             this.nome = nomeEsperado;
             this.descricao = descricao;
             this.categoria = Categoria.EFEITO;
        }


        public Ataque(String nome2) {
        }

        public Tipo getTipo(){
            return this.tipo;
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

        public int getForca() {
            return this.forca;
        }

        public void setForca(int forca) {
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

        public Collection<Pokemon> getPokemons() {
            return pokemons;
        }
    
    }
    
    

