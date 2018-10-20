package pessoa.fornecedor;

public final class FornecedorRecorrente extends Fornecedor {
    private float taxaDesconto;

    /**
     * Método construtor da classe FornecedorRecorrente.java.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public FornecedorRecorrente(String nome, String endereco, String codigo, String cnpj, float taxaDesconto) {
	super(nome, endereco, codigo, cnpj);
	    this.taxaDesconto = taxaDesconto;
    }

    /**
     * Método getTaxaDesconto.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public float getTaxaDesconto() {
	return taxaDesconto;
    }

    /**
     * Método setTaxaDesconto.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public void setTaxaDesconto(float taxaDesconto) {
	this.taxaDesconto = taxaDesconto;
    }
    
    /* (non-Javadoc)
     * @see pessoa.fornecedor.Fornecedor#imprimeInformacoesFornecedor()
     */
    public void imprimeInformacoesFornecedor() {
    	super.imprimeInformacoesFornecedor();
    	System.out.printf("Taxa de desconto: %.0f%%.\n", (getTaxaDesconto() * 100f));
    }
}
