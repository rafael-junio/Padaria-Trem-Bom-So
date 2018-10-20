package pessoa.cliente;

public final class ClienteGold extends Cliente {
	private final float DESCONTO = 0.05f;
	
	/**
	 * M�todo construtor da classe ClienteGold.java.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public ClienteGold(String nome, String endereco, String cpf, String telefone, float valorCompras) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = valorCompras;
	}
	
	/**
	 * M�todo getDESCONTO.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public float getDESCONTO() {
		return DESCONTO;
	}
	
	/**
	 * M�todo calculaDesconto.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
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
