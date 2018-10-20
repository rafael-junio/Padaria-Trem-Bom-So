package pessoa;

import funcionalidades.ValidaDocumento;

public abstract class Pessoa extends ValidaDocumento {
    protected String nome;
    protected String endereco;

    /**
     * M�todo construtor da classe Pessoa.java.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public Pessoa(String nome, String endereco) {
	this.nome = nome;
	this.endereco = endereco;
    }

    /**
     * M�todo getNome.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public String getNome() {
        return nome;
    }

    /**
     * M�todo setNome.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * M�todo getEndereco.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * M�todo setEndereco.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
