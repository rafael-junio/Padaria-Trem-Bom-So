package pessoa.fornecedor;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class FornecedorOcasional extends Fornecedor {

	/**
	 * M�todo construtor da classe FornecedorOcasional.
	 * 
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, codigo e cnpj. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, codigo e cnpj conforme recebidos pelos par�metros.
	 */
	public FornecedorOcasional(String nome, String endereco, String codigo, String cnpj) {
		super(nome, endereco, codigo, cnpj);
	}
	
	/**
	 * M�todo imprimeInformacoesFornecedor
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do fornecedor ocasional em tela.
	 */
	public void imprimeInformacoesFornecedor() {
		System.out.println("Fornecedor Ocasional");
		super.imprimeInformacoesFornecedor();
	}
}
