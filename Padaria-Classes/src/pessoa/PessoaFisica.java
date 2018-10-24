package pessoa;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor José Tamagno - RGA: 2018.1907.034-4
 *
 */
public abstract class PessoaFisica extends Pessoa{
    protected String cpf;
    protected String telefone;
    
    /**
     * Método construtor da classe PessoaFisica.java.
     * 
     * Pré-condição: recebimento de quatro String como parâmetros: nome, endereço, cpf e telefone. 
     * Pós-condição: atribução de valores dos atributos nome, endereço, cpf e telefone conforme recebidos pelos parâmetros, sendo os atributos nome e o endereço heranças da classe Pessoa.
     */
    public PessoaFisica(String nome, String endereco, String cpf, String telefone) {
	super(nome, endereco);
	
	// validação do CPF
	if(isCPF(cpf))
	    this.cpf = cpf;
	else
	    System.out.println("CPF inválido!");
	
	this.telefone = telefone;
    }

    /**
     * Método getCpf.
     * 
     * Pré-condição: não há.
     * Pós-condição: retorna uma String com o valor do atributo cpf formatado com máscara.
     */
    public String getCpf() {
        return imprimeCPF(this.cpf);
    }

    /**
     * Método setCpf.
     * 
     * Pré-condição: recebimento de uma String como parâmetro: cpf.
     * Pós-condição: atribuição do novo valor no atributo cpf.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Método getTelefone.
     * 
     * Pré-condição: não há.
     * Pós-condição: retorna uma String com o valor do atributo telefone.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Método setTelefone.
     * 
     * Pré-condição: recebimento de uma String como parâmetro: telefone.
     * Pós-condição: atribuição do novo valor no atributo telefone.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
