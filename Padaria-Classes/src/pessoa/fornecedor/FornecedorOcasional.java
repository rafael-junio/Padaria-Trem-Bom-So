/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.fornecedor;

public final class FornecedorOcasional extends Fornecedor {

	/**
	 * M�todo construtor da classe FornecedorOcasional.java.
	 * M�todo para a inicializa��o da classe Fornecedor Ocasional.
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, codigo e cnpj. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, codigo e cnpj conforme recebidos pelos par�metros.
	 */
	public FornecedorOcasional(String nome, String endereco, String codigo, String cnpj) {
		super(nome, endereco, codigo, cnpj);
	}
	
	/**
	 * M�todo imprimeInformacoesFornecedor
	 * M�todo para imprimir em tela as informa��es referentes ao fornecedor ocasional.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do fornecedor ocasional em tela.
	 */
	public void imprimeInformacoesFornecedor() {
		super.imprimeInformacoesFornecedor();
	}
}
