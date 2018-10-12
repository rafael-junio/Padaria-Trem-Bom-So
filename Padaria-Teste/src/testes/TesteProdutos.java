package testes;

import fornecedores.FornecedorRecorrente;
import produtos.ProdutoPerecivel;

public class TesteProdutos {
    public static void main(String[] args) {
	FornecedorRecorrente fr1 = new FornecedorRecorrente("Casa Talheres", "Rua 01", "88.155.645/0001-44", 90);
	
	ProdutoPerecivel pp1 = new ProdutoPerecivel("arroz","123456", fr1, 5.00f, 6.34f, 12, 10, 2000);
	
	System.out.println(fr1.getTaxaDesconto());
	System.out.println(fr1.getNome());
	System.out.println(fr1.getEndereco());
	System.out.println(fr1.getCnpj());
	
	System.out.println(pp1.getNome());
	System.out.println(pp1.getCodigo());
	System.out.println(pp1.getFornecedorProduto().getNome());
	System.out.println(pp1.getPrecoCusto());
	System.out.println(pp1.getPrecoFinal());
	System.out.println(pp1.getDataValidadeProduto());
	pp1.alterarDataValidadeProduto(12, 10, 2022);
	System.out.println(pp1.getDataValidadeProduto());
	
    }
}
