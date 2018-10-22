/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.cliente;

import pessoa.PessoaFisica;

public abstract class Cliente extends PessoaFisica {

	protected float valorCompras;

	/**
	 * M�todo construtor da classe Cliente.java.
	 * M�todo para a inicializa��o da classe Cliente.
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, cpf e telefone. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf e telefone conforme recebidos pelos par�metros, sendo que todos esses os atributos s�o heran�as da classe PessoaFisica. Inicializa��o do atributo valorCompras como zero.
	 */
	public Cliente(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = 0f;
	}

	/**
	 * M�todo getValorCompras.
	 * M�todo para permitir acesso ao valor do atributo valorCompras.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float com o valor do atributo valorCompras. 
	 */
	public float getValorCompras() {
		return valorCompras;
	}

	/**
	 * M�todo setValorCompras.
	 * M�todo que permite altera��o do valor do atributo valorCompras.
     * Pr�-condi��o: recebimento de um float como par�metro: valorCompras.
     * P�s-condi��o: atribui��o do novo valor no atributo valorCompras. 
	 */
	public void setValorCompras(float valorCompras) {
		this.valorCompras = valorCompras;
	}
	
	/**
	 * M�todo atualizaCompraCliente.
	 * M�todo que atualiza o valor da compras do cliente, ou seja, o valor das compras j� realizadas pelo cliente.
	 * Pr�-condi��o: recebimento de um float como par�metro: valorCompra.
	 * P�s-condi��o: retorna o valor do atributo valorCompras ap�s o incremento do valor de valorCompra passado como par�metro.
	 */
	public float atualizaCompraCliente(float valorCompra) {
		return this.valorCompras += valorCompra;
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
	 * M�todo que compara se o valor do atributo cpf � igual ao passado como par�metro.
	 * Pr�-condi��o: recebimento de uma String como par�metro: cpf.
	 * P�s-condi��o: retorna true caso o valor do atributo cpf comparado seja igual ao valor do par�metro cpf passado, caso contr�rio, retorna false;
	 */
	public boolean ehIgual(String cpf) {
		if(removeCaracteresEspeciais(this.cpf).equals(removeCaracteresEspeciais(cpf)))
			return true;
		else
			return false;
	}
	
	/**
	 * M�todo exibeInfoVendaCliente.
	 * M�todo para converter informa��es dos atributos relacionados � venda do cliente para o formato de String.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna uma String com as informa��es dos atributos relacionados � venda do cliente.
	 */
	public String exibeInfoVendaCliente() {
		String info = String.format("Nome Cliente: %s\nCPF: %s\nValor acumulado de compras: %.2fR$", this.nome, this.cpf, this.valorCompras);
		return info;
	}

	/**
	 * M�todo imprimeInformacoesCliente.
	 * M�todo para imprimir em tela as informa��es referentes ao cliente.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do cliente em tela.
	 */
	public void imprimeInformacoesCliente() {
		System.out.printf("Nome do Cliente: %s.\n", this.nome);
		System.out.printf("Endere�o: %s.\n", this.endereco);
		System.out.printf("Telefone: %s.\n", this.telefone);
		System.out.printf("CPF: %s.\n", this.getCpf());
		System.out.printf("Valor total de compras realizadas: %.2fR$.\n", this.valorCompras);
	}
	

}
