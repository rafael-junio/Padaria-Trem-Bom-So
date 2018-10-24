package pessoa.cliente;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class ClienteGold extends Cliente {
	private final float DESCONTO = 0.05f;
	
	/**
	 * M�todo construtor da classe ClienteGold.
	 * 
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, cpf e telefone e um float: valorCompras.
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf e telefone e valorCompras conforme recebidos pelos par�metros.
	 */
	public ClienteGold(String nome, String endereco, String cpf, String telefone, float valorCompras) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = valorCompras;
	}
	
	/**
	 * M�todo getDESCONTO.
	 * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float do valor do atributo DESCONTO.
	 */
	public float getDESCONTO() {
		return DESCONTO;
	}
	
	/**
	 * M�todo calculaDesconto.
	 * 
	 * Pr�-condi��o: recebimento de um float como par�metro: valorCompra.
	 * P�s-condi��o: retorna um float com o valor do par�metro valorCompra multiplicado pelo valor do Desconto.
	 */
	public float calculaDesconto(float valorCompra) {
		 return (valorCompra * DESCONTO);
	}
	
	/**
	 * M�todo exibeInfoVendaCliente.
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: retorna uma String com as informa��es dos atributos relacionados � venda do clienteGold.
	 */
	public String exibeInfoVendaCliente() {
		String info = "Cliente Gold (5% de desconto).\n" + super.exibeInfoVendaCliente();
		return info;
	}

	/**
	 * M�todo imprimeInformacoesCliente.
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do clienteGold em tela.
	 */
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Gold.");
		super.imprimeInformacoesCliente();
		System.out.printf("Desconto: %.0f%%.\n", (getDESCONTO() * 100f));
	}
}
