package pessoa;

public class PessoaFisica extends Pessoa{
    protected String cpf;
    protected String telefone;
    
    public PessoaFisica(String nome, String endereco, String cpf, String telefone) {
	super(nome, endereco);
	
	if(isCPF(cpf))
	    this.cpf = cpf;
	else
	    System.out.println("CPF inválido!");
	
	this.telefone = telefone;
    }

    public String getCpf() {
        return imprimeCPF(this.cpf);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
