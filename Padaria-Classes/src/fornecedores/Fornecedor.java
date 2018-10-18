package fornecedores;

import funcionalidades.Pessoa;

public abstract class Fornecedor extends Pessoa {
	protected String cnpj;
	protected String codigo;

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
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getCnpj() {
		return imprimeCNPJ(this.cnpj);
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return getNome();
	}

	public void imprimeInformacoesFornecedor() {
		System.out.printf("Nome do Fornecedor: %s.\n", this.nome);
		System.out.printf("Endere�o: %s.\n", this.endereco);
		System.out.printf("C�digo do fornecedor: %s.\n", this.codigo);
		System.out.printf("CNPJ: %s.\n", this.getCnpj());
		
	}
}