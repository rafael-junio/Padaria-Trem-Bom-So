/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.cliente;

public final class ClienteGold extends Cliente {
	private final float DESCONTO = 0.05f;
	
	/**
	 * M�todo construtor da classe ClienteGold.java.
	 * M�todo para a inicializa��o da classe ClienteGold.
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, cpf e telefone e um float: valorCompras.
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf e telefone e valorCompras conforme recebidos pelos par�metros.
	 */
	public ClienteGold(String nome, String endereco, String cpf, String telefone, float valorCompras) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = valorCompras;
	}
	
	/**
	 * M�todo getDESCONTO.
	 * M�todo para permitir acesso ao valor do atributo DESCONTO.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo DESCONTO.
	 */
	public float getDESCONTO() {
		return DESCONTO;
	}
	
	/**
	 * M�todo calculaDesconto.
	 * M�todo que calcula o valor da compra do cliente de acordo com o valor de desconto.
	 * Pr�-condi��o: recebimento de um float como par�metro: valorCompra.
	 * P�s-condi��o: retorna um float com o valor do par�metro valorCompra multiplicado pelo valor do Desconto.
	 */
	public float calculaDesconto(float valorCompra) {
		 return (valorCompra * DESCONTO);
	}
	
	/**
	 * M�todo exibeInfoVendaCliente.
	 * M�todo para converter informa��es dos atributos relacionados � venda do clienteGold para o formato de String.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna uma String com as informa��es dos atributos relacionados � venda do clienteGold.
	 */
	public String exibeInfoVendaCliente() {
		String info = "Cliente Gold (5% de desconto).\n" + super.exibeInfoVendaCliente();
		return info;
	}

	/**
	 * M�todo imprimeInformacoesCliente.
	 * M�todo para imprimir em tela as informa��es referentes ao cliente Gold.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do clienteGold em tela.
	 */
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Gold.");
		super.imprimeInformacoesCliente();
		System.out.printf("Desconto: %.0f%%.\n", (getDESCONTO() * 100f));
	}
}
