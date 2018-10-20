package pessoa.fornecedor;

import pessoa.Pessoa;

public abstract class Fornecedor extends Pessoa {
	protected String cnpj;
	protected String codigo;

	/**
	 * Método construtor da classe Fornecedor.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public Fornecedor(String nome, String endereco, String codigo, String cnpj) {
		super(nome, endereco);
		if(codigo.length() == 3)
			this.codigo = codigo;
		else
			System.out.println("Código inválido! Deve conter 3 dígitos.");
		
		if (isCNPJ(cnpj))
			this.cnpj = cnpj;
		else
			System.out.println("CNPJ inválido!");
	}
	
	/**
	 * Método setCodigo.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Método getCodigo.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Método getCnpj.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public String getCnpj() {
		return imprimeCNPJ(this.cnpj);
	}

	/**
	 * Método setCnpj.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		else
			return false;
	}

	/**
	 * Método imprimeInformacoesFornecedor.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void imprimeInformacoesFornecedor() {
		System.out.printf("Nome do Fornecedor: %s.\n", this.nome);
		System.out.printf("Endereço: %s.\n", this.endereco);
		System.out.printf("Código do fornecedor: %s.\n", this.codigo);
		System.out.printf("CNPJ: %s.\n", this.getCnpj());
		
	}
}