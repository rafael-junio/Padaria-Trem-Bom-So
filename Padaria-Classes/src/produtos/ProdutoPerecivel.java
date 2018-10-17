package produtos;

import fornecedores.Fornecedor;

public final class ProdutoPerecivel extends Produto {

	private int dia;
	private int mes;
	private int ano;

	public ProdutoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
			float precoFinal, int dia, int mes, int ano, String[] apelido) {
		super(nome, codigo, fornecedorProduto, precoCusto, precoFinal, apelido);
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void imprimeInformacoesProduto() {
		super.imprimeInformacoesProduto();
		System.out.printf("Data de validade: %02d/%02d/%02d.\n", this.dia, this.mes, this.ano);
	}

}
