package pessoa.cliente;

public final class ClienteRegular extends Cliente {

	/**
	 * Método construtor da classe ClienteRegular.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public ClienteRegular(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
	}
	
	/* (non-Javadoc)
	 * @see pessoa.cliente.Cliente#atualizaCompraCliente(float)
	 */
	public float atualizaCompraCliente(float valorCompra) {
		return this.valorCompras = valorCompra;
	}
	
	/* (non-Javadoc)
	 * @see pessoa.cliente.Cliente#exibeInfoVendaCliente()
	 */
	public String exibeInfoVendaCliente() {
		String info = "Cliente Regular.\n" + super.exibeInfoVendaCliente();
		return info;
	}
	
	/* (non-Javadoc)
	 * @see pessoa.cliente.Cliente#imprimeInformacoesCliente()
	 */
	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Regular.");
		super.imprimeInformacoesCliente();
	}
}
