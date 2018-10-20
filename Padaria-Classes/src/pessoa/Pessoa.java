package pessoa;

import funcionalidades.ValidaDocumento;

public abstract class Pessoa extends ValidaDocumento {
    protected String nome;
    protected String endereco;

    /**
     * Método construtor da classe Pessoa.java.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public Pessoa(String nome, String endereco) {
	this.nome = nome;
	this.endereco = endereco;
    }

    /**
     * Método getNome.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método setNome.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método getEndereco.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Método setEndereco.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
