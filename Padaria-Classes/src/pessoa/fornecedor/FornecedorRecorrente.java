/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor Jos� Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.fornecedor;

public final class FornecedorRecorrente extends Fornecedor {
    private float taxaDesconto;

    /**
	 * M�todo construtor da classe FornecedorRecorrente.java.
	 * M�todo para a inicializa��o da classe Fornecedor Recorrente.
	 * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, codigo e cnpj e um float: taxaDesconto. 
	 * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, codigo, cnpj e taxaDesconto conforme recebidos pelos par�metros.
	 */
    public FornecedorRecorrente(String nome, String endereco, String codigo, String cnpj, float taxaDesconto) {
	super(nome, endereco, codigo, cnpj);
	    this.taxaDesconto = taxaDesconto;
    }

    /**
     * M�todo getTaxaDesconto.
     * M�todo para permitir acesso ao valor do atributo taxaDesconto.
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna um float com o valor do atributo taxaDesconto. 
	 */
    public float getTaxaDesconto() {
	return taxaDesconto;
    }

    /**
     * M�todo setTaxaDesconto.
     * M�todo que permite altera��o do valor do atributo taxaDesconto.
     * Pr�-condi��o: recebimento de um float como par�metro: taxaDesconto.
     * P�s-condi��o: atribui��o do novo valor no atributo taxaDesconto. 
	 */
    public void setTaxaDesconto(float taxaDesconto) {
	this.taxaDesconto = taxaDesconto;
    }
    
    /**
	 * M�todo imprimeInformacoesFornecedor
	 * M�todo para imprimir em tela as informa��es referentes ao fornecedor recorrente.
	 * Pr�-condi��o: n�o h�.
	 * P�s-condi��o: impress�o dos valores dos atributos do fornecedor recorrente em tela.
	 */
    public void imprimeInformacoesFornecedor() {
    	System.out.println("Fornecedor Recorrente");
    	super.imprimeInformacoesFornecedor();
    	System.out.printf("Taxa de desconto: %.0f%%.\n", (getTaxaDesconto() * 100f));
    }
}
