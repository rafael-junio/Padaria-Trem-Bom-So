package pessoa.cliente;

public final class ClienteGold extends Cliente {
	private final float DESCONTO = 0.05f;
	
	/**
	 * Método construtor da classe ClienteGold.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public ClienteGold(String nome, String endereco, String cpf, String telefone, float valorCompras) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = valorCompras;
	}
	
	/**
	 * Método getDESCONTO.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getDESCONTO() {
		return DESCONTO;
	}
	
	/**
	 * Método calculaDesconto.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float calculaDesconto(float valorCompra) {
		 return (valorCompra * DESCONTO);
	}
	
	/* (non-Javadoc)
	 * @see pessoa.cliente.Cliente#exibeInfoVendaCliente()
	 */
	public String exibeInfoVendaCliente() {
		String info = "Cliente Gold (5% de desconto).\n" + super.exibeInfoVendaCliente();
		return info;
	}

	/* (non-Javadoc)
	 * @see pessoa.cliente.Cliente#imprimeInformacoesCliente()
	 */
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Gold.");
		super.imprimeInformacoesCliente();
		System.out.printf("Desconto: %.0f%%.\n", (getDESCONTO() * 100f));
	}
}
