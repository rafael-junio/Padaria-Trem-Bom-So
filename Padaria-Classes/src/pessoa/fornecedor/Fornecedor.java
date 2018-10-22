/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.fornecedor;

import pessoa.Pessoa;

public abstract class Fornecedor extends Pessoa {
	protected String cnpj;
	protected String codigo;

	/**
	 * Método construtor da classe Fornecedor.java.
	 * Método para a inicialização da classe Fornecedor.
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
	 * Método que permite alteração do valor do atributo codigo.
     * Pré-condição: recebimento de uma String como parâmetro: codigo.
     * Pós-condição: atribuição do novo valor no atributo codigo. 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Método getCodigo.
	 * Método para permitir acesso ao valor do atributo codigo.
     * Pré-condição: não há.
     * Pós-condição: retorna uma String com o valor do atributo codigo. 
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Método getCnpj.
	 * Método para permitir acesso ao valor do atributo cnpj.
     * Pré-condição: não há.
     * Pós-condição: retorna uma String com o valor do atributo cnpj. 
	 */
	public String getCnpj() {
		return imprimeCNPJ(this.cnpj);
	}

	/**
	 * Método setCnpj.
	 * Método que permite alteração do valor do atributo cnpj.
     * Pré-condição: recebimento de uma String como parâmetro: cnpj.
     * Pós-condição: atribuição do novo valor no atributo cnpj. 
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	/**
	 * Método toString().
	 * Método que converte o objeto original em formato String por meio do atributo nome;
	 * Pré-condição: não há.
	 * Pós-condição: retorna uma String com o valor do atributo nome;
	 */
	@Override
	public String toString() {
		return super.getNome();
	}
	
	/**
	 * Método ehIgual.
	 * Método que compara se o valor do atributo codigo é igual ao passado como parâmetro.
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
	 * Método para imprimir em tela as informações referentes ao fornecedor.
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