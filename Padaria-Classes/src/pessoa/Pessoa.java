/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa;

import funcionalidades.ValidaDocumento;

public abstract class Pessoa extends ValidaDocumento {
    protected String nome;
    protected String endereco;

    /**
     * M�todo construtor da classe Pessoa.java.
     * M�todo para a inicializa��o da classe Pessoa.
     * Pr�-condi��o: recebimento de duas String como par�metros: o nome e o endere�o.
     * P�s-condi��o: atribui��o das String recebidas para os atributos nome e endere�o, respectivamente.
     */
    public Pessoa(String nome, String endereco) {
	this.nome = nome;
	this.endereco = endereco;
    }

    /**
     * M�todo getNome.
     * M�todo para permitir acesso ao valor do atributo nome.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna uma String com o valor do atributo nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * M�todo setNome.
     * M�todo que permite altera��o do valor do atributo nome.
     * Pr�-condi��o: recebimento de uma String como par�metro: nome.
     * P�s-condi��o: atribui��o do novo valor no atributo nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * M�todo getEndereco.
     * M�todo para permitir acesso ao valor do atributo endereco.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna uma String com o valor do atributo endere�o.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * M�todo setEndereco.
     * M�todo que permite altera��o do valor do atributo endereco.
     * Pr�-condi��o: recebimento de uma String como par�metro: endereco.
     * P�s-condi��o: atribui��o do novo valor no atributo endereco. 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
