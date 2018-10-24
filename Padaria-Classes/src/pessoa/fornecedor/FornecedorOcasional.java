package pessoa.fornecedor;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class FornecedorOcasional extends Fornecedor {

	/**
	 * Método construtor da classe FornecedorOcasional.
	 * 
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, codigo e cnpj. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, codigo e cnpj conforme recebidos pelos parâmetros.
	 */
	public FornecedorOcasional(String nome, String endereco, String codigo, String cnpj) {
		super(nome, endereco, codigo, cnpj);
	}
	
	/**
	 * Método imprimeInformacoesFornecedor
	 * 
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do fornecedor ocasional em tela.
	 */
	public void imprimeInformacoesFornecedor() {
		System.out.println("Fornecedor Ocasional");
		super.imprimeInformacoesFornecedor();
	}
}
