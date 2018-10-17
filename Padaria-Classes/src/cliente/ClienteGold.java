package cliente;

public final class ClienteGold extends Cliente {
	private final float DESCONTO = 1.05f;
	
	public ClienteGold(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
	}
	
	public float getDESCONTO() {
		return DESCONTO;
	}

	public void imprimeInformacoesCliente() {
		super.imprimeInformacoesCliente();
	}
}
