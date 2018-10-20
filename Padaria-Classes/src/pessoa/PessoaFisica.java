package pessoa;

public class PessoaFisica extends Pessoa{
    protected String cpf;
    protected String telefone;
    
    /**
     * Método construtor da classe PessoaFisica.java.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public PessoaFisica(String nome, String endereco, String cpf, String telefone) {
	super(nome, endereco);
	
	if(isCPF(cpf))
	    this.cpf = cpf;
	else
	    System.out.println("CPF inválido!");
	
	this.telefone = telefone;
    }

    /**
     * Método getCpf.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public String getCpf() {
        return imprimeCPF(this.cpf);
    }

    /**
     * Método setCpf.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Método getTelefone.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Método setTelefone.
     *
     * Pré-condição: 
     * Pós-condição: 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
