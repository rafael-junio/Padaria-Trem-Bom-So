package pessoa.fornecedor;

import pessoa.Pessoa;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
 *
 */
public abstract class Fornecedor extends Pessoa {
	protected String cnpj;
	protected String codigo;

	/**
	 * Método construtor da classe Fornecedor.
	 * 
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, codigo e cnpj. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, codigo e cnpj conforme recebidos pelos parâmetros.
	 */
	public Fornecedor(String nome, String endereco, String codigo, String cnpj) {
		super(nome, endereco);
		
		if(codigo.length() == 3)
			this.codigo = codigo;
		else
			System.out.println("Código inválido! Deve conter 3 dígitos.");
		
		if (isCNPJ(cnpj))
			this.cnpj = cnpj;
		else
			System.out.println("CNPJ inválido!");
	}
	
	/**
	 * Método setCodigo.
	 * 
     * Pré-condição: recebimento de uma String como parâmetro: codigo.
     * Pós-condição: atribuição do novo valor no atributo codigo. 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Método getCodigo.
	 * 
     * Pré-condição: não há.
     * Pós-condição: retorna uma String com o valor do atributo codigo. 
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Método getCnpj.
	 * 
     * Pré-condição: não há.
     * Pós-condição: retorna uma String com o valor do atributo cnpj com máscara. 
	 */
	public String getCnpj() {
		return imprimeCNPJ(this.cnpj);
	}

	/**
	 * Método setCnpj.
	 * 
     * Pré-condição: recebimento de uma String como parâmetro: cnpj.
     * Pós-condição: atribuição do novo valor no atributo cnpj. 
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	/**
	 * Método ehIgual.
	 * 
	 * Pré-condição: recebimento de uma String como parâmetro: codigo.
	 * Pós-condição: retorna true caso o valor do atributo codigo comparado seja igual ao valor do parâmetro codigo passado, caso contrário, retorna false;
	 */
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		else
			return false;
	}

	/**
	 * Método imprimeInformacoesFornecedor.
	 * 
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do fornecedor em tela.
	 */
	public void imprimeInformacoesFornecedor() {
		System.out.printf("Nome do Fornecedor: %s.\n", this.nome);
		System.out.printf("Endereço: %s.\n", this.endereco);
		System.out.printf("Código do fornecedor: %s.\n", this.codigo);
		System.out.printf("CNPJ: %s.\n", this.getCnpj());
		
	}
}