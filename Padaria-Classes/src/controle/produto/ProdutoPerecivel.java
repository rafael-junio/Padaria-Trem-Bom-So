package controle.produto;

import pessoa.fornecedor.Fornecedor;

public final class ProdutoPerecivel extends Produto {

	private int dia;
	private int mes;
	private int ano;

	/**
	 * M�todo construtor da classe ProdutoPerecivel.java.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public ProdutoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
			float precoFinal, int dia, int mes, int ano, String[] apelido) {
		super(nome, codigo, fornecedorProduto, precoCusto, precoFinal, apelido);
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	/**
	 * M�todo getDia.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * M�todo setDia.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * M�todo getMes.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * M�todo setMes.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * M�todo getAno.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * M�todo setAno.
	 *
	 * Pr�-condi��o: 
	 * P�s-condi��o: 
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
