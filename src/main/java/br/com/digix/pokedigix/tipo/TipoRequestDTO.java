package br.com.digix.pokedigix.tipo;

public class TipoRequestDTO {

    private String nome;

    public TipoRequestDTO(Long long1, String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
