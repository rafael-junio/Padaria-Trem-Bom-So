package cliente;

import funcionalidades.PessoaFisica;
import produtos.Produto;

public abstract class Cliente extends PessoaFisica {

	protected float valorCompras;

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
	
	public Cliente clone() {
		try {
			return (Cliente) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(" Clonagem não permitida.");
			return this;
		}
	}
	
	public void imprimeInformacoesCliente() {
		System.out.printf("Nome do Cliente: %s.\n", this.nome);
		System.out.printf("Endereço: %s.\n", this.endereco);
		System.out.printf("Telefone: %s.\n", this.telefone);
		System.out.printf("CPF: %s.\n", this.getCpf());
		System.out.printf("Valor total de compras realizadas: %.2f.\n", this.valorCompras);
	}
}
