package pessoa.cliente;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class ClientePlatinum extends Cliente {
	private final float DESCONTO = 0.1f;
	
	/**
	 * Método construtor da classe ClientePlatinum.
	 * 
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, cpf e telefone e um float: valorCompras.
	 * Pós-condição: atribução de valores dos atributos nome, endereço, cpf e telefone e valorCompras conforme recebidos pelos parâmetros.
	 */
	public ClientePlatinum(String nome, String endereco, String cpf, String telefone, float valorCompras) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = valorCompras;
	}
	
	/**
	 * Método getDESCONTO.
	 * 
     * Pré-condição: não há.
     * Pós-condição: retorna um float do valor do atributo DESCONTO.
	 */
	public float getDESCONTO() {
		return DESCONTO;
	}
	
	/**
	 * Método calculaDesconto.
	 * 
	 * Pré-condição: recebimento de um float como parâmetro: valorCompra.
	 * Pós-condição: retorna um float com o valor do parâmetro valorCompra multiplicado pelo valor do DESCONTO.
	 */
	public float calculaDesconto(float valorCompra) {
		 return (valorCompra * DESCONTO);
	}
	
	/**
	 * Método exibeInfoVendaCliente.
	 * 
	 * Pré-condição: não há.
	 * Pós-condição: retorna uma String com as informações dos atributos relacionados à venda do clientePlatinum.
	 */
	public String exibeInfoVendaCliente() {
		String info = "Cliente Platinum  (10% de desconto).\n" + super.exibeInfoVendaCliente();
		return info;
	}

	/**
	 * Método imprimeInformacoesCliente.
	 * 
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do clientePlatinum em tela.
	 */
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Platinum.");
		super.imprimeInformacoesCliente();
		System.out.printf("Desconto: %.0f%%.\n", (getDESCONTO() * 100f));
	}
}
