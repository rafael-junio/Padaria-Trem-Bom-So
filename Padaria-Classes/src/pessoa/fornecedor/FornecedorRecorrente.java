/*Alunos:
 * Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * Rafael Junio Xavier - RGA: 2018.1907.050-6
 * Igor José Tamagno - RGA: 2018.1907.034-4
 */

package pessoa.fornecedor;

public final class FornecedorRecorrente extends Fornecedor {
    private float taxaDesconto;

    /**
	 * Método construtor da classe FornecedorRecorrente.java.
	 * Método para a inicialização da classe Fornecedor Recorrente.
	 * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, codigo e cnpj e um float: taxaDesconto. 
	 * Pós-condição: atribução de valores dos atributos nome, endereço, codigo, cnpj e taxaDesconto conforme recebidos pelos parâmetros.
	 */
    public FornecedorRecorrente(String nome, String endereco, String codigo, String cnpj, float taxaDesconto) {
	super(nome, endereco, codigo, cnpj);
	    this.taxaDesconto = taxaDesconto;
    }

    /**
     * Método getTaxaDesconto.
     * Método para permitir acesso ao valor do atributo taxaDesconto.
     * Pré-condição: não há.
     * Pós-condição: retorna um float com o valor do atributo taxaDesconto. 
	 */
    public float getTaxaDesconto() {
	return taxaDesconto;
    }

    /**
     * Método setTaxaDesconto.
     * Método que permite alteração do valor do atributo taxaDesconto.
     * Pré-condição: recebimento de um float como parâmetro: taxaDesconto.
     * Pós-condição: atribuição do novo valor no atributo taxaDesconto. 
	 */
    public void setTaxaDesconto(float taxaDesconto) {
	this.taxaDesconto = taxaDesconto;
    }
    
    /**
	 * Método imprimeInformacoesFornecedor
	 * Método para imprimir em tela as informações referentes ao fornecedor recorrente.
	 * Pré-condição: não há.
	 * Pós-condição: impressão dos valores dos atributos do fornecedor recorrente em tela.
	 */
    public void imprimeInformacoesFornecedor() {
    	System.out.println("Fornecedor Recorrente");
    	super.imprimeInformacoesFornecedor();
    	System.out.printf("Taxa de desconto: %.0f%%.\n", (getTaxaDesconto() * 100f));
    }
}
