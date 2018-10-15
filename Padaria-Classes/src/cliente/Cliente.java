package cliente;

import funcionalidades.PessoaFisica;

public abstract class Cliente extends PessoaFisica {

	protected float valorCompras;
	protected float desconto;

	public Cliente(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = 0f;
	}

	public float getValorCompras() {
		return valorCompras;
	}

	public void setValorCompras(float valorCompras) {
		this.valorCompras = valorCompras;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public float atualizarValorCompras(float totalCompra) {
		return this.valorCompras += totalCompra;
	}
	
	public void imprimeInformacoesCliente() {
		System.out.printf("Nome do Cliente: %s.\n", this.nome);
		System.out.printf("Endere�o: %s.\n", this.endereco);
		System.out.printf("Telefone: %s.\n", this.telefone);
		System.out.printf("CPF: %s.\n", this.getCpf());
		System.out.printf("Valor total de compras realizadas: %.2f.\n", this.valorCompras);
		if (getDesconto() != 0f)
			System.out.printf("Desconto: %.1%%.\n", (getDesconto() * 100f));
	}
}