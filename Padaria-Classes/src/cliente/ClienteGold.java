package cliente;

public class ClienteGold extends Cliente {

	public ClienteGold(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
		if (super.valorCompras > 250f)
			super.desconto = 0.05f;
	}
	
	public void imprimeInformacoesCliente() {
		super.imprimeInformacoesCliente();
	}
}
