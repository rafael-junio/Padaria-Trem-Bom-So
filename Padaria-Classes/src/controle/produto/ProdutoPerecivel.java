package controle.produto;

import pessoa.fornecedor.Fornecedor;

public final class ProdutoPerecivel extends Produto {

	private int dia;
	private int mes;
	private int ano;

	/**
	 * M�todo construtor da classe ProdutoPerecivel.java.
	 *
	 * Pr�-condi��o: recebe duas Strings, um objeto do tipo Fornecedor, dois floats, tr�s inteiros e um vetor de Strings. 
	 * P�s-condi��o: instancia os atributos da classe.
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
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo int dia.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * M�todo setDia.
	 *
	 * Pr�-condi��o: recebe um int.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo int dia.
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}



	/**
	 * M�todo getMes.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo int mes.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * M�todo setMes.
	 *
	 * Pr�-condi��o: recebe um int.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo int mes.
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * M�todo getAno.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna atributo int ano.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * M�todo setAno.
	 *
	 * Pr�-condi��o: recebe um int.
	 * P�s-condi��o: n�o retorna valor. Instancia atributo int ano.
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	/**
	 * M�todo imprimeInformacoesProduto.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: n�o retorna valor. Imprime atributos da classe.
	 */
	public void imprimeInformacoesProduto() {
		super.imprimeInformacoesProduto();
		System.out.printf("Data de validade: %02d/%02d/%02d.\n", this.dia, this.mes, this.ano);
	}
	
	/**
	 * M�todo exibeInfoVendaProdutos.
	 *
	 * Pr�-condi��o: n�o recebe nenhum par�metro.
	 * P�s-condi��o: retorna uma String com atributos da classe relevantes para a venda do produto.
	 */
	public String exibeInfoVendaProdutos() {
		String info = String.format("Data de validade: %02d/%02d/%02d.\n", this.dia, this.mes, this.ano);
		info += super.exibeInfoVendaProdutos();
		return info;
	}
}
