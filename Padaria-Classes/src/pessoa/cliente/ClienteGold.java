/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.cliente;

public final class ClienteGold extends Cliente {
	private final float DESCONTO = 0.05f;
	
	/**
	 * Método construtor da classe ClienteGold.java.
	 * Método para a inicialização da classe ClienteGold.
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, cpf e telefone e um float: valorCompras.
	 * Pós-condição: atribução de valores dos atributos nome, endereço, cpf e telefone e valorCompras conforme recebidos pelos parâmetros.
	 */
	public ClienteGold(String nome, String endereco, String cpf, String telefone, float valorCompras) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = valorCompras;
	}
	
	/**
	 * Método getDESCONTO.
	 * Método para permitir acesso ao valor do atributo DESCONTO.
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo DESCONTO.
	 */
	public float getDESCONTO() {
		return DESCONTO;
	}
	
	/**
	 * Método calculaDesconto.
	 * Método que calcula o valor da compra do cliente de acordo com o valor de desconto.
	 * Pré-condição: recebimento de um float como parâmetro: valorCompra.
	 * Pós-condição: retorna um float com o valor do parâmetro valorCompra multiplicado pelo valor do Desconto.
	 */
	public float calculaDesconto(float valorCompra) {
		 return (valorCompra * DESCONTO);
	}
	
	/**
	 * Método exibeInfoVendaCliente.
	 * Método para converter informações dos atributos relacionados à venda do clienteGold para o formato de String.
	 * Pré-condição: não há.
	 * Pós-condição: retorna uma String com as informações dos atributos relacionados à venda do clienteGold.
	 */
	public String exibeInfoVendaCliente() {
		String info = "Cliente Gold (5% de desconto).\n" + super.exibeInfoVendaCliente();
		return info;
	}

	/**
	 * Método imprimeInformacoesCliente.
	 * Método para imprimir em tela as informações referentes ao cliente Gold.
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do clienteGold em tela.
	 */
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Gold.");
		super.imprimeInformacoesCliente();
		System.out.printf("Desconto: %.0f%%.\n", (getDESCONTO() * 100f));
	}
}
