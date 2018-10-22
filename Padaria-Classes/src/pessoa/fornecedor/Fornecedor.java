/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.fornecedor;

import pessoa.Pessoa;

public abstract class Fornecedor extends Pessoa {
	protected String cnpj;
	protected String codigo;

	/**
	 * M�todo construtor da classe Fornecedor.java.
	 * M�todo para a inicializa��o da classe Fornecedor.
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, codigo e cnpj. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, codigo e cnpj conforme recebidos pelos par�metros.
	 */
	public Fornecedor(String nome, String endereco, String codigo, String cnpj) {
		super(nome, endereco);
		if(codigo.length() == 3)
			this.codigo = codigo;
		else
			System.out.println("C�digo inv�lido! Deve conter 3 d�gitos.");
		
		if (isCNPJ(cnpj))
			this.cnpj = cnpj;
		else
			System.out.println("CNPJ inv�lido!");
	}
	
	/**
	 * M�todo setCodigo.
	 * M�todo que permite altera��o do valor do atributo codigo.
     * Pr�-condi��o: recebimento de uma String como par�metro: codigo.
     * P�s-condi��o: atribui��o do novo valor no atributo codigo. 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * M�todo getCodigo.
	 * M�todo para permitir acesso ao valor do atributo codigo.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna uma String com o valor do atributo codigo. 
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * M�todo getCnpj.
	 * M�todo para permitir acesso ao valor do atributo cnpj.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna uma String com o valor do atributo cnpj. 
	 */
	public String getCnpj() {
		return imprimeCNPJ(this.cnpj);
	}

	/**
	 * M�todo setCnpj.
	 * M�todo que permite altera��o do valor do atributo cnpj.
     * Pr�-condi��o: recebimento de uma String como par�metro: cnpj.
     * P�s-condi��o: atribui��o do novo valor no atributo cnpj. 
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	/**
	 * M�todo toString().
	 * M�todo que converte o objeto original em formato String por meio do atributo nome;
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna uma String com o valor do atributo nome;
	 */
	@Override
	public String toString() {
		return super.getNome();
	}
	
	/**
	 * M�todo ehIgual.
	 * M�todo que compara se o valor do atributo codigo � igual ao passado como par�metro.
	 * Pr�-condi��o: recebimento de uma String como par�metro: codigo.
	 * P�s-condi��o: retorna true caso o valor do atributo codigo comparado seja igual ao valor do par�metro codigo passado, caso contr�rio, retorna false;
	 */
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		else
			return false;
	}

	/**
	 * M�todo imprimeInformacoesFornecedor.
	 * M�todo para imprimir em tela as informa��es referentes ao fornecedor.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do fornecedor em tela.
	 */
	public void imprimeInformacoesFornecedor() {
		System.out.printf("Nome do Fornecedor: %s.\n", this.nome);
		System.out.printf("Endere�o: %s.\n", this.endereco);
		System.out.printf("C�digo do fornecedor: %s.\n", this.codigo);
		System.out.printf("CNPJ: %s.\n", this.getCnpj());
		
	}
}