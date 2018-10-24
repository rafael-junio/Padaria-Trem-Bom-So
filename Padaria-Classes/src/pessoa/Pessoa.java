package pessoa;

import funcionalidades.ValidaDocumento;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public abstract class Pessoa extends ValidaDocumento {
    protected String nome;
    protected String endereco;

    /**
     * M�todo construtor da classe Pessoa.
     * 
     * Pr�-condi��o: recebimento de duas String como par�metros: o nome e o endere�o.
     * P�s-condi��o: atribui��o das String recebidas para os atributos nome e endere�o, respectivamente.
     */
    public Pessoa(String nome, String endereco) {
    	this.nome = nome;
    	this.endereco = endereco;
    }

    /**
     * M�todo getNome.
     * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna uma String com o valor do atributo nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * M�todo setNome.
     * 
     * Pr�-condi��o: recebimento de uma String como par�metro: nome.
     * P�s-condi��o: atribui��o do novo valor no atributo nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * M�todo getEndereco.
     * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna uma String com o valor do atributo endere�o.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * M�todo setEndereco.
     * 
     * Pr�-condi��o: recebimento de uma String como par�metro: endereco.
     * P�s-condi��o: atribui��o do novo valor no atributo endereco. 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /**
	 * M�todo toString.
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna uma String com o valor do atributo nome;
	 */
	@Override
	public String toString() {
		return getNome();
	}
}
