package produtos;

import fornecedores.Fornecedor;
import fornecedores.FornecedorRecorrente;

public abstract class Produto {
    protected String nome;
    protected String codigo;
    protected Fornecedor fornecedorProduto;
    protected float precoCusto;
    protected float precoFinal;
    protected int quantidade;
    protected String[] apelido;

    public Produto(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto, float precoFinal) {
	this.nome = nome;

	if (codigo.length() != 6)
	    System.out.println("Código inválido! Deve conter 6 dígitos.");
	else
	    this.codigo = codigo;

	this.fornecedorProduto = fornecedorProduto;

	if (fornecedorProduto instanceof FornecedorRecorrente) {
	    this.precoCusto = precoCusto - (precoCusto * ((FornecedorRecorrente) this.fornecedorProduto).getTaxaDesconto());
	}
	else
	    this.precoCusto = precoCusto;

	this.precoFinal = precoFinal;
	this.quantidade = 0;
    }

    public Produto(String nome, String codigo, Fornecedor fornecedorProduto, float precoCusto, float precoFinal,
	    String[] apelido) {
	this.nome = nome;

	if (codigo.length() != 6)
	    System.out.println("Código inválido! Deve conter 6 dígitos.");
	else
	    this.codigo = codigo;

	this.fornecedorProduto = fornecedorProduto;

	if (fornecedorProduto instanceof FornecedorRecorrente) {
	    this.precoCusto = precoCusto - (precoCusto * ((FornecedorRecorrente) this.fornecedorProduto).getTaxaDesconto());
	}
	else
	    this.precoCusto = precoCusto;

	this.precoFinal = precoFinal;
	this.apelido = apelido;
	this.quantidade = 0;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getCodigo() {
	return codigo;
    }

    public void setCodigo(String codigo) {
	this.codigo = codigo;
    }

    public Fornecedor getFornecedorProduto() {
	return fornecedorProduto;
    }

    public void setFornecedorProduto(Fornecedor fornecedorProduto) {
	this.fornecedorProduto = fornecedorProduto;
    }

    public float getPrecoCusto() {
	return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
	this.precoCusto = precoCusto;
    }

    public float getPrecoFinal() {
	return precoFinal;
    }

    public void setPrecoFinal(float precoFinal) {
	this.precoFinal = precoFinal;
    }

    public int getQuantidade() {
	return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
    }

    public String[] getApelido() {
	return apelido;
    }

    public void setApelido(String[] apelido) {
	this.apelido = apelido;
    }

    public boolean hasApelido() {
	if (this.apelido != null)
	    return true;
	return false;
    }

    public void imprimeInformacoesProduto() {
	System.out.println("Produto: " + getNome() + ".");
	System.out.println("Código: " + getCodigo() + ".");
	fornecedorProduto.imprimeInformacoesFornecedor();
	System.out.printf("Preço de custo: %.2f. ", getPrecoCusto());
	
	if(fornecedorProduto instanceof FornecedorRecorrente)
	    System.out.printf("Fornecedor com %.1f%% de desconto.", (((FornecedorRecorrente) fornecedorProduto).getTaxaDesconto()*100f));
	
	System.out.printf("\nPreço de final: %.2f.\n", getPrecoFinal());
	
	if (hasApelido()) {
	    System.out.println("Apelido(s): ");
	    for (String i : apelido)
		System.out.println(i);
	}

    }
}
