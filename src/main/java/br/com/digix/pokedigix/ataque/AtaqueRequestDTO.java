package br.com.digix.pokedigix.ataque;

public class AtaqueRequestDTO {
        private String nome ;
        private String descricao;
        private Categoria categoria; 
        private int forca;
        private int acuracia;
        private int pontosDePoder; 
        private Long tipoId;
        
        public void AtaqueRequestDTO(String nome, String descricao, Categoria categoria, int forca, int acuracia,
        int pontosDePoder, Long tipoId) {
            this.nome = nome;
            this.descricao = descricao;
            this.categoria = categoria;
            this.forca = forca;
            this.acuracia = acuracia;
            this.pontosDePoder = pontosDePoder;
            this.tipoId = tipoId;
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
        public Long getTipoId() {
            return tipoId;
        }
    
        public void setTipoId(Long tipoId) {
            this.tipoId = tipoId;
        }
        
        
    }
    
    
    