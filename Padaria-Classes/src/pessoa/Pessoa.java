/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa;

import funcionalidades.ValidaDocumento;

public abstract class Pessoa extends ValidaDocumento {
    protected String nome;
    protected String endereco;

    /**
     * Método construtor da classe Pessoa.java.
     * Método para a inicialização da classe Pessoa.
     * Pré-condição: recebimento de duas String como parâmetros: o nome e o endereço.
     * Pós-condição: atribuição das String recebidas para os atributos nome e endereço, respectivamente.
     */
    public Pessoa(String nome, String endereco) {
	this.nome = nome;
	this.endereco = endereco;
    }

    /**
     * Método getNome.
     * Método para permitir acesso ao valor do atributo nome.
     * Pré-condição: não há.
     * Pós-condição: retorna uma String com o valor do atributo nome.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método setNome.
     * Método que permite alteração do valor do atributo nome.
     * Pré-condição: recebimento de uma String como parâmetro: nome.
     * Pós-condição: atribuição do novo valor no atributo nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método getEndereco.
     * Método para permitir acesso ao valor do atributo endereco.
     * Pré-condição: não há.
     * Pós-condição: retorna uma String com o valor do atributo endereço.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Método setEndereco.
     * Método que permite alteração do valor do atributo endereco.
     * Pré-condição: recebimento de uma String como parâmetro: endereco.
     * Pós-condição: atribuição do novo valor no atributo endereco. 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
