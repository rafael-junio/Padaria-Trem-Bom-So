package pessoa;

public class PessoaFisica extends Pessoa{
    protected String cpf;
    protected String telefone;
    
    /**
     * M�todo construtor da classe PessoaFisica.java.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public PessoaFisica(String nome, String endereco, String cpf, String telefone) {
	super(nome, endereco);
	
	if(isCPF(cpf))
	    this.cpf = cpf;
	else
	    System.out.println("CPF inv�lido!");
	
	this.telefone = telefone;
    }

    /**
     * M�todo getCpf.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public String getCpf() {
        return imprimeCPF(this.cpf);
    }

    /**
     * M�todo setCpf.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * M�todo getTelefone.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * M�todo setTelefone.
     *
     * Pr�-condi��o: 
     * P�s-condi��o: 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
