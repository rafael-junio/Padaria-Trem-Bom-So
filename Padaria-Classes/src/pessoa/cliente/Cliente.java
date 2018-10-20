package pessoa.cliente;

import pessoa.PessoaFisica;

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
	
	public float atualizaCompraCliente(float valorCompra) {
		return this.valorCompras += valorCompra;
	}
	
	@Override
	public String toString() {
		return super.getNome();
	}
	
	public boolean ehIgual(String cpf) {
		if(removeCaracteresEspeciais(this.cpf).equals(removeCaracteresEspeciais(cpf)))
			return true;
		else
			return false;
	}
	
	public String exibeInfoVendaCliente() {
		String info = String.format("Nome Cliente: %s\nCPF: %s\nValor acumulado de compras: %.2fR$", this.nome, this.cpf, this.valorCompras);
		return info;
	}

	public void imprimeInformacoesCliente() {
		System.out.printf("Nome do Cliente: %s.\n", this.nome);
		System.out.printf("Endereço: %s.\n", this.endereco);
		System.out.printf("Telefone: %s.\n", this.telefone);
		System.out.printf("CPF: %s.\n", this.getCpf());
		System.out.printf("Valor total de compras realizadas: %.2fR$.\n", this.valorCompras);
	}
	
//	public void imprimeInformacoes
}
