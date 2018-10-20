package pessoa.cliente;

import pessoa.PessoaFisica;

public abstract class Cliente extends PessoaFisica {

	protected float valorCompras;

	/**
	 * Método construtor da classe Cliente.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Cliente(String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
		this.valorCompras = 0f;
	}

	/**
	 * Método getValorCompras.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float getValorCompras() {
		return valorCompras;
	}

	/**
	 * Método setValorCompras.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setValorCompras(float valorCompras) {
		this.valorCompras = valorCompras;
	}
	
	/**
	 * Método atualizaCompraCliente.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public float atualizaCompraCliente(float valorCompra) {
		return this.valorCompras += valorCompra;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.getNome();
	}
	
	/**
	 * Método ehIgual.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public boolean ehIgual(String cpf) {
		if(removeCaracteresEspeciais(this.cpf).equals(removeCaracteresEspeciais(cpf)))
			return true;
		else
			return false;
	}
	
	/**
	 * Método exibeInfoVendaCliente.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public String exibeInfoVendaCliente() {
		String info = String.format("Nome Cliente: %s\nCPF: %s\nValor acumulado de compras: %.2fR$", this.nome, this.cpf, this.valorCompras);
		return info;
	}

	/**
	 * Método imprimeInformacoesCliente.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void imprimeInformacoesCliente() {
		System.out.printf("Nome do Cliente: %s.\n", this.nome);
		System.out.printf("Endereço: %s.\n", this.endereco);
		System.out.printf("Telefone: %s.\n", this.telefone);
		System.out.printf("CPF: %s.\n", this.getCpf());
		System.out.printf("Valor total de compras realizadas: %.2fR$.\n", this.valorCompras);
	}
	
//	public void imprimeInformacoes
}
