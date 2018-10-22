/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.fornecedor;

public final class FornecedorOcasional extends Fornecedor {

	/**
	 * Método construtor da classe FornecedorOcasional.java.
	 * Método para a inicialização da classe Fornecedor Ocasional.
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, codigo e cnpj. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, codigo e cnpj conforme recebidos pelos parâmetros.
	 */
	public FornecedorOcasional(String nome, String endereco, String codigo, String cnpj) {
		super(nome, endereco, codigo, cnpj);
	}
	
	/**
	 * Método imprimeInformacoesFornecedor
	 * Método para imprimir em tela as informações referentes ao fornecedor ocasional.
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do fornecedor ocasional em tela.
	 */
	public void imprimeInformacoesFornecedor() {
		super.imprimeInformacoesFornecedor();
	}
}
