/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.cliente;

public final class ClienteRegular extends Cliente {

	/**
	 * Método construtor da classe ClienteRegular.
	 * Método para a inicialização da classe Cliente.
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, cpf e telefone. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, cpf e telefone conforme recebidos pelos parâmetros, sendo que todos esses os atributos são heranças da classe Cliente.
	 */
	public ClienteRegular(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
	}
	
	/**
	 * Método atualizaCompraCliente.
	 * Método que atualiza o valor da compras do clienteRegular, ou seja, o valor das compras já realizadas pelo clienteRegular.
	 * Pré-condição: recebimento de um float como parâmetro: valorCompra.
	 * Pós-condição: retorna o valor do atributo valorCompras após o incremento do valor de valorCompra passado como parâmetro.
	 */
	public float atualizaCompraCliente(float valorCompra) {
		return this.valorCompras += valorCompra;
	}
	
	/**
	 * Método exibeInfoVendaCliente.
	 * Método para converter informações dos atributos relacionados à venda do cliente para o formato de String.
	 * Pré-condição: não há.
	 * Pós-condição: retorna uma String com as informações dos atributos relacionados à venda do clienteRegular.
	 */
	public String exibeInfoVendaCliente() {
		String info = "Cliente Regular.\n" + super.exibeInfoVendaCliente();
		return info;
	}
	
	/**
	 * Método imprimeInformacoesCliente.
	 * Método para imprimir em tela as informações referentes ao cliente regular.
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do clienteRegular em tela.
	 */
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Regular.");
		super.imprimeInformacoesCliente();
	}
}
