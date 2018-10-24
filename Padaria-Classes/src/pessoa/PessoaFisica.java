package pessoa;

/**
 * Alunos:
 * @author Guilherme Ribeiro de Carvalho - RGA: 2018.1907.071-9
 * @author Rafael Junio Xavier - RGA: 2018.1907.050-6
 * @author Igor Jos� Tamagno - RGA: 2018.1907.034-4
 *
 */
public abstract class PessoaFisica extends Pessoa{
    protected String cpf;
    protected String telefone;
    
    /**
     * M�todo construtor da classe PessoaFisica.java.
     * 
     * Pr�-condi��o: recebimento de quatro String como par�metros: nome, endere�o, cpf e telefone. 
     * P�s-condi��o: atribu��o de valores dos atributos nome, endere�o, cpf e telefone conforme recebidos pelos par�metros, sendo os atributos nome e o endere�o heran�as da classe Pessoa.
     */
    public PessoaFisica(String nome, String endereco, String cpf, String telefone) {
	super(nome, endereco);
	
	// valida��o do CPF
	if(isCPF(cpf))
	    this.cpf = cpf;
	else
	    System.out.println("CPF inv�lido!");
	
	this.telefone = telefone;
    }

    /**
     * M�todo getCpf.
     * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna uma String com o valor do atributo cpf formatado com m�scara.
     */
    public String getCpf() {
        return imprimeCPF(this.cpf);
    }

    /**
     * M�todo setCpf.
     * 
     * Pr�-condi��o: recebimento de uma String como par�metro: cpf.
     * P�s-condi��o: atribui��o do novo valor no atributo cpf.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * M�todo getTelefone.
     * 
     * Pr�-condi��o: n�o h�.
     * P�s-condi��o: retorna uma String com o valor do atributo telefone.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * M�todo setTelefone.
     * 
     * Pr�-condi��o: recebimento de uma String como par�metro: telefone.
     * P�s-condi��o: atribui��o do novo valor no atributo telefone.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
