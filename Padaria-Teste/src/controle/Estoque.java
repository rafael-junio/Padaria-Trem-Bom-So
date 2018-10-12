package controle;

import fornecedores.Fornecedor;
import produtos.Produto;
import produtos.ProdutoNaoPerecivel;
import produtos.ProdutoPerecivel;

public class Estoque {
    private Produto[] produtos;

    public Estoque() {
	this.produtos = new Produto[50];
    }

    public Produto[] getProdutos() {
	return produtos;
    }

    public void setProdutos(Produto[] produtos) {
	this.produtos = produtos;
    }
    
    // Produto NÃO perecível SEM apelido
    public boolean cadastrarProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
	    float precoFinal, int quantidade) {

	ProdutoNaoPerecivel novoProduto = new ProdutoNaoPerecivel(nome, codigo, fornecedorProduto, precoCusto, precoFinal);
	
	for (int i = 0; i < produtos.length; i++) {
	    if (produtos[i] == null) {
		if((novoProduto.getQuantidade() + quantidade) < 1 || (novoProduto.getQuantidade() + quantidade) > 30) {
		    System.out.println("Não foi possível cadastrar o produto!");
		    return false;
		}
		else {
		    produtos[i] = novoProduto;
		    novoProduto = null;
		    produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
		    System.out.println("Produto cadastrado com sucesso!");
		    alertaEstoque(codigo);
		    return true;
		}
	    }
	    else if(produtos[i] != null && (produtos[i].getCodigo().equals(codigo)) && (produtos[i].getQuantidade() + quantidade) <= 30) {
		produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
		System.out.println("Produto atualizado com sucesso!");
		return true;
	    }
	    else {
		System.out.println("Não foi possível cadastrar o produto!");
		return false;
	    }
	}
	System.out.println("Não foi possível cadastrar o produto!");
	return false;
    }

    // Produto NÃO perecível COM apelido
    public boolean cadastrarProdutoNaoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
	    float precoFinal, String[] apelido, int quantidade) {
	
	ProdutoNaoPerecivel novoProduto = new ProdutoNaoPerecivel(nome, codigo, fornecedorProduto, precoCusto, precoFinal);
	
	for (int i = 0; i < produtos.length; i++) {
	    if (produtos[i] == null) {
		if((novoProduto.getQuantidade() + quantidade) < 1 || (novoProduto.getQuantidade() + quantidade) > 30) {
		    System.out.println("Não foi possível cadastrar o produto!");
		    return false;
		}
		else {
		    produtos[i] = novoProduto;
		    produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
		}
		System.out.println("Produto cadastrado com sucesso!");
		alertaEstoque(codigo);
		novoProduto = null;
		return true;
	    }
	    if(produtos[i] != null && produtos[i].getCodigo().equals(codigo) && (produtos[i].getQuantidade() + quantidade) < 30) {
		produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
		System.out.println("Produto atualizado com sucesso!");
		return true;
	    }
	}
	System.out.println("Não foi possível cadastrar o produto!");
	return false;
    }

    // Produto PERECÍVEL SEM apelido
    public boolean cadastrarProdutoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
	    float precoFinal, int dia, int mes, int ano, int quantidade) {

	ProdutoPerecivel novoProduto = new ProdutoPerecivel(nome, codigo, fornecedorProduto, precoCusto, precoFinal, dia, mes, ano);
	
	for (int i = 0; i < produtos.length; i++) {
	    if (produtos[i] == null) {
		if((novoProduto.getQuantidade() + quantidade) < 1 || (novoProduto.getQuantidade() + quantidade) > 30) {
		    System.out.println("Não foi possível cadastrar o produto!");
		    return false;
		}
		else {
		    produtos[i] = novoProduto;
		    produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
		}
		System.out.println("Produto cadastrado com sucesso!");
		alertaEstoque(codigo);
		novoProduto = null;
		return true;
	    }
	    if(produtos[i] != null && produtos[i].getCodigo().equals(codigo) && (produtos[i].getQuantidade() + quantidade) < 30) {
		produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
		System.out.println("Produto atualizado com sucesso!");
		return true;
	    }
	}

	System.out.println("Não foi possível cadastrar o produto!");
	return false;
    }

    // Produto PERECÍVEL COM apelido
    public boolean cadastrarProdutoPerecivel(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto,
	    float precoFinal, String[] apelido, int dia, int mes, int ano, int quantidade) {

	ProdutoPerecivel novoProduto = new ProdutoPerecivel(nome, codigo, fornecedorProduto, precoCusto, precoFinal, apelido, dia, mes, ano);
	
	for (int i = 0; i < produtos.length; i++) {
	    if (produtos[i] == null) {
		if((novoProduto.getQuantidade() + quantidade) < 1 || (novoProduto.getQuantidade() + quantidade) > 30) {
		    System.out.println("Não foi possível cadastrar o produto!");
		    return false;
		}
		else {
		    produtos[i] = novoProduto;
		    produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
		}
		System.out.println("Produto cadastrado com sucesso!");
		alertaEstoque(codigo);
		novoProduto = null;
		return true;
	    }
	    if(produtos[i] != null && produtos[i].getCodigo().equals(codigo) && (produtos[i].getQuantidade() + quantidade) < 30) {
		produtos[i].setQuantidade(produtos[i].getQuantidade() + quantidade);
		System.out.println("Produto atualizado com sucesso!");
		return true;
	    }
	}

	System.out.println("Não foi possível cadastrar o produto!");
	return false;
    }

    public boolean produdoEmEstoque(String codigo) {
	for (int i = 0; i < produtos.length; i++) {
	    if (produtos[i] != null && produtos[i].getCodigo() == codigo)
		return true;
	}
	System.out.println("Produto não encontrado!");
	return false;
    }
    
    public Produto procurarProdudo(String codigo) {
	for (int i = 0; i < produtos.length; i++) {
	    if (produtos[i] != null && produtos[i].getCodigo() == codigo)
		return produtos[i];
	}
	System.out.println("Produto não encontrado!");
	return null;
    }
    
    public void imprimeInformacoesEstoque() {
	for(Produto i : produtos) {
	    if(i != null) {
		i.imprimeInformacoesProduto();
		System.out.printf("Contém %d unidade(s) em estoque.\n", i.getQuantidade());
		System.out.println();
	    }
	}
    }
    
    public void alertaEstoque(String codigo) {
	boolean encontra = false;
	for (int i = 0; !encontra && i < produtos.length; i++) {
	    if (produtos[i] != null && produtos[i].getCodigo() == codigo) {
		if(produtos[i].getQuantidade() == 1) {
		    System.out.println("ALERTA! PRODUTO CONTÉM APENAS 1 UNIDADE EM ESTOQUE!");		    
		    encontra = true;
		}
		encontra = true;
	    }
	}
    }
}
