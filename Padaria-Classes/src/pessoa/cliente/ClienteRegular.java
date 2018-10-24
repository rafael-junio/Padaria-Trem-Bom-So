/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.cliente;

public final class ClienteRegular extends Cliente {

	/**
	 * M�todo construtor da classe ClienteRegular.
	 * M�todo para a inicializa��o da classe Cliente.
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, cpf e telefone. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf e telefone conforme recebidos pelos par�metros, sendo que todos esses os atributos s�o heran�as da classe Cliente.
	 */
	public ClienteRegular(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
	}
	
	/**
	 * M�todo atualizaCompraCliente.
	 * M�todo que atualiza o valor da compras do clienteRegular, ou seja, o valor das compras j� realizadas pelo clienteRegular.
	 * Pr�-condi��o: recebimento de um float como par�metro: valorCompra.
	 * P�s-condi��o: retorna o valor do atributo valorCompras ap�s o incremento do valor de valorCompra passado como par�metro.
	 */
	public float atualizaCompraCliente(float valorCompra) {
		return this.valorCompras += valorCompra;
	}
	
	/**
	 * M�todo exibeInfoVendaCliente.
	 * M�todo para converter informa��es dos atributos relacionados � venda do cliente para o formato de String.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna uma String com as informa��es dos atributos relacionados � venda do clienteRegular.
	 */
	public String exibeInfoVendaCliente() {
		String info = "Cliente Regular.\n" + super.exibeInfoVendaCliente();
		return info;
	}
	
	/**
	 * M�todo imprimeInformacoesCliente.
	 * M�todo para imprimir em tela as informa��es referentes ao cliente regular.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do clienteRegular em tela.
	 */
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Regular.");
		super.imprimeInformacoesCliente();
	}
}
