package cliente;

public final class ClienteGold extends Cliente {
	private final float DESCONTO = 0.05f;
	
	public ClienteGold(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
	}
	
	public float getDESCONTO() {
		return DESCONTO;
	}

	public void imprimeInformacoesCliente() {
		System.out.println("Cliente Gold.");
		super.imprimeInformacoesCliente();
		System.out.printf("Desconto: %.0f%%.\n", ((getDESCONTO() -1f) * 100f));
	}
}
