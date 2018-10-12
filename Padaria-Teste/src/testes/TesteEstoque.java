package testes;

import controle.Estoque;
import fornecedores.FornecedorOcasional;
import fornecedores.FornecedorRecorrente;
import produtos.Produto;

public class TesteEstoque {
    public static void main(String[] args) {
	Estoque novoEstoque = new Estoque();
	
	FornecedorOcasional fo1 = new FornecedorOcasional("Metal Mesa", "Rua 12", "48.164.417/0001-16");
	FornecedorRecorrente fr1 = new FornecedorRecorrente("Aço Mesa", "Rua 11", "48.164.417/0001-16", 0.5f),
			     fr2 = new FornecedorRecorrente("Verduras CIA", "Rua 10", "48.164.417/0001-16", 0.05f);
	
	String[] apelidoMandioca = {"Macaxeira", "Batata suja"};
	
	novoEstoque.cadastrarProdutoNaoPerecivel("Colher", "123457", fr1, 1f, 2.86f, 0);
	novoEstoque.cadastrarProdutoNaoPerecivel("Colher", "123456", fo1, 1.70f, 2.86f, 25);
	novoEstoque.cadastrarProdutoNaoPerecivel("Colher", "123456", fo1, 1.70f, 2.86f, 6);
	novoEstoque.cadastrarProdutoPerecivel("Arroz", "123478", fr1, 3f, 4f, 12, 11, 2019, 1);
	novoEstoque.cadastrarProdutoPerecivel("Arroz", "123478", fr1, 3f, 4f, 12, 11, 2019, 9);
	novoEstoque.cadastrarProdutoPerecivel("Mandioca", "123879", fr2, 4.89f, 5.9f, apelidoMandioca, 12, 12, 2018, 30);
	
	Produto[] p1 = novoEstoque.getProdutos();
	
	for(Produto i : p1) {
	    if(i != null) {
		System.out.println(i.getClass());
		System.out.println(i.getFornecedorProduto().getClass());
	    }
	}
	
	novoEstoque.imprimeInformacoesEstoque();
    }
}
