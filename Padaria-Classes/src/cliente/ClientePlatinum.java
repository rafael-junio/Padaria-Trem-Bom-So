package cliente;

public final class ClientePlatinum extends Cliente {
	private final float DESCONTO = 0.1f;
	
	public ClientePlatinum(String nome, String endereco, String cpf, String telefone, float valorCompras) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = valorCompras;
	}
	
	public float getDESCONTO() {
		return DESCONTO;
	}
	
	public float calculaDesconto(float valorCompra) {
		 return (valorCompra * DESCONTO);
	}
	
	public String exibeInfoVendaCliente() {
		String info = "Cliente Platinum.\n" + super.exibeInfoVendaCliente();
		return info;
	}

	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Platinum.");
		super.imprimeInformacoesCliente();
		System.out.printf("Desconto: %.0f%%.\n", (getDESCONTO() * 100f));
	}
}
