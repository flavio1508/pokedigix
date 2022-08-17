package br.com.digix.pokedigix.ataque;

import br.com.digix.pokedigix.tipo.TipoResponseDTO;

public class AtaqueResponseDTO {
        private Long id;
        private String nome ;
        private String descricao;
        private Categoria categoria; 
        private int forca;
        private int acuracia;
        private int pontosDePoder; 
        private TipoResponseDTO tipo;
        public AtaqueResponseDTO(Long id, String nome, String descricao, Categoria categoria, int forca, int acuracia,
                int pontosDePoder, TipoResponseDTO tipo) {
            this.id = id;
            this.nome = nome;
            this.descricao = descricao;
            this.categoria = categoria;
            this.forca = forca;
            this.acuracia = acuracia;
            this.pontosDePoder = pontosDePoder;
            this.tipo = tipo;
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getDescricao() {
            return descricao;
        }
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
        public Categoria getCategoria() {
            return categoria;
        }
        public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
        }
        public int getForca() {
            return forca;
        }
        public void setForca(int forca) {
            this.forca = forca;
        }
        public int getAcuracia() {
            return acuracia;
        }
        public void setAcuracia(int acuracia) {
            this.acuracia = acuracia;
        }
        public int getPontosDePoder() {
            return pontosDePoder;
        }
        public void setPontosDePoder(int pontosDePoder) {
            this.pontosDePoder = pontosDePoder;
        }
        public TipoResponseDTO getTipo() {
            return tipo;
        }
        public void setTipo(TipoResponseDTO tipo) {
            this.tipo = tipo;
        }
    
}
