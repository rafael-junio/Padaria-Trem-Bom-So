package controle.produto;

import pessoa.fornecedor.Fornecedor;

public final class ProdutoPerecivel extends Produto {

	private int dia;
	private int mes;
	private int ano;

	/**
	 * Método construtor da classe ProdutoPerecivel.java.
	 *
	 * Pré-condição: recebe duas Strings, um objeto do tipo Fornecedor, dois floats, três inteiros e um vetor de Strings. 
	 * Pós-condição: instancia os atributos da classe.
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
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo int dia.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Método setDia.
	 *
	 * Pré-condição: recebe um int.
	 * Pós-condição: não retorna valor. Instancia atributo int dia.
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}



	/**
	 * Método getMes.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo int mes.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Método setMes.
	 *
	 * Pré-condição: recebe um int.
	 * Pós-condição: não retorna valor. Instancia atributo int mes.
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Método getAno.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna atributo int ano.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Método setAno.
	 *
	 * Pré-condição: recebe um int.
	 * Pós-condição: não retorna valor. Instancia atributo int ano.
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	/**
	 * Método imprimeInformacoesProduto.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: não retorna valor. Imprime atributos da classe.
	 */
	public void imprimeInformacoesProduto() {
		super.imprimeInformacoesProduto();
		System.out.printf("Data de validade: %02d/%02d/%02d.\n", this.dia, this.mes, this.ano);
	}
	
	/**
	 * Método exibeInfoVendaProdutos.
	 *
	 * Pré-condição: não recebe nenhum parâmetro.
	 * Pós-condição: retorna uma String com atributos da classe relevantes para a venda do produto.
	 */
	public String exibeInfoVendaProdutos() {
		String info = String.format("Data de validade: %02d/%02d/%02d.\n", this.dia, this.mes, this.ano);
		info += super.exibeInfoVendaProdutos();
		return info;
	}
}
