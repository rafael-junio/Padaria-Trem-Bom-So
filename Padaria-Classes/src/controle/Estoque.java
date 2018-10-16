package controle;

import fornecedores.Fornecedor;
import produtos.Produto;


public class Estoque extends Produto implements AlertaEstoque {

	protected int quantidadeEstoque;
	protected int dia, mes, ano;
	
	public Estoque(String nome, String codigo, Fornecedor fornecedor, float precoCusto, float precoFinal,
			String[] apelido, int quantidadeEstoque) {
		super(nome, codigo, fornecedor, precoCusto, precoFinal, apelido);
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Estoque(String nome, String codigo, Fornecedor fornecedor, float precoCusto, float precoFinal, int dia,
			int mes, int ano, String[] apelido, int quantidadeEstoque) {
			super(nome, codigo, fornecedor, precoCusto, precoFinal, apelido);
			this.quantidadeEstoque = quantidadeEstoque;
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}



	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}


	public void alertaEstoque(Object obj1) {
		Estoque produto = (Estoque) obj1;

		if (produto.getQuantidadeEstoque() == 1)
			System.out.println("ALERTA! PRODUTO CONTÉM APENAS 1 UNIDADE EM ESTOQUE!");
	}

}
