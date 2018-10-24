package pessoa.fornecedor;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public final class FornecedorRecorrente extends Fornecedor {
    private float taxaDesconto;

    /**
	 * M�todo construtor da classe FornecedorRecorrente.
	 * 
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, codigo e cnpj e um float: taxaDesconto. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, codigo, cnpj e taxaDesconto conforme recebidos pelos par�metros.
	 */
    public FornecedorRecorrente(String nome, String endereco, String codigo, String cnpj, float taxaDesconto) {
    	super(nome, endereco, codigo, cnpj);
	    
		if(taxaDesconto > 0f && taxaDesconto < 100f)
	    	this.taxaDesconto = taxaDesconto;
	    else
	    	System.out.println("Taxa de desconto inv�lida! Desconto n�o pode ser igual ou menor a 0% e nem igual ou maior que 100%.");
    }

    /**
     * M�todo getTaxaDesconto.
     * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float com o valor do atributo taxaDesconto. 
	 */
    public float getTaxaDesconto() {
	return taxaDesconto;
    }

    /**
     * M�todo setTaxaDesconto.
     * 
     * Pr�-condi��o: recebimento de um float como par�metro: taxaDesconto.
     * P�s-condi��o: atribui��o do novo valor no atributo taxaDesconto. 
	 */
    public void setTaxaDesconto(float taxaDesconto) {
	this.taxaDesconto = taxaDesconto;
    }
    
    /**
	 * M�todo imprimeInformacoesFornecedor
	 * 
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do fornecedor recorrente em tela.
	 */
    public void imprimeInformacoesFornecedor() {
    	System.out.println("Fornecedor Recorrente");
    	super.imprimeInformacoesFornecedor();
    	System.out.printf("Taxa de desconto: %.0f%%.\n", (getTaxaDesconto() * 100f));
    }
}
