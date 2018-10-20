package controle.produto;

import pessoa.fornecedor.Fornecedor;

public final class ProdutoPerecivel extends Produto {

	private int dia;
	private int mes;
	private int ano;

	/**
	 * Método construtor da classe ProdutoPerecivel.java.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public ProdutoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
			float precoFinal, int dia, int mes, int ano, String[] apelido) {
		super(nome, codigo, fornecedorProduto, precoCusto, precoFinal, apelido);
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	/**
	 * Método getDia.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Método setDia.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Método getMes.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Método setMes.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Método getAno.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Método setAno.
	 *
	 * Pré-condição: 
	 * Pós-condição: 
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	/* (non-Javadoc)
	 * @see controle.produto.Produto#imprimeInformacoesProduto()
	 */
	public void imprimeInformacoesProduto() {
		super.imprimeInformacoesProduto();
		System.out.printf("Data de validade: %02d/%02d/%02d.\n", this.dia, this.mes, this.ano);
	}

}
