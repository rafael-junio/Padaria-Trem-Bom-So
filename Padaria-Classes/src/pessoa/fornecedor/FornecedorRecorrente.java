package pessoa.fornecedor;

public final class FornecedorRecorrente extends Fornecedor {
    private float taxaDesconto;

    /**
     * M�todo construtor da classe FornecedorRecorrente.java.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public FornecedorRecorrente(String nome, String endereco, String codigo, String cnpj, float taxaDesconto) {
	super(nome, endereco, codigo, cnpj);
	    this.taxaDesconto = taxaDesconto;
    }

    /**
     * M�todo getTaxaDesconto.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public float getTaxaDesconto() {
	return taxaDesconto;
    }

    /**
     * M�todo setTaxaDesconto.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
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
