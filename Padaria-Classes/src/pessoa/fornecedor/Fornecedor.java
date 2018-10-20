package pessoa.fornecedor;

import pessoa.Pessoa;

public abstract class Fornecedor extends Pessoa {
	protected String cnpj;
	protected String codigo;

	/**
	 * M�todo construtor da classe Fornecedor.java.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public Fornecedor(String nome, String endereco, String codigo, String cnpj) {
		super(nome, endereco);
		if(codigo.length() == 3)
			this.codigo = codigo;
		else
			System.out.println("C�digo inv�lido! Deve conter 3 d�gitos.");
		
		if (isCNPJ(cnpj))
			this.cnpj = cnpj;
		else
			System.out.println("CNPJ inv�lido!");
	}
	
	/**
	 * M�todo setCodigo.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * M�todo getCodigo.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * M�todo getCnpj.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public String getCnpj() {
		return imprimeCNPJ(this.cnpj);
	}

	/**
	 * M�todo setCnpj.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
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
	 * M�todo ehIgual.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public boolean ehIgual(String codigo) {
		if(this.codigo.equals(codigo))
			return true;
		else
			return false;
	}

	/**
	 * M�todo imprimeInformacoesFornecedor.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void imprimeInformacoesFornecedor() {
		System.out.printf("Nome do Fornecedor: %s.\n", this.nome);
		System.out.printf("Endere�o: %s.\n", this.endereco);
		System.out.printf("C�digo do fornecedor: %s.\n", this.codigo);
		System.out.printf("CNPJ: %s.\n", this.getCnpj());
		
	}
}