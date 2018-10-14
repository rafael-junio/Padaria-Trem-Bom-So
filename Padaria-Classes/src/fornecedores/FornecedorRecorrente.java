package fornecedores;

public final class FornecedorRecorrente extends Fornecedor {
    private float taxaDesconto;

    public FornecedorRecorrente(String nome, String endereco, String codigo, String cnpj, float taxaDesconto) {
	super(nome, endereco, codigo, cnpj);
	if (taxaDesconto > 0f && taxaDesconto < 1f) {
	    this.taxaDesconto = taxaDesconto;
	} else
	    System.out.println("Digite um valor válido! A taxa deve estar entre 0 e 1.");
    }

    public float getTaxaDesconto() {
	return taxaDesconto;
    }

    public void setTaxaDesconto(float taxaDesconto) {
	this.taxaDesconto = taxaDesconto;
    }
    
    public void imprimeInformacoesFornecedor() {
    	super.imprimeInformacoesFornecedor();
    	System.out.printf("Taxa de desconto: %.1f%%.\n", (getTaxaDesconto() * 100f));
    }
}
