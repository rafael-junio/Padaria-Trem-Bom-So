package fornecedores;

public final class FornecedorRecorrente extends Fornecedor {
    private float taxaDesconto;

    public FornecedorRecorrente(String nome, String endereco, String codigo, String cnpj, float taxaDesconto) {
	super(nome, endereco, codigo, cnpj);
	    this.taxaDesconto = taxaDesconto;
    }

    public float getTaxaDesconto() {
	return taxaDesconto;
    }

    public void setTaxaDesconto(float taxaDesconto) {
	this.taxaDesconto = taxaDesconto;
    }
    
    public void imprimeInformacoesFornecedor() {
    	super.imprimeInformacoesFornecedor();
    	System.out.printf("Taxa de desconto: %.0f%%.\n", (getTaxaDesconto() * 100f));
    }
}
