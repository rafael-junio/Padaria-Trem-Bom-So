package cliente;

public final class ClientePlatinum extends Cliente {
	private final float DESCONTO = 1.1f;
	
	public ClientePlatinum(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
	}
	
	public float getDESCONTO() {
		return DESCONTO;
	}

	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Platinum.");
		super.imprimeInformacoesCliente();
		System.out.printf("Desconto: %.0f%%.\n", ((getDESCONTO() -1f) * 100f));
	}
}
